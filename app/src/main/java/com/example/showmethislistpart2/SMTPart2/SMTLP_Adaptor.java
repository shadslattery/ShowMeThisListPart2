package com.example.showmethislistpart2.SMTPart2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.showmethislistpart2.People;
import com.example.showmethislistpart2.R;

import java.util.List;


public class SMTLP_Adaptor extends RecyclerView.Adapter<SMTLP_Adaptor.MyViewHolder> {

    private List<People> peopleList;

    public SMTLP_Adaptor(List<People> peopleList){
        this.peopleList = peopleList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.smtl_item
                        ,parent
                        ,false
        );
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     People people = peopleList.get(position);

     String firstName = people.getFirstName();
     holder.b_Name.setText(firstName);

    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView rvPeople;
        TextView b_Name;
        TextView user_Email;
        TextView user_Phone;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            rvPeople = itemView.findViewById(R.id.rvpeople);
            b_Name = itemView.findViewById(R.id.name);
            user_Email = itemView.findViewById(R.id.email);
            user_Phone = itemView.findViewById(R.id.phone);
        }
    }
}



