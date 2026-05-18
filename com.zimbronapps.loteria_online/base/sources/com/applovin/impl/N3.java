package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class n3 extends Activity implements AppLovinCommunicatorSubscriber {
    protected List communicatorTopics = new ArrayList();

    public String getCommunicatorId() {
        return getClass().getSimpleName();
    }

    public abstract com.applovin.impl.sdk.k getSdk();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSdk() != null && !n7.c(getSdk())) {
            setTheme(R.style.com_applovin_mediation_MaxDebuggerActivity_Theme_Live);
        }
        e8.a(findViewById(16908290), getSdk());
        List list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).subscribe(this, this.communicatorTopics);
    }

    public void onDestroy() {
        super.onDestroy();
        List list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).unsubscribe(this, this.communicatorTopics);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }
}
