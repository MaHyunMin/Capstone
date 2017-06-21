package com.drum.pad.drumpad;

import android.app.Fragment;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class pad1 extends Fragment {
    SoundPool pool;
    int bass, crash, floor, hihat1, hihat2, ride, snare, tom1, tom2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.drumpad1, container, false);
        Button bassBtn = (Button)view.findViewById(R.id.bassButton);
        Button crashBtn = (Button)view.findViewById(R.id.crashButton);
        Button floorBtn = (Button)view.findViewById(R.id.floorButton);
        Button hihat1Btn = (Button)view.findViewById(R.id.hihat1Button);
        Button hihat2Btn = (Button)view.findViewById(R.id.hihat2Button);
        Button rideBtn = (Button)view.findViewById(R.id.rideButton);
        Button snareBtn = (Button)view.findViewById(R.id.snareButton);
        Button tom1Btn = (Button)view.findViewById(R.id.tom1Button);
        Button tom2Btn = (Button)view.findViewById(R.id.tom2Button);

        initSound();

        bassBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.bassButton) {
                        // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                        // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                        // 속도는 1은 1배속
                        pool.play(bass, 1, 1, 0, 0, 1);

                        // 버튼 이미지를 눌린 이미지로 변경
                        button.setBackgroundResource(R.drawable.button_press);
                    }
                }
                // 버튼을 땟을 때
                else if(action == MotionEvent.ACTION_UP){
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button);
                }
                return true;
            }
        });

        crashBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.crashButton){
                        pool.play(crash, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button);
                }
                return true;
            }
        });

        floorBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.floorButton){
                        pool.play(floor, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button);
                }
                return true;
            }
        });

        hihat1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.hihat1Button){
                        pool.play(hihat1, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button);
                }
                return true;
            }
        });

        hihat2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.hihat2Button){
                        pool.play(hihat2, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button);
                }
                return true;
            }
        });

        rideBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.rideButton){
                        pool.play(ride, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button);
                }
                return true;
            }
        });

        snareBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.snareButton){
                        pool.play(snare, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button);
                }
                return true;
            }
        });

        tom1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.tom1Button){
                        pool.play(tom1, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button);
                }
                return true;
            }
        });

        tom2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.tom2Button){
                        pool.play(tom2, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button);
                }
                return true;
            }
        });

        return view;
        //return inflater.inflate(R.layout.drumpad1, container, false);
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
