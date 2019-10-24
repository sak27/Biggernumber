package com.example.biggernumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int number = r.nextInt();
    int number2 = r.nextInt();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView button = this.findViewById(R.id.button);
        TextView button2 = this.findViewById(R.id.button2);
        button.setText(String.valueOf(number));
        button2.setText(String.valueOf(number2));

    }
}
