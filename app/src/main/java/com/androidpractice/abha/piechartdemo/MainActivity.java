package com.androidpractice.abha.piechartdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = (PieChart) findViewById(R.id.piechart);


        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(4f, 0));
        entries.add(new PieEntry(8f, 1));
        entries.add(new PieEntry(6f, 2));
        entries.add(new PieEntry(13f,3));
        entries.add(new PieEntry(18f,4));
        entries.add(new PieEntry(9f, 5));
        entries.add(new PieEntry(12f,6));


        PieDataSet dataset = new PieDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        labels.add("Jul");

        PieData data = new PieData(dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //


        pieChart.setData(data);
        pieChart.animateY(5000);
        pieChart.setCenterTextSize(12);
    }
}
