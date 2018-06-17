package com.example.android.miwok;


//This is the example of the Custom Class.

/*{@link Word } represents the vocabulary words that the user wants to learn.
 *It contains a default translation and the miwok translation for that word.
 */


import android.media.Image;

public class Word {

    //now we need 3 STATES for the object {@link word}.
    //1) Default translation of the word.
    private String mDefaultTranslation;

    //2) Miwok translation of the word
    private  String mMiwokTranslation;

    //3) Images for the particular word.
    private int mImageResourceId;


    //*Now we need to create a CONSTRUCTOR which takes in 2 input parameter.

    public Word(String defaultTranslation,String miwokTranslation ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    //*Now we need to create a CONSTRUCTOR which takes in 1 input parameter(int ImageAddress).
    public Word(String defaultTranslation,String miwokTranslation,int ImageResourceId ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
      mImageResourceId = ImageResourceId;
    }
    //m Stands for member variable. And is add at the start of each variable name.

    //Get default translation method of the word
    //Public Method to call the constructor.
    //METHODS

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get miwok translation of the word.

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get ImageResource address of the Image.
    public int getmImageResourceId()
    {
        return mImageResourceId;
    }
}
