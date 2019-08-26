package com.example.student.tute4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.student.tute4.Database.DBHelper;

public class MainActivity extends AppCompatActivity {

    DBHelper dbHelper;
    EditText username = (EditText)findViewById(R.id.uName);
    EditText password = (EditText)findViewById(R.id.uName);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){

    }

    public void addUser(View view){

        String uname = username.getText().toString();
        String pswd = password.getText().toString();

        if(!uname.equals("") && !pswd.equals("")){
            if(dbHelper.addInfo(username.getText().toString(), password.getText().toString())) {
                Toast t = Toast.makeText(getApplicationContext(), "Inserted Succesfully!", Toast.LENGTH_LONG);
                t.show();
            }else{
                Toast t1= Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_LONG);
                t1.show();
            }
        }
    }

}
