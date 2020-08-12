package com.example.note;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button save,view;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.body);
        save=findViewById(R.id.save);
        view=findViewById(R.id.view);
        textView=findViewById(R.id.viewbtn);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String note =editText.getText().toString();
                if (note.equals("")){
                    Toast.makeText(getApplicationContext(),"please write some notes",Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(getApplicationContext(),"data saved successfully",Toast.LENGTH_SHORT).show();

                }

            }
        });



    }
}
