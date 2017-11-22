package com.programm.lordcoudy.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void plus(View view) {
        try {

            EditText num1 =
                    (EditText) this.findViewById(R.id.num1);
            double sNum1 = Double.parseDouble(num1.getText().toString());


            EditText num2 =
                    (EditText) this.findViewById(R.id.num2);
            double sNum2 = Double.parseDouble(num2.getText().toString());

            TextView out =
                    (TextView) this.findViewById(R.id.out);
            out.setText("" + (sNum1 + sNum2));
        } catch (NumberFormatException z) {
            Toast.makeText(this, "Oops! Something wrong!: " + z, Toast.LENGTH_LONG).show();
        }
    }


    public void minus(View view) {
        try {
            EditText num1 =
                    (EditText) this.findViewById(R.id.num1);
            double sNum1 = Double.parseDouble(num1.getText().toString());


            EditText num2 =
                    (EditText) this.findViewById(R.id.num2);
            double sNum2 = Double.parseDouble(num2.getText().toString());

            TextView out =
                    (TextView) this.findViewById(R.id.out);
            out.setText("" + (sNum1 - sNum2));
        } catch (NumberFormatException z) {
            Toast.makeText(this, "Oops! Something wrong!: " + z, Toast.LENGTH_LONG).show();
        }
    }
    public void multiply(View view) {
        try {
            EditText num1 =
                    (EditText) this.findViewById(R.id.num1);
            double sNum1 = Double.parseDouble(num1.getText().toString());


            EditText num2 =
                    (EditText) this.findViewById(R.id.num2);
            double sNum2 = Double.parseDouble(num2.getText().toString());

            TextView out =
                    (TextView) this.findViewById(R.id.out);
            out.setText("" + (sNum1 * sNum2));
        } catch (NumberFormatException z) {
            Toast.makeText(this, "Oops! Something wrong!: " + z, Toast.LENGTH_LONG).show();
        }
    }
    public void divide(View view) {
        try {
            EditText num1 =
                    (EditText) this.findViewById(R.id.num1);
            double sNum1 = Double.parseDouble(num1.getText().toString());


            EditText num2 =
                    (EditText) this.findViewById(R.id.num2);
            double sNum2 = Double.parseDouble(num2.getText().toString());

            TextView out =
                    (TextView) this.findViewById(R.id.out);
            out.setText("" + (sNum1 / sNum2));
        } catch (NumberFormatException z) {
            Toast.makeText(this, "Oops! Something wrong!: " + z, Toast.LENGTH_LONG).show();
        }
    }
    public void clear(View view){
        EditText num1 =
                (EditText) this.findViewById(R.id.num1);
        num1.setText("");


        EditText num2 =
                (EditText) this.findViewById(R.id.num2);
        num2.setText("");
        TextView out =
                (TextView) this.findViewById(R.id.out);
        out.setText("");

    }
    public void google(View view){
        //Intent intent = new Intent(this, SecondActivity.class);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://google.ru"));
        startActivity(intent);
    }
}
