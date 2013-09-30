package com.jwallpaper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//removed import TextureView

public class MainActivity extends Activity {
	
	int counter; 
	Button add, sub;
	TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        counter = 0; //added to reference int counter
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.tvDisplay); //possible issue with TextView vs TextureView
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++; //adds one to counter variable
				display.setText("Your total is " + counter); //displays counter
				
			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--; //subtracts one from counter variable
				display.setText("Your total is " + counter); //displays counter
				
			}
		});
        return true; //line was above counter = 0
    }
    
}
