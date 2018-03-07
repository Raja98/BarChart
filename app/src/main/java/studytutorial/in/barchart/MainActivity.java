package studytutorial.in.barchart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.XAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AxisBase yaxis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         int[] barColorArray1 = new int[12];
        BarChart barChart = (BarChart) findViewById(R.id.barchart);
       float barWidth =  0.45f;
        barChart.setTouchEnabled(false);
        barChart.getAxisLeft().setDrawLabels(false);
        barChart.getAxisRight().setDrawLabels(false);
        barChart.getXAxis().setDrawLabels(false);

        barChart.getLegend().setEnabled(false);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(3f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(2f, 3));
        entries.add(new BarEntry(3f, 4));
        entries.add(new BarEntry(4f, 5));
        entries.add(new BarEntry(1f, 6));
        entries.add(new BarEntry(2f, 7));
        entries.add(new BarEntry(3f, 8));
        entries.add(new BarEntry(4f, 9));
        entries.add(new BarEntry(5f, 10));
        entries.add(new BarEntry(7f, 11));
        BarDataSet bardataset = new BarDataSet(entries, "");

        ArrayList<String> labels = new ArrayList<String>();
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");
            labels.add(" ");

        BarData data = new BarData(labels, bardataset);
        barChart.setData(data);



        // set the data and list of lables into chart
       //
        //barChart.getXAxis().setEnabled(false);

        barChart.getXAxis().setDrawGridLines(false); // disable grid lines for the XAxis
        barChart.getAxisLeft().setDrawGridLines(false); // disable grid lines for the left YAxis
        barChart.getAxisRight().setDrawGridLines(false);
        bardataset.setBarSpacePercent(2);

        barChart.setDescription("");  // set the descripti

        barChart.setDrawBorders(false);
        barChart.animateY(5000);


        for (int i=0;i<entries.size();i++)
        {
            if( entries.get(i).getVal() <=4)
            {
                Log.d("jshdhshdjs","skdhshdj");
                barColorArray1[i] = Color.RED;
                bardataset.setColors(barColorArray1);
            }
            else if(entries.get(i).getVal() >4 && entries.get(i).getVal() <= 6)
            {
                barColorArray1[i] = Color.GREEN;
                bardataset.setColors(barColorArray1);
            }
            else if(entries.get(i).getVal() > 6 )
            {
                barColorArray1[i] = Color.BLUE;
                bardataset.setColors(barColorArray1);
            }
            bardataset.setColors(barColorArray1);
        }
    }
}
