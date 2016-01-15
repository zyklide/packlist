/*
 * PackList is an open-source packing-list for Android
 *
 * Copyright (c) 2016 Nicolas Bossard.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */



package com.nbossard.packlist.gui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.util.Log;
import android.widget.Button;

import com.nbossard.packlist.R;

import hugo.weaving.DebugLog;

/**
 * About activity.
 *
 * @author nicolas Bossard
 */
public class AboutActivity extends AppCompatActivity  implements View.OnClickListener {

    // *********************** CONSTANTS**********************************************************************

    /** Log tag. */
    private static final String TAG = AboutActivity.class.getName();

    // *********************** METHODS **********************************************************************

    @Override
    @DebugLog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.about_act__fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBrowser();
            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // setting button listener
        final Button mButtonThirdParty = (Button) findViewById(R.id.help__third_party__button);
        mButtonThirdParty.setOnClickListener(this);
    }


    @Override
    @DebugLog
    public final void onClick(final View parClickedView)
    {

        if (parClickedView.getId() == R.id.help__third_party__button)
        {
            openThirdPartyActivity();
        } else
        {
            // what the fuck
            Log.e(TAG, "onClick(...) unexpected clicked view");
        }
    }

// *********************** PRIVATE METHODS ******************************************************************

    @DebugLog
    private void openBrowser() {
        String url = "https://github.com/nbossard/packlist";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


    /**
     * Open the activity to display third party softwares licences.
     */
    @DebugLog
    private void openThirdPartyActivity()
    {
        final Intent intent = new Intent(this, HelpThirdPartyActivity.class);
        startActivity(intent);
    }
//

}
