package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Convertor extends AppCompatActivity {

    Spinner ufsp, utsp;
    EditText uftxt;
    TextView uttxt;
    Button uconv;

    Spinner cfsp, ctsp;
    EditText cftxt;
    TextView cttxt;
    Button cconv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertor);

        ufsp= findViewById(R.id.fromdd);
        utsp= findViewById(R.id.todd);
        uftxt= findViewById(R.id.fromtxt);
        uttxt= findViewById(R.id.totxt);
        uconv= findViewById(R.id.ucb);

        cfsp= findViewById(R.id.cfdd);
        ctsp= findViewById(R.id.ctdd);
        cftxt= findViewById(R.id.cftxt);
        cttxt= findViewById(R.id.cttxt);
        cconv= findViewById(R.id.cbtn);

        String[] ufrom = {"-option-","USD","NEPALI"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,ufrom);
        ufsp.setAdapter(ad1);

        String[] uto = {"-option-","USD","NEPALI"};
        ArrayAdapter ad2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,uto);
        utsp.setAdapter(ad2);

        uconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ufsp.getSelectedItem().toString() == "-option-" || utsp.getSelectedItem().toString() == "-option-"){

                }
                else if (ufsp.getSelectedItem().toString() == "USD" && utsp.getSelectedItem().toString() == "USD"){
                    uttxt.setText(uftxt.getText().toString());
                }
                else if (ufsp.getSelectedItem().toString() == "NEPALI" && utsp.getSelectedItem().toString() == "NEPALI"){
                    uttxt.setText(uftxt.getText().toString());
                }
                else if (ufsp.getSelectedItem().toString() == "USD" && utsp.getSelectedItem().toString() == "NEPALI"){
                    double a = Double.parseDouble(uftxt.getText().toString());
                    double b = a*116.2;
                    uttxt.setText(String.format("%.4f",b));
                }
                else{
                    double a = Double.parseDouble(uftxt.getText().toString());
                    double b = a/116.2;
                    uttxt.setText(String.format("%.4f",b));
                }

            }
        });

        String[] ufrom1 = {"-option-","kg","pound"};
        ArrayAdapter ad3 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,ufrom1);
        cfsp.setAdapter(ad3);

        String[] uto1 = {"-option-","kg","pound"};
        ArrayAdapter ad4 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,uto1);
        ctsp.setAdapter(ad4);

        cconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cfsp.getSelectedItem().toString() == "-option-" || ctsp.getSelectedItem().toString() == "-option-"){

                }
                else if (cfsp.getSelectedItem().toString() == "kg" && ctsp.getSelectedItem().toString() == "kg"){
                    cttxt.setText(cftxt.getText().toString());
                }
                else if (cfsp.getSelectedItem().toString() == "pound" && ctsp.getSelectedItem().toString() == "pound"){
                    cttxt.setText(cftxt.getText().toString());
                }
                else if (cfsp.getSelectedItem().toString() == "kg" && ctsp.getSelectedItem().toString() == "pound"){
                    double a = Double.parseDouble(cftxt.getText().toString());
                    double b = a*2.204;
                    cttxt.setText(String.format("%.4f",b));
                }
                else{
                    double a = Double.parseDouble(cftxt.getText().toString());
                    double b = a/2.204;
                    cttxt.setText(String.format("%.4f",b));
                }

            }
        });

    }
}