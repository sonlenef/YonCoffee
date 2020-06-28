package me.lesonnnn.yoncoffee.screen.main.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import me.lesonnnn.yoncoffee.R;
import me.lesonnnn.yoncoffee.screen.main.adapter.ItemMenuAdapter;
import me.lesonnnn.yoncoffee.screen.main.model.ItemMenuHome;
import me.lesonnnn.yoncoffee.screen.product.ProductActivity;

/**
 * Created by leson on 6/26/20
 */
public class HomeFragment extends Fragment implements ItemMenuAdapter.onClickItemMenu {
    private List<ItemMenuHome> mItemMenuHomes;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.rvHome);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mItemMenuHomes = new ArrayList<>();
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Espresso")
                .menuImage(R.drawable.espresso)
                .build());
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Cappuccino")
                .menuImage(R.drawable.capuccino)
                .build());
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Macciato")
                .menuImage(R.drawable.macciato)
                .build());
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Mocha")
                .menuImage(R.drawable.mocha)
                .build());
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Latte")
                .menuImage(R.drawable.latte)
                .build());
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Espresso")
                .menuImage(R.drawable.espresso)
                .build());
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Cappuccino")
                .menuImage(R.drawable.capuccino)
                .build());
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Macciato")
                .menuImage(R.drawable.macciato)
                .build());
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Mocha")
                .menuImage(R.drawable.mocha)
                .build());
        mItemMenuHomes.add(new ItemMenuHome.ItemMenuHomeBuilder().menuTitle("Latte")
                .menuImage(R.drawable.latte)
                .build());
        ItemMenuAdapter itemMenuAdapter = new ItemMenuAdapter(getContext(), mItemMenuHomes);
        itemMenuAdapter.setOnClickItemMenu(this);
        recyclerView.setAdapter(itemMenuAdapter);
    }

    @Override
    public void onClickItem(int id) {
        Intent i = new Intent(getContext(), ProductActivity.class);
        i.putExtra("idProduct", id);
        startActivity(i);
    }
}
