package com.example.student.picassoandlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExampleActivity extends AppCompatActivity {

    public static final String TAG = "ListExampleActivity_log_tag";

    private ListView mList;

    public static final String[] namesArray = {"Vasya", "Petya", "Masha", "Kolya", "Sasha"};

    List<Berry> berries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_example);

        mList = (ListView) findViewById(R.id.list);

        berries.add(new Berry("atata", "http://www.adagio.com/images5/flavor_thumbnail/berry_blast.jpg"));
        berries.add(new Berry("kjsdfds", "http://img1.liveinternet.ru/images/attach/c/0/40/809/40809443_1236679220_0_2bf2_c8733f71_XL.jpg"));
        berries.add(new Berry("dfsgdsfg", "http://freedesignfile.com/upload/2013/05/Fresh-berry-vector-01.jpg"));

        loadData();

        Log.d(TAG, "Logging in Android");
    }

    private void loadData() {

        MyListAdapter adapter = new MyListAdapter(this, berries);
        mList.setAdapter(adapter);

    }
}
