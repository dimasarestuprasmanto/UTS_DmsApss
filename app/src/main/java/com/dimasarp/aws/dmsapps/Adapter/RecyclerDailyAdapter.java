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
import android.widget.VideoView;

import java.util.ArrayList;

import com.dimasarp.aws.dmsapps.Model.ModelDaily;
import com.dimasarp.aws.dmsapps.R;

public class RecyclerDailyAdapter extends RecyclerView.Adapter<RecyclerDailyAdapter.DailyViewHolder> {
    private Context context;
    private ArrayList<ModelDaily> listDaily;
    private ArrayList<ModelDaily> getListDaily() {
        return listDaily;
    }

    public void setListDaily(ArrayList<ModelDaily> listDaily) {
        this.listDaily = listDaily;
    }

    public RecyclerDailyAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view_detail_daily, viewGroup, false);

        return new DailyViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder dailyViewHolder, int i) {
        dailyViewHolder.txtTitleDaily.setText(getListDaily().get(i).getTitle());
        dailyViewHolder.txtDescDaily.setText(getListDaily().get(i).getDesc());
        dailyViewHolder.imgDaily.setImageResource(getListDaily().get(i).getImage());
        dailyViewHolder.txtWaktuDaily.setText(getListDaily().get(i).getWaktu());


    }

    @Override
    public int getItemCount() {
        return getListDaily().size();
    }

    class DailyViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitleDaily, txtDescDaily, txtWaktuDaily;
        ImageView imgDaily;
        VideoView videoView;

        private DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitleDaily = itemView.findViewById(R.id.txt_title_daily);
            txtDescDaily = itemView.findViewById(R.id.txt_desc_daily);
            txtWaktuDaily = itemView.findViewById(R.id.txt_waktu_daily);
            imgDaily = itemView.findViewById(R.id.img_daily);



        }
    }
}
