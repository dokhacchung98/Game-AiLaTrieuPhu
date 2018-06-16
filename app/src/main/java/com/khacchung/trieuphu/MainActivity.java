package com.khacchung.trieuphu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FrameLayout frameLayout;
    private Fragment_Menu fragment_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
    }

    private void initFragment() {
        fragment_menu = new Fragment_Menu();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.flPanel, fragment_menu);
        fragmentTransaction.commit();
    }

    public void switchFragment(Fragment fragment) {

    }
}
