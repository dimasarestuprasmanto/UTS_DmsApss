package com.dimasarp.aws.dmsapps.Adapter;

import com.dimasarp.aws.dmsapps.Model.ModelFriendList;
import com.dimasarp.aws.dmsapps.R;
import java.util.ArrayList;

public class AdapterDataFriend {
    public static String[][] data = new String[][]{
            {String.valueOf(R.drawable.bg_daily),"Sugiyanto","45 Tahun","Wiraswasta","0857148238","sugiantoapih@yahoo.com"},
            {String.valueOf(R.drawable.bg_daily),"Rosani","43 Tahun","Wiraswasta","0850148238","rosani06@gmail.com"},
            {String.valueOf(R.drawable.bg_daily),"Sutantio","21 Tahun","Mahasiswa","08956248238","sutantiogaming@gmail.com"},
            {String.valueOf(R.drawable.bg_daily),"Fanny Murty","19 Tahun","Mahasiswa","089571482328","fannymurty@gmail.com"},
            {String.valueOf(R.drawable.bg_daily),"Alifsar","19 Tahun","Mahasiswa","089231482328","alifsarmorang@gmail.com"},
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
            modelFriend.setTelepon(data[i][4]);
            modelFriend.setEmail(data[i][5]);
            listFriend.add(modelFriend);

        }
        return listFriend;
    }
}
