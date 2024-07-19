package com.zypher.shortnotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private View view;
    private Intent NoteActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGetStartedClick(View view) {
        this.view = view;
        Intent intent;
        intent = new Intent(this .NoteActivity; class);
        startActivity(intent);
    }
}
