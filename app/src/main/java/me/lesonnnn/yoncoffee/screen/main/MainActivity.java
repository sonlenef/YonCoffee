package me.lesonnnn.yoncoffee.screen.main;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import me.lesonnnn.yoncoffee.R;
import me.lesonnnn.yoncoffee.screen.main.adapter.SlideMenuAdapter;
import me.lesonnnn.yoncoffee.screen.main.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private int[] imageResId = {
            R.drawable.ic_home,
            R.drawable.ic_locate,
            R.drawable.ic_cart,
            R.drawable.ic_profile
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        TabLayout tabLayout = findViewById(R.id.tabMenu);
        ViewPager viewPager = findViewById(R.id.vpMain);
        viewPager.setCurrentItem(1);

        SlideMenuAdapter slideMenuAdapter = new SlideMenuAdapter(getSupportFragmentManager());
        List<Fragment> listPages = new ArrayList<>();
        listPages.add(new HomeFragment());
        listPages.add(new HomeFragment());
        listPages.add(new HomeFragment());
        listPages.add(new HomeFragment());
        slideMenuAdapter.setListPage(listPages);
        viewPager.setAdapter(slideMenuAdapter);
        tabLayout.setupWithViewPager(viewPager);

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            Objects.requireNonNull(tabLayout.getTabAt(i)).setIcon(imageResId[i]);
        }

        BadgeDrawable badge = Objects.requireNonNull(tabLayout.getTabAt(2)).getOrCreateBadge();
        badge.setVisible(true);
        // Optionally show a number.
        badge.setNumber(999);
    }
}