package wandering.jp.fragmentsample.Fragments;


import android.app.Activity;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class CalculateFragment extends Fragment {

    private Boolean running = true;

    private void createTask(){
        AsyncTask<Void, Void, Void> task = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                while (running){
                    Log.d("", "Runnning Calculate Fragment");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                return null;
            }
        };
        task.execute();
    }

    public CalculateFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onResume() {
        super.onResume();
        running = true;
        createTask();
    }

    @Override
    public void onPause() {
        super.onPause();
        running = false;
        //task.cancel(true);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
