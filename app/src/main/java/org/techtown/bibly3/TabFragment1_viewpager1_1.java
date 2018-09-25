package org.techtown.bibly3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabFragment1_viewpager1_1 extends Fragment {
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

    //생성자
//    @SuppressLint("ValidFragment")
//    public TabFragment1_viewpager1_1(int bookId,        String title,           String author,
//                                     float ratingBar,   String comment_writer,  String comment) {
//        this.book.setImageResource(bookId);
//        this.title.setText(title);
//        this.author.setText(author + " 지음");
//        this.ratingBar.setRating(ratingBar);
//        this.rate.setText(String.valueOf(ratingBar));
//        this.comment_writer.setText(comment_writer);
//        this.comment.setText(comment);
//    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_1_viewpager_1, container, false);
        ButterKnife.bind(this, view);


        book.setImageResource(R.drawable.book6);
        title.setText("꿈꾸는 다락방");
        author.setText("이지성 지음");
        ratingBar.setRating(4);
        rate.setText("" + ratingBar.getRating());
        comment_writer.setText("안땡땡");
        comment.setText("Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. ");

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
