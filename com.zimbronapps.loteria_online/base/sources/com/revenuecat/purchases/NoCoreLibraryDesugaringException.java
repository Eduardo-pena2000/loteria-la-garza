package com.revenuecat.purchases;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class NoCoreLibraryDesugaringException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoCoreLibraryDesugaringException(Throwable th) {
        super("Error building BillingFlowParams which is required to perform purchases in the Play store. This is due to an issue in Google's Billing Client library. Please check https://errors.rev.cat/no-core-library-desugaring for more info and to fix this issue.", th);
        t.g(th, "cause");
    }
}
