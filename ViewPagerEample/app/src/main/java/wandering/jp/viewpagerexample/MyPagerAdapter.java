package wandering.jp.viewpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import wandering.jp.viewpagerexample.fragment.AFragment;
import wandering.jp.viewpagerexample.fragment.BFragment;
import wandering.jp.viewpagerexample.fragment.CFragment;
import wandering.jp.viewpagerexample.fragment.DFragment;

/**
 * Created by RyusukeFuda on 2014/10/21.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private AFragment aFragment;
    private BFragment bFragment;
    private CFragment cFragment;
    private DFragment dFragment;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        aFragment = new AFragment();
        bFragment = new BFragment();
        cFragment = new CFragment();
        dFragment = new DFragment();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        switch (position){
            case 0: f = aFragment;
                break;
            case 1: f = bFragment;
                break;
            case 2: f = cFragment;
                break;
            case 3: f = dFragment;
                break;
        }
        return f;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
