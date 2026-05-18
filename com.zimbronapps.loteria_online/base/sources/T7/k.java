package t7;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class k {
    public static final k a = new a();
    public static final k b = new b(-1);
    public static final k c = new b(1);

    public class a extends k {
        public a() {
            super(null);
        }

        public k d(int i, int i2) {
            return k(w7.f.e(i, i2));
        }

        public k e(long j, long j2) {
            return k(w7.h.a(j, j2));
        }

        public k f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        public k g(boolean z, boolean z2) {
            return k(w7.a.a(z, z2));
        }

        public k h(boolean z, boolean z2) {
            return k(w7.a.a(z2, z));
        }

        public int i() {
            return 0;
        }

        public k k(int i) {
            return i < 0 ? k.a() : i > 0 ? k.b() : k.c();
        }
    }

    public /* synthetic */ k(a aVar) {
        this();
    }

    public static /* synthetic */ k a() {
        return b;
    }

    public static /* synthetic */ k b() {
        return c;
    }

    public static /* synthetic */ k c() {
        return a;
    }

    public static k j() {
        return a;
    }

    public abstract k d(int i, int i2);

    public abstract k e(long j, long j2);

    public abstract k f(Object obj, Object obj2, Comparator comparator);

    public abstract k g(boolean z, boolean z2);

    public abstract k h(boolean z, boolean z2);

    public abstract int i();

    public k() {
    }

    public static final class b extends k {
        public final int d;

        public b(int i) {
            super(null);
            this.d = i;
        }

        public int i() {
            return this.d;
        }

        public k d(int i, int i2) {
            return this;
        }

        public k e(long j, long j2) {
            return this;
        }

        public k g(boolean z, boolean z2) {
            return this;
        }

        public k h(boolean z, boolean z2) {
            return this;
        }

        public k f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }
    }
}
