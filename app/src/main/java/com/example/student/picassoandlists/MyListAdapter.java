package com.example.student.picassoandlists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Berry> mBerries;
    private LayoutInflater inflater;

    public MyListAdapter(Context context, List<Berry> berries) {
        mContext = context;
        mBerries = berries;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mBerries.size();
    }

    @Override
    public Object getItem(int position) {
        return mBerries.get(position);
    }

    public Berry getBerry(int position) {
        return (Berry) getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = inflater.inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = (ImageView) view.findViewById(R.id.list_item_iv);
        TextView nameView = (TextView) view.findViewById(R.id.list_item_tv);

        Berry item = getBerry(position);

        nameView.setText(item.getName());

        Picasso
                .with(mContext)
                .load(item.getImage())
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);

        return view;
    }
}
