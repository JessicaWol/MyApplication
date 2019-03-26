package com.example.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CelluleJava> {
    private List<products> listValues;
    private final OnclickProduct Click;


    public class CelluleJava extends RecyclerView.ViewHolder {
        public TextView txtHeader;
        public TextView txtFooter;
        public ImageView image;
        public View layout;


        public CelluleJava(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
            image = v.findViewById(R.id.icon);
        }
    }

    public void add(int position, products item) {
        listValues.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        listValues.remove(position);
        notifyItemRemoved(position);

    }
    public MyAdapter(List<products> listValues, OnclickProduct Click) {
        this.listValues = listValues;
        this.Click = Click;

    }

    @Override
    public MyAdapter.CelluleJava onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);
        CelluleJava vh = new CelluleJava(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(CelluleJava holder, final int position) {

        final products currentproducts = listValues.get(position);
        final String name = currentproducts.getName();
        holder.txtHeader.setText(name);

       holder.txtHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click.Onclick(currentproducts);
            }
        });

        holder.txtFooter.setText("name: " + name);
    }

    @Override
    public int getItemCount() {
        return listValues.size();
    }

}






