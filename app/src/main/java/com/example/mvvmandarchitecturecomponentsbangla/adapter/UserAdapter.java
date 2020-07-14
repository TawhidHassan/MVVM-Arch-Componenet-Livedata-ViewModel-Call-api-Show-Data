package com.example.mvvmandarchitecturecomponentsbangla.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mvvmandarchitecturecomponentsbangla.R;
import com.example.mvvmandarchitecturecomponentsbangla.model.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    User[]users;

    public UserAdapter(User[] users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.user_list,viewGroup,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {

        userViewHolder.textViewName.setText(users[i].getLogin());
        userViewHolder.textViewId.setText(String.valueOf(users[i].getId()));
        userViewHolder.textViewRepoUrl.setText(users[i].getReposUrl());

        Glide.with(userViewHolder.imageView.getContext()).load(users[i].getAvatarUrl()).into(userViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return users.length;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewName,textViewId,textViewRepoUrl;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textViewName=itemView.findViewById(R.id.textView);
            textViewId=itemView.findViewById(R.id.textView2);
            textViewRepoUrl=itemView.findViewById(R.id.textView3);
        }
    }
}
