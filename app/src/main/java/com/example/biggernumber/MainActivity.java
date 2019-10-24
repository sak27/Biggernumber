package com.example.biggernumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int number = r.nextInt();
    int number2 = r.nextInt();
    int score;
    int lives = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialising();


    }

    public void initialising() {
        number = r.nextInt();
        number2 = r.nextInt();
        TextView button = this.findViewById(R.id.button);
        TextView button2 = this.findViewById(R.id.button2);
        button.setText(String.valueOf(number));
        button2.setText(String.valueOf(number2));
    }

    public void on_button_click(View view) {
        TextView tv = this.findViewById(R.id.textView);
        TextView point = this.findViewById(R.id.textView3);
        TextView life = this.findViewById(R.id.textView4);

        if (number > number2) {
            tv.setText("Congratulation!");
            score++;
            point.setText("Score: " + score);
        } else {
            tv.setText("Oops! Wrong");
            lives--;
            life.setText("Lives " + lives);
            if (lives == 0) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This is a message displayed in a Toast",
                        Toast.LENGTH_SHORT);

                toast.show();

            }
            initialising();
        }
    }

    public void on_button_click2(View view){
        TextView tv = this.findViewById(R.id.textView);
        TextView point = this.findViewById(R.id.textView3);
        TextView life = this.findViewById(R.id.textView4);
        if (number2 > number)
        {
            tv.setText("Congratulation!");
            score++;
            point.setText("Score: " + score);


        } else
        {
            tv.setText("Oops! Wrong");
            lives--;
            life.setText("Lives " + lives);
            if (lives == 0)
            {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Game Over!!!!",
                        Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 20, 20);


                toast.show();

            }
            initialising();
        }


    }
}

