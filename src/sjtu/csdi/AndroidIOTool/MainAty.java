package sjtu.csdi.AndroidIOTool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import sjtu.csdi.AndroidIOTool.chart.ChartAty;

public class MainAty extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        startActivity(new Intent(MainAty.this, AppListAty.class));
        startActivity(new Intent(MainAty.this, ChartAty.class));
        this.finish();
    }
}
