package com.example.diceroller;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView dice;
    private Random rng = new Random();
    private TextView rolledvalue;
    private MediaPlayer roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rolledvalue = (TextView)findViewById(R.id.rolledvalue);

        dice = findViewById(R.id.dice);
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                rollDice();
            }
        });
    }

    private void rollDice()
    {
        int randomNumber = rng.nextInt(20) + 1;
        switch(randomNumber)
        {
            case 1:
                dice.setImageResource(R.drawable.roll1);
                rolledvalue.setText("Critical Miss!");
                roll = MediaPlayer.create(this, R.raw.youdied);
                roll.start();
                break;
            case 2:
                dice.setImageResource(R.drawable.roll2);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 3:
                dice.setImageResource(R.drawable.roll3);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 4:
                dice.setImageResource(R.drawable.roll4);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 5:
                dice.setImageResource(R.drawable.roll5);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 6:
                dice.setImageResource(R.drawable.roll6);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 7:
                dice.setImageResource(R.drawable.roll7);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 8:
                dice.setImageResource(R.drawable.roll8);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 9:
                dice.setImageResource(R.drawable.roll9);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 10:
                dice.setImageResource(R.drawable.roll10);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 11:
                dice.setImageResource(R.drawable.roll11);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 12:
                dice.setImageResource(R.drawable.roll12);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 13:
                dice.setImageResource(R.drawable.roll13);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 14:
                dice.setImageResource(R.drawable.roll14);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 15:
                dice.setImageResource(R.drawable.roll15);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 16:
                dice.setImageResource(R.drawable.roll16);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 17:
                dice.setImageResource(R.drawable.roll17);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 18:
                dice.setImageResource(R.drawable.roll18);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 19:
                dice.setImageResource(R.drawable.roll19);
                rolledvalue.setText("");
                roll = MediaPlayer.create(this, R.raw.rollsound);
                roll.start();
                break;
            case 20:
                dice.setImageResource(R.drawable.roll20);
                rolledvalue.setText("Critical Hit!");
                roll = MediaPlayer.create(this, R.raw.victory);
                roll.start();
                break;
        }
    }
}
