package com.example.ramesh.zero_cross;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnr;
    TextView txtview;
    int trun;
    String temp;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    //this is  demo
    //hello sahil


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtview = findViewById(R.id.TxtView);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnr = findViewById(R.id.btnrst);


        temp = "x";

        b1 = btn1.getText().toString();
        b2 = btn2.getText().toString();
        b3 = btn3.getText().toString();
        b4 = btn4.getText().toString();
        b5 = btn5.getText().toString();
        b6 = btn6.getText().toString();
        b7 = btn7.getText().toString();
        b8 = btn8.getText().toString();
        b9 = btn9.getText().toString();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp.matches("x")) {
                    btn1.setText(temp);
                    temp = "0";
                } else if (temp.matches("0")) {
                    btn1.setText(temp);
                    temp = "x";
                }
                btn1.setEnabled(false);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp.matches("x")) {
                    btn2.setText(temp);
                    temp = "0";
                } else if (temp.matches("0")) {
                    btn2.setText(temp);
                    temp = "x";
                }
                btn2.setEnabled(false);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp.matches("x")) {
                    btn3.setText(temp);
                    temp = "0";
                } else if (temp.matches("0")) {
                    btn3.setText(temp);
                    temp = "x";
                }
                btn3.setEnabled(false);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp.matches("x")) {
                    btn4.setText(temp);
                    temp = "0";
                } else if (temp.matches("0")) {
                    btn4.setText(temp);
                    temp = "x";
                }
                btn4.setEnabled(false);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp.matches("x")) {
                    btn5.setText(temp);
                    temp = "0";
                } else if (temp.matches("0")) {
                    btn5.setText(temp);
                    temp = "x";
                }
                btn5.setEnabled(false);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp.matches("x")) {
                    btn6.setText(temp);
                    temp = "0";
                } else if (temp.matches("0")) {
                    btn6.setText(temp);
                    temp = "x";
                }
                btn6.setEnabled(false);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp.matches("x")) {
                    btn7.setText(temp);
                    temp = "0";
                } else if (temp.matches("0")) {
                    btn7.setText(temp);
                    temp = "x";
                }
                btn7.setEnabled(false);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp.matches("x")) {
                    btn8.setText(temp);
                    temp = "0";
                } else if (temp.matches("0")) {
                    btn8.setText(temp);
                    temp = "x";
                }
                btn8.setEnabled(false);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp.matches("x")) {
                    btn9.setText(temp);
                    temp = "0";
                } else if (temp.matches("0")) {
                    btn9.setText(temp);
                    temp = "x";
                }
                btn9.setEnabled(false);
            }
        });
        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });


        if (b1.equals(b2) && b2.equals(b3) && !b3.equals("")) {

            Toast.makeText(this, "Winner" + b1, Toast.LENGTH_LONG).show();
            reset();
        } else if (b4.equals(b5) && b5.equals(b6) && !b6.equals("")) {
            Toast.makeText(this, "Winner" + b4, Toast.LENGTH_LONG).show();
            reset();
        } else if (b7.equals(b8) && b8.equals(b9) && !b9.equals("")) {
            Toast.makeText(this, "Winner" + b7, Toast.LENGTH_LONG).show();
            reset();
        } else if (b1.equals(b4) && b4.equals(b7) && !b7.equals("")) {
            Toast.makeText(this, "Winner" + b1, Toast.LENGTH_LONG).show();
            reset();
        } else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("")) {
            Toast.makeText(this, "Winner" + b2, Toast.LENGTH_LONG).show();
            reset();
        } else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")) {
            Toast.makeText(this, "Winner" + b3, Toast.LENGTH_LONG).show();
            reset();
        } else if (b1.equals(b5) && b5.equals(b9) && !b9.equals("")) {
            Toast.makeText(this, "Winner" + b1, Toast.LENGTH_LONG).show();
            reset();
        } else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("")) {
            Toast.makeText(this, "Winner" + b3, Toast.LENGTH_LONG).show();
            reset();
        } else if (!b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("") && !b5.equals("") && !b6.equals("") && !b7.equals("") && !b8.equals("") && !b9.equals("")) {
            Toast.makeText(this, "Draw", Toast.LENGTH_LONG).show();
            reset();

        }

    }

    void reset() {
        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
    }


    public void check(View view) {
    }
}
