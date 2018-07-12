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
public class SchoolFragment extends Fragment {

    ListView schoolLists;

    ArrayList<Product> mProducts = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mProducts.clear();
        View v = inflater.inflate(R.layout.fragment_school, container, false);
        schoolLists = v.findViewById(R.id.schoolList);
        Animation slide_up = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slide_up);
        schoolLists.startAnimation(slide_up);
        Product product1 = new Product(getString(R.string.school1),
                getString(R.string.school1Address),
                getString(R.string.school1Website),
                R.drawable.mountlitera, (float) 3.8,
                getString(R.string.school1Description));
        mProducts.add(product1);
        Product product2 = new Product(getString(R.string.school2),
                getString(R.string.school2Address),
                getString(R.string.school2Website),
                R.drawable.grace, (float) 4.0,
                getString(R.string.school2Description));
        mProducts.add(product2);
        Product product3 = new Product(getString(R.string.school3),
                getString(R.string.school3Address),
                getString(R.string.school3Website),
                R.drawable.armypublic, (float) 3.6,
                getString(R.string.school3Description));
        mProducts.add(product3);
        Product product4 = new Product(getString(R.string.school4),
                getString(R.string.school4Address),
                getString(R.string.school4Website),
                R.drawable.sentdominic, (float) 4.4,
                getString(R.string.school4Description));
        mProducts.add(product4);
        Product product5 = new Product(getString(R.string.school5),
                getString(R.string.school5Address),
                getString(R.string.school5Website),
                R.drawable.kds, (float) 3.6,
                getString(R.string.school5Description));
        mProducts.add(product5);
        ListViewAdapter listViewAdapter = new ListViewAdapter(mProducts, getActivity());
        schoolLists.setAdapter(listViewAdapter);
        return v;
    }
}
