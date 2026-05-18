package com.revenuecat.purchases;

import android.content.Intent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class IntentExtensionsKt {
    public static final /* synthetic */ WebPurchaseRedemption asWebPurchaseRedemption(Intent intent) {
        t.g(intent, "<this>");
        return Purchases.Companion.parseAsWebPurchaseRedemption(intent);
    }
}
