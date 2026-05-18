package Wa;

import Da.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a implements Iterable, Ra.a {
    public static final a d = new a(null);
    public final char a;
    public final char b;
    public final int c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public a(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = c;
        this.b = (char) Ka.c.c(c, c2, i);
        this.c = i;
    }

    public final char f() {
        return this.a;
    }

    public final char g() {
        return this.b;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t iterator() {
        return new b(this.a, this.b, this.c);
    }
}
