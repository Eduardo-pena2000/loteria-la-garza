package com.google.android.gms.ads.mediation.customevent;

import L5.h;
import Y5.f;
import Z5.a;
import Z5.b;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, h hVar, f fVar, Bundle bundle);
}
