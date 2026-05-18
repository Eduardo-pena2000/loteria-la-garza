package x4;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public static final a b = new a(null);
    public static final c c = new c(0);
    public static final c d = new c(1);
    public static final c e = new c(2);
    public final int a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final c a(float f) {
            if (f >= 0.0f) {
                return f < 600.0f ? c.c : f < 840.0f ? c.d : c.e;
            }
            throw new IllegalArgumentException(("Width must be positive, received " + f).toString());
        }

        public a() {
        }
    }

    public c(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.a == ((c) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "WindowWidthSizeClass: " + (t.c(this, c) ? "COMPACT" : t.c(this, d) ? "MEDIUM" : t.c(this, e) ? "EXPANDED" : "UNKNOWN");
    }
}
