package org.example.testincludemultiple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewGroup first = (ViewGroup) findViewById(R.id.first);

        final ViewGroup second = (ViewGroup) findViewById(R.id.second);

        LayoutInflater inflater = LayoutInflater.from(this);
        inflater.inflate(R.layout.test_include, first, true);
        inflater.inflate(R.layout.test_include, second, true);

        Button btn1 = (Button) first.getChildAt(0);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I`m button 1", Toast.LENGTH_SHORT).show();
                Log.e(TAG, "I`m button 1");
            }
        });

        Button btn3 = (Button) second.getChildAt(0);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I`m button 3", Toast.LENGTH_SHORT).show();
                Log.e(TAG, "I`m button 3");
            }
        });

    }
}
