package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class Calculator extends AppCompatActivity {

    public String TAG = "Calc";
    Button ac,c,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bdec,divbtn,addbtn,mulbtn,subbtn,eqbtn,hisbtn;
    TextView qtext,atext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

         ac = findViewById(R.id.acbtn);
         c =  findViewById(R.id.cbtn);

         b1 = findViewById(R.id.btn1);
         b2 = findViewById(R.id.btn2);
         b3 = findViewById(R.id.btn3);
         b4 = findViewById(R.id.btn4);
         b5 = findViewById(R.id.btn5);
         b6 = findViewById(R.id.btn6);
         b7 = findViewById(R.id.btn7);
         b8 = findViewById(R.id.btn8);
         b9 = findViewById(R.id.btn9);
         b0 = findViewById(R.id.btn0);
         b00 = findViewById(R.id.btn00);

         bdec = findViewById(R.id.btndec);

         divbtn = findViewById(R.id.divbtn);
         addbtn = findViewById(R.id.addbtn);
         subbtn = findViewById(R.id.subbtn);
         mulbtn =findViewById(R.id.mulbtn);

         eqbtn = findViewById(R.id.eqbtn);

         hisbtn = findViewById(R.id.hisbtn);

         qtext = findViewById(R.id.qtext);
         atext = findViewById(R.id.atext);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtext.setText("");
                atext.setText("");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = atext.getText().toString();
                if(before.length()>0) {
                    atext.setText(before.substring(0, before.length() - 1));
                }
                else{
                    Log.d(TAG,"neg");
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "1");
                Log.d(TAG,"n1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "2");            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "3");            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "4");            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "5");            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "6");            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "7");            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "8");            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "9");             }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "0");             }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "00");             }
        });
        bdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + ".");             }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "/");             }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "*");             }
        });
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "+");             }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                atext.setText(atext.getText().toString() + "-");             }
        });
        eqbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtext.setText(atext.getText());
                String input = atext.getText().toString();

                Expression exp = new Expression(input);

                String res = String.valueOf(exp.calculate());
                atext.setText(res);

               // String i1 = qtext.getText().toString();
               // String j1 = atext.getText().toString();
                //transfer(i1,j1);


            }
        });

//        hisbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//             histpg();              }
//        });

    }

//    public Intent idk(){
//        Intent passdata = new Intent(this,history.class);
//        return passdata;
//    }

//    Intent passdata = new Intent(this,history.class);
//    public void transfer(String i,String j){
//        //Intent passdata = new Intent(this,history.class);
//        idk().putExtra("qd",i);
//        idk().putExtra("ad",j);
//        history obj = new history();
//        obj.caller();
//    }

    public void histpg(View v){
            Intent i = new Intent(this, history.class);
            startActivity(i);
       // startActivity(idk());
    }

}
