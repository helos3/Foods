package itlab.foods;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ProductViewHolder> {

    List<Product> products;

    RvAdapter(List<Product> products){
        this.products = products;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
        return new ProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.textView.setText(products.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        //CardView cardView;
        ImageView imageView;
        TextView textView;

        ProductViewHolder(View itemView) {
            super(itemView);
            //cardView = (CardView)itemView.findViewById(R.id.cv);
            imageView = (ImageView)itemView.findViewById(R.id.pic);
            textView = (TextView)itemView.findViewById(R.id.text);
        }

    }

}