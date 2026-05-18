package com.amazon.a.a.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d implements c {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("MetricsManagerImpl");
    private b b = new b();

    public synchronized void a(a aVar) {
        try {
            if (com.amazon.a.a.o.c.a) {
                a.a("Recording Metric: " + aVar);
            }
            this.b.a(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized b a() {
        if (this.b.a()) {
            return this.b;
        }
        b bVar = this.b;
        this.b = new b();
        return bVar;
    }
}
