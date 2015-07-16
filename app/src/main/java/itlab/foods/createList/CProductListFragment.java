package itlab.foods.createList;



import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import itlab.foods.Product;
import itlab.foods.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class CProductListFragment extends Fragment {

    int SPAN_COUNT = 3;
    List<Product> products;
    RvAdapter mAdapter;
    RecyclerView rv;
    OnProductClick mCallBack;

    public interface OnProductClick {
        void onProductClick(Product item, int id);
    }

    public CProductListFragment() {
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallBack = (OnProductClick) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadLineInteractionListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_fragment, container, false);
        rv = (RecyclerView) rootView.findViewById(R.id.rv);
        rv.addOnItemTouchListener(new RvProductListener(getActivity(), new RvProductListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                mCallBack.onProductClick(((ListActivity) getActivity()).custProduct.get(position), getId());
            }
        }));
        rv.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        mAdapter = new RvAdapter(products);
        products = (((ListActivity) getActivity()).custProduct);
        mAdapter = new RvAdapter(products);
        rv.setAdapter(mAdapter);
        return rootView;
    }

    public void addProduct(Product item) {
        mAdapter.addProduct(item);
    }

    public void removeProduct(Product item) {
        mAdapter.removeProduct(item);
    }
}
