package org.techtown.bibly3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

@SuppressLint("ValidFragment")
public class TabFragment1_viewpager1_2 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @BindView(R.id.bookmark)
    ImageView bookmark;

    @BindView(R.id.book)            ImageView book;
    @BindView(R.id.title)           TextView title;
    @BindView(R.id.author)          TextView author;
    @BindView(R.id.ratingBar)       RatingBar ratingBar;
    @BindView(R.id.rate)            TextView rate;
    @BindView(R.id.comment_writer)  TextView comment_writer;
    @BindView(R.id.comment)         TextView comment;

    int i = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_1_viewpager_1, container, false);
        ButterKnife.bind(this, view);

        book.setImageResource(R.drawable.book8);
        title.setText("창문 넘어 도망친 100세 노인");
        author.setText("요나스 요나손 지음");
        ratingBar.setRating(3);
        rate.setText("" + ratingBar.getRating());
        comment_writer.setText("김땡땡");
        comment.setText("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.");



        bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    bookmark.setImageResource(R.drawable.ic_bookmark_full);
                    i = 1;
                } else {
                    bookmark.setImageResource(R.drawable.ic_bookmark_empty);
                    i = 0;
                }
            }
        });

        return view;
    }
}
