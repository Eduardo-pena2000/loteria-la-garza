package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c0 implements Callable {
    protected final com.applovin.impl.sdk.k a;
    protected final String b;
    protected final com.applovin.impl.sdk.o c;
    protected final AtomicBoolean e = new AtomicBoolean();
    private final Context d = com.applovin.impl.sdk.k.o();

    public c0(String str, com.applovin.impl.sdk.k kVar) {
        this.b = str;
        this.a = kVar;
        this.c = kVar.O();
    }

    public Context a() {
        return this.d;
    }

    public void a(boolean z) {
        this.e.set(z);
    }
}
