package org.techtown.bibly3;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabFragment2 extends Fragment implements View.OnClickListener {

    //tablayout
    @BindView (R.id.person_tab_layout)
    TabLayout tabLayout;

    TabFragment2_1 fragment2_1;
    TabFragment2_2 fragment2_2;

    private FragmentActivity myContext;
    private FragmentManager fragManager;

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }


    //4개 버튼
    @BindView(R.id.tab_fragment_2_button_1)
    Button tab_fragment_2_button_1;
    @BindView(R.id.tab_fragment_2_button_2)
    Button tab_fragment_2_button_2;
    @BindView(R.id.tab_fragment_2_button_3)
    Button tab_fragment_2_button_3;
    @BindView(R.id.tab_fragment_2_button_4)
    Button tab_fragment_2_button_4;




    //이건 뭐즤
//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_2, container, false);

        //꼭 해주긔~~~
        ButterKnife.bind(this, view);

        //tablayout
        tabLayout.addTab(tabLayout.newTab().setText("내서재"));
        tabLayout.addTab(tabLayout.newTab().setText("책장사진"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        fragment2_1 = new TabFragment2_1();
        fragment2_2 = new TabFragment2_2();

        //framelayout에 fragment2_1이 기본값으로 보여짐.
        fragManager = myContext.getSupportFragmentManager(); //If using fragments from support v4
        fragManager.beginTransaction().add(R.id.person_tab_frame, fragment2_1).commit();

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                Fragment selected = null;
                if (position == 0) {
                    selected = fragment2_1;
                } else if (position == 1) {
                    selected = fragment2_2;
                }

                fragManager.beginTransaction().replace(R.id.person_tab_frame, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        //4개 버튼
        //tab_fragment_2_button
        tab_fragment_2_button_1.setOnClickListener(this);
        tab_fragment_2_button_2.setOnClickListener(this);
        tab_fragment_2_button_3.setOnClickListener(this);
        tab_fragment_2_button_4.setOnClickListener(this);
        //tab_fragment_2_button_4.setOnClickListener((View.OnClickListener) view);

        return view;
    }


    @Override
    public void onClick(View v) {
        Intent myIntent;
        switch (v.getId()) {
            case R.id.tab_fragment_2_button_1:
                myIntent = new Intent(getActivity(), TabFragment2_button1.class);
                startActivity(myIntent);
                break;
            case R.id.tab_fragment_2_button_2:
                myIntent = new Intent(getActivity(), TabFragment2_button2.class);
                startActivity(myIntent);
                break;

            case R.id.tab_fragment_2_button_3:
                myIntent = new Intent(getActivity(), TabFragment2_button3.class);
                startActivity(myIntent);
                break;

            case R.id.tab_fragment_2_button_4:
                myIntent = new Intent(getActivity(), TabFragment2_button4.class);
                startActivity(myIntent);
                break;
        }
    }

}
