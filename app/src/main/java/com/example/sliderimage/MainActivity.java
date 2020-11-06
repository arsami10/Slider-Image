package com.example.sliderimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider= findViewById(R.id.slider);

        List<SlideModel> slideModels= new ArrayList<>();
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2015/12/01/20/28/fall-1072821_960_720.jpg","1 Image"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2015/12/01/20/28/road-1072823_960_720.jpg","2 Image"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2015/09/09/16/05/forest-931706_960_720.jpg","3 Image"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2015/06/19/21/24/the-road-815297_960_720.jpg","4 Image"));
        imageSlider.setImageList(slideModels,true);
    }
}
