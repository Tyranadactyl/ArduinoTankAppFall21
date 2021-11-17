package com.example.arduinotankapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button left ;
    Button right;
    Button forward;
    Button reverse;
    TextView txtDisplay;
    TextView ipDisplay;
    EditText tankIp;
    WebView webDisplay;
    String tankAddress;

    public void onSubmit(View v) {
        String ip = tankIp.getText().toString();
        ipDisplay.setText(ip);
        tankAddress = "HTTP://" + ip;
        txtDisplay.setText("website address:" + tankAddress);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

         left = findViewById(R.id.leftButton);
         right = findViewById(R.id.rightButton);
         forward = findViewById(R.id.fwdButton);
         reverse = findViewById(R.id.revButton);
         txtDisplay = findViewById(R.id.mainTextDisplay);
         ipDisplay = findViewById(R.id.showIp);
         tankIp = findViewById(R.id.ipInput);
         webDisplay = findViewById(R.id.tankWebServer);

        getSupportActionBar().hide();

        forward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    //Send signal to move forward
                    webDisplay.loadUrl(tankAddress + "/F");
                    txtDisplay.setText("Going Forward");
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    //Send stop signal
                    webDisplay.loadUrl(tankAddress + "/S");
                    txtDisplay.setText("");
                }
                return false;
            }
        });
        reverse.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    //Send signal to back up
                    webDisplay.loadUrl(tankAddress + "/B");
                    txtDisplay.setText("Backing Up");
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    //Send stop signal
                    webDisplay.loadUrl(tankAddress + "/S");
                    txtDisplay.setText("");
                }
                return false;
            }
        });
        left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    //Send signal to turn left
                    webDisplay.loadUrl(tankAddress + "/L");
                    txtDisplay.setText("Turning Left");
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    //Send stop signal
                    webDisplay.loadUrl(tankAddress + "/S");
                    txtDisplay.setText("");
                }
                return false;
            }
        });
        right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    //Send signal to turn right
                    webDisplay.loadUrl(tankAddress + "/R");
                    txtDisplay.setText("Turning Right");
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    //Send stop signal
                    webDisplay.loadUrl(tankAddress + "/S");
                    txtDisplay.setText("");
                }
                return false;
            }
        });
    }
}