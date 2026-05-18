package com.revenuecat.purchases.common;

import com.revenuecat.purchases.common.networking.HTTPResult;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackendHelperKt {
    public static final boolean isSuccessful(HTTPResult hTTPResult) {
        t.g(hTTPResult, "<this>");
        return hTTPResult.getResponseCode() < 300;
    }
}
