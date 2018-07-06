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
public class Temples extends Fragment {
    ListView templeLists;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_temples, container, false);
        templeLists = v.findViewById(R.id.templeList);
        Animation slide_up = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slide_up);
        templeLists.startAnimation(slide_up);
        final String templeName[] = {
                getString(R.string.temple1),
                getString(R.string.temple2),
                getString(R.string.temple3),
                getString(R.string.temple4),
                getString(R.string.temple5)
        };
        final String templeAddress[] = {getString(R.string.temple1Address),
                getString(R.string.temple2Address),
                getString(R.string.temple3Address),
                getString(R.string.temple4Address),
                getString(R.string.temple5Address)
        };
        final int templeImages[] = {R.drawable.baankebihari,
                R.drawable.dwarkaadesh,
                R.drawable.janambhumi,
                R.drawable.premmandir,
                R.drawable.iskcon
        };
        final String templeWebsite[] = {getString(R.string.temple1Website),
                getString(R.string.temple2Website),
                getString(R.string.temple3Website),
                getString(R.string.temple4Website),
                getString(R.string.temple5Website)};
        final float templeRating[] = {(float) 5.0,
                (float) 4.0,
                (float) 3.6,
                (float) 3.4,
                (float) 4.2};
        final String templeDescription[] = {
                getString(R.string.temple1Descriprion),
                getString(R.string.temple2Description),
                getString(R.string.temple3Description),
                getString(R.string.temple4Description),
                getString(R.string.temple5Description),
        };
        ArrayAdapter<String> templeListAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, templeName);
        templeLists.setAdapter(templeListAdapter);
        templeLists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), General.class);
                Bundle b = new Bundle();
                b.putString("productName", templeName[position]);
                b.putString("productAddress", templeAddress[position]);
                b.putString("productWebsite", templeWebsite[position]);
                b.putInt("productImage", templeImages[position]);
                b.putFloat("productRating", templeRating[position]);
                b.putString("productDescription", templeDescription[position]);
                i.putExtras(b);
                startActivity(i);
            }
        });
        return v;
    }
}
