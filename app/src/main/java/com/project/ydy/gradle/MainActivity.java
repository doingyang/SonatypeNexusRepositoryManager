package com.project.ydy.gradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.project.ydy.algorithmmodule.SortAlgorithmUtil;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private int[] data = new int[]{9, 7, 5, 3, 1, 0, 8, 6, 4, 2};

    private TextView tvOriginalData;
    private TextView tvSortData;
    private TextView tvSort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        setListener();
    }

    private void setListener() {
        tvSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SortAlgorithmUtil.bubblingSort(data);
                tvSortData.setText(String.format("排序后：%s", Arrays.toString(data)));
            }
        });
    }

    private void initData() {
        tvOriginalData.setText(String.format("原数据：%s", Arrays.toString(data)));
    }

    private void initView() {
        tvOriginalData = findViewById(R.id.tv_original_data);
        tvSortData = findViewById(R.id.tv_sort_data);
        tvSort = findViewById(R.id.tv_sort);
    }
}
