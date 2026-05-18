package androidx.compose.ui.focus;

import P0.p0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q {
    public static final a a = new a(null);
    public static final int b = d(1);
    public static final int c = d(0);
    public static final int d = d(2);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return q.a();
        }

        public final int b() {
            return q.b();
        }

        public a() {
        }
    }

    public static final /* synthetic */ int a() {
        return b;
    }

    public static final /* synthetic */ int b() {
        return d;
    }

    public static final boolean c(int i, O0.h hVar) {
        if (e(i, b)) {
            return true;
        }
        if (e(i, c)) {
            return true ^ E0.a.f(((E0.b) O0.i.a(hVar, p0.j())).a(), E0.a.b.b());
        }
        if (e(i, d)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public static int d(int i) {
        return i;
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }
}
