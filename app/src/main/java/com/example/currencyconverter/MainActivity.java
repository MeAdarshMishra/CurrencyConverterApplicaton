package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText money;
    Button convert_tag;
    Spinner spin;
    TextView rupees,developer;

    ArrayAdapter adapter;
    String list,getMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        money=findViewById(R.id.value);
        convert_tag=findViewById(R.id.convert);
        rupees=findViewById(R.id.result);
        spin=findViewById(R.id.spinner);
        developer=findViewById(R.id.developerAD);
        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/MeAdarshMishra");
            }
        });

        adapter=ArrayAdapter.createFromResource(this,R.array.currencies, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                list=parent.getItemAtPosition(position).toString();
                switch (list) {
                    case "KWD - Kuwaiti Dinar":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *245.70;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "USD - US Dollar":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *74.60;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "BHD - Bahraini Dinar":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *197.35;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "OMR - Omani Riyal":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *193.37;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "JOD - Jordanian Dinar":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *104.98;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "GBP - Pound":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *99.73;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "EUR - Euro":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *83.66;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "TRY - Turkish Lira":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *6.52;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "QAR - Qatari Riyal":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *20.44;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "CAD - Canadian Dollar":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *58.63;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "AUD - Australian Dollar":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *53.80;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "SGD - Singapore Dollar":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *54.53;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "SAR - Saudi Riyal":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *19.84;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "NPR - Nepalese Rupee":{
                        convert_tag.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney=money.getText().toString();
                                if (getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(),"Please enter some value to convert",Toast.LENGTH_SHORT).show();

                                }else{
                                    Double convertDouble=Double.parseDouble(getMoney);
                                    Double store=convertDouble *0.63;
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}