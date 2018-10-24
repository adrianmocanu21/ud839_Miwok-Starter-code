package com.example.android.miwok;

/**
 * Created by skorpyo1 on 5/14/2017.
 */

public class Word {
    private String englishWord;
    private String mewokWord;
    private int myImageResourceId;
    private int mySongResourceId;

    public Word(String englishWord, String mewokWord,int mySongResourceId){
        this.englishWord = englishWord;
        this.mewokWord = mewokWord;
        this.mySongResourceId = mySongResourceId;

    }

    public Word(String englishWord, String mewokWord, int myImageResourceId, int mySongResourceId){
        this.englishWord = englishWord;
        this.mewokWord = mewokWord;
        this.myImageResourceId = myImageResourceId;
        this.mySongResourceId = mySongResourceId;

    }


    public String getEnglishWord(){
        return englishWord;
    }

    public String getMewokWord(){ return mewokWord; }

    public int getImageResourceId(){ return myImageResourceId; }

    public int getMySongResourceId(){ return mySongResourceId; }



}

