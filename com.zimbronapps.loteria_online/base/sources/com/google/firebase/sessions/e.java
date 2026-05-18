package com.google.firebase.sessions;

import B8.H;
import android.content.Context;
import com.google.firebase.sessions.b;
import o2.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e implements D8.b {
    public final Ba.a a;
    public final Ba.a b;
    public final Ba.a c;

    public e(Ba.a aVar, Ba.a aVar2, Ba.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static e a(Ba.a aVar, Ba.a aVar2, Ba.a aVar3) {
        return new e(aVar, aVar2, aVar3);
    }

    public static i c(Context context, Ga.i iVar, H h) {
        return (i) D8.d.d(b.b.a.m(context, iVar, h));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.a.get(), (Ga.i) this.b.get(), (H) this.c.get());
    }
}
