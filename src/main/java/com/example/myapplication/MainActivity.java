package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {




    int index = 0;



        public void pindot(View v) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String[] messages = {
                    "It always seems impossible until it's done",
                    "The expert in anything was once a beginner",
                    "The best way to predict the future is to create it",
                    "First, solve the problem. Then, write the code.",
                    "Vision without execution is just hallucination",
                    "Success is the sum of small efforts, repeated day in the day out.",
                    "Don't watch the clock; do what it does. Keep going.",
                    "Programs must be written for people to read, and only incidentally for machines to execute",
                    "Your attitude, not your aptitude, will determine your altitude.",
                    "Code is like humor. When you have to explain it, it's bad.",

            };



            tv.setText(messages[index]);
            index++;

            if(index == messages.length){
                index = 0;
            }

        }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        }








}