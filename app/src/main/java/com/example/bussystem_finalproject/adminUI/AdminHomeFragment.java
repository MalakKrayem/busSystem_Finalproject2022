package com.example.bussystem_finalproject.adminUI;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bussystem_finalproject.AdminAdapter.BusAdapter;
import com.example.bussystem_finalproject.AdminModel.Bus;
import com.example.bussystem_finalproject.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class AdminHomeFragment extends Fragment {
    RecyclerView buses;
    ArrayList<Bus> busesArray=new ArrayList<>();


    public AdminHomeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_admin_home, container, false);
        Context context=container.getContext();
        busesArray.add(new Bus("Gaza","Rafah",50,100));
        busesArray.add(new Bus("Gaza","Quds",30,200));
        busesArray.add(new Bus("Hebron","Rafah",100,150));
        buses=view.findViewById(R.id.rv_busAdmin);
        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        buses.setLayoutManager(manager);
        buses.setAdapter(new BusAdapter(busesArray,context));
        return view;
    }

}