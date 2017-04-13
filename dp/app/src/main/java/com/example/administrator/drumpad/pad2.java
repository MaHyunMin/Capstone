package com.example.administrator.drumpad;

import android.app.Fragment;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class pad2 extends Fragment{
    SoundPool pool;
    int chant1, chant2, clap1, click1, click2, crash1, kick1, kick2, openhihat1, snare1, snare2, snare3;
    int loop1, loop2, loop3, loop4;
    int isloop = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.drumpad2, container, false);
        pool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0);

        chant1 = pool.load(view.getContext(), R.raw.chant_1, 1);
        chant2 = pool.load(view.getContext(), R.raw.chant_2, 1);
        clap1 = pool.load(view.getContext(), R.raw.clap_1, 1);
        click1 = pool.load(view.getContext(), R.raw.click_1, 1);
        click2 = pool.load(view.getContext(), R.raw.click_2, 1);
        crash1 = pool.load(view.getContext(), R.raw.crash_1, 1);
        kick1 = pool.load(view.getContext(), R.raw.kick_1, 1);
        kick2 = pool.load(view.getContext(), R.raw.kick_2, 1);
        openhihat1 = pool.load(view.getContext(), R.raw.o_hihat_1, 1);
        snare1 = pool.load(view.getContext(), R.raw.snare_1, 1);
        snare2 = pool.load(view.getContext(), R.raw.snare_2, 1);
        snare3 = pool.load(view.getContext(), R.raw.snare_3, 1);
        loop1 = pool.load(view.getContext(), R.raw.drum_loop_1, 1);
        loop2 = pool.load(view.getContext(), R.raw.drum_loop_3, 1);
        loop3 = pool.load(view.getContext(), R.raw.piano_loop_1, 1);
        loop4 = pool.load(view.getContext(), R.raw.synth_loop_1, 1);

        Button chant1Btn = (Button)view.findViewById(R.id.Chant1Button);
        Button chant2Btn = (Button)view.findViewById(R.id.Chant2Button);
        Button clap1Btn = (Button)view.findViewById(R.id.Clap1Button);
        Button click1Btn = (Button)view.findViewById(R.id.Click1Button);
        Button click2Btn = (Button)view.findViewById(R.id.Click2Button);
        Button crash1Btn = (Button)view.findViewById(R.id.Crash1Button);
        Button kick1Btn = (Button)view.findViewById(R.id.Kick1Button);
        Button kick2Btn = (Button)view.findViewById(R.id.Kick2Button);
        Button openhihat1Btn = (Button)view.findViewById(R.id.Open_Hihat1Button);
        Button snare1Btn = (Button)view.findViewById(R.id.Snare1Button);
        Button snare2Btn = (Button)view.findViewById(R.id.Snare2Button);
        Button snare3Btn = (Button)view.findViewById(R.id.Snare3Button);
        Button loop1Btn = (Button)view.findViewById(R.id.Loop1Button);
        Button loop2Btn = (Button)view.findViewById(R.id.Loop2Button);
        Button loop3Btn = (Button)view.findViewById(R.id.Loop3Button);
        Button loop4Btn = (Button)view.findViewById(R.id.Loop4Button);


        chant1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if(action == MotionEvent.ACTION_DOWN){
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(chant1, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if(action == MotionEvent.ACTION_UP){
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        chant2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if(action == MotionEvent.ACTION_DOWN){
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(chant2, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if(action == MotionEvent.ACTION_UP){
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        clap1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(clap1, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        click1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(click1, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        click2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(click2, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        crash1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if(action == MotionEvent.ACTION_DOWN){
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(crash1, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if(action == MotionEvent.ACTION_UP){
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        kick1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(kick1, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        kick2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(kick2, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        openhihat1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(openhihat1, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        snare1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(snare1, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        snare2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(snare2, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        snare3Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속
                    pool.play(snare3, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        loop1Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속

                    pool.play(loop1, 1, 1, 0, isloop, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        loop2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속

                    pool.play(loop2, 1, 1, 0, isloop, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        loop3Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속

                    pool.play(loop3, 1, 1, 0, isloop, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        loop4Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button) v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                // 버튼을 눌렀을 때
                if (action == MotionEvent.ACTION_DOWN) {
                    // pool.play(소리, 좌측볼륨, 우측볼륨, 우선순위, 반복여부, 속도);
                    // 우선순위는 0일수록 높음, 반복여부는 0이면 없고 -1이면 무한반복
                    // 속도는 1은 1배속

                    pool.play(loop4, 1, 1, 0, 0, 1);

                    // 버튼 이미지를 눌린 이미지로 변경
                    button.setBackgroundResource(R.drawable.button_press2);
                }
                // 버튼을 땟을 때
                else if (action == MotionEvent.ACTION_UP) {
                    // 버튼 이미지 복구
                    button.setBackgroundResource(R.drawable.button2);
                }
                return true;
            }
        });

        return view;
    }
}
