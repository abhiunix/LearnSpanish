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

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList of Words(using word class).

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red","rojo",R.drawable.color_red));
        words.add(new Word("Green","verde",R.drawable.color_green));
        words.add(new Word("Brown","marrón",R.drawable.color_brown));
        words.add(new Word("Gray","gris",R.drawable.color_gray));
        words.add(new Word("black","negro",R.drawable.color_black));
        words.add(new Word("white","blanco",R.drawable.color_white));
        words.add(new Word("dusty yellow","amarillo polvoriento",R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow","mostaza amarilla",R.drawable.color_mustard_yellow));


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
