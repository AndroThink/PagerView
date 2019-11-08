package com.androthink.viewpager.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.androthink.viewpager.model.PagerViewFragment;

import java.util.List;

public class PagerViewAdapter extends FragmentStatePagerAdapter {

    private List<PagerViewFragment> fragmentsList;

    public PagerViewAdapter(List<PagerViewFragment> fragmentsList, FragmentManager fragmentManager) {
        super(fragmentManager,FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragmentsList = fragmentsList;
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }

    @Override
    @NonNull
    public Fragment getItem(int position) {
        return fragmentsList.get(position).getFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position < fragmentsList.size())
            return fragmentsList.get(position).getTitle();
        else
            return null;
    }
}


