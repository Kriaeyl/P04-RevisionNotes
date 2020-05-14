package com.myapplicationdev.android.p04_revisionnotes;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

	ListView lv;
	RevisionNotesArrayAdapter aa;
	ArrayList<Note> notes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		//TODO implement the Custom ListView
		lv = findViewById(R.id.listView1);
		DBHelper db = new DBHelper(SecondActivity.this);

		// Insert a task
		notes = db.getAllNotes();
		db.close();
		aa = new RevisionNotesArrayAdapter(this, R.layout.row, notes);
		lv.setAdapter(aa);
	}


}
