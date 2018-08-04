package com.example.stutijain.fragmentsbasic;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends FragmentActivity {
    private static final String TAG ="Main_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new BasicFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
   @Override
    public void onStart(){
        super.onStart();
       Log.d(TAG,"Inside  onStart");
   }



   @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"Inside onPause");
   }

   @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "Inside onResume");
   }

   @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "Inside onStop");
   }

   @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Inside onDestroy");
   }
}


