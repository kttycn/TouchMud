package com.stone.touchmud;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class LoginActivity extends Activity {
    private String account = null;
    private String password = null;
    private Button LoginAccount;
    private Button RegisterAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        LoginAccount = (Button)findViewById(R.id.logining_account);
        LoginAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        RegisterAccount = (Button)findViewById(R.id.register_account);
        RegisterAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
