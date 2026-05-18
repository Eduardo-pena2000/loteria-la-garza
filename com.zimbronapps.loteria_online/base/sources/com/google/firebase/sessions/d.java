package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.b;
import o2.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d implements D8.b {
    public final Ba.a a;
    public final Ba.a b;

    public d(Ba.a aVar, Ba.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public static d a(Ba.a aVar, Ba.a aVar2) {
        return new d(aVar, aVar2);
    }

    public static i c(Context context, Ga.i iVar) {
        return (i) D8.d.d(b.b.a.j(context, iVar));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.a.get(), (Ga.i) this.b.get());
    }
}
