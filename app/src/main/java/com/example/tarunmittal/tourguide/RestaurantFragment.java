package com.example.tarunmittal.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

import java.util.ArrayList;
/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    ListView restaurantLists;

    ArrayList<Product> mProducts = new ArrayList<>();

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mProducts.clear();
        View v = inflater.inflate(R.layout.fragment_restaurant, container, false);

        Product product1 = new Product(getString(R.string.restaurant1),
                getString(R.string.restauran1Address),
                getString(R.string.restaurant1Website),
                R.drawable.basera, (float) 3.8,
                getString(R.string.restaurant1Description));
        mProducts.add(product1);

        Product product2 = new Product(getString(R.string.restaurant2),
                getString(R.string.restauran2Address),
                getString(R.string.restaurant2Website),
                R.drawable.dosa, (float) 4.0,
                getString(R.string.restaurant2Description));
        mProducts.add(product2);

        Product product3 = new Product(getString(R.string.restaurant3),
                getString(R.string.restauran3Address),
                getString(R.string.restaurant3Website),
                R.drawable.regal, (float) 3.6,
                getString(R.string.restaurant3Description));
        mProducts.add(product3);

        Product product4 = new Product(getString(R.string.restaurant4),
                getString(R.string.restauran4Address),
                getString(R.string.restaurant4Website),
                R.drawable.lords, (float) 4.4,
                getString(R.string.restaurant4Description));
        mProducts.add(product4);

        Product product5 = new Product(getString(R.string.restaurant5),
                getString(R.string.restauran5Address),
                getString(R.string.restaurant5Website),
                R.drawable.brijwasi, (float) 3.6,
                getString(R.string.restaurant5Description));
        mProducts.add(product5);

        restaurantLists = v.findViewById(R.id.restaurantList);
        Animation slide_up = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up);
        restaurantLists.startAnimation(slide_up);

        ListViewAdapter listViewAdapter = new ListViewAdapter(mProducts, getActivity());
        restaurantLists.setAdapter(listViewAdapter);

        return v;
    }
}
