package app.cuenca.petservice.com.petservice;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by carlosluna on 2/8/17.
 */

public class frag_footer extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.frag_footer,container);
        return view;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
