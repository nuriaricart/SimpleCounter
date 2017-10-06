package edu.upc.eseiaat.pma.simplecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleCounterActivity extends AppCompatActivity {

    private int num;
    private TextView label_num;
    private String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_counter);

        Button btn_plus = (Button) findViewById(R.id.btn_plus);
        Button btn_resta = (Button) findViewById(R.id.btn_resta);
        label_num = (TextView) findViewById(R.id.label_num);
        num = 0;
        label_num.setText("0");


        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                number = Integer.toString(num);
                label_num.setText(number);
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num--;
                number = Integer.toString(num);
                label_num.setText(number);
            }
        });
    }
}
