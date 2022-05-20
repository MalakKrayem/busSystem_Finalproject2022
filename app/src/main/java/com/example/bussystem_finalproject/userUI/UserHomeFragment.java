package com.example.bussystem_finalproject.userUI;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bussystem_finalproject.AdminAdapter.BusAdapter;
import com.example.bussystem_finalproject.AdminModel.Bus;
import com.example.bussystem_finalproject.R;
import com.example.bussystem_finalproject.UserAdapter.TripAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class UserHomeFragment extends Fragment {
    ArrayList<Bus> trips = new ArrayList<>();
    RecyclerView rv_trips;

    public UserHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_home, container, false);
        Context context = container.getContext();
        trips.add(new Bus("Gaza", "Rafah", 50, 100));
//        trips.add(new Bus("Gaza", "Quds", 30, 200));
//        trips.add(new Bus("Hebron", "Rafah", 100, 150));
//        trips.add(new Bus("Egypt", "Rafah", 55, 250));
//        trips.add(new Bus("Egypt", "America", 55, 250));
//        trips.add(new Bus("Egypt", "Quads", 55, 250));
        Log.d("mm","good");
        rv_trips = view.findViewById(R.id.rv_UserTrips);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_trips.setLayoutManager(manager);
        rv_trips.setAdapter(new TripAdapter(trips, context));
        Log.d("mm","nice");

        return view;

    }
}