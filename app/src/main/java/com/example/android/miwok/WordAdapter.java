package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by skorpyo1 on 5/14/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    private MediaPlayer mediaPlayer;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId){
        super(context,0,words );
        this.mColorResourceId = colorResourceId;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);


        TextView mewokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        mewokTextView.setText(currentWord.getMewokWord());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaulf_text_view);
        defaultTextView.setText(currentWord.getEnglishWord());


        if(currentWord.getImageResourceId() != 0) {
            ImageView myImageResourceId = (ImageView) listItemView.findViewById(R.id.corresponding_image);
            myImageResourceId.setImageResource(currentWord.getImageResourceId());
        }
        else {
            ImageView myImageResourceId = (ImageView) listItemView.findViewById(R.id.corresponding_image);
            myImageResourceId.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}

