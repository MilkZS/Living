package com.milkdz.living.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.milkdz.living.R;
import com.milkdz.living.bean.MethodBean;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * Create by zuoqi@bhz.com.cn on 2019/5/31 14:12
 */
public class HomeMethodRecycleAdapter extends RecyclerView.Adapter<HomeMethodRecycleAdapter.MyViewHolder> {

    private ArrayList<MethodBean> beanArrayList;
    private Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.rv_home_method, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        MethodBean bean = beanArrayList.get(i);
        Picasso.with(context).load(bean.getUrl()).fit().into(myViewHolder.iv);
        myViewHolder.tvName.setText(bean.getName());
    }

    @Override
    public int getItemCount() {
        if (beanArrayList == null) return 0;
        return beanArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        ImageView iv;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_rv_home_method);
            iv = itemView.findViewById(R.id.iv_rv_home_method);
        }
    }

    public void swap(ArrayList<MethodBean> methodBeanList) {
        this.beanArrayList = methodBeanList;
    }
}
