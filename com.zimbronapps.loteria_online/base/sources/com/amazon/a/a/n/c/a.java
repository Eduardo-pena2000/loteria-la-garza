package com.amazon.a.a.n.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a implements c {
    private b a;

    public final void a(b bVar) {
        com.amazon.a.a.o.a.a.a((Object) bVar, "workflow");
        com.amazon.a.a.o.a.a.c(this.a, "workflow instance can only be set once");
        this.a = bVar;
    }

    public final boolean m() {
        return this.a != null;
    }

    public final void n() {
        com.amazon.a.a.o.a.a.a(m(), "task is no a workflow child");
        this.a.d();
    }
}
