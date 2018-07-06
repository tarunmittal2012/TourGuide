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
public class School extends Fragment {
    ListView schoolLists;
    public School() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_school, container, false);
        schoolLists = v.findViewById(R.id.schoolList);
        Animation slide_up = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slide_up);
        schoolLists.startAnimation(slide_up);
        final String schools[] = {
                getString(R.string.school1),
                getString(R.string.school2),
                getString(R.string.school3),
                getString(R.string.school4),
                getString(R.string.school5)
        };
        final String schoolAddress[] = {getString(R.string.school1Address),
                getString(R.string.school2Address),
                getString(R.string.school3Address),
                getString(R.string.school4Address),
                getString(R.string.school5Address)
        };
        final int schoolImages[] = {R.drawable.mountlitera,
                R.drawable.grace,
                R.drawable.armypublic,
                R.drawable.sentdominic,
                R.drawable.kds
        };
        final String schoolWebsite[] = {getString(R.string.school1Website),
                getString(R.string.school2Website),
                getString(R.string.school3Website),
                getString(R.string.school4Website),
                getString(R.string.school5Website)};
        final String schoolDescription[] = {getString(R.string.school1Description),
                getString(R.string.school2Description),
                getString(R.string.school3Description),
                getString(R.string.school4Description),
                getString(R.string.school5Description)};

        final float schoolRating[] = {(float) 4.0,
                (float) 3.0,
                (float) 4.6,
                (float) 4.4,
                (float) 3.2};
        ArrayAdapter<String> schoolListAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, schools);
        schoolLists.setAdapter(schoolListAdapter);
        schoolLists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), General.class);
                Bundle b = new Bundle();
                b.putString("productName", schools[position]);
                b.putString("productAddress", schoolAddress[position]);
                b.putString("productWebsite", schoolWebsite[position]);
                b.putString("productDescription",schoolDescription[position]);
                b.putInt("productImage", schoolImages[position]);
                b.putFloat("productRating", schoolRating[position]);
                i.putExtras(b);
                startActivity(i);
            }
        });
        return v;
    }
}
