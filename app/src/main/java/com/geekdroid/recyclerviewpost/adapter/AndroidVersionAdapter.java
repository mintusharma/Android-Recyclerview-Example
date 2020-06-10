package com.geekdroid.recyclerviewpost.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geekdroid.recyclerviewpost.R;
import com.geekdroid.recyclerviewpost.model.AndroidVersionModel;

import java.util.List;


public class AndroidVersionAdapter extends RecyclerView.Adapter<AndroidVersionAdapter.ViewHolder> {

    private List<AndroidVersionModel> versionList;
    private Context context;

    public AndroidVersionAdapter(List<AndroidVersionModel> versionList, Context context) {
        this.versionList = versionList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.androidversion_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final AndroidVersionModel list=versionList.get(position);
        // String.valueOf is used to convert the int into string to set the value to the textView
        holder.api_level.setText(String.valueOf(list.getaPI_level()));
        holder.version_name.setText(list.getAndroid_name());
        holder.version_number.setText(list.getVersion_number());
        holder.release_date.setText(list.getInitial_release_date());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"You clicked on api leve "+list.getaPI_level(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return versionList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView api_level,version_name,release_date,version_number;
        ViewHolder(@NonNull View itemView) {
            super(itemView);

            api_level=itemView.findViewById(R.id.api_level);
            version_name=itemView.findViewById(R.id.version_name);
            version_number=itemView.findViewById(R.id.version_number);
            release_date=itemView.findViewById(R.id.release_date);

        }
    }
}
