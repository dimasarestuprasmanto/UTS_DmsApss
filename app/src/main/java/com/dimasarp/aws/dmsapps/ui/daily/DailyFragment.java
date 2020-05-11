package com.dimasarp.aws.dmsapps.ui.daily;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.dimasarp.aws.dmsapps.DetailFragment.DetailDailyFragment;
import com.dimasarp.aws.dmsapps.DetailFragment.DetailFriendListFragment;
import com.dimasarp.aws.dmsapps.R;
import com.dimasarp.aws.dmsapps.test;

public class DailyFragment extends Fragment {

    View view;
    TextView txtTitle;
    ImageButton cvDetailDaily, cvDetailFriend;
    private DailyViewModel dailyViewModel;

    public DailyFragment() {
        // Required empty public constructor
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_daily, container, false);

        cvDetailDaily =view.findViewById(R.id.btn_daily);
        cvDetailFriend = view.findViewById(R.id.btn_friend);

        cvDetailDaily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailDailyFragment dailyFragment = new DetailDailyFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, dailyFragment, DetailDailyFragment.class.getSimpleName());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        cvDetailFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailFriendListFragment friendFragment = new DetailFriendListFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, friendFragment, DetailFriendListFragment.class.getSimpleName());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return view;
    }

}
