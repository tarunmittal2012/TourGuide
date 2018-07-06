package com.example.tarunmittal.tourguide;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
public class FestivalDescription extends AppCompatActivity {
    String name, description;
    int images;
    @BindView(R.id.festivalName)
    TextView festivalName;
    @BindView(R.id.festivalDescription)
    TextView festivalDescription;
    @BindView(R.id.festivalImage)
    ImageView festivalImage;
    @BindView(R.id.festival_linearLayout)
    LinearLayout festivalLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival_description);
        ButterKnife.bind(this);
        Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
// Start animation
        festivalLayout.startAnimation(slide_up);
        Bundle b = getIntent().getExtras();
        name = b.getString("festivalName");
        description = b.getString("festivalDescription");
        images = b.getInt("festivalImage");
        festivalName.setText(name);
        festivalDescription.setText(description);
        festivalImage.setImageResource(images);
    }
}
