package com.example.bussystem_finalproject.AdminAdapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bussystem_finalproject.AdminModel.Bus;
import com.example.bussystem_finalproject.R;

import java.util.ArrayList;

public class BusAdapter extends RecyclerView.Adapter<BusAdapter.BusHolder> {
    ArrayList<Bus> buses;
    Context context;

    public BusAdapter(ArrayList<Bus> buses, Context context) {
        this.buses = buses;
        this.context = context;
    }

    @NonNull
    @Override
    public BusHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.bus_item, null, false);
        return new BusHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BusHolder holder, int position) {
        Bus bus =buses.get(position);
        holder.source.setText(bus.getSource());
        holder.destination.setText(bus.getDestination());
        holder.seats.setText(bus.getNumOfSeats()+"seats");
        holder.price.setText((int) bus.getTicketPrice()+"$");


    }

    @Override
    public int getItemCount() {
        return buses.size();
    }

    public class BusHolder extends RecyclerView.ViewHolder{
        TextView source,destination,price,seats;
        Button delete;
        public BusHolder(@NonNull View itemView) {
            super(itemView);
            source=itemView.findViewById(R.id.tv_source);
            destination=itemView.findViewById(R.id.tv_destination);
            price=itemView.findViewById(R.id.tv_price);
            seats=itemView.findViewById(R.id.tv_seats);
            delete=itemView.findViewById(R.id.btn_deleteBus);

        }
    }
}
