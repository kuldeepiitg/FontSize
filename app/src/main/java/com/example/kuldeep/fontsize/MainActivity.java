package com.example.kuldeep.fontsize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] ids = {R.id.t1, R.id.t2,  R.id.t3,  R.id.t4,  R.id.t5,  R.id.t6,  R.id.t7,  R.id.t8};
        for (int i = 0; i < ids.length; i++) {
            TextView sT = (TextView) findViewById(ids[i]);
            if (sT != null)
                sT.setTextSize(9 + i);
        }
    }
}
