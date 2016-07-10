package com.example.fernando.helpme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by fernando on 06/07/16.
 */
public class DebugActivity extends AppCompatActivity{
    protected static final String TAG = "ciclo";

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Log.i(TAG,getLocalClassName()+ ".icicle");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,getLocalClassName()+ ".onSaveInstaceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, getLocalClassName()+ ".onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,getLocalClassName()+ ".onRestar()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,getLocalClassName()+ ".onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,getLocalClassName()+ ".onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, getLocalClassName()+ ".onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,getLocalClassName()+ ".onDestroy()");
    }
}
