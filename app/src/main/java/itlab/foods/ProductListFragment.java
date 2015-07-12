package itlab.foods;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class ProductListFragment extends Fragment {

    int SPAN_COUNT = 3; //кол-во столбцов

    public ProductListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv);
        rv.setLayoutManager(new GridLayoutManager(getActivity(), SPAN_COUNT));
        RvAdapter adapter = new RvAdapter(new Products().products);
        rv.setAdapter(adapter);
        return rootView;
    }
}
