package com.angers.angersmove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View activity_second){
                setContentView(R.layout.activity_second);
            }
        });
    }
    protected void onStart(){
        super.onStart();
    }
    protected void onResume(){
        super.onResume();
    }
    protected void onPause(){
        super.onPause();
    }
    protected void onStop(){
        super.onStop();
    }
    protected void onDestroy(){
        super.onDestroy();
    }
}
