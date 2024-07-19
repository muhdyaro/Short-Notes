package com.zypher.shortnotes;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class NoteActivity extends AppCompatActivity {

    private EditText etNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        etNote = findViewById(R.id.etNote);
    }

    public void onSaveNoteClick(View view) {
        String note = etNote.getText().toString();
        if (!note.isEmpty()) {
            Toast.makeText(this, "Note saved: " + note, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please enter a note", Toast.LENGTH_SHORT).show();
        }
    }
}
