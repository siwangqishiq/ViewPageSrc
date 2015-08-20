package com.xinlan.viewpagesrc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    private MyViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (MyViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));

        LinearLayout s;
        FragmentPagerAdapter s1;
        ScrollView sw;


        mViewPager.addOnPageChangeListener(new MyViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                System.out.println("measure-->" + mViewPager.getMeasuredWidth());
//                System.out.println("width-->" + mViewPager.getWidth());
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    private final class MyAdapter extends MyFragmentStatePagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return ImageFragment.newInstance();
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
