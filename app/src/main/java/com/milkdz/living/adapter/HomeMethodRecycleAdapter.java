package com.milkdz.living.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.milkdz.living.R;
import com.milkdz.living.bean.MethodBean;

import java.util.ArrayList;


/**
 * Create by zuoqi@bhz.com.cn on 2019/5/31 14:12
 */
public class HomeMethodRecycleAdapter extends RecyclerView.Adapter<HomeMethodRecycleAdapter.MyViewHolder> {

    private ArrayList<MethodBean> beanArrayList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.rv_home_method, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        if (beanArrayList == null) return 0;
        return beanArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public void swap(ArrayList<MethodBean> methodBeanList) {
        this.beanArrayList = methodBeanList;
    }
}
