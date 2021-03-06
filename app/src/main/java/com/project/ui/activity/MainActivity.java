package com.project.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.project.R;
import com.project.base.BaseActivity;
import com.project.ui.fragment.ShowApiGifFragment;
import com.project.ui.fragment.ShowApiTextFragment;

public class MainActivity extends BaseActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private Fragment frags[];
    @Override
    protected void initParam(Bundle param) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mTabLayout = findViewById(R.id.mTabLayout);
        mViewPager = findViewById(R.id.mViewPager);
        frags = new Fragment[2];
        frags[0] = new ShowApiTextFragment();
        frags[1] = new ShowApiGifFragment();

    }

    @Override
    protected void initData() {
        mViewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText("文字");
        mTabLayout.getTabAt(1).setText("GIF");

    }

    @Override
    protected void initListener() {

    }


    @Override
    public void onClick(View view) {

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    private class MyViewPagerAdapter extends FragmentPagerAdapter{

        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return frags[position];
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            return super.instantiateItem(container, position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
        }

        @Override
        public int getCount() {
            return frags.length;
        }
    }


}
