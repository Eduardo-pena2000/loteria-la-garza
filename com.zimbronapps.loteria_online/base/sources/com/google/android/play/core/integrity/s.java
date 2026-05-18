package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class s {
    private final s a = this;
    private final r7.o b;
    private final r7.o c;
    private final r7.o d;
    private final r7.o e;
    private final r7.o f;

    public /* synthetic */ s(Context context, r rVar) {
        r7.l b = r7.m.b(context);
        this.b = b;
        r7.o b2 = r7.k.b(ac.a());
        this.c = b2;
        au auVar = new au(b, l.a());
        this.d = auVar;
        r7.o b3 = r7.k.b(new al(b, b2, auVar, l.a()));
        this.e = b3;
        this.f = r7.k.b(new ab(b3));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f.a();
    }
}
