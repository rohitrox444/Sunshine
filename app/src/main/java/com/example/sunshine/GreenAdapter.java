package com.example.sunshine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.NumberViewHolder> {

    private static final String TAG = GreenAdapter.class.getSimpleName();

    private int mNumberItems;

    GreenAdapter(int numberOfItems){
        mNumberItems = numberOfItems;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder numberViewHolder, int i) {

    }


    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder{

        TextView number_textView;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);

            number_textView = itemView.findViewById(R.id.tv_item_number);
        }
    }
}
