package com.ec3_appplatillos;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                validateFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        };
        editTextEmail.addTextChangedListener(textWatcher);
        editTextPassword.addTextChangedListener(textWatcher);
    }

    private void validateFields() {
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        boolean isValid = isValidEmail(email) && isValidPassWord(password);

        buttonLogin.setEnabled(isValid);

        if(isValid) {
             openMenuActivity();
        }
    }

    private boolean isValidEmail(String email) {
        return email.equals("ejemploe@idat.com.pe");
    }

    private boolean isValidPassWord(String password) {
        return password.equals("Peru123.");
    }

    private void openMenuActivity() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
        finish();
    }
}
