package com.example.avenash_2.dinnerdecider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    List<String> lstFoods=new ArrayList();
    EditText txtNewFood;
    TextView lblFood;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNewFood=findViewById(R.id.txtNewFood);
        lblFood=findViewById(R.id.lblFood);
        initializeList();

    }

    private void initializeList(){
        lstFoods.add("Hamburger");
        lstFoods.add("Pizza");
        lstFoods.add("Mexican");
        lstFoods.add("American");
        lstFoods.add("Chinese");
    }


    public void eventAddFood(View view) {

        String newFood= String.valueOf(txtNewFood.getText()).trim();
        if(!newFood.isEmpty()) {
            lstFoods.add(newFood);
            lblFood.setText(newFood);
            txtNewFood.setText("");
        }
    }

    int getRandomIndex(){
        return (rand.nextInt()& Integer.MAX_VALUE)%lstFoods.size();
    }
    public void eventDecide(View view) {
        lblFood.setText(lstFoods.get(getRandomIndex()));
    }
}
