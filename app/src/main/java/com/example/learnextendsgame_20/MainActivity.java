package com.example.learnextendsgame_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.learnextendsgame_20.data.Hero;
import com.example.learnextendsgame_20.data.Monster;

public class MainActivity extends AppCompatActivity {
    private RadioGroup RGHeroAtk, RGHeroDef;
    private RadioButton RBMonsterAtkHead, RBMonsterAtkBody, RBMonsterAtkLegs, RBMonsterDefHead, RBMonsterDefBody, RBMonsterDefLegs;
    private TextView TVHeroHP, TVHeroATK, TVMonsterHP, TVMonsterATK;
    private Button button;
    private Hero hero = new Hero(200, 10);
    private Monster monster = new Monster(200, 10);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//Установка ориентации экрана
        setContentView(R.layout.activity_main);
        RGHeroAtk = findViewById(R.id.radioGroupHeroAtk);
        RGHeroDef = findViewById(R.id.radioGroupHeroDef);
        TVHeroHP = findViewById(R.id.textViewHeroHp);
        TVHeroATK = findViewById(R.id.textViewHeroATK);
        TVMonsterHP = findViewById(R.id.textViewMonsterHP);
        TVMonsterATK = findViewById(R.id.textViewMonsterATK);
        button = findViewById(R.id.button);

        RBMonsterAtkBody = findViewById(R.id.radioButtonMonsterAtkBody);
        RBMonsterAtkHead = findViewById(R.id.radioButtonMonsterAtkHead);
        RBMonsterAtkLegs = findViewById(R.id.radioButtonMonsterAtkLegs);
        RBMonsterDefBody = findViewById(R.id.radioButtonMonsterDefBody);
        RBMonsterDefHead = findViewById(R.id.radioButtonMonsterDefHead);
        RBMonsterDefLegs = findViewById(R.id.radioButtonMonsterDefLegs);
        TVHeroATK.setText("ATK : "+hero.getDamage());
       TVMonsterATK.setText("ATK : " +monster.getDamage());

    }
}