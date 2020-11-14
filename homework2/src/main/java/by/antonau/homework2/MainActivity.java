package by.antonau.homework2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private List<Integer> numbers = new ArrayList<Integer>();
    Button button;
    private static final int REQUEST_ACCESS_TYPE = 1;
    static final String ACCESS_MESSAGE = "ACCESS_MESSAGE";
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Set<Integer> set = new HashSet<Integer>();
        Random rnd = new Random();
        int x = 20;
        for (int i = 1; i <= x; i++) {
            set.add(rnd.nextInt(100));
        }
        numbers = new ArrayList<Integer>(set);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
        intent.putIntegerArrayListExtra("NUMBERS", (ArrayList<Integer>) numbers);
        startActivityForResult(intent, REQUEST_ACCESS_TYPE);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_ACCESS_TYPE) {
            if (resultCode == RESULT_OK) {
                String accessMessage = data.getStringExtra(ACCESS_MESSAGE);
                textView.setText(accessMessage);
            }
        }
    }
}