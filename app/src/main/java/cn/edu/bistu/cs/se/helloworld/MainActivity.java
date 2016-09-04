package cn.edu.bistu.cs.se.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText text1 = (EditText) findViewById(R.id.editT1);
        final EditText text2 = (EditText) findViewById(R.id.editT2);
        final TextView view1 = (TextView) findViewById(R.id.checkB);
        final TextView view2 = (TextView) findViewById(R.id.textV3);
        Button btn1 = (Button) findViewById(R.id.ButtonOk);
        Button btn2 = (Button) findViewById(R.id.ButtonCancel);
        CheckBox box1 = (CheckBox) findViewById(R.id.check1);
        CheckBox box2 = (CheckBox) findViewById(R.id.check2);
        CheckBox box3 = (CheckBox) findViewById(R.id.check3);
        RadioButton radio1 = (RadioButton) findViewById(R.id.textV4);
        RadioButton radio2 = (RadioButton) findViewById(R.id.textV5);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("小明");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText("123");
            }
        });
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                view1.setText("汉语");

            }
        });
        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText("英语");
            }
        });
        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setText("日语");
            }
        });
        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view2.setText("男");
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view2.setText("女");
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
