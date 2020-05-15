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
import java.util.ArrayList;

import com.dimasarp.aws.dmsapps.Model.ModelGallery;
import com.dimasarp.aws.dmsapps.R;

public class AdapterDataGallery {
    public static String[][] data = new String[][]{
            {String.valueOf(R.drawable.kny),"Anime"},
            {String.valueOf(R.drawable.dota),"Game"},
            {String.valueOf(R.drawable.manga),"Manga"},
            {String.valueOf(R.drawable.light_novel),"Light Novel"},
            {String.valueOf(R.drawable.personal_comp),"PC Gaming"},
            {String.valueOf(R.drawable.source_code),"Source Code"},
    };

    public static ArrayList<ModelGallery> getListDataGallery() {
        ModelGallery modelGallery = null;
        ArrayList<ModelGallery> listGallery = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            modelGallery = new ModelGallery();
            modelGallery.setImage(Integer.parseInt(data[i][0]));
            modelGallery.setNamaGallery(data[i][1]);
            listGallery.add(modelGallery);

        }
        return listGallery;
    }
}
