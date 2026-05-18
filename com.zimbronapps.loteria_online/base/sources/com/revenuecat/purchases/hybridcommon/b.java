package com.revenuecat.purchases.hybridcommon;

import Qa.l;
import com.revenuecat.purchases.TrackedEventListener;
import com.revenuecat.purchases.common.events.FeatureEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b implements TrackedEventListener {
    public final /* synthetic */ l a;

    public /* synthetic */ b(l lVar) {
        this.a = lVar;
    }

    public final void onEventTracked(FeatureEvent featureEvent) {
        CommonKt.a(this.a, featureEvent);
    }
}
