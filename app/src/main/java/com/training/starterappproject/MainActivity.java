package com.training.starterappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project[] projects = {
                new Project( "Getting Started app","Our very first project, the default 'Hello World' app!", R.drawable.getting_started),
                new Project( "App","Making a simple change to the layout, with my oun personal motivational quote for software developers!", R.drawable.quote),
                new Project( "BMI Calculator","A real life working BMI calculator teaching me Variables, Methods and Conditional logic ", R.drawable.calculator),
                new Project( "Inches Converter","A basic converter to convert inches to meters (my own personal calculator app made on my own)", R.drawable.tape),
                new Project( "The Hungry Developer","A menu app for a fictional restaurant, learning abut Activities, Classes & Objects,Arrays Intends and ListViews", R.drawable.hungry_developer)



        };

    }

}