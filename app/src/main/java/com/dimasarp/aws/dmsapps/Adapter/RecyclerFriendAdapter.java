package com.dimasarp.aws.dmsapps.Adapter;
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
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dimasarp.aws.dmsapps.Model.ModelFriendList;
import com.dimasarp.aws.dmsapps.R;
import java.util.ArrayList;

public class RecyclerFriendAdapter extends RecyclerView.Adapter<RecyclerFriendAdapter.FriendViewHolder> {
    private Context context;
    private ArrayList<ModelFriendList> listFriend;

    private ArrayList<ModelFriendList> getListFriend() {
        return listFriend;
    }

    public void setListFriend(ArrayList<ModelFriendList> listFriend) {
        this.listFriend = listFriend;
    }

    public RecyclerFriendAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view_friend_list, viewGroup, false);

        return new FriendViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder friendViewHolder, int i) {
        friendViewHolder.imgFriend.setImageResource(getListFriend().get(i).getFoto());
        friendViewHolder.txtNama.setText(getListFriend().get(i).getNama());
        friendViewHolder.txtUmur.setText(getListFriend().get(i).getUmur());
        friendViewHolder.txtPekerjaan.setText(getListFriend().get(i).getPekerjaan());
    }

    @Override
    public int getItemCount() {
        return getListFriend().size();
    }

    class FriendViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFriend;
        TextView txtNama, txtUmur, txtPekerjaan;

        public FriendViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFriend = itemView.findViewById(R.id.img_friend_list);
            txtNama = itemView.findViewById(R.id.txt_nama_friend);
            txtUmur = itemView.findViewById(R.id.txt_umur_friend);
            txtPekerjaan = itemView.findViewById(R.id.txt_pekerjaan_friend);
        }
    }
}
