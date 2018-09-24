package org.techtown.bibly3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.internal.NavigationMenu;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import io.github.yavski.fabspeeddial.FabSpeedDial;

public class TabFragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_1, container, false);



        return view;
    }
}
