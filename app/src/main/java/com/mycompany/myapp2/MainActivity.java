package com.mycompany.myapp2;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toast.makeText(this, "Hello GIT", 1).show();
    }
}
