package com.google.android.gms.ads.mediation.customevent;

import Y5.f;
import Z5.a;
import Z5.c;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface CustomEventInterstitial extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, c cVar, String str, f fVar, Bundle bundle);

    void showInterstitial();
}
