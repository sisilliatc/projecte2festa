package com.example.sisillia.bikebank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class HealthAnalyzer extends AppCompatActivity {


    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_analyzer);

        double x,y;
        x=0;

        GraphView graph = (GraphView) findViewById(R.id.graph1);
        series=new LineGraphSeries<DataPoint>();

        for(int i = 0 ; i<=101;i++){
            x=x+1;
            y=0+x;
            series.appendData(new DataPoint(x,y),true,101);
        }
        graph.addSeries(series);

    }
}
