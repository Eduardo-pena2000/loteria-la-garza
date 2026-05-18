package com.google.android.gms.ads.mediation.customevent;

import Y5.A;
import Z5.a;
import Z5.d;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, A a, Bundle bundle);
}
