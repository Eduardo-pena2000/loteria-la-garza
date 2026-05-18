package com.google.android.gms.ads.mediation;

import Y5.A;
import Y5.g;
import Y5.v;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface MediationNativeAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, v vVar, Bundle bundle, A a, Bundle bundle2);
}
