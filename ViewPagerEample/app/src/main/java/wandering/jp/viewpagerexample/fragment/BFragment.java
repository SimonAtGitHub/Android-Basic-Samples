package wandering.jp.viewpagerexample.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wandering.jp.viewpagerexample.R;

/**
 * Created by RyusukeFuda on 2014/10/21.
 */
public class BFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, null);
        return v;
    }
}
