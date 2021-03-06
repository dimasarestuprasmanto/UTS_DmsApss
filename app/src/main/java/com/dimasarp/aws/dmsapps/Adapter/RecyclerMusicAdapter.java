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

import com.dimasarp.aws.dmsapps.Model.ModelMusic;
import com.dimasarp.aws.dmsapps.R;
import java.util.ArrayList;

public class RecyclerMusicAdapter extends RecyclerView.Adapter<RecyclerMusicAdapter.MusicViewHolder> {
    private Context context;
    private ArrayList<ModelMusic> listMusic;
    private ArrayList<ModelMusic> getListMusic() {
        return listMusic;
    }

    public void setListMusic(ArrayList<ModelMusic> listMusic) {
        this.listMusic = listMusic;
    }

    public RecyclerMusicAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_music,viewGroup,false);

        return new MusicViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder musicViewHolder, int i) {
        musicViewHolder.txtTitleMusic.setText(getListMusic().get(i).getTitle());
        musicViewHolder.txtDescMusic.setText(getListMusic().get(i).getDesc());
    }
    @Override
    public int getItemCount() {
        return getListMusic().size();
    }

    class MusicViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitleMusic, txtDescMusic;
        ImageView imgPlay;

        private MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitleMusic = itemView.findViewById(R.id.txtTitleMusic1);
            txtDescMusic = itemView.findViewById(R.id.txtdescMusic1);
            imgPlay = itemView.findViewById(R.id.btnPlay1);
        }
    }
}
