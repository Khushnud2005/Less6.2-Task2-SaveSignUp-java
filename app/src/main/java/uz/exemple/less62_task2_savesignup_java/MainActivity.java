package uz.exemple.less62_task2_savesignup_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_fullName,et_email,et_password,et_cpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        et_fullName = findViewById(R.id.et_fullNameSU);
        et_email = findViewById(R.id.et_emailSU);
        et_password = findViewById(R.id.et_passwordSU);
        et_cpassword = findViewById(R.id.et_cpasswordSU);

        Button btn_signUp = findViewById(R.id.btn_signUp);
        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = et_email.getText().toString().trim();
                String fullName = et_fullName.getText().toString().trim();
                String password = et_password.getText().toString().trim();
                String cpassword = et_cpassword.getText().toString().trim();

                PrefsManager.getInstance(v.getContext()).saveData("fullName",fullName);
                PrefsManager.getInstance(v.getContext()).saveData("email",email);
                PrefsManager.getInstance(v.getContext()).saveData("password",password);
                PrefsManager.getInstance(v.getContext()).saveData("cpassword",cpassword);
                openResult();

            }
        });

    }

    void openResult(){
        Intent intent = new Intent(this,ResultActivity.class);
        startActivity(intent);
    }
}