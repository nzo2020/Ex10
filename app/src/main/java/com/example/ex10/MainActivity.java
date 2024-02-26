package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;








public class MainActivity extends AppCompatActivity {

    Button button2;
    ToggleButton tB;
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tB = (ToggleButton) findViewById(R.id.tB);
        s = (Switch) findViewById(R.id.s);
        button2 = (Button) findViewById(R.id.button2);
    }
    public void clicked(View view){
        if (s.isChecked() && tB.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);

        }
        if (s.isChecked() && tB.isChecked()==false) {
            getWindow().getDecorView().setBackgroundColor(Color.RED);

        }
        if (s.isChecked()==false && tB.isChecked()) {
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);

        }
        if (s.isChecked()==false && tB.isChecked()==false){
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);

        }

    }


}
