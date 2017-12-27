package com.example.dell_pc.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.dell_pc.task2.Adapter.UserAdapter;
import com.example.dell_pc.task2.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // AdapterView
        ListView listView = (ListView) this.findViewById(R.id.list1);

        // DataSource
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User(1, "DANIA", "03239109990"));
        for (int i = 1; i < 1000; i++) {
            arrayList.add(new User(i + 1, "DANIA" + i, "03239109990" + i));
        }

        UserAdapter userAdapter = new UserAdapter(this, arrayList);

        listView.setAdapter(userAdapter);


    }
}
