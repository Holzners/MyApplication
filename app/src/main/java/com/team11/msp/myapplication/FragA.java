package com.team11.msp.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragA extends Fragment {

    String string;

    public static FragA newInstance(String string) {
        FragA fragment = new FragA();
        fragment.setString(string);
        return fragment;
    }

    public FragA() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        greatFragB();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_, container, false);
    }

    public void greatFragB(){
        MainActivity main = (MainActivity)getActivity();
        main.greatB("Hello B i Am A");
    }

    public void printAnswer(String string){
        System.out.println(this.string);
        System.out.println(string);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


}
