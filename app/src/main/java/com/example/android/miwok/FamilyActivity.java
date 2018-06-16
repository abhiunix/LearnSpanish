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
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

       //Implementation of Simple ArrayList.
        ArrayList<String> FamilyName = new ArrayList<String>();

        FamilyName.add("Father");
        FamilyName.add("Mother");
        FamilyName.add("Sun");
        FamilyName.add("Daughter");
        FamilyName.add("Older Brother");
        FamilyName.add("Younger Brother");
        FamilyName.add("Older Sister");
        FamilyName.add("Younger Sister");
        FamilyName.add("Grand Mother");
        FamilyName.add("Grand Father");

        FamilyName.add("Father");
        FamilyName.add("Mother");
        FamilyName.add("Sun");
        FamilyName.add("Daughter");
        FamilyName.add("Older Brother");
        FamilyName.add("Younger Brother");
        FamilyName.add("Older Sister");
        FamilyName.add("Younger Sister");
        FamilyName.add("Grand Mother");
        FamilyName.add("Grand Father");

        FamilyName.add("Father");
        FamilyName.add("Mother");
        FamilyName.add("Sun");
        FamilyName.add("Daughter");
        FamilyName.add("Older Brother");
        FamilyName.add("Younger Brother");
        FamilyName.add("Older Sister");
        FamilyName.add("Younger Sister");
        FamilyName.add("Grand Mother");
        FamilyName.add("Grand Father");

        FamilyName.add("Father");
        FamilyName.add("Mother");
        FamilyName.add("Sun");
        FamilyName.add("Daughter");
        FamilyName.add("Older Brother");
        FamilyName.add("Younger Brother");
        FamilyName.add("Older Sister");
        FamilyName.add("Younger Sister");
        FamilyName.add("Grand Mother");
        FamilyName.add("Grand Father");


        LinearLayout rootViewF =  (LinearLayout)findViewById(R.id.rootViewF);

        int index;

        for(index=0;index<40;index++) {
            TextView familyView = new TextView(this);

            familyView.setText(FamilyName.get(index));
            rootViewF.addView(familyView);
        }
    }
}

