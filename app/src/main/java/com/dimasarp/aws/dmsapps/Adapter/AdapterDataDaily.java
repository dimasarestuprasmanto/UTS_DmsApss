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
import com.dimasarp.aws.dmsapps.Model.ModelDaily;

import java.util.ArrayList;
import com.dimasarp.aws.dmsapps.R;

public class AdapterDataDaily {
    public static String[][] data = new String[][]{
            {"Shalat Subuh","Beribadah wajib setiap subuh ke masjid", String.valueOf(R.drawable.solat),"4.55"},
            {"Nonton Anime","Menonton anime musiman", String.valueOf(R.drawable.nonton_anime),"5.30"},
            {"Kuliah","Pergi kuliah sesuai jadwal", String.valueOf(R.drawable.ngampus),"7.15"},
            {"Shalat Dzuhur","Beribadah wajib setiap dzuhur ke masjid", String.valueOf(R.drawable.solat),"12.00"},
            {"Shalat Ashar","Beribadah wajib setiap ashar ke masjid", String.valueOf(R.drawable.solat),"15.00"},
            {"Ngegame","Bermain game buat hiburan", String.valueOf(R.drawable.ngegame),"15.30"},
            {"Shalat Maghrib","Beribadah wajib setiap maghrib ke masjid", String.valueOf(R.drawable.solat),"18.00"},
            {"Shalat Isya","Beribadah wajib setiap isya ke masjid",String.valueOf(R.drawable.solat),"19.00"},
            {"Nugas","Mengerjakan tugas yang diberikan", String.valueOf(R.drawable.nugas),"19.45"},
            {"Baca LN/Manga","Membaca Light Novel atau Manga Sebelum Tidur", String.valueOf(R.drawable.baca),"21.15"}
    };


    public static ArrayList<ModelDaily> getListData(){
        ModelDaily modelDaily = null;
        ArrayList<ModelDaily> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++){
            modelDaily = new ModelDaily();
            modelDaily.setTitle(data[i][0]);
            modelDaily.setDesc(data[i][1]);
            modelDaily.setImage(Integer.parseInt(data[i][2]));
            modelDaily.setWaktu(data[i][3]);
            list.add(modelDaily);
        }
        return list;
    }
}
