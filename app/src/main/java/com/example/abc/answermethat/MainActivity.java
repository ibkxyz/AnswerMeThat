 package com.example.abc.answermethat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


     /**
      * Called when the Start Quiz button is pressed.
      */

     public void startQuiz(View view) {
         Intent intent = new Intent(this, Main2Activity.class);
         startActivity(intent);

         }



}
