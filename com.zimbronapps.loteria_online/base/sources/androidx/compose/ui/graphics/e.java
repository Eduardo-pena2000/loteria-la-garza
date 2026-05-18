package androidx.compose.ui.graphics;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public static final a b = new a(null);
    public static final int c = e(0);
    public static final int d = e(1);
    public static final int e = e(2);
    public final int a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final int a() {
            return e.a();
        }

        public final int b() {
            return e.b();
        }

        public final int c() {
            return e.c();
        }

        public a() {
        }
    }

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    public static final /* synthetic */ int a() {
        return c;
    }

    public static final /* synthetic */ int b() {
        return e;
    }

    public static final /* synthetic */ int c() {
        return d;
    }

    public static final /* synthetic */ e d(int i) {
        return new e(i);
    }

    public static int e(int i) {
        return i;
    }

    public static boolean f(int i, Object obj) {
        return (obj instanceof e) && i == ((e) obj).j();
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static int h(int i) {
        return Integer.hashCode(i);
    }

    public static String i(int i) {
        return "CompositingStrategy(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ int j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }
}
