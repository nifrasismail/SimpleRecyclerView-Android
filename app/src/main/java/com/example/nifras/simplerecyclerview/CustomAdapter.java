package com.example.nifras.simplerecyclerview;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nifras on 2/22/17.
 */

// TODO (8) Creating adapter class called CustomAdapter and inner class NumberViewHolder
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.NumberViewHolder>{

    // TODO (11) Specify How many views the adapter hold
    private int mNumberItems;

    // TODO (12) populate the item into the constructor
    public CustomAdapter(int mNumberItems) {
        this.mNumberItems = mNumberItems;
    }


    // TODO (13) Override the onCreateViewHolder
    @Override
    public CustomAdapter.NumberViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.number_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachedToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem,viewGroup,shouldAttachedToParentImmediately);
        NumberViewHolder viewHolder = new NumberViewHolder(view);

        return  viewHolder;
    }

    // TODO (14) Override the onBindViewHolder
    @Override
    public void onBindViewHolder(CustomAdapter.NumberViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    class NumberViewHolder extends  RecyclerView.ViewHolder{

        // TODO (9) Create a single textview varaible
        TextView listItemNumberView;

        // TODO (10) Create a constructor for number view holder
        public NumberViewHolder(View itemView) {
            super(itemView);

            listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
        }

        void bind(int listIndex){
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}
