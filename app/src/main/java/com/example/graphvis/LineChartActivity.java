package com.example.graphvis;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


//
//
//class DateAxisValueFormatter implements IAxisValueFormatter {
//    private String[] mValues;
//
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd:hh:mm:ss");
//
//    public DateAxisValueFormatter(String[] values) {
//        this.mValues = values; }
//
//    @Override
//    public String getFormattedValue(float value, AxisBase axis) {
//        return sdf.format(new Date((long) value));
//    }
//}



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
        xAxis.setValueFormatter(new HourAxisValueFormatter(1604575794));

        lineDataSet.setColor(Color.rgb(98, 0, 238));
        lineDataSet.setLineWidth(3);
        lineDataSet.setValueTextSize(12);
        lineDataSet.setCircleColor(Color.rgb(164, 77, 255));
        lineDataSet.setDrawCircles(true);
        lineDataSet.setCircleRadius(8);


    }

    private ArrayList<Entry> lineChartDataSet(){
        ArrayList<Entry> dataSet = new ArrayList<Entry>();
        dataSet.add(new Entry( 1604539446,40));
        dataSet.add(new Entry(1604543046,15));
        dataSet.add(new Entry(1604550246,20));
        dataSet.add(new Entry(1604553846,50));
        dataSet.add(new Entry(1604557446,34));
        dataSet.add(new Entry(1604561046,23));
        dataSet.add(new Entry(1604571846,12));
        dataSet.add(new Entry(1604575446,11));


       return dataSet;

    }
}
