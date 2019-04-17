package com.group6.placementportal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.group6.placementportal.DatabasePackage.Jobs;

import java.util.ArrayList;

public class enrolments_screen1_adpater extends RecyclerView.Adapter<enrolments_screen1_adpater.MyViewHolder> {

    Context context;
    ArrayList<Jobs> profiles;

    public enrolments_screen1_adpater(Context c , ArrayList<Jobs> p)
    {
        context = c;
        profiles = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.card_enrolments_job, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
       // holder.company_name.setText(profiles.get(position).getCompany_name());
        holder.job_profile.setText(profiles.get(position).getProfile());
       // holder.job_location.setText(profiles.get(position).getLocation());
        holder.parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(context, Apply_For_Jobs.class);
                //intent.putExtra("job_profile", profiles.get(position));
                //context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView company_name,job_profile,job_location;
        CardView parentlayout;
        public MyViewHolder(View itemView) {
            super(itemView);
          //  company_name = itemView.findViewById(R.id.txt_company_name);
           job_profile = itemView.findViewById(R.id.txt_job_profile);
            //job_location = itemView.findViewById(R.id.txt_job_location);
            
            parentlayout = itemView.findViewById(R.id.cardview_enrolments_job);
        }
    }
}