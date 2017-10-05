package com.example.android.recycle;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 04/10/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    Context ct;
    String s1[], s2[];

    public Adapter(Context ct, String s1[], String s2[]){
        this.ct = ct;
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(ct);
        View myview = inflator.inflate(R.layout.rows, parent, false);
        return new Holder(myview);
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {
        holder.te1.setText(s1[position]);
        holder.te2.setText(s2[position]);
        holder.te1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent it;
               if(position == 0)
                   it = new Intent(ct, No1.class);
               else if(position == 1)
                   it = new Intent(ct, No2.class);
               else
                   it = new Intent(ct, No3.class);
               ct.startActivity(it);
           }
        });
        holder.te2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent it;
                if(position == 0)
                    it = new Intent(ct, No1.class);
                else if(position == 1)
                    it = new Intent(ct, No2.class);
                else
                    it = new Intent(ct, No3.class);
                ct.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return s1.length;
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView te1, te2;
        public Holder(View itemView) {
            super(itemView);
            te1 = (TextView) itemView.findViewById(R.id.nama);
            te2 = (TextView) itemView.findViewById(R.id.deskripsi);
        }
    }
}
