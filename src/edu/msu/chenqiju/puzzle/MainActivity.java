package edu.msu.chenqiju.puzzle;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onStartPuzzle(View view) {
		Intent intent = new Intent(this, PuzzleActivity.class);
		startActivity(intent);
	}

}
