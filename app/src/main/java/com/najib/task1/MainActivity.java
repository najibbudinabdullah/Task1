package com.najib.task1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.OnClickListener;
import static android.view.View.OnTouchListener;
public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button12;
    EditText edt1,edt2;
    String evalue ="1";
    FloatingActionButton fab;
    TextView result;
    Integer num1 =0,num2 =0,hasil = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button12 = (Button) findViewById(R.id.button12);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        result = (TextView) findViewById(R.id.hasil);

        edt1 = (EditText) findViewById(R.id.editText);
        edt2 = (EditText) findViewById(R.id.editText2);

        edt1.setOnTouchListener(new OnTouchListener()
        {
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                evalue = "1";
                return false;
            }
        });

        edt2.setOnTouchListener(new OnTouchListener()
        {
            public boolean onTouch(View arg0, MotionEvent arg1)
            {
                evalue = "2";
                return false;
            }
        });

       fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(edt1.getText().toString());
                num2 = Integer.parseInt(edt2.getText().toString());

                hasil = (num1 - num2);
                result.setText(hasil.toString());

            }
        });

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"1"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"1"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"2"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"2"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"3"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"3"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"4"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"4"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"5"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"5"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"6"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"6"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"7"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"7"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"8"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"8"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"9"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"9"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    int start =edt1.getSelectionStart();
                    edt1.setText(edt1.getText().insert(start,"0"));
                    edt1.setSelection(start+1);
                }else{
                    int start2 =edt2.getSelectionStart();
                    edt2.setText(edt2.getText().insert(start2,"0"));
                    edt2.setSelection(start2+1);
                }
            }
        });

        button10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if(evalue=="1") {
                    String dialled_nos = edt1.getText().toString();
                    int remove_index_position = edt1.getSelectionStart()-1;
                    StringBuilder dialled_nos_builder = new StringBuilder(dialled_nos);
                    if(remove_index_position>=0) {
                        dialled_nos_builder.deleteCharAt(remove_index_position);
                        edt1.setText(dialled_nos_builder.toString());
                        edt1.setSelection(remove_index_position);
                    }


                }else{
                    String dialled_nos = edt2.getText().toString();
                    int remove_index_position = edt2.getSelectionStart()-1;
                    StringBuilder dialled_nos_builder = new StringBuilder(dialled_nos);
                    if(remove_index_position>=0) {
                        dialled_nos_builder.deleteCharAt(remove_index_position);
                        edt2.setText(dialled_nos_builder.toString());
                        edt2.setSelection(remove_index_position);
                    }
                }
            }
        });

        button12.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(evalue=="1") {
                    edt1.setText("");
                }else{
                    edt2.setText("");
                }
            }
        });
    }
}
