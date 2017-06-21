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

public class pad3 extends Fragment{
    SoundPool pool;
    int a3, b2, b3, b4, c_3, c_4, d3, d5, d_4, e2, e4, f2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.drumpad3, container, false);

        Button a3Btn = (Button)view.findViewById(R.id.a3);
        Button b2Btn = (Button)view.findViewById(R.id.b2);
        Button b3Btn = (Button)view.findViewById(R.id.b3);
        Button b4Btn = (Button)view.findViewById(R.id.b4);
        Button c_3Btn = (Button)view.findViewById(R.id.c_3);
        Button c_4Btn = (Button)view.findViewById(R.id.c_4);
        Button d3Btn = (Button)view.findViewById(R.id.d3);
        Button d5Btn = (Button)view.findViewById(R.id.d5);
        Button d_4Btn = (Button)view.findViewById(R.id.d_4);
        Button e2Btn = (Button)view.findViewById(R.id.e2);
        Button e4Btn = (Button)view.findViewById(R.id.e4);
        Button f2Btn = (Button)view.findViewById(R.id.f2);

        initSound();

        a3Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;          // 버튼 객체
                int action = event.getAction();     // 버튼 이벤트 발생 변수
                int id = v.getId();                 // 버튼 id값 받을 변수

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.a3){
                        pool.play(a3, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        b2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.b2){
                        pool.play(b2, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        b3Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.b3){
                        pool.play(b3, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        b4Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.b4){
                        pool.play(b4, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        c_3Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.c_3){
                        pool.play(c_3, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        c_4Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.c_4){
                        pool.play(c_4, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        d3Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.d3){
                        pool.play(d3, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        d5Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.d5){
                        pool.play(d5, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        d_4Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.d_4){
                        pool.play(d_4, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        e2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.e2){
                        pool.play(e2, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        e4Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.e4){
                        pool.play(e4, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        f2Btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Button button = (Button)v;
                int action = event.getAction();
                int id = v.getId();

                if(action == MotionEvent.ACTION_DOWN){
                    if(id == R.id.f2){
                        pool.play(f2, 1, 1, 0, 0, 1);
                        button.setBackgroundResource(R.drawable.button3_press);
                    }
                }
                else if(action == MotionEvent.ACTION_UP){
                    button.setBackgroundResource(R.drawable.button3);
                }
                return true;
            }
        });

        return view;
    }

    public void initSound(){
        pool = new SoundPool(12, AudioManager.STREAM_MUSIC, 0);
        a3 = pool.load(getActivity(), R.raw.a3, 1);
        b2 = pool.load(getActivity(), R.raw.b2, 1);
        b3 = pool.load(getActivity(), R.raw.b3, 1);
        b4 = pool.load(getActivity(), R.raw.b4, 1);
        c_3 = pool.load(getActivity(), R.raw.c_3, 1);
        c_4 = pool.load(getActivity(), R.raw.c_4, 1);
        d3 = pool.load(getActivity(), R.raw.d3, 1);
        d5 = pool.load(getActivity(), R.raw.d5, 1);
        d_4 = pool.load(getActivity(), R.raw.d_4, 1);
        e2 = pool.load(getActivity(), R.raw.e2, 1);
        e4 = pool.load(getActivity(), R.raw.e4, 1);
        f2 = pool.load(getActivity(), R.raw.f2, 1);
    }
}
