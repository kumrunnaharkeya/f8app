package com.facebook.f8;

import com.facebook.react.ReactActivity;
import android.content.Intent;
/*import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.microsoft.codepush.react.CodePush;*/

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "F82017";
    }
    
    @Override
protected void onCreate(Bundle savedInstanceState) {
        AppCenter.start(getApplication(), "94cbd92e-6d36-4baa-b480-51e6c28464b9",
                Analytics.class, Crashes.class);
    

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        MainApplication.getCallbackManager().onActivityResult(requestCode, resultCode, data);
    }
}
