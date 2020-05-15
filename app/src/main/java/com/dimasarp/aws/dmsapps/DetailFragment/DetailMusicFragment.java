package com.dimasarp.aws.dmsapps.DetailFragment;
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
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.dimasarp.aws.dmsapps.Adapter.AdapterMusic;
import com.dimasarp.aws.dmsapps.Adapter.RecyclerMusicAdapter;
import com.dimasarp.aws.dmsapps.Model.ModelMusic;
import com.dimasarp.aws.dmsapps.R;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class DetailMusicFragment extends Fragment {
    View view;
    RecyclerView rvMusic;
    ArrayList<ModelMusic> list;

    public DetailMusicFragment() {
        // Required empty public constructor
    }

    ImageView btnPlay, btnPause;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        view = inflater.inflate(R.layout.music, container, false);

        btnPlay = view.findViewById(R.id.btnPlay1);
        btnPause = view.findViewById(R.id.btnPause1);
        rvMusic = view.findViewById(R.id.recyclerMusic);
        rvMusic.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(AdapterMusic.getListdata());

        showRecyclerList();
        return view;
    }

    private void showRecyclerList() {
        rvMusic.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerMusicAdapter listMusic = new RecyclerMusicAdapter(getActivity());
        listMusic.setListMusic(list);
        rvMusic.setAdapter(listMusic);
    }

}
