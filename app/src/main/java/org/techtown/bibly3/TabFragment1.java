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
        //floating button
//        View view = inflater.inflate(R.layout.tab_fragment_1, container, false);
//        FabSpeedDial fabSpeedDial = (FabSpeedDial) view.findViewById(R.id.fabSpeedDial);
//        fabSpeedDial.setMenuListener(new FabSpeedDial.MenuListener() {
//            @Override
//            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
//                return true; // false : don't show menu
//            }
//
//            @Override
//            public boolean onMenuItemSelected(MenuItem menuItem) {
//                //toast메시지  띄우는 법!!!!
////                Toast.makeText(container, "" + menuItem.getTitle(), Toast.LENGTH_SHORT).show(); //x container 그냥써봄
////                Toast.makeText("" + menuItem.getTitle(), Toast.LENGTH_SHORT).show(); //mainactivity에서 쓰는 코드
//                return true;
//            }
//
//            @Override
//            public void onMenuClosed() {
//
//            }
//        });


        return inflater.inflate(R.layout.tab_fragment_1, container, false);
    }
}
