package com.example.graphvis;

import com.github.mikephil.charting.formatter.ValueFormatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HourAxisValueFormatter extends ValueFormatter {
    private long referenceTimestamp; // minimum timestamp in your data set
    private DateFormat mDataFormat;
    private Date mDate;

    public HourAxisValueFormatter(long referenceTimestamp) {
        this.referenceTimestamp = referenceTimestamp;
        this.mDataFormat = new SimpleDateFormat("HH:mm", Locale.ENGLISH);;
        this.mDate = new Date();
    }

    @Override
    public String getFormattedValue(float value) {
        return getDateString((long) value);
    }

    private String getDateString(long timestamp) {
        try {

            return this.mDataFormat.format(new Date(timestamp));
        } catch(Exception ex) {
            System.out.println(ex);
            return "xx";
        }
    }
}