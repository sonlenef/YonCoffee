package me.lesonnnn.yoncoffee.screen.product;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import me.lesonnnn.yoncoffee.R;

/**
 * Created by leson on 6/28/20
 */
public class ProductActivity extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        initView();
    }

    private void initView() {
    }
}
