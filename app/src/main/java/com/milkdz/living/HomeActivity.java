package com.milkdz.living;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.milkdz.living.adapter.HomeMethodRecycleAdapter;

public class HomeActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        context = this;
        initRV();
    }

    private void initRV() {
        RecyclerView recyclerView = findViewById(R.id.rv_home_method);
        // 当知道Adapter内Item的改变不会影响RecyclerView宽高的时候，可以设置为true让RecyclerView避免重新计算大小。
        recyclerView.setHasFixedSize(true);
        HomeMethodRecycleAdapter homeMethodRecycleAdapter = new HomeMethodRecycleAdapter();
        recyclerView.setAdapter(homeMethodRecycleAdapter);
        GridLayoutManager manager = new GridLayoutManager(context,2);
        recyclerView.setLayoutManager(manager);
    }
}
