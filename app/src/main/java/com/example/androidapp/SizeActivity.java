package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SizeActivity extends AppCompatActivity {

    private static final String TAG = "myLogs";
    EditText height;
    EditText chestСircumference;
    EditText waistСircumference;
    EditText hipGirth;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        calculate = (Button) findViewById((R.id.calculate));

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                height = (EditText)findViewById((R.id.height));
                String value0 = height.getText().toString();
                int finalHeight = Integer.parseInt(value0);

                Log.d(TAG, "найдем View-'элементы");
                chestСircumference = (EditText)findViewById((R.id.chestСircumference));
                String value1 = chestСircumference.getText().toString();
                int finalChestСircumference = Integer.parseInt(value1);

                waistСircumference = (EditText)findViewById((R.id.waistСircumference));
                String value2 = waistСircumference.getText().toString();
                int finalWaistСircumference = Integer.parseInt(value2);

                hipGirth = (EditText)findViewById((R.id.hipGirth));
                String value3 = hipGirth.getText().toString();
                int finalHipGirth = Integer.parseInt(value3);

                if (finalHeight > 126 && finalHeight < 137 && finalChestСircumference > 63 &&
                    finalChestСircumference < 69 && finalWaistСircumference > 53 &&
                    finalWaistСircumference < 60 && finalHipGirth > 65 && finalHipGirth < 74) {
                    Toast toast = Toast.makeText(SizeActivity.this, "38 - 40", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else if (finalHeight > 136 && finalHeight < 147 && finalChestСircumference > 67 &&
                        finalChestСircumference < 75 && finalWaistСircumference > 58 &&
                        finalWaistСircumference < 64 && finalHipGirth > 72 && finalHipGirth < 80) {
                    Toast toast = Toast.makeText(SizeActivity.this, "40 - 42", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else if (finalHeight > 146 && finalHeight < 157 && finalChestСircumference > 73 &&
                        finalChestСircumference < 79 && finalWaistСircumference > 62 &&
                        finalWaistСircumference < 68 && finalHipGirth > 80 && finalHipGirth < 85) {
                    Toast toast = Toast.makeText(SizeActivity.this, "42 - 44", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else if (finalHeight > 156 && finalHeight < 167 && finalChestСircumference > 77 &&
                        finalChestСircumference < 86 && finalWaistСircumference > 66 &&
                        finalWaistСircumference < 74 && finalHipGirth > 83 && finalHipGirth < 91) {
                    Toast toast = Toast.makeText(SizeActivity.this, "44 - 46", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else if (finalHeight > 166 && finalHeight < 176 && finalChestСircumference > 84 &&
                        finalChestСircumference < 94 && finalWaistСircumference > 72 &&
                        finalWaistСircumference < 81 && finalHipGirth > 89 && finalHipGirth < 98) {
                    Toast toast = Toast.makeText(SizeActivity.this, "46 - 48", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else if (finalHeight > 175 && finalHeight < 182 && finalChestСircumference > 92 &&
                        finalChestСircumference < 102 && finalWaistСircumference > 79 &&
                        finalWaistСircumference < 89 && finalHipGirth > 96 && finalHipGirth < 104) {
                    Toast toast = Toast.makeText(SizeActivity.this, "48 - 50", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else if (finalHeight > 181 && finalHeight < 189 && finalChestСircumference > 100 &&
                        finalChestСircumference < 109 && finalWaistСircumference > 87 &&
                        finalWaistСircumference < 97 && finalHipGirth > 102 && finalHipGirth < 111) {
                    Toast toast = Toast.makeText(SizeActivity.this, "50 - 52", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else if (finalHeight > 188 && finalHeight < 199 && finalChestСircumference > 107 &&
                        finalChestСircumference < 116 && finalWaistСircumference > 95 &&
                        finalWaistСircumference < 104 && finalHipGirth > 109 && finalHipGirth < 119) {
                    Toast toast = Toast.makeText(SizeActivity.this, "52 - 54", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else if (finalHeight > 198 && finalHeight < 210 && finalChestСircumference > 114 &&
                        finalChestСircumference < 120 && finalWaistСircumference > 102 &&
                        finalWaistСircumference < 108 && finalHipGirth > 117 && finalHipGirth < 123) {
                    Toast toast = Toast.makeText(SizeActivity.this, "54 - 56", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else if (finalHeight > 209 && finalHeight < 220 && finalChestСircumference > 118 &&
                        finalChestСircumference < 125 && finalWaistСircumference > 106 &&
                        finalWaistСircumference < 113 && finalHipGirth > 121 && finalHipGirth < 127) {
                    Toast toast = Toast.makeText(SizeActivity.this, "56 - 58", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(SizeActivity.this, "Размера с такими параметрами - НЕТ!", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
            }
        );
    }
}