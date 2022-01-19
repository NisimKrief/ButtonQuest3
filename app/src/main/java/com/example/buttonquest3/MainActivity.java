package com.example.buttonquest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int count;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        count = 0;

    }
    public void go(View view){
        count = count + 1;
        btn.setText("This is a click number: " + count);
        if (count % 6 == 0){
            btn.setText("Enough to click. Go to new start!");
            count = 0;
        }

    }

}