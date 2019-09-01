package com.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;
public void guess(View view){
    EditText guesseditText = (EditText)findViewById((R.id.guesseditText));
    int guesstext = Integer.parseInt(guesseditText.getText().toString());
    if(guesstext > randomnumber){
        Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
    }
    else if(guesstext < randomnumber) {
        Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
    }
    else{
        Toast.makeText(this, "That's right, try again", Toast.LENGTH_SHORT).show();
        Random rn = new Random();
        randomnumber = rn.nextInt(20) + 1;
    }
    //Toast.makeText(this,guesseditText.getText().toString(), Toast.LENGTH_SHORT).show();

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rn = new Random();
        randomnumber = rn.nextInt(20) + 1;
    }
}
