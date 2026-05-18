package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class g0 {
    public Object a;
    public boolean b;
    public final /* synthetic */ d c;

    public g0(d dVar, Object obj) {
        Objects.requireNonNull(dVar);
        this.c = dVar;
        this.a = obj;
        this.b = false;
    }

    public abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.a;
                if (this.b) {
                    String obj2 = toString();
                    StringBuilder sb = new StringBuilder(obj2.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(obj2);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.b = true;
        }
        c();
    }

    public final void c() {
        d();
        d dVar = this.c;
        synchronized (dVar.zzj()) {
            dVar.zzj().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
