package com.dimasarp.aws.dmsapps.Adapter;

import java.util.ArrayList;

import com.dimasarp.aws.dmsapps.Model.ModelGallery;
import com.dimasarp.aws.dmsapps.R;

public class AdapterDataGallery {
    public static String[][] data = new String[][]{
            {String.valueOf(R.drawable.bg_daily),"Kucing"},
            {String.valueOf(R.drawable.bg_daily),"Profile"},
            {String.valueOf(R.drawable.bg_daily),"Vacation"},
            {String.valueOf(R.drawable.bg_daily),"Program"},
            {String.valueOf(R.drawable.bg_daily),"Kajian"},
            {String.valueOf(R.drawable.bg_daily),"Cartoon"},
            {String.valueOf(R.drawable.bg_daily),"Game"},
            {String.valueOf(R.drawable.bg_daily),"Film"}
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
