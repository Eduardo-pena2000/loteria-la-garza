package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class InAppMessageResult {
    public final int a;
    public final String b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public String getPurchaseToken() {
        return this.b;
    }

    public int getResponseCode() {
        return this.a;
    }
}
