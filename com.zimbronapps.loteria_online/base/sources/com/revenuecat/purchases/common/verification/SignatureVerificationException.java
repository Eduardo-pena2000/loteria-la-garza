package com.revenuecat.purchases.common.verification;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SignatureVerificationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureVerificationException(String str) {
        super("Failed signature verification for request with path " + str);
        t.g(str, "apiPath");
    }
}
