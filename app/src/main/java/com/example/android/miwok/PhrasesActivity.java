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
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList of Words(using word class).

        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("One");

        //now add new " 'Word' object"(storing in variable w ) to the word list.
        Word w = new Word("Where are you going?","¿A dónde vas?");
        //adding that variable to the word list.
        words.add(w);

        //OR

        //words.add("Two");
        words.add(new Word("What is your name?","¿Cuál es su nombre?"));
        words.add(new Word("My name is...","Me llamo..."));
        words.add(new Word("How are you feeling?","¿Como te sientes?"));
        words.add(new Word("I’m feeling good.","Me siento bien."));
        words.add(new Word("Are you coming?","¿Vienes?"));
        words.add(new Word("Yes, I’m coming.","Si, voy para allá."));
        words.add(new Word("I’m coming","Ya voy"));
        words.add(new Word("Let’s go.","Vamonos"));
        words.add(new Word("Come here.","Ven aca."));


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
