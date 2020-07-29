package com.example.android.android_me.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    // Mandatory Constructor for instantiating the fragment
    public BodyPartFragment() {
    }

    /**
     *Inflates the fragment layout and sets any image resources
     */
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

            // Inflate the Android-Me fragment layout
            View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

            // Get reference to the ImageView in the fragment layout
            ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

            //Set the image resource to display
            imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

            // Return root view
            return rootView;
        }
    }