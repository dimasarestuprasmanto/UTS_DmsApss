package com.dimasarp.aws.dmsapps.ui.daily;
/*
Tanggal Pengerjaan : 9 Mei 2020
Deskripsi Pengerjaan : Membuat Splash Screen, Walkthrough 3 view, Side Bar

Tanggal Pengerjaan : 10 Mei 2020
Deskripsi Pengerjaan : Membuat Profile, Tampilan Daily

Tanggal Pengerjaan : 11 Mei 2020
Deskripsi Pengerjaan : Membuat Daily Activity, FriendList

Tanggak Pengerjaan : 13 Mei 2020
Deskripsi Pengerjaan : Membuat Gallery,Video dan Music

Tanggak Pengerjaan : 14 Mei 2020
Deskripsi Pengerjaan : Membuat Profile,fb,googlemaps,call

Tanggak Pengerjaan : 15 Mei 2020
Deskripsi Pengerjaan : Memperbagus semua tampilan, mengisi data dummy/hardcore sesuai reality

NIM : 10117123
NAMA : Dimas Arestu Prasmanto
KELAS : IF4
 */
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
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
import com.dimasarp.aws.dmsapps.DetailFragment.DetailGalleryFragment;
import com.dimasarp.aws.dmsapps.DetailMusicAndVideo;
import com.dimasarp.aws.dmsapps.R;
import com.dimasarp.aws.dmsapps.test;

public class DailyFragment extends Fragment {

    View view;
    TextView txtTitle;
    ImageButton cvDetailDaily, cvDetailFriend, cvDetailGallery, cvDetailMusic;
    private DailyViewModel dailyViewModel;


    public DailyFragment() {
        // Required empty public constructor
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_daily, container, false);

        cvDetailDaily =view.findViewById(R.id.btn_daily);
        cvDetailFriend = view.findViewById(R.id.btn_friend);
        cvDetailGallery = view.findViewById(R.id.btn_gallery);
        cvDetailMusic = view.findViewById(R.id.btn_fav);

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

        cvDetailGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailGalleryFragment detailGalleryFragment = new DetailGalleryFragment();
                FragmentManager managerGallery = getFragmentManager();
                FragmentTransaction fragmentTransaction = managerGallery.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, detailGalleryFragment, DetailFriendListFragment.class.getSimpleName());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        cvDetailMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailMusicAndVideo.class);
                startActivity(intent);
            }
        });


        return view;
    }


}
