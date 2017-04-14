package paztechnologies.com.meribusdrvier;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class Earning extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_earning, container, false);
        GraphView graph = (GraphView) v.findViewById(R.id.graph);
        BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6),
                new DataPoint(5, 6),
                new DataPoint(6, 6),
                new DataPoint(7, 6),
                new DataPoint(8, 6),
                new DataPoint(9, 6),
                new DataPoint(10, 6),
                new DataPoint(11, 6),
                new DataPoint(12, 6),
                new DataPoint(13, 6),

        });
//        graph.getViewport().setXAxisBoundsManual(true);
//        graph.getViewport().setYAxisBoundsManual(true);
//        graph.getViewport().setScalable(true);
//        graph.getViewport().setScalableY(true);
       // graph.getViewport().setMinX(1);
       // graph.getViewport().setMinY(1);
        graph.getViewport().setScrollable(true); // enables horizontal scrolling
        graph.getViewport().setScrollableY(true); // enables vertical scrolling
        graph.getViewport().setScalable(true); // enables horizontal zooming and scrolling
        graph.getViewport().setScalableY(true); // enables vertical zooming and scrolling
        graph.addSeries(series);
        return v;
    }


}
