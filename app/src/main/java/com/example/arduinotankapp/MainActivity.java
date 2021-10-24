package com.example.arduinotankapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button left;
    Button right;
    Button forward;
    Button reverse;
    TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = findViewById(R.id.leftButton);
        right = findViewById(R.id.rightButton);
        forward = findViewById(R.id.fwdButton);
        reverse = findViewById(R.id.revButton);
        txtDisplay = findViewById(R.id.mainTextDisplay);

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