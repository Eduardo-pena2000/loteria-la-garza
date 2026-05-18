package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AccountIdentifiers {
    public final String a;
    public final String b;

    public AccountIdentifiers(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String getObfuscatedAccountId() {
        return this.a;
    }

    public String getObfuscatedProfileId() {
        return this.b;
    }
}
