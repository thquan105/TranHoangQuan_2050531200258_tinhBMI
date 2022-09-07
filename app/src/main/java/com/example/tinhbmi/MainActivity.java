package com.example.tinhbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float chieucao,cannang,bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btntinh = (Button) findViewById(R.id.btntinh);
        EditText cnang = (EditText) findViewById(R.id.cannangtext);
        EditText ccao = (EditText) findViewById(R.id.chieucaotext);
        TextView kq = (TextView) findViewById(R.id.textkq);
        btntinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cannang = Float.parseFloat(cnang.getText().toString());
                chieucao = Float.parseFloat(ccao.getText().toString());
                bmi = 0;
                if (view.getId() == R.id.btntinh) {
                    bmi = cannang / (chieucao * chieucao);
                    if (bmi < 16)
                        kq.setText("BMI = " + bmi + ": Gầy độ III");
                    else if (bmi < 17)
                        kq.setText("BMI = " + bmi + ": Gầy độ II");
                    else if (bmi < 18.5)
                        kq.setText("BMI = " + bmi + ": Gầy độ I");
                    else if (bmi < 25)
                        kq.setText("BMI = " + bmi + ": Bình thường");
                    else if (bmi < 30)
                        kq.setText("BMI = " + bmi + ": Thừa cân");
                    else if (bmi < 35)
                        kq.setText("BMI = " + bmi + ": Béo phì độ I");
                    else if (bmi < 40)
                        kq.setText("BMI = " + bmi + ": Béo phì II");
                    else
                        kq.setText("BMI = " + bmi + ": Béo phì III");
                }
            }
        });
    }
}
