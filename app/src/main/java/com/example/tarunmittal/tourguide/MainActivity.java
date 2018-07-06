package com.example.tarunmittal.tourguide;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import static android.view.View.GONE;
public class MainActivity extends AppCompatActivity {
    ProgressBar mProgressBar;
    LinearLayout ll1, ll2;
    TabLayout mTabLayout;
    ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.viewPager);
        mTabLayout = findViewById(R.id.tabLayout);
        mProgressBar = findViewById(R.id.progressbar1);
        ll1 = findViewById(R.id.ll1);
        ll2 = findViewById(R.id.ll2);
        ll1.setVisibility(View.VISIBLE);
        ll2.setVisibility(GONE);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ll1.setVisibility(GONE);
        ll2.setVisibility(View.VISIBLE);
        mTabLayout.addTab(mTabLayout.newTab().setText("School").setIcon(R.drawable.ic_school));
        mTabLayout.addTab(mTabLayout.newTab().setText("Restaurant").setIcon(R.drawable.ic_restaurant));
        mTabLayout.addTab(mTabLayout.newTab().setText("Temple").setIcon(R.drawable.ic_temple));
        mTabLayout.addTab(mTabLayout.newTab().setText("Festival").setIcon(R.drawable.ic_festival));
        EAdapter eAdapter = new EAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(eAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(mTabLayout.getSelectedTabPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
    private class EAdapter extends FragmentPagerAdapter {
        int count;
        public EAdapter(FragmentManager supportFragmentManager, int tabCount) {
            super(supportFragmentManager);
            this.count = tabCount;
        }
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: {
                    School school_fragment = new School();
                    return school_fragment;
                }
                case 1: {
                    Restaurant restaurant = new Restaurant();
                    return restaurant;
                }
                case 2: {
                    Temples temples = new Temples();
                    return temples;
                }
                case 3: {
                    Festivals festivals = new Festivals();
                    return festivals;
                }
            }
            return new Fragment();
        }
        @Override
        public int getCount() {
            return count;
        }
    }
}
