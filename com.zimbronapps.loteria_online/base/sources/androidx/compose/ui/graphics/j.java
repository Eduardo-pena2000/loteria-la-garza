package androidx.compose.ui.graphics;

import kotlin.jvm.internal.k;
import v0.L1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public static final a b = new a(null);
    public static final long c = L1.a(0.5f, 0.5f);
    public final long a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final long a() {
            return j.a();
        }

        public a() {
        }
    }

    public /* synthetic */ j(long j) {
        this.a = j;
    }

    public static final /* synthetic */ long a() {
        return c;
    }

    public static final /* synthetic */ j b(long j) {
        return new j(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof j) && j == ((j) obj).j();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final float f(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float g(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int h(long j) {
        return Long.hashCode(j);
    }

    public static String i(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ long j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }
}
