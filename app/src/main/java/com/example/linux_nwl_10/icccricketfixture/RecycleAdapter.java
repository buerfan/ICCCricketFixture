package com.example.linux_nwl_10.icccricketfixture;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyHolder> {

    private ArrayList<ContentModel> listOfCOntents;
    private Context context;

    public RecycleAdapter(ArrayList<ContentModel> listOfCOntents, Context context) {
        this.listOfCOntents = listOfCOntents;
        this.context = context;
    }


    @Override
    public MyHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.match_list,viewGroup,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder myHolder, int i) {
        ContentModel contentModel=listOfCOntents.get(i);

        myHolder.txtDateOfMatch.setText(contentModel.getDateOfMatch());
        myHolder.txtNumberOfMatch.setText(contentModel.getNumberOfMatch());
        myHolder.txtStartTime.setText(contentModel.getMatchStartTime());
        myHolder.txtFirstTeam.setText(contentModel.getFirstTeamName());
        myHolder.imgFirstTeam.setImageResource(contentModel.getFirstTeamImage());
        myHolder.txtSecondTeam.setText(contentModel.getSecondTeamName());
        myHolder.imgSecondTeam.setImageResource(contentModel.getSecondTeamImage());

    }

    @Override
    public int getItemCount() {
        return listOfCOntents.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView txtFirstTeam,txtSecondTeam,txtDateOfMatch,txtNumberOfMatch,txtStartTime;
        ImageView imgFirstTeam,imgSecondTeam;

        public MyHolder(View view)
        {
            super(view);


            txtDateOfMatch=view.findViewById(R.id.txtDateOfMatch);
            txtNumberOfMatch=view.findViewById(R.id.txtNumberOfMatch);
            txtStartTime=view.findViewById(R.id.txtMatchStartTime);
            txtFirstTeam=view.findViewById(R.id.firstTeam);
            imgFirstTeam=view.findViewById(R.id.firstTeamImage);
            txtSecondTeam=view.findViewById(R.id.secondTeam);
            imgSecondTeam=view.findViewById(R.id.secondTeamImage);

        }


    }
}
