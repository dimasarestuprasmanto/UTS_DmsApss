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
import com.dimasarp.aws.dmsapps.Model.ModelFriendList;
import com.dimasarp.aws.dmsapps.R;
import java.util.ArrayList;

public class AdapterDataFriend {
    public static String[][] data = new String[][]{
            {String.valueOf(R.drawable.friend_1),"Ananda Marwanaya Putra","20 Tahun", "Mahasiswa"},
            {String.valueOf(R.drawable.friend_2),"Ari Sumardi","20 Tahun", "Mahasiswa"},
            {String.valueOf(R.drawable.friend_3),"Muhammad Farhan","20 Tahun", "Mahasiswa"},
            {String.valueOf(R.drawable.friend_4),"M. Nizar","20 Tahun", "Mahasiswa"}
    };

    public static ArrayList<ModelFriendList> getListDataFriend() {
        ModelFriendList modelFriend = null;
        ArrayList<ModelFriendList> listFriend = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            modelFriend = new ModelFriendList();
            modelFriend.setFoto(Integer.parseInt(data[i][0]));
            modelFriend.setNama(data[i][1]);
            modelFriend.setUmur(data[i][2]);
            modelFriend.setPekerjaan(data[i][3]);
            listFriend.add(modelFriend);

        }
        return listFriend;
    }
}
