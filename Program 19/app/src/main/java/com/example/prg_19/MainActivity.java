package com.example.prg_19;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve username and password from EditText fields
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Perform your login authentication here (e.g., check against database)
                boolean isAuthenticated = authenticate(username, password);

                // Display toast message based on authentication result
                if (isAuthenticated) {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Unsuccessful. Please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Dummy authentication method - replace with your actual authentication logic
    private boolean authenticate(String username, String password) {
        // Dummy credentials for demonstration
        return username.equals("admin") && password.equals("password");
    }
}