package com.example.app2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.app2.MainActivity;
import com.example.app2.R;
import com.example.app2.bean.Bean;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {
    private ArrayList<Bean.DataDTO.DatasDTO> list;
    private Context context;

    public MyAdapter(ArrayList<Bean.DataDTO.DatasDTO> list, Context context) {
        this.list = list;
        this.context = context;
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
    class ViewHolder extends RecyclerView.ViewHolder{

        private final ImageView iv;
        private final TextView tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
