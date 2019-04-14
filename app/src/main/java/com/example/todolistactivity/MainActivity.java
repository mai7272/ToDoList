package com.example.todolistactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnToDoList;
    Button btnContact;
int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     btnToDoList = (Button) findViewById(R.id.btnToDoList);
     btnContact =  (Button) findViewById(R.id.btnContact);
    }
    @Override
    protected void onResume() {

        super.onResume();
        counter++;
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Counter", counter);
        Log.d("VIVZ", counter + "was saves");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("Counter");
        Log.d("VIVZ", counter + "was restored");

    }

    public void ToDoList(View v){
    Intent i = new Intent(this, ToDoListActvity.class);
    startActivity(i);
    finish();

}
    public void contact(View v){
        Intent ii = new Intent(this, contactWithMeActivity.class);
        startActivity(ii);
        finish();

    }

}

