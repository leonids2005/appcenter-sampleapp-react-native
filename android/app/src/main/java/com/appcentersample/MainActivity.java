package com.appcentersample;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "AppCenterSample";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCenter.start(getApplication(), "4ee2726a-0cd1-408c-b1db-b39353006784",
                Analytics.class, Crashes.class);
    }
