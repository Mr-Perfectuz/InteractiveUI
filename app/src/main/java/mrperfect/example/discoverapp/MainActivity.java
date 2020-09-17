package mrperfect.example.discoverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout backgroundcheck;
    LinearLayout backgroundLink;
    LinearLayout backgroundHome;
    LinearLayout backgroundFilm;
    LinearLayout backgroundSaved;
    LinearLayout backgroundDownload;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroundcheck = (LinearLayout) findViewById(R.id.bg_check);
        backgroundcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "You clicked New Arrival Activity", Toast.LENGTH_SHORT).show();
            }
        });



        backgroundLink = (LinearLayout) findViewById(R.id.bg_link);
        backgroundLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "You clicked New Link Saved Activity", Toast.LENGTH_SHORT).show();
            }
        });
    }
}