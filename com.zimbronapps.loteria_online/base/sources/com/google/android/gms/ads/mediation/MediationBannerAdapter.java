package com.google.android.gms.ads.mediation;

import L5.h;
import Y5.f;
import Y5.g;
import Y5.n;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface MediationBannerAdapter extends g {
    View getBannerView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, n nVar, Bundle bundle, h hVar, f fVar, Bundle bundle2);
}
