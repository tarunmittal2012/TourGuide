package com.example.tarunmittal.tourguide;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ms.square.android.expandabletextview.ExpandableTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
public class General extends AppCompatActivity {
    String name, website, address, description;
    int images;
    float rating;
    @BindView(R.id.productName)
    TextView productName;
    @BindView(R.id.productRating)
    RatingBar productRating;
    @BindView(R.id.productImage)
    ImageView productImage;
    @BindView(R.id.productWebsite)
    TextView productWebsite;
    @BindView(R.id.productAddress)
    TextView productAddress;
    @BindView(R.id.linear1)
    LinearLayout linear_layout;
    @BindView(R.id.productDescription)
    TextView productDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
    //    ExpandableTextView textView=findViewById(R.id.expanded_view);
        ButterKnife.bind(this);
//Load animation
        Animation slide_down = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);
        Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
// Start animation
        linear_layout.startAnimation(slide_up);
        Bundle b = getIntent().getExtras();
        name = b.getString("productName");
        website = b.getString("productWebsite");
        address = b.getString("productAddress");
        images = b.getInt("productImage");
        rating = b.getFloat("productRating");
        description = b.getString("productDescription");
        productImage.setImageResource(images);
        productName.setText(name);
        productWebsite.setText(website);
        productAddress.setText(address);
        productRating.setRating(rating);
        productDescription.setText(description);

    }
}
