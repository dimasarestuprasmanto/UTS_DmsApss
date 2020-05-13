package com.dimasarp.aws.dmsapps.DetailFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dimasarp.aws.dmsapps.Adapter.AdapterDataGallery;
import com.dimasarp.aws.dmsapps.Adapter.RecyclerGalleryAdapter;
import com.dimasarp.aws.dmsapps.Model.ModelGallery;

import com.dimasarp.aws.dmsapps.R;

import java.util.ArrayList;

public class DetailGalleryFragment extends Fragment {
    View view;
    RecyclerView rvGallery;
    ArrayList<ModelGallery> galleryList;

    public DetailGalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detail_gallery, container, false);
        rvGallery = view.findViewById(R.id.rvGallery);
        rvGallery.setHasFixedSize(true);

        galleryList = new ArrayList<>();
        galleryList.addAll(AdapterDataGallery.getListDataGallery());

        showRecyclerList();

        return view;
    }

    private void showRecyclerList() {

        rvGallery.setLayoutManager(new GridLayoutManager(getActivity(),2));
        RecyclerGalleryAdapter galleryAdapter = new RecyclerGalleryAdapter(getActivity());
        galleryAdapter.setListGallery(galleryList);
        rvGallery.setAdapter(galleryAdapter);
    }

}
