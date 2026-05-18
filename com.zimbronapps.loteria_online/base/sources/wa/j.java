package Wa;

import Da.N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j implements Iterable, Ra.a {
    public static final a d = new a(null);
    public final long a;
    public final long b;
    public final long c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public j(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = j;
        this.b = Ka.c.d(j, j2, j3);
        this.c = j3;
    }

    public final long f() {
        return this.a;
    }

    public final long g() {
        return this.b;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public N iterator() {
        return new k(this.a, this.b, this.c);
    }
}
