package com.google.android.gms.common.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u {
    public static u b;
    public static final v c = new v(0, false, false, 0, 0);
    public v a;

    public static synchronized u b() {
        u uVar;
        synchronized (u.class) {
            try {
                if (b == null) {
                    b = new u();
                }
                uVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public v a() {
        return this.a;
    }

    public final synchronized void c(v vVar) {
        if (vVar == null) {
            this.a = c;
            return;
        }
        v vVar2 = this.a;
        if (vVar2 == null || vVar2.Q1() < vVar.Q1()) {
            this.a = vVar;
        }
    }
}
