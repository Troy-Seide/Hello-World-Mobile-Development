package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstwords;
    Button newwords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstwords=(TextView)findViewById(R.id.textView);
        newwords=(Button)findViewById(R.id.button);
        newwords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstwords.setText("You have clicked the button");
            }
        });
        //Button testButton = (Button) findViewById(R.id.button);
        //testButton.setOnClickListener();
    }
}
