package com.gdmec.s07150713.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String TAG ="MainActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onDestroy: "+ "我走到前台了 " );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called with: " + "我可以用啦");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onDestroy: "+  "我失去控制权了 ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onDestroy: "+ "我被控制了 " );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() called with: " + "我又可以用了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: "+"请清理内存");
    }
}
