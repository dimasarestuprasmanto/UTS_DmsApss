package com.dimasarp.aws.dmsapps.Adapter;

import android.widget.BaseAdapter;

import com.dimasarp.aws.dmsapps.Model.ModelGallery;
import com.dimasarp.aws.dmsapps.Model.ModelMusic;
import com.dimasarp.aws.dmsapps.R;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class AdapterMusic {

    public static String[][] data = new String[][]{
            {"New Light","John Mayer - New Light"},
            {"Menuju Senja","Payung Teduh - Menuju Senja"},
            {"Almost Is never Enough","Ariana Grande,Nathan Sykes"},
            {"My Faforite Position","NOVAKANE, Cindercella"},
            {"Digital Love","Mardial, Ramngvrl"},
            {"Bohemian Rhapsody","Queen"},
            {"Love Of My Life","Queen - A Night At The Opera"},
            {"Don't Stop Me Now","Queen"},
            {"Somebody To Love","Queen"},
            {"Killer Queen","Queen"},
            {"I Want To Break Free","Queen"},
            {"Perfect","Ed Sheeran"},
            {"Can't Smile Without You","Carry Manilow"},
            {"I Want To Hold Your Hand","The Beatles"},
            {"Imagine","John Lennon"},
            {"Fana Merah Jambu","Fourtwnty"},
            {"Kali Kedua","Raisa"},
            {"Lily","Alan Walker"},
            {"On My Way","Alan Walker"}
    };

    public static ArrayList<ModelMusic> getListdata(){
        ModelMusic modelMusic  = null;
        ArrayList<ModelMusic> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++){
            modelMusic = new ModelMusic();
            modelMusic.setTitle(data[i][0]);
            modelMusic.setDesc(data[i][1]);
            list.add(modelMusic);
        }
        return list;
    }
}
