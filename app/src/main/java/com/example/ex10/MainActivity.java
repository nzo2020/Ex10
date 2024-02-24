package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    int counter=0;
    Button button2;
    ToggleButton toggleButton;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        switch1 = (Switch) findViewById(R.id.switch1);
        button2 = (Button) findViewById(R.id.button2);
    }
    public void clicked(View view){
        counter=counter+1;
        switch (counter){
            case 1:
                switch1.setChecked(true);
                toggleButton.setChecked(false);
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                break;
            case 2:
                switch1.setChecked(false);
                toggleButton.setChecked(true);
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                switch1.setChecked(false);
                toggleButton.setChecked(false);
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                break;
            case 4:
                switch1.setChecked(true);
                toggleButton.setChecked(true);
                getWindow().getDecorView().setBackgroundColor(Color.RED);
                break;
        }

    }


}
