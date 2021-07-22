package com.example.noteapp.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.noteapp.onboard.FirstFragment;
import com.example.noteapp.onboard.OnBoardFragment;
import com.example.noteapp.onboard.SecondFragment;
import com.example.noteapp.onboard.ThreeFragment;

import org.jetbrains.annotations.NotNull;

public class OnBoardAdapter extends FragmentPagerAdapter {


    public OnBoardAdapter(@NonNull  FragmentManager fm) {
        super(fm);
    }

    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThreeFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
