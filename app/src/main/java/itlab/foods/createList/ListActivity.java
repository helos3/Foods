package itlab.foods.createList;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import itlab.foods.Product;
import itlab.foods.Products;
import itlab.foods.R;

public class ListActivity extends AppCompatActivity implements ProductListFragment.OnProductClick {


    List<Product> defProduct, custProduct;




    @Override
    public void onProductClick(Product item, int id) {
        if (id == R.id.defListFragment) {
            defProduct.remove(item);
            custProduct.add(0, item);
            ((ProductListFragment) getFragmentManager().findFragmentById(R.id.custListFragment)).mAdapter.notifyDataSetChanged();
            ((ProductListFragment) getFragmentManager().findFragmentById(R.id.defListFragment)).mAdapter.notifyDataSetChanged();
        } else {
            custProduct.remove(item);
            defProduct.add(0, item);
            ((ProductListFragment) getFragmentManager().findFragmentById(R.id.defListFragment)).mAdapter.notifyDataSetChanged();
            ((ProductListFragment) getFragmentManager().findFragmentById(R.id.custListFragment)).mAdapter.notifyDataSetChanged();
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        defProduct = new Products().getDefProducts();
        custProduct = new Products().getCustProducts();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void test() {};

}
