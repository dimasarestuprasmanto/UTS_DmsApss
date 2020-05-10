package com.dimasarp.aws.dmsapps.ui.daily;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.dimasarp.aws.dmsapps.R;

public class DailyFragment extends Fragment {

    private DailyViewModel dailyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dailyViewModel =
                ViewModelProviders.of(this).get(DailyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_daily, container, false);


        return root;
    }
}
