package whaples.tdb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        establishButtons();

    }

    private void establishButtons()
    {
        Button d4 = (Button) findViewById(R.id.d4);
        Button d6 = (Button) findViewById(R.id.d6);
        Button d10 = (Button) findViewById(R.id.d10);
        Button d12 = (Button) findViewById(R.id.d12);
        Button d20 = (Button) findViewById(R.id.d20);

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, diceView.class);
                intent.putExtra("Dice",4);
                startActivity(intent);
            }
        });

        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, diceView.class);
                intent.putExtra("Dice",6);
                startActivity(intent);
            }
        });

        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, diceView.class);
                intent.putExtra("Dice",10);
                startActivity(intent);
            }
        });

        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, diceView.class);
                intent.putExtra("Dice",12);
                startActivity(intent);
            }
        });

        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, diceView.class);
                intent.putExtra("Dice",20);
                startActivity(intent);
            }
        });


    }




}
