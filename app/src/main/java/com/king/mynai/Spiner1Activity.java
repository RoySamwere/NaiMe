package com.king.mynai;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Spiner1Activity extends AppCompatActivity {

    ImageView iv_wheel;
    TextView textView;
    Button button,popupButton,btns,mDisplay1,mDisplay2,mDisplay3,mDisplay4,mDisplay5;

    String data1,data2,data3,data4,data5;



    Random r;

    int degree = 0, degree_old = 0;

    private static final float FACTOR =4.86f;


    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiner1);

        btns = (Button) findViewById(R.id.btns);
        textView = (TextView) findViewById(R.id.textView);
        iv_wheel = (ImageView) findViewById(R.id.iv_wheel);
        popupButton = findViewById(R.id.popup);

        r = new Random();

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                degree_old = degree % 360;
                degree = r.nextInt(400) + 1000 ;

                RotateAnimation rotate = new RotateAnimation(degree_old,degree,
                        RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);

                rotate.setDuration(4600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                        textView.setText("");

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360 - (degree % 360)));

//                        if (textView.getText().toString().equals(mDisplay1.getText().toString())){
//                            //Change te button's bg color
//                            mDisplay1.setBackgroundColor(R.color.colorAccent);
//                        }
//                        if (textView.getText().toString().equals(mDisplay2.getText().toString())){
//                            //Change te button's bg color
//                            mDisplay2.setBackgroundColor(R.color.colorAccent);
//                        }
//                        if (textView.getText().toString().equals(mDisplay3.getText().toString())){
//                            //Change te button's bg color
//                            mDisplay3.setBackgroundColor(R.color.colorAccent);
//                        }
//                        if (textView.getText().toString().equals(mDisplay4.getText().toString())){
//                            //Change te button's bg color
//                            mDisplay4.setBackgroundColor(R.color.colorAccent);
//                        }
//                        if (textView.getText().toString().equals(mDisplay5.getText().toString())){
//                            //Change te button's bg color
//                            mDisplay5.setBackgroundColor(R.color.colorAccent);
//                        }

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                iv_wheel.startAnimation(rotate);

            }
        });


        popupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupMenuExample();
            }
        });

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle != null){
            data1 = bundle.getString("a");
            data2 = bundle.getString("b");
            data3 = bundle.getString("c");
            data4 = bundle.getString("d");
            data5 = bundle.getString("e");
        }

        mDisplay1 = findViewById(R.id.btnDisplay1);
        mDisplay2 = findViewById(R.id.btnDisplay2);
        mDisplay3 = findViewById(R.id.btnDisplay3);
        mDisplay4 = findViewById(R.id.btnDisplay4);
        mDisplay5 = findViewById(R.id.btnDisplay5);
        mDisplay1.setText(data1+"");
        mDisplay2.setText(data2+"");
        mDisplay3.setText(data3+"");
        mDisplay4.setText(data4+"");
        mDisplay5.setText(data5+"");



    }

    private void popupMenuExample() {
        PopupMenu p = new PopupMenu(Spiner1Activity.this, popupButton);
        p.getMenuInflater().inflate(R.menu.main, p .getMenu());
        p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {


            public boolean onMenuItemClick(MenuItem item) {

                int id = item.getItemId();

                //noinspection SimplifiableIfStatement

                if (id == R.id.nav_gallery) {

                    Intent page_one = new Intent(Spiner1Activity.this,PicOneActivity.class);
                    startActivity(page_one);

                } if (id == R.id.nav_raffle)
                    Toast.makeText(Spiner1Activity.this, "Find Out More is Clicked", Toast.LENGTH_LONG).show();



                if (id == R.id.nav_send)
                    Toast.makeText(Spiner1Activity.this, "Buy Points here", Toast.LENGTH_LONG).show();



                if (id == R.id.nav_slideshow)
                    Toast.makeText(Spiner1Activity.this, "Add Players", Toast.LENGTH_LONG).show();


                if (id == R.id.nav_send)
                    Toast.makeText(Spiner1Activity.this, "Redeme Points", Toast.LENGTH_LONG).show();

                return true;

            }



        });




        p.show();
    }

    private String currentNumber (int degrees){

        String text ="";

        if (degrees >= (FACTOR * 1) && degrees < (FACTOR * 3)){

            text = "32  ";
        }

        if (degrees >= (FACTOR * 3) && degrees < (FACTOR * 5)){

            text = "15  ";
        }
        if (degrees >= (FACTOR * 5) && degrees < (FACTOR * 7)){

            text = "19  ";
        }
        if (degrees >= (FACTOR * 7) && degrees < (FACTOR * 9)){

            text = "4  ";
        }
        if (degrees >= (FACTOR * 9) && degrees < (FACTOR * 11)){

            text = "21  ";
        }
        if (degrees >= (FACTOR * 11) && degrees < (FACTOR * 13)){

            text = "2  ";
        }
        if (degrees >= (FACTOR * 13) && degrees < (FACTOR * 15)){

            text = "25  ";
        }
        if (degrees >= (FACTOR * 15) && degrees < (FACTOR * 17)){

            text = "17  ";
        }
        if (degrees >= (FACTOR * 17) && degrees < (FACTOR * 19)){

            text = "34  ";
        }
        if (degrees >= (FACTOR * 19) && degrees < (FACTOR * 21)){

            text = "6    ";
        }
        if (degrees >= (FACTOR * 21) && degrees < (FACTOR * 23)){

            text = "27  ";
        }

        if (degrees >= (FACTOR * 23) && degrees < (FACTOR * 25)){

            text = "13  ";
        }

        //Additions
        if (degrees >= (FACTOR * 25) && degrees < (FACTOR * 27)){

            text = "36  ";
        }

        if (degrees >= (FACTOR * 27) && degrees < (FACTOR * 29)){

            text = "11  ";
        }

        if (degrees >= (FACTOR * 29) && degrees < (FACTOR * 31)){

            text = "30  ";
        }

        if (degrees >= (FACTOR * 31) && degrees < (FACTOR * 33)){

            text = "8";
        }

        if (degrees >= (FACTOR * 33) && degrees < (FACTOR * 35)){

            text = "23";
        }

        if (degrees >= (FACTOR * 35) && degrees < (FACTOR * 37)){

            text = "10";
        }

        if (degrees >= (FACTOR * 37) && degrees < (FACTOR * 39)){

            text = "5  ";
        }

        if (degrees >= (FACTOR * 39) && degrees < (FACTOR * 41)){

            text = "24  ";
        }

        if (degrees >= (FACTOR * 41) && degrees < (FACTOR * 43)){

            text = "16  ";
        }

        if (degrees >= (FACTOR * 43) && degrees < (FACTOR * 45)){

            text = "33  ";
        }

        if (degrees >= (FACTOR * 45) && degrees < (FACTOR * 47)){

            text = "1  ";
        }

        if (degrees >= (FACTOR * 47) && degrees < (FACTOR * 49)){

            text = "20  ";
        }

        if (degrees >= (FACTOR * 49) && degrees < (FACTOR * 51)){

            text = "14  ";
        }

        if (degrees >= (FACTOR * 51) && degrees < (FACTOR * 53)){

            text = "31";
        }

        //there

        if (degrees >= (FACTOR * 53) && degrees < (FACTOR * 55)){

            text = "9 ";
        }

        if (degrees >= (FACTOR * 55) && degrees < (FACTOR * 57)){

            text = "22";
        }

        if (degrees >= (FACTOR * 57) && degrees < (FACTOR * 59)){

            text = "18 ";
        }

        if (degrees >= (FACTOR * 59) && degrees < (FACTOR * 61)){

            text = "29";
        }

        if (degrees >= (FACTOR * 61) && degrees < (FACTOR * 63)){

            text = "7";
        }

        if (degrees >= (FACTOR * 63) && degrees < (FACTOR * 65)){

            text = "28";
        }

        if (degrees >= (FACTOR * 65) && degrees < (FACTOR * 67)){

            text = "12";
        }

        if (degrees >= (FACTOR * 67) && degrees < (FACTOR * 69)){

            text = "35  ";
        }

        if (degrees >= (FACTOR * 69) && degrees < (FACTOR * 71)){

            text = "3  ";
        }

        if (degrees >= (FACTOR * 71) && degrees < (FACTOR * 73)){

            text = "26  ";
        }

        //Ends there

        if ((degrees >= (FACTOR * 73) && degrees < 360)||(degrees >= 0 && degrees < (FACTOR * 1))) {

            text = "0";
        }


        return text;
    }

    //ADDING MENU HUKO JUU KWA MAIN MENU PAGE
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}
