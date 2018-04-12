package com.example.android.miwok;

import android.media.Image;

/**
 * Created by leonardo on 23.03.2018.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID;
    private boolean showImage;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        showImage = false;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID ){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        showImage = true;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceID(){
        return mImageResourceID;
    }

    public boolean isShowImage(){
        return showImage;
    }
}
