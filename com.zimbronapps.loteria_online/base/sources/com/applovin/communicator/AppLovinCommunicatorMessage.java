package com.applovin.communicator;

import android.os.Bundle;
import com.applovin.impl.communicator.CommunicatorMessageImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinCommunicatorMessage extends CommunicatorMessageImpl {
    public AppLovinCommunicatorMessage(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(bundle, str, appLovinCommunicatorPublisher);
    }

    public Bundle getMessageData() {
        return this.data;
    }

    public String getPublisherId() {
        AppLovinCommunicatorPublisher appLovinCommunicatorPublisher = (AppLovinCommunicatorPublisher) this.publisherRef.get();
        return appLovinCommunicatorPublisher != null ? appLovinCommunicatorPublisher.getCommunicatorId() : "";
    }

    public String getTopic() {
        return getAction();
    }
}
