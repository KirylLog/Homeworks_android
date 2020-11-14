package by.antonau.homework2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayMessageActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        ArrayList<Integer> receivedNumbers = intent.getIntegerArrayListExtra("NUMBERS");
        Integer[] array = new Integer[receivedNumbers.size()];
        receivedNumbers.toArray(array);
        double sum = 0;
        for (int k : array) {
            sum += k;
        }
        double average = sum / array.length;
        Integer[] myArray1 = Arrays.copyOfRange(array, 0, array.length / 2);
        double sum2 = 0;
        for (int a : myArray1) {
            sum2 += a;
        }
        Integer[] myArray2 = Arrays.copyOfRange(array, array.length / 2, array.length);
        double sub = myArray2[0] * 2;
        for (int b : myArray2) {
            sub -= b;
        }
        double divisionArray = sum2 / sub;
        String sumOfNumbers = Double.toString(sum);
        String averageOfNumbers = Double.toString(average);
        String halfSum = Double.toString(sum2);
        String halfDifference = Double.toString(sub);
        String division = Double.toString(divisionArray);
        String message = "Sum of array numbers: " + " " + sumOfNumbers + "Average of numbers: " + averageOfNumbers + "Sum of half numbers: " + halfSum + "Difference of half numbers: " + halfDifference + "Division of numbers: " + division;
        Intent data = new Intent(DisplayMessageActivity.this, MainActivity.class);
        data.putExtra(MainActivity.ACCESS_MESSAGE, message);
        setResult(RESULT_OK, data);
        finish();
    }
}
