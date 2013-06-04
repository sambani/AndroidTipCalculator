package com.example.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private float numb_tip;
	private EditText et_amount;
	private TextView tv_tip;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	}
	public void onClick10per(View view) {

		et_amount=(EditText) findViewById(R.id.etAmount);
		tv_tip = (TextView) findViewById(R.id.tvTip);
		numb_tip= (Float.parseFloat(et_amount.getText().toString())*10)/100;
		tv_tip.setText(Float.toString(numb_tip));

	}
	public void onClick15per(View view) {
		
		et_amount=(EditText) findViewById(R.id.etAmount);
		tv_tip = (TextView) findViewById(R.id.tvTip);
		numb_tip= (Float.parseFloat(et_amount.getText().toString())*15)/100;
		tv_tip.setText(Float.toString(numb_tip));

	}
	public void onClick20per(View view) {
		
		et_amount=(EditText) findViewById(R.id.etAmount);
		tv_tip = (TextView) findViewById(R.id.tvTip);
		numb_tip= (Float.parseFloat(et_amount.getText().toString())*20)/100;
		tv_tip.setText(Float.toString(numb_tip));

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
