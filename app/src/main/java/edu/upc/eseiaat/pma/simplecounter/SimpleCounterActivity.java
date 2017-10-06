package edu.upc.eseiaat.pma.simplecounter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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
        Button btn_exit = (Button) findViewById(R.id.btn_exit);
        label_num = (TextView) findViewById(R.id.label_num);
        num = 0;
        number = Integer.toString(num);
        label_num.setText(number);


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

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SimpleCounterActivity.this);
                builder.setTitle(R.string.title);
                String msg = getResources().getString(R.string.message);
                builder.setMessage(msg);
                builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton(R.string.no,null);
                builder.create().show();
            }
        });
    }
}
