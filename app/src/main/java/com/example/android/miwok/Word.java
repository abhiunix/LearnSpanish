package com.example.android.miwok;
    //This is the example of the Custom Class.

  /*{@link Word } represents the vocabulary words that the user wants to learn.
   *It contains a default translation and the miwok translation for that word.
   */


public class Word {

    //now we need 2 states for the object {@link word}.
    //1) Default translation of the word.
    private String mDefaultTranslation;

    //2) Miwok translation of the word
    private  String mMiwokTranslation;


    //*Now we need to create a constructor which takes in 2 input parameter.
    public Word(String defaultTranslation,String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }


    //Get default translation method of the word
     //Public Method to call the constructor.


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get miwok translation of the word.

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
