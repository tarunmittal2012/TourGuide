package com.example.tarunmittal.tourguide;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {

    LinearLayout mainLayout;

    TabLayout mTabLayout;

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.viewPager);
        mTabLayout = findViewById(R.id.tabLayout);
        mainLayout = findViewById(R.id.ll2);
        MyProgressbar myProgressbar = new MyProgressbar(this);

        myProgressbar.execute();
        mTabLayout.addTab(mTabLayout.newTab().setText(R.string.school).setIcon(R.drawable.ic_school));
        mTabLayout.addTab(mTabLayout.newTab().setText(R.string.restaurant).setIcon(R.drawable.ic_restaurant));
        mTabLayout.addTab(mTabLayout.newTab().setText(R.string.temple).setIcon(R.drawable.ic_temple));
        mTabLayout.addTab(mTabLayout.newTab().setText(R.string.festival).setIcon(R.drawable.ic_festival));
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
                    SchoolFragment school_fragment = new SchoolFragment();
                    return school_fragment;
                }
                case 1: {
                    RestaurantFragment restaurant = new RestaurantFragment();
                    return restaurant;
                }
                case 2: {
                    TempleFragment temples = new TempleFragment();
                    return temples;
                }
                case 3: {
                    FestivalFragment festivals = new FestivalFragment();
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

    private class MyProgressbar extends AsyncTask<Void, Integer, String> {

        Context mContext;

        ProgressDialog mProgressDialog;

        public MyProgressbar(MainActivity mainActivity) {

            this.mContext = mainActivity;
        }

        @Override
        protected void onPreExecute() {

            super.onPreExecute();
            mainLayout.setVisibility(View.GONE);
            mProgressDialog = new ProgressDialog(mContext);
            mProgressDialog.setTitle(getString(R.string.progress_text));
            mProgressDialog.setMessage(getString(R.string.progress_message));
            mProgressDialog.show();
        }

        @Override
        protected String doInBackground(Void... voids) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return getString(R.string.progress_output);
        }

        @Override
        protected void onPostExecute(String s) {

            super.onPostExecute(s);
            mProgressDialog.dismiss();
            mainLayout.setVisibility(View.VISIBLE);

        }
    }
}
