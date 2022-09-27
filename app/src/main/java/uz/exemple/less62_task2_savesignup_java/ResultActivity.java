package uz.exemple.less62_task2_savesignup_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tv_fullName,tv_email,tv_password,tv_cpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initViews();
    }

    void initViews(){
        tv_fullName = findViewById(R.id.tv_myName);
        tv_email = findViewById(R.id.tv_myEmail);
        tv_password = findViewById(R.id.tv_myPassword);
        tv_cpassword = findViewById(R.id.tv_myConfPassword);

        tv_fullName.setText(PrefsManager.getInstance(this).getData("fullName"));
        tv_email.setText(PrefsManager.getInstance(this).getData("email"));
        tv_password.setText(PrefsManager.getInstance(this).getData("password"));
        tv_cpassword.setText(PrefsManager.getInstance(this).getData("cpassword"));
    }
}