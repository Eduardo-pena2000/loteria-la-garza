package jb;

import cb.r0;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f extends r0 {
    public final int c;
    public final int d;
    public final long e;
    public final String f;
    public a g = G();

    public f(int i, int i2, long j, String str) {
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = str;
    }

    public Executor E() {
        return this.g;
    }

    public final a G() {
        return new a(this.c, this.d, this.e, this.f);
    }

    public final void J(Runnable runnable, boolean z, boolean z2) {
        this.g.k(runnable, z, z2);
    }

    public void x(Ga.i iVar, Runnable runnable) {
        a.m(this.g, runnable, false, false, 6, null);
    }

    public void y(Ga.i iVar, Runnable runnable) {
        a.m(this.g, runnable, false, true, 2, null);
    }
}
