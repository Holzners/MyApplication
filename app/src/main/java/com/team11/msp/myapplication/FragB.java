package com.team11.msp.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragB extends Fragment {

    String string;

    public static FragB newInstance(String string) {
        FragB fragment = new FragB();
        fragment.setString(string);
        return fragment;
    }

    public FragB() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        greatFragA();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_b, container, false);
    }
    public void greatFragA(){
        MainActivity main = (MainActivity)getActivity();
        main.greatA("Hello A i Am B");
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
