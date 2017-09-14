package com.xinlan.viewpagesrc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
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

        mViewPager.addOnPageChangeListener(new MyViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //mViewPager.setCurrentItem(10,true);

        ImageView imgView;
        ViewPager p;
        FragmentPagerAdapter a;

        RecyclerView rey;
    }

//    private final class MyAdapter2 extends FragmentStatePagerAdapter {
//        public MyAdapter2(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return ImageFragment.newInstance();
//        }
//
//        @Override
//        public int getCount() {
//            return 5;
//        }
//    }

    private final class MyAdapter extends MyFragmentStatePagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            int id = R.drawable.test;
            switch (position){
                case 0:
                    id = R.drawable.poke1;
                    break;
                case 1:
                    id = R.drawable.poke2;
                    break;
                case 2:
                    id = R.drawable.poke3;
                    break;
                case 3:
                    id = R.drawable.poke4;
                case 4:
                    id = R.drawable.poke4;
                    break;
            }
            return ImageFragment.newInstance(id);
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
