package com.dimasarp.aws.dmsapps.Adapter;

import com.dimasarp.aws.dmsapps.Model.ModelDaily;

import java.util.ArrayList;
import com.dimasarp.aws.dmsapps.R;

public class AdapterDataDaily {
    public static String[][] data = new String[][]{
            {"Shalat Subuh","Beribadah wajib setiap subuh ke masjid", String.valueOf(R.drawable.img1),"4.55"},
            {"Kuliah","Pergi kuliah sesuai jadwal", String.valueOf(R.drawable.img1),"9.15"},
            {"Shalat Dzuhur","Beribadah wajib setiap dzuhur ke masjid", String.valueOf(R.drawable.img1),"12.00"},
            {"Bermain Game","Bermain game jika ada kosong", String.valueOf(R.drawable.img1),"13.00"},
            {"Shalat Ashar","Beribadah wajib setiap ashar ke masjid", String.valueOf(R.drawable.img1),"13.00"},
            {"Shalat Maghrib","Beribadah wajib setiap maghrib ke masjid", String.valueOf(R.drawable.img1),"18.00"},
            {"Shalat Isya","Beribadah wajib setiap isya ke masjid",String.valueOf(R.drawable.img1),"19.00"},
            {"Ngoding","Mempelajari lebih dalam tentang Android dan Python", String.valueOf(R.drawable.img1),"20.30"}
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
