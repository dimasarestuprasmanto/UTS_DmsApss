package com.dimasarp.aws.dmsapps.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.dimasarp.aws.dmsapps.Model.ModelGallery;
import com.dimasarp.aws.dmsapps.R;
public class RecyclerGalleryAdapter extends RecyclerView.Adapter<RecyclerGalleryAdapter.GalleryViewHolder> {
    private Context context;
    private ArrayList<ModelGallery> listGallery;


    private ArrayList<ModelGallery> getListGallery() {
        return listGallery;
    }

    public void setListGallery(ArrayList<ModelGallery> listGallery){
        this.listGallery = listGallery;
    }

    public RecyclerGalleryAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view_detail_gallery,viewGroup,false);

        return new GalleryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder galleryViewHolder, int i) {
        galleryViewHolder.imgGallery.setImageResource(getListGallery().get(i).getImage());
        galleryViewHolder.namaGallery.setText(getListGallery().get(i).getNamaGallery());
    }

    @Override
    public int getItemCount() {
        return getListGallery().size();
    }

    class GalleryViewHolder extends RecyclerView.ViewHolder{
        ImageView imgGallery;
        TextView namaGallery;

        public GalleryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGallery = itemView.findViewById(R.id.imgGallery);
            namaGallery = itemView.findViewById(R.id.namaGallery);
        }
    }
}