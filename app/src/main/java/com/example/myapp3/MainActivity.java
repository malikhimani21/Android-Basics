package com.example.myapp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    to visible option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    // click event on option menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.html:
                Toast.makeText(this, "HTML", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, HTMLActivity.class);
                startActivity(intent);

                break;

            case R.id.css:
                Toast.makeText(this, "CSS", Toast.LENGTH_LONG).show();

                Intent intent1 = new Intent(MainActivity.this, CSSActivity.class);
                startActivity(intent1);
                break;

            case R.id.android:
                Toast.makeText(this, "Android", Toast.LENGTH_LONG).show();

                Intent intent2 = new Intent(MainActivity.this, AndroidActivity.class);
                startActivity(intent2);
                break;

            case R.id.scrollview:
                Intent intent3 = new Intent(MainActivity.this, ScrollViewActivity1.class);
                startActivity(intent3);
                break;

            case R.id.horizontalscrollview:
                Intent intent4 = new Intent(MainActivity.this, HorizontalScrollViewActivity1.class);
                startActivity(intent4);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}