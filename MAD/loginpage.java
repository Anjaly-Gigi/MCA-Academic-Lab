package com.example.login;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   Button login;
   EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        login=(Button)findViewById(R.id.login_button);
        login.setOnClickListener(this);

    }

    public void onClick(View view) {

        if (view.getId() == R.id.login_button) {
            String a = username.getText().toString();
            String b = password.getText().toString();
            if (a.equals("anjaly") && b.equals("2001"))
                Toast.makeText(this, "Login Success !", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "Login Failed !", Toast.LENGTH_LONG).show();

        }
    }
