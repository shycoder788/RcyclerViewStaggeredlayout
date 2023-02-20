package com.example.staggeredgridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView postRecyclerView = findViewById(R.id.postsRecyclerView);
        postRecyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );
        // Here i am preparing list of images from drawable,
        // You can get it from your API.
        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.ic_image1));
        postItems.add(new PostItem(R.drawable.ic_image2));
        postItems.add(new PostItem(R.drawable.ic_image3));
        postItems.add(new PostItem(R.drawable.ic_image4));
        postItems.add(new PostItem(R.drawable.ic_image5));
        postItems.add(new PostItem(R.drawable.ic_image6));
        postItems.add(new PostItem(R.drawable.ic_image7));
        postItems.add(new PostItem(R.drawable.ic_image8));
        postItems.add(new PostItem(R.drawable.ic_image9));
        postItems.add(new PostItem(R.drawable.image_10));

        postRecyclerView.setAdapter(new PostAdapter(postItems));

    }
}