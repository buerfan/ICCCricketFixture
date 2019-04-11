package com.example.linux_nwl_10.icccricketfixture;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StandingListAdapter extends RecyclerView.Adapter<StandingListAdapter.MyViewHolder> {

    private List<StandingListData> standingListData;  //moviesList to standingListData
    private RecyclerView recyclerViewStandingList;  //recycleView to recyclerViewStandingList

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textID,textCountryName,textMatch,textNumberOfWin,textNumberOfLoss,textNRR,textPts;

        public MyViewHolder(View view) {
            super(view);
            textID = (TextView) view.findViewById(R.id.txtID);
            textCountryName = (TextView) view.findViewById(R.id.txtCountryName);
            textMatch = (TextView) view.findViewById(R.id.txtMatch);

            textNumberOfWin = (TextView) view.findViewById(R.id.txtNumberOfWin);
            textNumberOfLoss = (TextView) view.findViewById(R.id.txtNumberOfLoss);
            textNRR = (TextView) view.findViewById(R.id.txtNRR);
            textPts = (TextView) view.findViewById(R.id.txtPts);
        }
    }


    public StandingListAdapter(List<StandingListData> standingListData,RecyclerView recyclerView) {
        this.standingListData = standingListData;
        this.recyclerViewStandingList=recyclerViewStandingList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext())
////                .inflate(R.layout.movie_list_row, parent, false);

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_layout_for_standing_list, parent, false);
        //itemView.setOnClickListener(new MyClickListenerClass(recyclerView));

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        StandingListData data = standingListData.get(position);
        holder.textID.setText(data.getDataID());
        holder.textCountryName.setText(data.getCountryName());
        holder.textMatch.setText(data.getNumberOfMatch());
        holder.textNumberOfWin.setText(data.getNumberOfWin());
        holder.textNumberOfLoss.setText(data.getNumberOfLoss());
        holder.textNRR.setText(data.getDataNRR());
        holder.textPts.setText(data.getPts());
    }

    @Override
    public int getItemCount() {
        return standingListData.size();
    }
}
