package com.unity3d.scar.adapter.common;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a {
    public int a = 0;
    public Runnable b;

    public synchronized void a() {
        this.a++;
    }

    public synchronized void b() {
        this.a--;
        d();
    }

    public void c(Runnable runnable) {
        this.b = runnable;
        d();
    }

    public final void d() {
        Runnable runnable;
        if (this.a > 0 || (runnable = this.b) == null) {
            return;
        }
        runnable.run();
    }
}
