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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList of Words(using word class).

        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("One");


        words.add(new Word("Father","Padre",R.drawable.family_father));
        words.add(new Word("Mother","Madre",R.drawable.family_mother));
        words.add(new Word("Son","hijo",R.drawable.family_son));
        words.add(new Word("Daughter","Hija",R.drawable.family_daughter));
        words.add(new Word("Older Brother","hermano mayor",R.drawable.family_older_brother));
        words.add(new Word("Younger Brother","hermano más joven",R.drawable.family_younger_brother));
        words.add(new Word("Older Sister","hermana mayor",R.drawable.family_older_sister));
        words.add(new Word("Younger Sister","hermana menor",R.drawable.family_younger_sister));
        words.add(new Word("GrandMother","abuela",R.drawable.family_grandmother));
        words.add(new Word("GrandFather","abuelo",R.drawable.family_grandfather));
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

