package com.revenuecat.purchases.google;

import com.android.billingclient.api.BillingResult;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(BillingResult billingResult) {
        t.g(billingResult, "<this>");
        return billingResult.getResponseCode() == 0;
    }
}
