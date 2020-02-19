package com.example.edithna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage (View view) {
        EditText message = (EditText)findViewById(R.id.message);
        Toast.makeText (this, "Sending message " + message.getText().toString(),
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("MESSAGE", message.getText().toString());
        startActivity(intent);
        message.setText("");
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf =
                getMenuInflater();
        inf.inflate(R.menu.helo, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId1 = item.getItemId();
        switch (itemId1) {
            case R.id.song:
                startActivity(new Intent(this, life1.class));
                return true;
                

            case R.id.style:
                startActivity(new Intent(this, life2.class));
                return true;
            default:

                return super.onOptionsItemSelected(item);
        }
    }
}













































