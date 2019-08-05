package com.king.mynai;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class PicOneActivity extends AppCompatActivity implements View.OnClickListener {

    Button button0, button1, button2,button3,button4,button5,button6,button7,
            button8,button9, button10, button11, button12, button13,
            button14, button15, button16, button17, button18, button19, button20,
            button21, button22, button23, button24, button25, button26, button27, button28, button29, button30,
            button32, button31, button33, button35, button34, button36, button37;
    TextView number1,number2,number3,number4,number5;
    int counter = 0;
    WebView pageYetu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_one);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        pageYetu = findViewById(R.id.webYetu3);
        WebSettings settingsb = pageYetu.getSettings();
        settingsb.setJavaScriptEnabled(true);

       pageYetu.loadUrl("file:///android_asset/index2.html");
        //pageYetu.loadUrl("https://www.google.com/");


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText("");
                number2.setText("");
                number3.setText("");
                number4.setText("");
                number5.setText("");

            }
        });

        number1 = findViewById(R.id.display);
        number2 = findViewById(R.id.display1);
        number3 = findViewById(R.id.display2);
        number4 = findViewById(R.id.display3);
        number5 = findViewById(R.id.display4);


        button0 = (Button)findViewById(R.id.num_0);
        button1 = (Button)findViewById(R.id.num_1);
        button2 = (Button)findViewById(R.id.num_2);
        button3 = (Button)findViewById(R.id.num_3);
        button4 = (Button)findViewById(R.id.num_4);
        button5 = (Button)findViewById(R.id.num_5);
        button6 = (Button)findViewById(R.id.num_6);
        button7 = (Button)findViewById(R.id.num_7);
        button8 = (Button)findViewById(R.id.num_8);
        button9 = (Button)findViewById(R.id.num_9);
        button10 = (Button)findViewById(R.id.num_10);
        button11 = (Button)findViewById(R.id.num_11);
        button12 = (Button)findViewById(R.id.num_12);
        button13 = (Button)findViewById(R.id.num_13);
        button14 = (Button)findViewById(R.id.num_14);
        button15 = (Button)findViewById(R.id.num_15);
        button16 = (Button)findViewById(R.id.num_16);
        button17 = (Button)findViewById(R.id.num_17);
        button18 = (Button)findViewById(R.id.num_18);
        button19 = (Button)findViewById(R.id.num_19);
        button20 = (Button)findViewById(R.id.num_20);
        button21 = (Button)findViewById(R.id.num_21);
        button22 = (Button)findViewById(R.id.num_22);
        button23 = (Button)findViewById(R.id.num_23);
        button24 = (Button)findViewById(R.id.num_24);
        button25 = (Button)findViewById(R.id.num_25);
        button26 = (Button)findViewById(R.id.num_26);
        button27 = (Button)findViewById(R.id.num_27);
        button28 = (Button)findViewById(R.id.num_28);
        button29 = (Button)findViewById(R.id.num_29);
        button30 = (Button)findViewById(R.id.num_30);
        button31 = (Button)findViewById(R.id.num_31);
        button32 = (Button)findViewById(R.id.num_32);
        button33 = (Button)findViewById(R.id.num_33);
        button34 = (Button)findViewById(R.id.num_34);
        button35 = (Button)findViewById(R.id.num_35);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button28.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button16.setOnClickListener(this);


    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.num_0:

                if (number1.getText().toString().isEmpty()){
                    number1.setText("0");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("0");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("0");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("0");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("0");
                }




                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }
                break;

            case R.id.num_1:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("1");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("1");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("1");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("1");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("1");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }
                break;
            case R.id.num_2:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("2");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("2");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("2");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("2");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("2");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }
                break;

            case R.id.num_3:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("3");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("3");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("3");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("3");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("3");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }


                break;

            case R.id.num_4:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("4");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("4");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("4");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("4");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("4");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_5:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("5");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("5");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("5");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("5");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("5");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;



            case R.id.num_6:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("6");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("6");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("6");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("6");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("6");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_7:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("7");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("7");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("7");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("7");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("7");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;



            case R.id.num_8:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("8");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("8");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("8");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("8");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("8");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;

            case R.id.num_9:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("9");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("9");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("9");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("9");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("9");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;



            case R.id.num_10:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("10");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("10");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("10");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("10");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("10");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_11:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("11");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("11");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("11");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("11");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("11");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_12:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("12");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("12");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("12");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("12");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("12");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_13:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("13");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("13");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("13");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("13");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("13");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_14:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("14");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("14");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("14");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("14");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("14");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;

            case R.id.num_15:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("15");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("15");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("15");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("15");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("15");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_16:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("16");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("16");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("16");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("16");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("16");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_17:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("17");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("17");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("17");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("17");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("17");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_18:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("18");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("18");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("18");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("18");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("18");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_19:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("19");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("19");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("19");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("19");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("19");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_20:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("20");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("20");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("20");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("20");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("20");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_21:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("21");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("21");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("21");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("21");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("21");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_22:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("22");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("22");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("22");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("22");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("22");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_23:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("23");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("23");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("23");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("23");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("23");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_24:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("24");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("24");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("24");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("24");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("24");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_25:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("25");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("25");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("25");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("25");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("25");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;

            case R.id.num_26:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("26");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("26");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("26");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("26");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("26");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_27:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("27");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("27");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("27");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("27");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("27");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;

            case R.id.num_28:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("28");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("28");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("28");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("28");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("28");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_29:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("29");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("29");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("29");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("29");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("29");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_30:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("30");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("30");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("30");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("30");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("30");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_31:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("31");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("31");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("31");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("31");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("31");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_32:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("32");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("32");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("32");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("32");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("32");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_33:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("33");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("33");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("33");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("33");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("33");
                }


                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_34:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("34");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("34");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("34");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("34");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("34");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


            case R.id.num_35:
                if (number1.getText().toString().isEmpty()){
                    number1.setText("35");
                }else if (number2.getText().toString().isEmpty()){
                    number2.setText("35");
                }else if (number3.getText().toString().isEmpty()){
                    number3.setText("35");
                }else if (number4.getText().toString().isEmpty()){
                    number4.setText("35");
                }else if (number5.getText().toString().isEmpty()){
                    number5.setText("35");
                }

                if (number1.getText().toString().isEmpty()||number2.getText().toString().isEmpty()||number3.getText().toString().isEmpty()||number4.getText().toString().isEmpty()||number5.getText().toString().isEmpty()){

                }else {
                    Intent go = new Intent(getApplicationContext(),SpinerActivity.class);
                    go.putExtra("a", String.valueOf(number1.getText()));
                    go.putExtra("b", String.valueOf(number2.getText()));
                    go.putExtra("c", String.valueOf(number3.getText()));
                    go.putExtra("d", String.valueOf(number4.getText()));
                    go.putExtra("e", String.valueOf(number5.getText()));
                    startActivity(go);
                }

                break;


        }
    }
}



