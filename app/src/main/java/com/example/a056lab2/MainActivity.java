package com.example.a056lab2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int numMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        numMessage = 10;
        Log .i("number of Message=",""+numMessage);

        numMessage++;
        numMessage = numMessage+1;
        Log .i("number of Message=",""+numMessage);

        Boolean isFriend = true;
        Log .i("This is friend=",""+isFriend);

        String contact = "Gus" ;
        String message = "I Love AIMMY" ;

        Toast.makeText(this,"Message from "+contact,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Message is "+message,Toast.LENGTH_SHORT).show();
    }
}