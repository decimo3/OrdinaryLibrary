package com.mestreruan.ordinarylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView greetings = new TextView(this);
		greetings.setText("Olá, Ordinary Library!");
		greetings.setTextSize(24);

		setContentView(greetings);
	}
}
