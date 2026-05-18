package com.google.ads.mediation;

import L5.m;
import Y5.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d extends m {
    public final AbstractAdViewAdapter a;
    public final t b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, t tVar) {
        this.a = abstractAdViewAdapter;
        this.b = tVar;
    }

    public final void b() {
        this.b.onAdClosed(this.a);
    }

    public final void e() {
        this.b.onAdOpened(this.a);
    }
}
