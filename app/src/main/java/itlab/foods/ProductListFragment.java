package itlab.foods;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class ProductListFragment extends Fragment {

    int SPAN_COUNT = 3;
    List<Product> products;
    RvAdapter mAdapter;


    public ProductListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);
        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv);
        if (this.getId() == R.id.defListFragment) {
            rv.setLayoutManager(new GridLayoutManager(getActivity(), SPAN_COUNT));
            products = new Products().getProducts();

        } else {
            rv.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
            products = new ArrayList<>();
        }
        mAdapter = new RvAdapter(products);
        rv.setAdapter(mAdapter);
        return rootView;
    }

    public void addProduct() {
        products.add(new Product("hui", "hui"));
        mAdapter.notifyDataSetChanged();
    }

    public void removeProduct() {
        products.remove(new Product("hui", "hui"));
        mAdapter.notifyDataSetChanged();
    }
}
