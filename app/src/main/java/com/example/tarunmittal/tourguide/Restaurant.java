package com.example.tarunmittal.tourguide;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/**
 * A simple {@link Fragment} subclass.
 */
public class Restaurant extends Fragment {
    ListView restaurantLists;
    public Restaurant() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_restaurant, container, false);
        final String restaurant[] = {
                getString(R.string.restaurant1),
                getString(R.string.restaurant2),
                getString(R.string.restaurant3),
                getString(R.string.restaurant4),
                getString(R.string.restaurant5)
        };
        restaurantLists = v.findViewById(R.id.restaurantList);
        Animation slide_up = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slide_up);
        restaurantLists.startAnimation(slide_up);
        final String restaurantAddress[] = {getString(R.string.restauran1Address),
                getString(R.string.restauran2Address),
                getString(R.string.restauran3Address),
                getString(R.string.restauran4Address),
                getString(R.string.restauran5Address)
        };
        final int restaurantImages[] = {R.drawable.basera,
                R.drawable.dosa,
                R.drawable.regal,
                R.drawable.lords,
                R.drawable.brijwasi
        };
        final String restaurantWebsite[] = {getString(R.string.restaurant1Website),
                getString(R.string.restaurant2Website),
                getString(R.string.restaurant3Website),
                getString(R.string.restaurant4Website),
                getString(R.string.restaurant5Website)};
        final String restaurantDescription[] = {
                getString(R.string.restaurant1Description),
                getString(R.string.restaurant2Description),
                getString(R.string.restaurant3Description),
                getString(R.string.restaurant4Description),
                getString(R.string.restaurant5Description)
        };
        final float restaurantRating[] = {(float) 3.8,
                (float) 4.0,
                (float) 3.6,
                (float) 4.4,
                (float) 3.2};
        ArrayAdapter<String> restaurantListAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, restaurant);
        restaurantLists.setAdapter(restaurantListAdapter);
        restaurantLists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), General.class);
                Bundle b = new Bundle();
                b.putString("productName", restaurant[position]);
                b.putString("productAddress", restaurantAddress[position]);
                b.putString("productWebsite", restaurantWebsite[position]);
                b.putString("productDescription",restaurantDescription[position]);
                b.putInt("productImage", restaurantImages[position]);
                b.putFloat("productRating", restaurantRating[position]);
                i.putExtras(b);
                startActivity(i);
            }
        });
        return v;
    }
}
