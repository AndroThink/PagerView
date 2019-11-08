package com.androthink.viewpager.model;

import androidx.fragment.app.Fragment;

public class PagerViewFragment {

    private String tag;
    private String title;
    private Fragment fragment;

    public PagerViewFragment() { }

    public PagerViewFragment(Fragment fragment, String title) {
        this.tag = "";
        this.title = title;
        this.fragment = fragment;
    }

    public PagerViewFragment(Fragment fragment, String title, String tag) {
        this.tag = tag;
        this.title = title;
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
