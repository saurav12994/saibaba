package com.example.sourabh.saibaba;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sourabh on 24-03-2017.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    static Context context;
    RecyclerAdapter(Context context){
        this.context=context;
    }
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_child,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        if(position==0){
        holder.info.setText("About us");}
        if(position==1){
            holder.info.setText("Biography");}
        if(position==2){
            holder.info.setText("Sai baba quotes");}
        if(position==3){
            holder.info.setText("Sai baba wallpapers");}
        if(position==4){
            holder.info.setText("Live Darshan");}
        if(position==5){
            holder.info.setText("Donation");}
        if(position==6){
            holder.info.setText("sai baba aarthi lyrics");}
        if(position==7){
            holder.info.setText("Sai baba satcharitra");}




    }

    @Override
    public int getItemCount() {
        int count1= 8;
        return count1;

    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView info;
        ArrayList screens;
        public View view;
        int i=0;
        public ViewHolder(View itemView) {
            super(itemView);
            Context context=itemView.getContext();
            SQLiteDatabase db = context.openOrCreateDatabase("ZomatoDB", Context.MODE_APPEND, null);
            info=(TextView)itemView.findViewById(R.id.info_text);

            view = itemView;
            view.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    // item clicke
                    String ab=info.getText().toString();
                    Toast.makeText(v.getContext(),ab,Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(v.getContext(),ImageActivity.class);
                    //intent.putExtra("U",ab);
                    v.getContext().startActivity(intent);
                }
            });

        }
    }
}
