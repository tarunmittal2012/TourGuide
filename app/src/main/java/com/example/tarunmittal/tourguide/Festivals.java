package com.example.tarunmittal.tourguide;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
public class Festivals extends Fragment {

    ListView festivalLists;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_festivals, container, false);
        festivalLists = view.findViewById(R.id.festivalList);
        Animation slide_up = AnimationUtils.loadAnimation(getActivity(),
                R.anim.slide_up);
        festivalLists.startAnimation(slide_up);
        final String festivals[] = {
                getString(R.string.festival1),
                getString(R.string.festival2),
                getString(R.string.festival3),
                getString(R.string.festival4),
                getString(R.string.festival5)
        };
        final String festivalsDescription[] = {
                getString(R.string.festival1Description),
                getString(R.string.festival2Description),
                getString(R.string.festival3Description),
                getString(R.string.festival4Description),
                getString(R.string.festival5Description)
        };
        final int festivalsImage[]={R.drawable.fest1,
        R.drawable.fest2,
        R.drawable.fest3,
        R.drawable.fest4,
        R.drawable.fest5};
        ArrayAdapter<String> schoolListAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, festivals);
        festivalLists.setAdapter(schoolListAdapter);
        festivalLists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), FestivalDescription.class);
                Bundle b = new Bundle();
                b.putString("festivalName", festivals[position]);
                b.putInt("festivalImage",festivalsImage[position]);
                b.putString("festivalDescription",festivalsDescription[position]);
                i.putExtras(b);
                startActivity(i);
            }
        });
        return view;

    }
   }
