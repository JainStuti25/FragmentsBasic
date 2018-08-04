package com.example.stutijain.fragmentsbasic;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BasicFragment extends Fragment {
    private static final String TAG = "Basic_Fragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_basic, container,false);
        return v;

    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"Inside  onStart");
    }

    @Override
    public void onActivityCreated(Bundle bundle){
        super.onActivityCreated(bundle);
        Log.d(TAG, "Inside OnActivityCreated");
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        Log.d(TAG, "Inside OnAttache");
    }

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Inside onCreate");


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

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d(TAG, "Inside onDestroyView");
    }

    @Override
    public void onDetach(){
        super.onDetach();
        Log.d(TAG, "Inside onDetach");
    }




}
