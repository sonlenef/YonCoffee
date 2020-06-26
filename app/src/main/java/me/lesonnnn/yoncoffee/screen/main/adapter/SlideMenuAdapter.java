package me.lesonnnn.yoncoffee.screen.main.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;

/**
 * Created by leson on 6/26/20
 */
public class SlideMenuAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mListPages;

    public SlideMenuAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void setListPage(List<Fragment> listPage) {
        mListPages = listPage;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mListPages.get(position);
    }

    @Override
    public int getCount() {
        return mListPages.size();
    }
}
