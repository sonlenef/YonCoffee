package me.lesonnnn.yoncoffee.screen.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputLayout;
import me.lesonnnn.yoncoffee.R;
import me.lesonnnn.yoncoffee.screen.main.MainActivity;

/**
 * Created by leson on 6/25/20
 */
public class LoginActivity extends Activity implements View.OnClickListener {
    private TextInputLayout mTilPhoneNumber, mTilPass;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        mTilPhoneNumber = findViewById(R.id.tilPhoneNumber);
        mTilPass = findViewById(R.id.tilPass);
        Button btnLogin = findViewById(R.id.btnLoginNext);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String regexStr = "^[0-9]{10}$";
        if (view.getId() == R.id.btnLoginNext) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
            //            if (Objects.requireNonNull(mTilPhoneNumber.getEditText()).getText()
            //            .toString().matches(regexStr)) {
            //                if (Objects.requireNonNull(mTilPass.getEditText()).getText()
            //                .toString().equals("")) {
            //                    mTilPass.setError("Sai mật khẩu");
            //                }
            //            } else {
            //                mTilPhoneNumber.setError("Số điện thoại không xác định");
            //            }
        }
    }
}
