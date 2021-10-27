package com.example.arduinotankapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button left = findViewById(R.id.leftButton);
    Button right = findViewById(R.id.rightButton);
    Button forward = findViewById(R.id.fwdButton);
    Button reverse = findViewById(R.id.revButton);
    TextView txtDisplay = findViewById(R.id.mainTextDisplay);

    EditText tankIp = findViewById(R.id.ipInput);

    public void onSubmit(View v) {
        CharSequence ip = tankIp.getText();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    //send signal to move forward
                    txtDisplay.setText("Going Forward");
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    //send stop signal
                    txtDisplay.setText("");
                }
                return false;
            }
        });
        reverse.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    //send signal to back up
                    txtDisplay.setText("Backing Up");
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    //send stop signal
                    txtDisplay.setText("");
                }
                return false;
            }
        });
        left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    //send signal to move left
                    txtDisplay.setText("Turning Left");
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    //send stop signal
                    txtDisplay.setText("");
                }
                return false;
            }
        });
        right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    //send signal to move right
                    txtDisplay.setText("Turning Right");
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    //send stop signal
                    txtDisplay.setText("");
                }
                return false;
            }
        });
    }
}