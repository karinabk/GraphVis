package com.example.graphvis;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;



public class LineChartActivity extends AppCompatActivity {

    LineChart lineChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);

        lineChart = findViewById(R.id.lineChart);
        LineDataSet lineDataSet = new LineDataSet(lineChartDataSet(), "data set");
        ArrayList<ILineDataSet> iLineDataSets = new ArrayList<>();
        iLineDataSets.add(lineDataSet);

        LineData lineData = new LineData(iLineDataSets);

        lineChart.setData(lineData);
        lineChart.invalidate();
        lineChart.animateXY(1000,1000);


        XAxis xAxis = lineChart.getXAxis();
//        xAxis.setValueFormatter(new HourAxisValueFormatter(1604575794));

        lineDataSet.setColor(Color.rgb(98, 0, 238));
        lineDataSet.setLineWidth(3);
        lineDataSet.setValueTextSize(12);
        lineDataSet.setCircleColor(Color.rgb(164, 77, 255));
        lineDataSet.setDrawCircles(true);
//        lineDataSet.setCircleRadius(8);
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);


    }

    private ArrayList<Entry> lineChartDataSet(){
        ArrayList<Entry> dataSet = new ArrayList<Entry>();
        dataSet.add(new Entry( 0,40));
        dataSet.add(new Entry(1,15));
        dataSet.add(new Entry(2,20));
        dataSet.add(new Entry(3,50));
        dataSet.add(new Entry(4,34));
        dataSet.add(new Entry(5,23));
        dataSet.add(new Entry(6,12));
        dataSet.add(new Entry(7,11));
        dataSet.add(new Entry(8,11));
        dataSet.add(new Entry(9,11));
        dataSet.add(new Entry(10,110));
        dataSet.add(new Entry(11,114));
        dataSet.add(new Entry(12,13));
        dataSet.add(new Entry(13,50));
        dataSet.add(new Entry(14,11));
        dataSet.add(new Entry(15,11));
        dataSet.add(new Entry(16,11));
        dataSet.add(new Entry(17,11));
        dataSet.add(new Entry(18,11));
        dataSet.add(new Entry(19,11));
        dataSet.add(new Entry(20,11));
        dataSet.add(new Entry(21,11));
        dataSet.add(new Entry(22,11));
        dataSet.add(new Entry(23,11));
        dataSet.add(new Entry(24,11));
        dataSet.add(new Entry(25,11));
        dataSet.add(new Entry(26,11));


       return dataSet;

    }
}
