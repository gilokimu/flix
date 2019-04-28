package me.gilo.flix.adapters;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class ListViewHolder<T> extends RecyclerView.ViewHolder{
    View itemView;
    Context context;

    public ListViewHolder(Context context, View itemView) {
        super(itemView);
        this.itemView = itemView;
        this.context = context;
    }

    public abstract void renderView(T data);

}

