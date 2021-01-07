package com.example.ashutosh.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }
    public void myButtonListenerMethod()
    {Button butt=(Button)findViewById(R.id.btt);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand=new Random();
                int num= rand.nextInt(6)+1;
                final ImageView img=(ImageView)findViewById(R.id.im);
                switch(num)
                {case 1: img.setImageResource(R.drawable.die_face_1);
                    break;
                    case 2: img.setImageResource(R.drawable.die_face_2);
                        break;
                    case 3: img.setImageResource(R.drawable.die_face_3);
                        break;
                    case 4: img.setImageResource(R.drawable.die_face_4);
                        break;
                    case 5: img.setImageResource(R.drawable.die_face_5);
                        break;
                    case 6: img.setImageResource(R.drawable.die_face_6);
            }
                final TextView ttt=(TextView)findViewById(R.id.tt);
                ttt.setText(Integer.toString(num));
        }
        });

    }
}
