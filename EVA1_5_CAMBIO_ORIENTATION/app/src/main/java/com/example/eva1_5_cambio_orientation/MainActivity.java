package com.example.eva1_5_cambio_orientation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout frmLyDetail;
    Intent inDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inDetail = new Intent(this, DetailActivity.class);
    }

    public void onMessageFromFragmentToMain(){
        frmLyDetail = findViewById(R.id.frmLyDetail);
        if(frmLyDetail != null){//LANDSCAPE
            //CREAR DINAMICAMENTE EL FRAGMENTO DETAIL
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            DetailFragment detailFragment = new DetailFragment();
            ft.replace(R.id.frmLyDetail, detailFragment);
            ft.commit();
        }else{//PORTRAIT
            startActivity(inDetail);
        }
    }

}