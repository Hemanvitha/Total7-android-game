package com.game.total7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    private ImageView image1, image2;
    public Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll = findViewById(R.id.rollDices);
        image1 = findViewById(R.id.image11);
        image2 = findViewById(R.id.image22);




        // the following code represents the event listener for the roll button click

        roll.setOnClickListener(new View.OnClickListener() {
            // set what to do when clicked
//           @Override
            public void onClick(View v){
                // animated image 1
                //animated image 2
                rolling();
            }

        });
    }
    public void rolling() {
        //find the image view in the layout
//        ImageView diceImage1 = (ImageView) findViewById(R.id.image11);
//        ImageView diceImage = (ImageView) findViewById(R.id.image22);

        int value = rand.nextInt(6)+1;

        switch (value){
            case 1:
                image1.setImageResource(R.drawable.dice_1);
                image2.setImageResource(R.drawable.dice_1);
                break;

            case 2:
                image1.setImageResource(R.drawable.dice_2);
                image2.setImageResource(R.drawable.dice_2);
                break;

            case 3:
                image1.setImageResource(R.drawable.dice_3);
                image2.setImageResource(R.drawable.dice_3);
                break;

            case 4:
                image1.setImageResource(R.drawable.dice_4);
                image2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                image1.setImageResource(R.drawable.dice_5);
                image2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                image1.setImageResource(R.drawable.dice_6);
                image2.setImageResource(R.drawable.dice_6);
                break;
            default:
                break;
        }
    }

}

