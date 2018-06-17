/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList of Words(using word class).

        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("One");


        words.add(new Word("one","dos",R.drawable.number_one));
        words.add(new Word("Two","dos",R.drawable.number_two));
        words.add(new Word("Three","Tres",R.drawable.number_three));
        words.add(new Word("Four","las cuatro",R.drawable.number_four));
        words.add(new Word("Five","cinco",R.drawable.number_five));
        words.add(new Word("Six","seis",R.drawable.number_six));
        words.add(new Word("Seven","siete",R.drawable.number_seven));
        words.add(new Word("Eight","ocho",R.drawable.number_eight));
        words.add(new Word("Nine","nueve",R.drawable.number_nine));
        words.add(new Word("Ten","diez",R.drawable.number_ten));

       //Create an {@link ArrayAdapter }, whose data source is a list of Strings.
        //The Adapter knows how to create layouts for the each items in the list, using the
        //simple_list_item_1.xml layout resource defined in the android framework/
        //this list item layout contains a single {@link TextView}, which the adapter will set to display
        //a single word.

        WordAdapter adapter = new WordAdapter(this, words);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}
        //There should be a {@link ListView} with the view ID called list,
        //which is declared in word_listyout file.

       ListView listView =(ListView) findViewById(R.id.list);

       //Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        //{@link listView} will display the list items for each word in the list of words.
        //Do this by calling the setAdapter method on the {@link ListView} and pass in
        //1 Argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(adapter);

       }



    }

