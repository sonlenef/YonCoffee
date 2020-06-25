package me.lesonnnn.yoncoffee.screen.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import me.lesonnnn.yoncoffee.R;

/**
 * Created by leson on 6/25/20
 */
public class LoginFragment extends Fragment implements View.OnClickListener {
    private OnClickBtnLoginNext mOnClickBtnLoginNext;
    private EditText mEdtPhoneNumber, mEdtPassword;
    private TextView mTvNotiValidPhone, mTvNotiValidPass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        initView(view);
        return view;
    }

    public void setOnClickBtnLoginNext(OnClickBtnLoginNext onClickBtnLoginNext) {
        mOnClickBtnLoginNext = onClickBtnLoginNext;
    }

    private void initView(View view) {
        Button btnLoginNext = view.findViewById(R.id.btnLoginNext);
        mEdtPhoneNumber = view.findViewById(R.id.edtPhoneNumber);
        mTvNotiValidPhone = view.findViewById(R.id.tvNotiLoginPhone);
        mEdtPassword = view.findViewById(R.id.edtPassword);
        mTvNotiValidPass = view.findViewById(R.id.tvNotiLoginPass);
        mTvNotiValidPhone.setVisibility(View.INVISIBLE);
        mTvNotiValidPass.setVisibility(View.INVISIBLE);
        btnLoginNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String regexStr = "^[0-9]{10}$";
        if (view.getId() == R.id.btnLoginNext) {
            if (mEdtPhoneNumber.getText().toString().matches(regexStr)) {
                mTvNotiValidPhone.setVisibility(View.INVISIBLE);
                mOnClickBtnLoginNext.onClickLoginNext();
            } else {
                mTvNotiValidPhone.setVisibility(View.VISIBLE);
            }
        }
    }

    public interface OnClickBtnLoginNext {
        void onClickLoginNext();
    }
}
