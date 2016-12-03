package id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji.R;
import id.sch.smktelkom_mlg.project.xiirpl5102030.belajarmengaji.model.modyel;

/**
 * Created by LordARThur on 19/11/2016.
 */
public class adapterr extends RecyclerView.Adapter<adapterr.ViewHolder> {
    Iadapterr mIadapterr;
    ArrayList<modyel> modyelsList;

    public adapterr(Context context, ArrayList<modyel> modyelsList) {
        mIadapterr = (Iadapterr) context;
        this.modyelsList = modyelsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        modyel modyel = modyelsList.get(position);
        holder.anu.setText(modyel.foto);
    }


    @Override
    public int getItemCount() {
        if (modyelsList != null)
            return modyelsList.size();
        return 0;
    }


    public interface Iadapterr {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView anu;

        public ViewHolder(View itemView) {
            super(itemView);
            anu = (TextView) itemView.findViewById(R.id.hal);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIadapterr.doClick(getAdapterPosition());
                }
            });

        }
    }
}
