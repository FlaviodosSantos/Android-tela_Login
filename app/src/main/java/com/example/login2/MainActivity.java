package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* esconder a barra de titulo*/
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        user = findViewById(R.id.user);
        password = findViewById(R.id.password);
    }

    public void login(View view){
        if(user.getText().toString().equals("admin") && password.getText().toString().equals("12345")){
            Intent it = new Intent(this, MainActivity2.class);
            startActivity(it);
            finish();
        }else {
            Toast.makeText(this,"Usuario ou senha incorretos!", Toast.LENGTH_LONG).show();
        }

        //finish();   era o que tava causando o bug


    }
}