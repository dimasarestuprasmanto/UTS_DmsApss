package com.dimasarp.aws.dmsapps.DetailFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dimasarp.aws.dmsapps.Adapter.AdapterDataDaily;
import com.dimasarp.aws.dmsapps.Adapter.RecyclerDailyAdapter;
import com.dimasarp.aws.dmsapps.Model.ModelDaily;
import com.dimasarp.aws.dmsapps.R;
import java.util.ArrayList;

public class DetailDailyFragment extends Fragment {
    View view;
    RecyclerView rvDaily;
    ArrayList<ModelDaily> list;

    public DetailDailyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detail_daily, container, false);
        rvDaily = view.findViewById(R.id.recycler_daily);
        rvDaily.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(AdapterDataDaily.getListData());

        showRecyclerList();

        return view;
    }

    private void showRecyclerList() {
        rvDaily.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerDailyAdapter listDailiy = new RecyclerDailyAdapter(getActivity());
        listDailiy.setListDaily(list);
        rvDaily.setAdapter(listDailiy);


    }
}
