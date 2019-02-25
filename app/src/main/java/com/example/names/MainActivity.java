package com.example.names;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button mybutton;
    private TextView mytextviws;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton = (Button)findViewById(R.id.buttonID);
        mytextviws = (TextView)findViewById(R.id.textViewID);

        final String[] names = {"A","B","C","D","E","F"};

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int Rnum = rand.nextInt(names.length);

                mytextviws.setText(names[Rnum]);
             }
        });
    }
}
