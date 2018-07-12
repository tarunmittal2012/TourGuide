package com.example.tarunmittal.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
public class FestivalFragment extends Fragment {

    ListView festivalLists;

    ArrayList<Product> mProducts = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mProducts.clear();
        View view = inflater.inflate(R.layout.fragment_festivals, container, false);

        Product product1 = new Product(getString(R.string.festival1),
                getString(R.string.festival1Description),
                R.drawable.fest1
        );

        mProducts.add(product1);
        Product product2 = new Product(getString(R.string.festival2),
                getString(R.string.festival2Description),
                R.drawable.fest2
        );
        mProducts.add(product2);
        Product product3 = new Product(getString(R.string.festival3),
                getString(R.string.festival3Description),
                R.drawable.fest3
        );
        mProducts.add(product3);
        Product product4 = new Product(getString(R.string.festival4),
                getString(R.string.festival4Description),
                R.drawable.fest4
        );
        mProducts.add(product4);
        Product product5 = new Product(getString(R.string.festival5),
                getString(R.string.festival5Description),
                R.drawable.fest5
        );
        mProducts.add(product5);

        festivalLists = view.findViewById(R.id.festivalList);
        ListViewAdapter listViewAdapter = new ListViewAdapter(mProducts, getActivity());
        festivalLists.setAdapter(listViewAdapter);
        return view;
    }
}
