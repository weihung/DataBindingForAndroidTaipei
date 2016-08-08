package com.example.databindinglibrary;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.databindinglibrary.databinding.ItemUserBinding;

/**
 * Created by weihung on 16/8/4.
 */
public class UserViewHolder extends RecyclerView.ViewHolder {
    public ItemUserBinding itemUserBinding;

    public UserViewHolder(View itemView) {
        super(itemView);
        itemUserBinding = ItemUserBinding.bind(itemView);
    }
}
