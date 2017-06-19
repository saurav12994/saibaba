package com.example.sourabh.saibaba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.nikhil.saibabaxd.Adapters.GridViewAdapter;
import com.example.nikhil.saibabaxd.Adapters.GridViewAdapter_IMG;
import com.example.nikhil.saibabaxd.ExpandableHeightGridView;
import com.example.nikhil.saibabaxd.R;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ArrayList<String> temp = new ArrayList<String>();
        temp.add("http://pngimagesfree.com/God/sai_baba_png/sai_baba_png_image_one.png");
        temp.add("http://pngimagesfree.com/God/sai_baba_png/sai_baba_png_image_three.png");
        temp.add("http://pngimagesfree.com/God/sai_baba_png/sai_baba_png_image_two.png");
/*
        temp.add("https://www.google.co.in/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjoisr-3IrUAhWIPo8KHf2PA90QjRwIBw&url=http%3A%2F%2Fpngimagesfree.com%2FGod%2Fsai_baba-png.htm&psig=AFQjCNGjYQ0EFqiIKtAuXtikoubd_xpdYg&ust=1495790709489582");
*/

        ExpandableHeightGridView gridviewimg = new ExpandableHeightGridView(this);
        gridviewimg = (ExpandableHeightGridView) findViewById(R.id.Imageviewer);
        gridviewimg.setNumColumns(2);
        gridviewimg.setAdapter(new GridViewAdapter_IMG(temp,getApplicationContext()));
        gridviewimg.setExpanded(true);

        /*ExpandableHeightGridView gridView = new ExpandableHeightGridView(this);
        gridView = (ExpandableHeightGridView) findViewById(R.id.menu_grid);
        gridView.setNumColumns(2);
        gridView.setAdapter(new GridViewAdapter(temp,getApplicationContext()));
        gridView.setExpanded(true);*/
    }
}