package com.example.appnumber2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        //StringTokenizer is to add delimiter (blank space)
        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);
        TextView txt3 = findViewById(R.id.txt3);
        /*
        txt1.setText("My Own text");

        String str1 = "Some Value";

        StringTokenizer strObject1 = new StringTokenizer(str1);

        txt2.setText(strObject1.nextToken());//this first text
        txt1.setText(strObject1.nextToken());//this second text
        */

        String str2 = "This is another text@This is your text @This is my text";

        StringTokenizer strObject2 = new StringTokenizer(str2, "@");//the delimiter should be '@'
        // when we use the 'new' keyword, several things happen , the new instance of the given class is created
            // and memory is allocated for it and special method define in given class is called and that special method
            // is constructor, our constructor is a new way , a constructor initializes a new object and it's variable
            // a constructor is actually a special method and cannot have a return type but method is must return
        txt1.setText(strObject2.nextToken());
        txt2.setText(strObject2.nextToken());
        txt3.setText(strObject2.nextToken() + " Concatinate text");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
