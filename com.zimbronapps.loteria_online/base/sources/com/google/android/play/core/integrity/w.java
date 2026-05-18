package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class w implements aw {
    private final w a = this;
    private final r7.o b;
    private final r7.o c;
    private final r7.o d;
    private final r7.o e;
    private final r7.o f;
    private final r7.o g;

    public /* synthetic */ w(Context context, v vVar) {
        r7.l b = r7.m.b(context);
        this.b = b;
        r7.o b2 = r7.k.b(bb.a());
        this.c = b2;
        au auVar = new au(b, n.a());
        this.d = auVar;
        r7.o b3 = r7.k.b(new bp(b, b2, auVar, n.a()));
        this.e = b3;
        r7.o b4 = r7.k.b(new bu(b3));
        this.f = b4;
        this.g = r7.k.b(new ba(b3, b4));
    }

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.g.a();
    }
}
