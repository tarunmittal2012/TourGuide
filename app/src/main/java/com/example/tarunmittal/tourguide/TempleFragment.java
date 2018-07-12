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
public class TempleFragment extends Fragment {

    ListView templeLists;

    ArrayList<Product> mProducts = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mProducts.clear();
        View v = inflater.inflate(R.layout.fragment_temples, container, false);
        templeLists = v.findViewById(R.id.templeList);
        Animation slide_up = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slide_up);
        templeLists.startAnimation(slide_up);
        Product product1 = new Product(getString(R.string.temple1),
                getString(R.string.temple1Address),
                getString(R.string.temple1Website),
                R.drawable.baankebihari, (float) 3.8,
                getString(R.string.temple1Descriprion));
        mProducts.add(product1);
        Product product2 = new Product(getString(R.string.temple2),
                getString(R.string.temple2Address),
                getString(R.string.temple2Website),
                R.drawable.dwarkaadesh, (float) 4.0,
                getString(R.string.temple2Description));
        mProducts.add(product2);
        Product product3 = new Product(getString(R.string.temple3),
                getString(R.string.temple3Address),
                getString(R.string.temple3Website),
                R.drawable.janambhumi, (float) 3.6,
                getString(R.string.temple3Description));
        mProducts.add(product3);
        Product product4 = new Product(getString(R.string.temple4),
                getString(R.string.temple4Address),
                getString(R.string.temple4Website),
                R.drawable.premmandir, (float) 4.4,
                getString(R.string.temple4Description));
        mProducts.add(product4);
        Product product5 = new Product(getString(R.string.temple5),
                getString(R.string.temple5Address),
                getString(R.string.temple5Website),
                R.drawable.iskcon, (float) 3.6,
                getString(R.string.temple5Description));
        mProducts.add(product5);
        ListViewAdapter listViewAdapter = new ListViewAdapter(mProducts, getActivity());
        templeLists.setAdapter(listViewAdapter);

        return v;
    }
}
