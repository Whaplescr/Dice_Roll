package whaples.tdb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;


public class diceView extends Activity {

    private ImageButton blank_die;
    private int die;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_view);

        Intent intent = getIntent();
        die = intent.getIntExtra("Dice",-1);

        displayDie(die);

        setListener();
    }

    private void displayDie(int die)
    {
        blank_die = (ImageButton)findViewById(R.id.die_button);
        blank_die.setPadding(0,0,0,0);

        switch(die)
        {
            case 4:
                blank_die.setImageResource(R.drawable.d4);
                blank_die.setPadding(0,50,0,0);
                break;
            case 6:
                blank_die.setImageResource(R.drawable.d6);
                break;
            case 10:
                blank_die.setImageResource(R.drawable.d10);
                break;
            case 12:
                blank_die.setImageResource(R.drawable.d12);
                break;
            case 20:
                blank_die.setImageResource(R.drawable.d20);
                break;

        }
    }

    private void setListener()
    {
        blank_die.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayResult(die,roll(die,100));
            }
        }); 
    }

    private int roll(int id, int rolls)
    {
        int random_num = -1;
        int minimum = 0;
        int size = rolls;
        int[] nums = new int[size];

        if (id != -1)
        {
            Random rand = new Random();

            for (int i = 0; i < size; i++) {
                random_num = rand.nextInt((id - minimum) + 1) + minimum;
                nums[i] = random_num;
            }
        }
        else
        {
            throw new IllegalArgumentException("Dice number not added to intent");
        }
        return select_roll(nums);
    }


    private int select_roll(int[] rolls)
    {
        Random new_random = new Random();
        int index_random = new_random.nextInt(rolls.length-1);
        return rolls[index_random];
    }

    private void displayResult(int die, int result)
    {
        ImageButton result_die = blank_die;
        switch(die)
        {
            case 4:
                switch(result)
                {
                    case 1:
                        result_die.setImageResource(R.drawable.d4_1);
                        break;
                    case 2:
                        result_die.setImageResource(R.drawable.d4_2);
                        break;
                    case 3:
                        result_die.setImageResource(R.drawable.d4_3);
                        break;
                    case 4:
                        result_die.setImageResource(R.drawable.d4_4);
                        break;
                }
                break;
            case 6:
                switch(result)
                {
                    case 1:
                        result_die.setImageResource(R.drawable.d6_1);
                        break;
                    case 2:
                        result_die.setImageResource(R.drawable.d6_2);
                        break;
                    case 3:
                        result_die.setImageResource(R.drawable.d6_3);
                        break;
                    case 4:
                        result_die.setImageResource(R.drawable.d6_4);
                        break;
                    case 5:
                        result_die.setImageResource(R.drawable.d6_5);
                        break;
                    case 6:
                        result_die.setImageResource(R.drawable.d6_6);
                        break;
                }
                break;
            case 10:
                switch(result)
                {
                    case 1:
                        result_die.setImageResource(R.drawable.d10_1);
                        break;
                    case 2:
                        result_die.setImageResource(R.drawable.d10_2);
                        break;
                    case 3:
                        result_die.setImageResource(R.drawable.d10_3);
                        break;
                    case 4:
                        result_die.setImageResource(R.drawable.d10_4);
                        break;
                    case 5:
                        result_die.setImageResource(R.drawable.d10_5);
                        break;
                    case 6:
                        result_die.setImageResource(R.drawable.d10_6);
                        break;
                    case 7:
                        result_die.setImageResource(R.drawable.d10_7);
                        break;
                    case 8:
                        result_die.setImageResource(R.drawable.d10_8);
                        break;
                    case 9:
                        result_die.setImageResource(R.drawable.d10_9);
                        break;
                    case 10:
                        result_die.setImageResource(R.drawable.d10_10);
                        break;
                }
                break;
            case 12:
                switch(result)
                {
                    case 1:
                        result_die.setImageResource(R.drawable.d12_1);
                        break;
                    case 2:
                        result_die.setImageResource(R.drawable.d12_2);
                        break;
                    case 3:
                        result_die.setImageResource(R.drawable.d12_3);
                        break;
                    case 4:
                        result_die.setImageResource(R.drawable.d12_4);
                        break;
                    case 5:
                        result_die.setImageResource(R.drawable.d12_5);
                        break;
                    case 6:
                        result_die.setImageResource(R.drawable.d12_6);
                        break;
                    case 7:
                        result_die.setImageResource(R.drawable.d12_7);
                        break;
                    case 8:
                        result_die.setImageResource(R.drawable.d12_8);
                        break;
                    case 9:
                        result_die.setImageResource(R.drawable.d12_9);
                        break;
                    case 10:
                        result_die.setImageResource(R.drawable.d12_10);
                        break;
                    case 11:
                        result_die.setImageResource(R.drawable.d12_11);
                        break;
                    case 12:
                        result_die.setImageResource(R.drawable.d12_12);
                        break;
                    }
                break;
            case 20:
                switch(result)
                {
                    case 1:
                        result_die.setImageResource(R.drawable.d20_1);
                        break;
                    case 2:
                        result_die.setImageResource(R.drawable.d20_2);
                        break;
                    case 3:
                        result_die.setImageResource(R.drawable.d20_3);
                        break;
                    case 4:
                        result_die.setImageResource(R.drawable.d20_4);
                        break;
                    case 5:
                        result_die.setImageResource(R.drawable.d20_5);
                        break;
                    case 6:
                        result_die.setImageResource(R.drawable.d20_6);
                        break;
                    case 7:
                        result_die.setImageResource(R.drawable.d20_7);
                        break;
                    case 8:
                        result_die.setImageResource(R.drawable.d20_8);
                        break;
                    case 9:
                        result_die.setImageResource(R.drawable.d20_9);
                        break;
                    case 10:
                        result_die.setImageResource(R.drawable.d20_10);
                        break;
                    case 11:
                        result_die.setImageResource(R.drawable.d20_11);
                        break;
                    case 12:
                        result_die.setImageResource(R.drawable.d20_12);
                        break;
                    case 13:
                        result_die.setImageResource(R.drawable.d20_13);
                        break;
                    case 14:
                        result_die.setImageResource(R.drawable.d20_14);
                        break;
                    case 15:
                        result_die.setImageResource(R.drawable.d20_15);
                        break;
                    case 16:
                        result_die.setImageResource(R.drawable.d20_16);
                        break;
                    case 17:
                        result_die.setImageResource(R.drawable.d20_17);
                        break;
                    case 18:
                        result_die.setImageResource(R.drawable.d20_18);
                        break;
                    case 19:
                        result_die.setImageResource(R.drawable.d20_19);
                        break;
                    case 20:
                        result_die.setImageResource(R.drawable.d20_20);
                        break;
                }
                break;

        }
    }


}
