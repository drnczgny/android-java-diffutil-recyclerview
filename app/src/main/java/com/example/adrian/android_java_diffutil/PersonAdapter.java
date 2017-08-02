package com.example.adrian.android_java_diffutil;

import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian_Czigany on 8/2/2017.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder>  {

    private List<Person> items;

    public PersonAdapter(List<Person> items) {
        this.items = items;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_layout, parent, false);
        return new PersonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person person = items.get(position);
        holder.bind(person);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void updateList(ArrayList<Person> newList) {
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new MyDiffCallback(this.items, newList));
        this.items.clear();
        this.items.addAll(newList);
        diffResult.dispatchUpdatesTo(this);
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {

        private TextView tvId, tvAge, tvName;

        public PersonViewHolder(View view) {
            super(view);
            tvId = (TextView) view.findViewById(R.id.tvId);
            tvAge = (TextView) view.findViewById(R.id.tvAge);
            tvName = (TextView) view.findViewById(R.id.tvName);
        }

        public void bind(Person person) {
            tvId.setText(person.getId() + "");
            tvAge.setText(person.getAge() + "");
            tvName.setText(person.getName() + "");
        }
    }
}
