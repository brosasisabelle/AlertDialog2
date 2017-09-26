package com.isabelle.alertdialog2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCustomDialog (View view){
        CustomDialog customDialog = new CustomDialog();
        customDialog.show(getSupportFragmentManager(), "custom_dialog");
    }
}
