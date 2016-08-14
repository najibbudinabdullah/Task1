package com.najib.task1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.OnTouchListener;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
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

        edt1 = (EditText) findViewById(R.id.editText);
        edt2 = (EditText) findViewById(R.id.editText2);
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
        result = (TextView) findViewById(R.id.hasil);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button12.setOnClickListener(this);

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

                if(edt1.length() <= 0 || edt2.length() <= 0) {
                    result.setText("0");
                }else{
                    num1 = Integer.parseInt(edt1.getText().toString());
                    num2 = Integer.parseInt(edt2.getText().toString());
                    hasil = num1 - num2;
                    result.setText(hasil.toString());
                }
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                tombol_angka(evalue,"0");
                break;

            case R.id.button1:
                tombol_angka(evalue,"1");
                break;

            case R.id.button2:
                tombol_angka(evalue,"2");
                break;

            case R.id.button3:
                tombol_angka(evalue,"3");
                break;

            case R.id.button4:
                tombol_angka(evalue,"4");
                break;

            case R.id.button5:
                tombol_angka(evalue,"5");
                break;

            case R.id.button6:
                tombol_angka(evalue,"6");
                break;

            case R.id.button7:
                tombol_angka(evalue,"7");
                break;

            case R.id.button8:
                tombol_angka(evalue,"8");
                break;

            case R.id.button9:
                tombol_angka(evalue,"9");
                break;

            case R.id.button10:
                if(evalue=="1"){
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
                break;

            case R.id.button12:
                if(evalue=="1") {
                    edt1.setText("");
                }else{
                    edt2.setText("");
                }
                break;

            default:
                break;
        }
    }

    public void tombol_angka(String value, String angka){
        if(value=="1") {
            int start =edt1.getSelectionStart();
            edt1.setText(edt1.getText().insert(start,angka));
            edt1.setSelection(start+1);
        }else{
            int start2 =edt2.getSelectionStart();
            edt2.setText(edt2.getText().insert(start2,angka));
            edt2.setSelection(start2+1);
        }
    }
}
