package me.lesonnnn.yoncoffee.screen.login;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import me.lesonnnn.yoncoffee.R;
import me.lesonnnn.yoncoffee.screen.main.MainActivity;

/**
 * Created by leson on 6/25/20
 */
public class LoginActivity extends AppCompatActivity implements LoginFragment.OnClickBtnLoginNext{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        LoginFragment loginFragment = new LoginFragment();
        loginFragment.setOnClickBtnLoginNext(this);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.layoutLogin, loginFragment);
        fragmentTransaction.addToBackStack("login");
        fragmentTransaction.commit();
    }

    @Override
    public void onClickLoginNext() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}
