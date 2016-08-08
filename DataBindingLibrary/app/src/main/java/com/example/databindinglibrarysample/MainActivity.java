package com.example.databindinglibrarysample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<User> users = new ArrayList<>();
    // TODO : declare ActivityMainBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: setContentView

        setData();
        init();
    }

    private void setData(){
//        users.add(new User("1", "Marry", 11, true));
//        users.add(new User("2", "John", 22, false));
//        users.add(new User("3", "Jason", 33, true));
    }

    private void init(){
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        // TODO : Add LinearLayoutManager and setAdapter
    }

    private class RecyclerAdapter extends RecyclerView.Adapter {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.item_user, null);
            return new UserViewHolder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            // TODO: set data into itemUserBinding
        }

        @Override
        public int getItemCount() {
            return users.size();
        }
    }
}
