package com.example.student_mobile_app;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity {
    package com.example.student_mobile_app.HomeActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

    public class HomeActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);

            findViewById(R.id.btnProfile).setOnClickListener(v ->
                    startActivity(new Intent(this, ProfileActivity.class))
            );
        }
    }

}
