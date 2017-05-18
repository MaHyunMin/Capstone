package com.drum.pad.drumpad;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.AlertDialog;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends ActionBarActivity{
    final String rec_f = "/rec_test"; // 녹음저장폴더
    final String default_filename = "record"; // 기본녹음파일이름
    final String sdRootPath = Environment.getExternalStorageDirectory().getAbsolutePath(); // 저장소 경로
    final File rec_test = new File(sdRootPath + rec_f); // 저장소 경로에 만들 폴더
    MediaPlayer mPlayer = null;
    MediaRecorder mRecorder = null;
    String mFilePath, mMusicPath;
    Menu action_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setfilepath();

        if(findViewById(R.id.pad_area) != null){
            if(savedInstanceState != null){
                return;
            }
            pad1 p1 = new pad1();
            p1.setArguments(getIntent().getExtras());

            getFragmentManager().beginTransaction().add(R.id.pad_area, p1).commit();
        }
    }

    // 1 2 3 버튼에 따라 드럼패드(프래그먼트) 전환
    // 화면 전환 추가
    public void selectFragment(View view){
        Fragment fr_pad = null;
        Fragment fr_menu = null;

        switch(view.getId()){
            case R.id.frag1Button:
                fr_pad = new pad1();
                break;

            case R.id.frag2Button:
                fr_pad = new pad2();
                break;

            case R.id.frag3Button:
                fr_pad = new pad3();
                break;
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.pad_area, fr_pad);
        //fragmentTransaction.addToBackStack(null); // 주석 풀면 뒤로가기 누를 시 이전 프레그먼트 나옴
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_menu, menu);
        action_menu = menu;
        action_menu.findItem(R.id.action_musiclist).setEnabled(true);
        action_menu.findItem(R.id.action_recordlist).setEnabled(true);
        action_menu.findItem(R.id.action_record).setEnabled(true);
        action_menu.findItem(R.id.action_save).setEnabled(false);
        action_menu.findItem(R.id.action_stop).setEnabled(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_musiclist:
                musicList();
                action_menu.findItem(R.id.action_musiclist).setEnabled(true);
                action_menu.findItem(R.id.action_recordlist).setEnabled(true);
                action_menu.findItem(R.id.action_record).setEnabled(true);
                action_menu.findItem(R.id.action_save).setEnabled(false);
                action_menu.findItem(R.id.action_stop).setEnabled(true);
                break;

            case R.id.action_stop:
                stopMusic();
                action_menu.findItem(R.id.action_musiclist).setEnabled(true);
                action_menu.findItem(R.id.action_recordlist).setEnabled(true);
                action_menu.findItem(R.id.action_record).setEnabled(true);
                action_menu.findItem(R.id.action_save).setEnabled(false);
                action_menu.findItem(R.id.action_stop).setEnabled(false);
                break;

            case R.id.action_record:
                startRecording();
                action_menu.findItem(R.id.action_musiclist).setEnabled(true);
                action_menu.findItem(R.id.action_recordlist).setEnabled(true);
                action_menu.findItem(R.id.action_record).setEnabled(false);
                action_menu.findItem(R.id.action_save).setEnabled(true);
                action_menu.findItem(R.id.action_stop).setEnabled(false);
                break;

            case R.id.action_recordlist:
                recordList();
                action_menu.findItem(R.id.action_musiclist).setEnabled(true);
                action_menu.findItem(R.id.action_recordlist).setEnabled(true);
                action_menu.findItem(R.id.action_record).setEnabled(true);
                action_menu.findItem(R.id.action_save).setEnabled(false);
                action_menu.findItem(R.id.action_stop).setEnabled(true);
                break;

            case R.id.action_save:
                stopRecording();
                action_menu.findItem(R.id.action_musiclist).setEnabled(true);
                action_menu.findItem(R.id.action_recordlist).setEnabled(true);
                action_menu.findItem(R.id.action_record).setEnabled(true);
                action_menu.findItem(R.id.action_save).setEnabled(false);
                action_menu.findItem(R.id.action_stop).setEnabled(false);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setfilepath(){
        if(rec_test.exists() == true) {
            mFilePath = sdRootPath + rec_f;
            mMusicPath = sdRootPath + "/Download";
        }else{
            rec_test.mkdir();
            mFilePath = sdRootPath + rec_f;
            mMusicPath = sdRootPath + "/Download";
        }
    }

    private void startRecording(){
        if(mRecorder != null){
            mRecorder.release();
            mRecorder = null;
        }
        mRecorder = new MediaRecorder();
        mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mRecorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
        mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        mRecorder.setOutputFile(mFilePath + "/" + default_filename);

        try{
            mRecorder.prepare();
            Toast.makeText(getApplicationContext(), "녹음 시작", Toast.LENGTH_SHORT).show();
        }catch (IOException e){
            Log.d("tag", "Record Prepare error");
            Toast.makeText(getApplicationContext(), "녹음 실패", Toast.LENGTH_SHORT).show();
        }
        mRecorder.start();
    }

    private void stopRecording(){
        if(mRecorder == null){
            return;
        }
        mRecorder.stop();
        mRecorder.release();
        mRecorder = null;

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        final File before_file = new File(sdRootPath + rec_f, default_filename);

        alert.setTitle("파일저장");
        alert.setMessage("저장할 파일 이름을 입력하세요.");

        final EditText filename = new EditText(this);
        alert.setView(filename);

        alert.setPositiveButton("저장", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String fn = filename.getText().toString();
                final File after_file = new File(sdRootPath + rec_f, fn);
                before_file.renameTo(after_file);

                if(before_file.exists() == true){
                    Toast.makeText(getApplicationContext(), "이미 존재하는 파일입니다.", Toast.LENGTH_SHORT).show();
                    stopRecording();
                }
                else {
                    Toast.makeText(getApplicationContext(), "저장 완료", Toast.LENGTH_SHORT).show();
                }
            }
        });

        alert.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                before_file.delete();
                Toast.makeText(getApplicationContext(), "녹음 취소", Toast.LENGTH_SHORT).show();
            }
        });
        alert.show();
    }

    private void stopMusic(){
        if(mRecorder == null){
            return;
        }
        mPlayer.stop();
        mPlayer.release();
        mPlayer = null;
        Toast.makeText(getApplicationContext(), "재생 중지", Toast.LENGTH_SHORT).show();
    }

    private void musicList(){
        ArrayList<String> items = new ArrayList<>();
        File files = new File(mMusicPath);
        if(files.listFiles().length > 0){
            for(File file : files.listFiles()){
                items.add(file.getName());
            }
        }
        files = null;
        final String[] list = items.toArray(new String[items.size()]);

        AlertDialog.Builder playlist = new AlertDialog.Builder(this);
        playlist.setTitle("음악재생목록");
        playlist.setItems(list, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mPlayer = new MediaPlayer();
                String filename = list[which].toString();
                try{
                    mPlayer.setDataSource(mMusicPath + "/" + filename);
                    mPlayer.prepare();
                }catch (IOException e){
                    Toast.makeText(getApplicationContext(), "실행 실패", Toast.LENGTH_SHORT).show();
                    return;
                }
                mPlayer.start();

                Toast.makeText(getApplicationContext(), "음악 재생", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = playlist.create();
        alertDialog.show();
    }

    private void recordList(){
        ArrayList<String> items = new ArrayList<>();
        File files = new File(mFilePath);
        if(files.listFiles().length > 0){
            for(File file : files.listFiles()){
                items.add(file.getName());
            }
        }
        files = null;
        final String[] list = items.toArray(new String[items.size()]);

        AlertDialog.Builder playlist = new AlertDialog.Builder(this);
        playlist.setTitle("녹음재생목록");
        playlist.setItems(list, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(mPlayer != null){
                    mPlayer.stop();
                    mPlayer.release();
                    mPlayer = null;
                }
                mPlayer = new MediaPlayer();
                String filename = list[which].toString();
                try{
                    mPlayer.setDataSource(mFilePath + "/" + filename);
                    mPlayer.prepare();
                }catch (IOException e){
                    Toast.makeText(getApplicationContext(), "실행 실패", Toast.LENGTH_SHORT).show();
                    return;
                }
                mPlayer.start();
                Toast.makeText(getApplicationContext(), "재생", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = playlist.create();
        alertDialog.show();
    }
}
