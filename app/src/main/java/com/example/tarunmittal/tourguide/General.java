package com.example.tarunmittal.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

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

    @BindView(R.id.rating)
    TextView ratingTextView;

    @BindView(R.id.address)
    TextView addressTextView;

    @BindView(R.id.website)
    TextView websiteTextView;

    @BindView(R.id.expand_text_view)
    ExpandableTextView expandDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        ButterKnife.bind(this);
        Animation slide_down = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);
        Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
        linear_layout.startAnimation(slide_up);
        Bundle b = getIntent().getExtras();
        name = b.getString(this.getResources().getString(R.string.product_name));
        website = b.getString(this.getResources().getString(R.string.product_website));
        address = b.getString(this.getResources().getString(R.string.product_address));
        images = b.getInt(this.getResources().getString(R.string.product_image));
        rating = b.getFloat(this.getResources().getString(R.string.product_rating));
        description = b.getString(this.getResources().getString(R.string.product_description));
        try {
            if (website.equals("") || address.equals("")) {
            }
        } catch (Exception e) {
            productAddress.setVisibility(View.GONE);
            productWebsite.setVisibility(View.GONE);
            productRating.setVisibility(View.GONE);
            ratingTextView.setVisibility(View.GONE);
            websiteTextView.setVisibility(View.GONE);
            addressTextView.setVisibility(View.GONE);

        }

        productImage.setImageResource(images);
        productName.setText(name);
        productWebsite.setText(website);
        productAddress.setText(address);
        productRating.setRating(rating);
        expandDescriptionTextView.setText(description);
    }
}
