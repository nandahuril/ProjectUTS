package com.example.nanda.utsnanda;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.nanda.utsnanda.R;

public class Holder  extends RecyclerView.ViewHolder {
    public TextView txt_judul, txt_waktu;
    public ImageView img_icon;


    public Holder(View itemView) {
        super(itemView);

        txt_judul = (TextView) itemView.findViewById(R.id.txt_judul);
        txt_waktu = (TextView) itemView.findViewById(R.id.txt_waktu);
        img_icon = (ImageView) itemView.findViewById(R.id.img_icon);
    }
}
