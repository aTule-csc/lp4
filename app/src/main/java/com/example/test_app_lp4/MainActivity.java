package com.example.test_app_lp4;

import android.os.Bundle;
import android.app.NotificationManager;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button buttonM;
    private Button buttonD;
    private Button buttonE;
    private Button buttonN;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonM = findViewById(R.id.button);
        buttonD = findViewById(R.id.button2);
        buttonE = findViewById(R.id.button3);
        buttonN = findViewById(R.id.button4);
        MyPushNotification myPushNotification = new MyPushNotification(this,
                getSystemService(NotificationManager.class));
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Morning.class);
                startActivity(intent);
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPushNotification.sendNotify("Attention","Time to dive, Chris");
                Intent intent=new Intent(getApplicationContext(),Day.class);
                startActivity(intent);
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPushNotification.sendNotify("Attention","Sleepy sleep time");
                Intent intent=new Intent(getApplicationContext(),Evening.class);
                startActivity(intent);
            }
        });
        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Night.class);
                startActivity(intent);
            }
        });
    }

//    public void toMorning(View view){
//        Intent intent = new Intent(this, Morning.class);
//        startActivity(intent);
//    }
//    public void toDay(View view){
//        myPushNotification.sendNotify("Предупреждение","Скоро конец рабочего дня ;)");
//        Intent intent = new Intent(this, Day.class);
//        startActivity(intent);
//    }
//    public void toEvening(View view){
//        myPushNotification.sendNotify("Предупреждение","Спаааать!");
//        Intent intent = new Intent(this, Evening.class);
//        startActivity(intent);
//    }
//    public void toNight(View view){
//        Intent intent = new Intent(this, Night.class);
//        startActivity(intent);
//    }
}