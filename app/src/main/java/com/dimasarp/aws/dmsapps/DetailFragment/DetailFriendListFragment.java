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
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.dimasarp.aws.dmsapps.Adapter.AdapterDataFriend;
import com.dimasarp.aws.dmsapps.Adapter.RecyclerFriendAdapter;
import com.dimasarp.aws.dmsapps.R;
import com.dimasarp.aws.dmsapps.Model.ModelFriendList;

import java.util.ArrayList;

public class DetailFriendListFragment extends Fragment {
    View view;
    RecyclerView rvFriend;
    ArrayList<ModelFriendList> friendList;
    public DetailFriendListFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_detail_friend_list,container,false);
        rvFriend = view.findViewById(R.id.recycler_friend_list);
        rvFriend.setHasFixedSize(true);

        friendList = new ArrayList<>();
        friendList.addAll(AdapterDataFriend.getListDataFriend());

        showRecyclerList();

        return view;
    }

    private void showRecyclerList() {

        rvFriend.setLayoutManager(new GridLayoutManager(getActivity(),1, LinearLayout.HORIZONTAL,false));
        RecyclerFriendAdapter friendAdapter = new RecyclerFriendAdapter(getActivity());
        friendAdapter.setListFriend(friendList);
        rvFriend.setAdapter(friendAdapter);
    }
}
