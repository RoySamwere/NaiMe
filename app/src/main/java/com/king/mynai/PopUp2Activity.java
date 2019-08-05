package com.king.mynai;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class PopUp2Activity extends AppCompatActivity {

    Button mBtnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up2);


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


    }

}
