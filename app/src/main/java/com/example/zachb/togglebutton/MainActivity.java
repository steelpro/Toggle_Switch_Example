package com.example.zachb.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    ToggleButton tglBtn;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.txtBox); //create variable that is textBox
        textView.setVisibility(View.INVISIBLE); //and is invisible by default

        textView2 = (TextView) findViewById(R.id.txtBox2);
        textView2.setVisibility(View.INVISIBLE);
    }

    public void changeVis(View view) {

        boolean checked = ((ToggleButton)view).isChecked(); //returns true if toggle is on, false if off
        tglBtn = (ToggleButton) findViewById(R.id.toggleButton);

        if (checked) { //if toggle button is turned on
            textView.setVisibility(View.VISIBLE); //set text to true
            tglBtn.setText("Visible"); //change toggle text to Visible
        }
        else {
            textView.setVisibility(View.INVISIBLE);
            tglBtn.setText("Invisible");
        }

    }

    public void changeVis2(View view) { //this method works the same as the previous

        boolean checked = ((Switch)view).isChecked();
        aSwitch = (Switch) findViewById(R.id.switchBtn);

        if (checked) {
            textView2.setVisibility(View.VISIBLE);
            aSwitch.setText("On");
        }
        else {
            textView2.setVisibility(View.INVISIBLE);
            aSwitch.setText("Off");
        }

    }
}
