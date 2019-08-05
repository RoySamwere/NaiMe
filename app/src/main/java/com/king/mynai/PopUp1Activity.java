package com.king.mynai;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PopUp1Activity extends AppCompatActivity {

Button mBtnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up1);


//        mBtnShare.findViewById(R.id.btnShare);
        mBtnShare = findViewById(R.id.btnShare);

        mBtnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.setType("text/link");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Hey, download this app!");
                startActivity(shareIntent);

            }
        });


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle != null){
            String point1 = bundle.getString("a");
            String point2 = bundle.getString("b");
            String point3 = bundle.getString("c");
            String point4 = bundle.getString("d");
            String point5 = bundle.getString("e");


            Toast.makeText(this, point1+point2+point3+point4+point5, Toast.LENGTH_SHORT).show();
        }


    }

}
