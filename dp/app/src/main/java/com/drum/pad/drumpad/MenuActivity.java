package com.drum.pad.drumpad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button button_Play, button_Tutorial, button_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button_Play = (Button)findViewById(R.id.btnPlay);
        button_Tutorial = (Button)findViewById(R.id.btnTutorial);
        button_exit = (Button)findViewById(R.id.btnExit);

        // 패드로 이동
        button_Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 튜토리얼로 이동
        button_Tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });

        // 종료
        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
