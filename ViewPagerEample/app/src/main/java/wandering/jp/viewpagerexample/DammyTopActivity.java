package wandering.jp.viewpagerexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by RyusukeFuda on 2014/10/21.
 */
public class DammyTopActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
