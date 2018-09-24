package org.techtown.bibly3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TabFragment2_button1 extends AppCompatActivity {

//    @BindView(R.id.tab_fragment_2_button_1)
//    ImageView fragment_2_button_toolbar_back;

    @BindView(R.id.fragment_2_button_toolbar_text)
    TextView fragment_2_button_toolbar_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_fragment_2_button_1);

        ButterKnife.bind(this);


        fragment_2_button_toolbar_text.setText(R.string.tab_fragment_2_button_1_text);

        ImageView fragment_2_button_toolbar_back = (ImageView) findViewById(R.id.fragment_2_button_toolbar_back);
        fragment_2_button_toolbar_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
