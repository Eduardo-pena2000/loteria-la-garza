package com.applovin.mediation;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface MaxAdWaterfallInfo {
    long getLatencyMillis();

    MaxAd getLoadedAd();

    String getName();

    List getNetworkResponses();

    String getTestName();
}
