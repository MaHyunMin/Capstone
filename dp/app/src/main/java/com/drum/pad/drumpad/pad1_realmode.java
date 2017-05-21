package com.drum.pad.drumpad;

import android.app.Fragment;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class pad1_realmode extends Fragment {
    SoundPool pool;
    int bass, crash, floor, hihat1, hihat2, ride, snare, tom1, tom2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.drumpad1_realmode, container, false);
        ImageButton bassBtn = (ImageButton)view.findViewById(R.id.baseBtn);
        ImageButton crashBtn = (ImageButton)view.findViewById(R.id.crashBtn);
        ImageButton floorBtn = (ImageButton)view.findViewById(R.id.floorBtn);
        ImageButton hihat1Btn = (ImageButton)view.findViewById(R.id.hihat1Btn);
        ImageButton hihat2Btn = (ImageButton)view.findViewById(R.id.hihat2Btn);
        ImageButton rideBtn = (ImageButton)view.findViewById(R.id.rideBtn);
        ImageButton snareBtn = (ImageButton)view.findViewById(R.id.snareBtn);
        ImageButton tom1Btn = (ImageButton)view.findViewById(R.id.tom1Btn);
        ImageButton tom2Btn = (ImageButton)view.findViewById(R.id.tom2Btn);

        initSound();

        bassBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageButton button = (ImageButton) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수

                // 버튼을 눌렀을 때
                if(action == MotionEvent.ACTION_DOWN){
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(bass, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.drum_click1);
                }
                // 버튼을 땟을 때
                else if(action == MotionEvent.ACTION_UP){
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.drum1);
                }
                return true;
            }
        });

        crashBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageButton button = (ImageButton) v;
                int action = event.getAction();

                if(action == MotionEvent.ACTION_DOWN){
                    pool.play(crash, 1, 1, 0, 0, 1);
                    button.setBackgroundResource(R.drawable.drum_click2);
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.drum2);
                }
                return true;
            }
        });

        floorBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageButton button = (ImageButton) v;
                int action = event.getAction();

                if(action == MotionEvent.ACTION_DOWN){
                    pool.play(floor, 1, 1, 0, 0, 1);
                    button.setBackgroundResource(R.drawable.drum_click1);
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.drum1);
                }
                return true;
            }
        });

        hihat1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageButton button = (ImageButton) v;
                int action = event.getAction();

                if(action == MotionEvent.ACTION_DOWN){
                    pool.play(hihat1, 1, 1, 0, 0, 1);
                    button.setBackgroundResource(R.drawable.drum_click2);
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.drum2);
                }
                return true;
            }
        });

        hihat2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageButton button = (ImageButton) v;
                int action = event.getAction();

                if(action == MotionEvent.ACTION_DOWN){
                    pool.play(hihat2, 1, 1, 0, 0, 1);
                    button.setBackgroundResource(R.drawable.drum_click2);
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.drum2);
                }
                return true;
            }
        });

        rideBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageButton button = (ImageButton) v;
                int action = event.getAction();

                if(action == MotionEvent.ACTION_DOWN){
                    pool.play(ride, 1, 1, 0, 0, 1);
                    button.setBackgroundResource(R.drawable.drum_click2);
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.drum2);
                }
                return true;
            }
        });

        snareBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageButton button = (ImageButton) v;
                int action = event.getAction();

                if(action == MotionEvent.ACTION_DOWN){
                    pool.play(snare, 1, 1, 0, 0, 1);
                    button.setBackgroundResource(R.drawable.drum_click1);
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.drum1);
                }
                return true;
            }
        });

        tom1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageButton button = (ImageButton) v;
                int action = event.getAction();

                if(action == MotionEvent.ACTION_DOWN){
                    pool.play(tom1, 1, 1, 0, 0, 1);
                    button.setBackgroundResource(R.drawable.drum_click1);
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.drum1);
                }
                return true;
            }
        });

        tom2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ImageButton button = (ImageButton) v;
                int action = event.getAction();

                if(action == MotionEvent.ACTION_DOWN){
                    pool.play(tom2, 1, 1, 0, 0, 1);
                    button.setBackgroundResource(R.drawable.drum_click1);
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.drum1);
                }
                return true;
            }
        });

        return view;
    }

    public void initSound(){
        pool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0);
        bass = pool.load(getActivity(), R.raw.bass, 1);
        crash = pool.load(getActivity(), R.raw.crash, 1);
        floor = pool.load(getActivity(), R.raw.floor, 1);
        hihat1 = pool.load(getActivity(), R.raw.hihat1, 1);
        hihat2 = pool.load(getActivity(), R.raw.hihat2, 1);
        ride = pool.load(getActivity(), R.raw.ride, 1);
        snare = pool.load(getActivity(), R.raw.snare, 1);
        tom1 = pool.load(getActivity(), R.raw.tom1, 1);
        tom2 = pool.load(getActivity(), R.raw.tom2, 1);
    }
}
