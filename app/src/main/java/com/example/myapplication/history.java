package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class history extends AppCompatActivity {

    Button clr;
    TextView hlog;

    List<String> inp = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        clr.findViewById(R.id.clear);
        hlog.findViewById(R.id.hislog);

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hlog.setText("");
                inp.clear();
            }
        });

       // disp();

    }

//    public void caller(){
//        Bundle impo = getIntent().getExtras();
//        String datas= impo.getString("qd");
//        String datas2= impo.getString("ad");
//        inp.add(datas);
//        inp.add(datas2);
//    }
//    public void disp(){
//        for(String i : inp){
//            hlog.setText(i);
//        }
//    }

}