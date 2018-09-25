package org.techtown.bibly3;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.internal.NavigationMenu;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.yavski.fabspeeddial.FabSpeedDial;

public class TabFragment1 extends Fragment {

    private FragmentActivity myContext;

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }

    int MAX_PAGE = 3;
    Fragment cur_fragment;

    @BindView(R.id.viewpager)
    ViewPager viewpager;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_1, container, false);
        ButterKnife.bind(this, view);

        viewpager.setAdapter(new adapter(myContext.getSupportFragmentManager()));




        return view;
    }

    private class adapter extends FragmentPagerAdapter {
        public adapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            if(position<0 || MAX_PAGE<=position)
                return null;
            switch (position){
                case 0:
                    cur_fragment=new TabFragment1_viewpager1_1();
//                    cur_fragment=new TabFragment1_viewpager1_1(R.drawable.book6, "꿈꾸는 다락방", "이지성",
//                            4.5F, "안다희", "가나다라마바사아자차카타파하" );
                    break;
                case 1:
                    cur_fragment=new TabFragment1_viewpager1_2();
                    break;
                case 2:
                    cur_fragment=new TabFragment1_viewpager1_3();
                    break;
            }
            return cur_fragment;
        }
        @Override
        public int getCount() {
            return MAX_PAGE;
        }
    }


}
