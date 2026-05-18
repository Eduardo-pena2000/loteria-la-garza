package com.applovin.impl;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class p4 {
    private final String a;
    private final String b;
    private final boolean c;

    public p4(String str, String str2, Context context) {
        this.a = str.replace("android.permission.", "");
        this.b = str2;
        this.c = o0.a(str, context);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }
}
