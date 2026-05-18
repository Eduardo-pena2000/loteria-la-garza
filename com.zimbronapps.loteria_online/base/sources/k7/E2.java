package k7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e2 {
    public static final Object g = new Object();
    public final String a;
    public final P b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;
    public volatile Object f = null;

    public /* synthetic */ e2(String str, Object obj, Object obj2, P p, byte[] bArr) {
        this.a = str;
        this.c = obj;
        this.b = p;
    }

    public final String a() {
        return this.a;
    }

    public final Object b(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (Y1.a == null) {
            return this.c;
        }
        synchronized (g) {
            try {
                if (f.a()) {
                    return this.f == null ? this.c : this.f;
                }
                try {
                    for (e2 e2Var : f2.b()) {
                        if (f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            P p = e2Var.b;
                            if (p != null) {
                                obj2 = p.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (g) {
                            e2Var.f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                P p2 = this.b;
                if (p2 != null) {
                    try {
                        return p2.zza();
                    } catch (SecurityException | IllegalStateException unused3) {
                    }
                }
                return this.c;
            } finally {
            }
        }
    }
}
