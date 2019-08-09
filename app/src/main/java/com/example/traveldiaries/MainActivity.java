package com.example.traveldiaries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button vBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vBtn1=(Button) findViewById(R.id.viewBtn1);
        vBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_guider_details();
            }
        });

    }

    public void open_guider_details(){
        Intent intent =new Intent(this,GuiderDetails.class);
        startActivity(intent);
    }

}
