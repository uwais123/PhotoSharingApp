package com.masuwes.photosharingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatesAdapter extends RecyclerView.Adapter<CatesAdapter.CatesViewHolder> {

    Context context;
    List<Cates> cateslist;

    public CatesAdapter(Context context, List<Cates> cateslist) {
        this.context = context;
        this.cateslist = cateslist;
    }

    @NonNull
    @Override
    public CatesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_menu, null);
        return new CatesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatesViewHolder holder, int position) {

        Cates cates = cateslist.get(position);

        holder.icontitle.setText(cates.getIcontitle());
        holder.iconimg.setImageDrawable(context.getResources().
                getDrawable(cates.getIconimg()));

    }

    @Override
    public int getItemCount() {
        return cateslist.size();
    }

    public class CatesViewHolder extends RecyclerView.ViewHolder {
        ImageView iconimg;
        TextView icontitle;

        public CatesViewHolder(@NonNull View itemView) {
            super(itemView);
            iconimg = itemView.findViewById(R.id.iconimg);
            icontitle = itemView.findViewById(R.id.icontitle);
        }
    }
}
