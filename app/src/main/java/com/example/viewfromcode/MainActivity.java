package com.example.viewfromcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //skapa en textwiev
        TextView myTextView = new TextView(this);

        // lägg till text i textview
        myTextView.setText("Hej Världen");

        //skapa object för parametrar och ange storlek
        RelativeLayout.LayoutParams myParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);


        // lägga till regler för placering
        myParams.addRule(RelativeLayout.BELOW, R.id.hello_world);

        //lägg til parameerobject till textview
        myTextView.setLayoutParams(myParams);



        //leta reda på aktiv layout som skapas i xml
        RelativeLayout myLayout = findViewById(R.id.layout);

        //lägg till textview till layouten
        myLayout.addView(myTextView);




    }
}
