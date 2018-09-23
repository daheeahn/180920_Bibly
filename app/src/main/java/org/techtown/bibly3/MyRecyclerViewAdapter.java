package org.techtown.bibly3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<BookInfo> bookInfos = new ArrayList<>();
    public MyRecyclerViewAdapter() {
        bookInfos.add(new BookInfo(R.drawable.book1, "온 여름을 이 하루에", "레이 브래드버리 지음"));
        bookInfos.add(new BookInfo(R.drawable.book2, "청출어람", "미상"));
        bookInfos.add(new BookInfo(R.drawable.book3, "편지봉투", "예쁘다"));
        bookInfos.add(new BookInfo(R.drawable.book4, "숲에 소원을 빌어요", "안다희 지음"));
        bookInfos.add(new BookInfo(R.drawable.book5, "미움 받을 용기", "고가 후미타케, 기시미 이치로 지음"));
    }
    public RowCell onCreateViewHolder(ViewGroup parent, int viewType) {
        //XML 가져오는 부분
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //데이터를 넣어주는 부분. 바인딩하는 부분

        ((RowCell) holder).book.setImageResource(bookInfos.get(position).book);
        ((RowCell) holder).title.setText(bookInfos.get(position).title);
        ((RowCell) holder).author.setText(bookInfos.get(position).author);
    }

    @Override
    public int getItemCount() {
        //카운터
        return bookInfos.size();
    }

    //소스코드 절약해주는 부분 static 넣으면 더 좋음
    private static class RowCell extends RecyclerView.ViewHolder {
        ImageView book;
        TextView title;
        TextView author;
        public RowCell(View view) {
            super(view);
            book = (ImageView)view.findViewById(R.id.book);
            title = (TextView) view.findViewById(R.id.title);
            author = (TextView) view.findViewById(R.id.author);
        }
    }
}
