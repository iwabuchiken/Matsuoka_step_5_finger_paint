package step_5.main;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActv extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actv_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actv_main, menu);
        return true;
    }
}
