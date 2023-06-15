package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_levels);


        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    Intent i = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(i);finish();
                }catch (Exception e){

                }
            }
        });
        //Кнопка для прехода на первый уровень
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent i = new Intent(GameLevels.this, Level1.class);
                    startActivity(i); finish();
                }catch (Exception e){
                    //пусто
                }
            }
        });
    }




    //Системная кнопка "назад"
    @Override
    public void onBackPressed() {
        try {
            Intent i = new Intent(GameLevels.this, MainActivity.class);
            startActivity(i);
            finish();
        } catch (Exception e) {

        }

    }
}