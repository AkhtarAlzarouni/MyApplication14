package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView postListView;
    String[] lun= {"C++","JAVA","payhon",".NET"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        postListView = findViewById(R.id.view1);
        spinner=findViewById(R.id.sp);

        List<qus> posts = generateSamplePosts();
        qusAdapter adapter = new qusAdapter(this, (ArrayList<qus>) posts);
        postListView.setAdapter(adapter);


        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lun);
        spinner.setAdapter(adapter1);
    }



    private List<qus> generateSamplePosts() {
        List<qus> posts = new ArrayList<>();
        posts.add(new qus("Post  This is the content of post 1."));
        posts.add(new qus("Post 1This is the content of post 1."));
        posts.add(new qus("Post 3This is the content of post 3."));
        // Add more posts here
        return posts;
    }}