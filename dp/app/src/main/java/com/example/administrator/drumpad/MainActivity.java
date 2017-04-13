package com.example.administrator.drumpad;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends ActionBarActivity{
    // 뒤로가기버튼 누른시간
    private long backpresstime = 0;
    boolean ispad = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    // 뒤로가기 2번 누를시 앱 종료
    /*
    @Override
    public void onBackPressed() {
        long time = System.currentTimeMillis();
        long intervaltime = time - backpresstime;

        if(0 <= intervaltime && intervaltime <= 2000){
            super.onBackPressed();
        }
        else{
            backpresstime = time;
            Toast.makeText(getApplicationContext(), "한번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
        }
    }
    */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
