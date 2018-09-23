package org.techtown.bibly3;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFragment4 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_4, container, false);

        Context context = view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.main_recyclerview);
        //recyclerView.setHasFixedSize(true); ???

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);

        return view;

        //return inflater.inflate(R.layout.tab_fragment_4, container, false);

        //이 코드는 안돌아감.
        //RecyclerView view = (RecyclerView) findViewById(R.id.main_recyclerview);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
//        view.setLayoutManager(layoutManager);
//
//        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter();
//        view.setAdapter(myRecyclerViewAdapter);

    }
}
