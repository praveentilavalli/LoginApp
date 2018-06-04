package com.example.adityacomputers.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText unameET,passwdET;
    Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initilize the resources with their ids
        unameET=(EditText)findViewById(R.id.usernameET);
        passwdET=(EditText)findViewById(R.id.passwdET);
        loginbtn=(Button)findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //read data from views;
                String uname=unameET.getText().toString();
                String passwd=passwdET.getText().toString();
                //check valid user or not and display meesage
                if(uname.equals("praveen")&&passwd.equals("praveen"))
                {
                    Toast.makeText(MainActivity.this,"Logined successfully",Toast.LENGTH_LONG).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Invalid username or password",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
