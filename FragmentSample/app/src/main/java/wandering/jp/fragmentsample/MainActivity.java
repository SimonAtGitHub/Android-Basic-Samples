package wandering.jp.fragmentsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import wandering.jp.fragmentsample.Fragments.CalculateFragment;


public class MainActivity extends FragmentActivity implements View.OnClickListener{

    private Fragment calcurateFragment = new CalculateFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = (Button) findViewById(R.id.btn_start);
        Button buttonStop = (Button) findViewById(R.id.btn_stop);
        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    private void addFragment(){
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(calcurateFragment,CalculateFragment.class.getName()).commit();
    }

    private void removeFragment(){
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().remove(calcurateFragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start:
                addFragment();
                break;
            case R.id.btn_stop:
                removeFragment();
                break;
        }
    }
}
