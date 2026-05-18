package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h {
    public AppLovinSdk a(Context context) {
        return AppLovinSdk.getInstance(context);
    }

    public String b() {
        return AppLovinSdk.VERSION;
    }
}
