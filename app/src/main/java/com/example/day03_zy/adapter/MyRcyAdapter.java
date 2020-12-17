package com.example.day03_zy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.day03_zy.R;
import com.example.day03_zy.bean.Bean;

import java.util.ArrayList;

public class MyRcyAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<Bean.DataDTO.DatasDTO> list;

    public MyRcyAdapter(Context context, ArrayList<Bean.DataDTO.DatasDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rcy, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder= (ViewHolder) holder;
        Bean.DataDTO.DatasDTO datasDTO = list.get(position);
        viewHolder.tv.setText(datasDTO.getTitle());
        Glide.with(context).load(datasDTO.getEnvelopePic()).into(viewHolder.iv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static
    class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iv;
        private final TextView tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv = itemView.findViewById(R.id.iv);
            this.tv = itemView.findViewById(R.id.tv);
        }
    }
}
