package ma.ac.emi.campusdelivery.store_list_elements;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ma.ac.emi.campusdelivery.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView name,title,desc,price;
    View view;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;

        // Click
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mclickListener.onItemClick(v,getAdapterPosition());
            }
        });

        // Long Click
        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mclickListener.onItemLongClick(v,getAdapterPosition());
                return true;
            }
        });

        // Initialize view with layout
        name = itemView.findViewById(R.id.cardName);


    }

    private ViewHolder.ClickListener mclickListener;
    // interface for click listner
    public interface ClickListener{
        void onItemClick(View view, int position);
        void onItemLongClick(View view, int position);

    }

    public void setOnClickListener(ViewHolder.ClickListener clickListener){
        mclickListener = clickListener;
    }

}
