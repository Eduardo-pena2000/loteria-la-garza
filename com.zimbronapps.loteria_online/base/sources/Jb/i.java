package jb;

import cb.T;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class i extends h {
    public final Runnable c;

    public i(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    public void run() {
        this.c.run();
    }

    public String toString() {
        return "Task[" + T.a(this.c) + '@' + T.b(this.c) + ", " + this.a + ", " + j.a(this.b) + ']';
    }
}
