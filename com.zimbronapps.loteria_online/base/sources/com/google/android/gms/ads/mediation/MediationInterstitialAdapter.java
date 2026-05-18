package com.google.android.gms.ads.mediation;

import Y5.f;
import Y5.g;
import Y5.t;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface MediationInterstitialAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, t tVar, Bundle bundle, f fVar, Bundle bundle2);

    void showInterstitial();
}
