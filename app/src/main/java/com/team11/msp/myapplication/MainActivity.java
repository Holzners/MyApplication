package com.team11.msp.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    FragA fragA;
    FragB fragB;
    boolean isFragA = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        fragA = FragA.newInstance("Hello i m FragA");
        fragB = FragB.newInstance("Hello i m FragB");
        FragmentManager fm = this.getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.fragmentContainer, fragA).commit();
    }


    public void changeFrag(View view){
        if(isFragA) {
            isFragA = false;
            FragmentManager fm = this.getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.fragmentContainer, fragB).commit();
        }else{
            isFragA = true;
            FragmentManager fm = this.getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.fragmentContainer, fragA).commit();

        }
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void greatB(String s) {
        fragB.printAnswer(s);
    }

    public void greatA(String s) {
        fragA.printAnswer(s);
    }
}
