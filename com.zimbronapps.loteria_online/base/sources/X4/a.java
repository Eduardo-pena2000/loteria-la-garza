package x4;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public static final a b = new a(null);
    public static final a c = new a(0);
    public static final a d = new a(1);
    public static final a e = new a(2);
    public final int a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final a a(float f) {
            if (f >= 0.0f) {
                return f < 480.0f ? a.c : f < 900.0f ? a.d : a.e;
            }
            throw new IllegalArgumentException(("Height must be positive, received " + f).toString());
        }

        public a() {
        }
    }

    public a(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.a == ((a) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "WindowHeightSizeClass: " + (t.c(this, c) ? "COMPACT" : t.c(this, d) ? "MEDIUM" : t.c(this, e) ? "EXPANDED" : "UNKNOWN");
    }
}
