package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void sortNumbers(View view) {
		int number = new Random().nextInt(11);
		final String initText = "O número escolhido foi: ";
		TextView text = findViewById(R.id.textView3);
		text.setText(initText + number);
	}
}
