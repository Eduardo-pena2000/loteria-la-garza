package okhttp3.internal.http2;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Settings {
    public static final Companion c = new Companion(null);
    public int a;
    public final int[] b = new int[10];

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public final int a(int i) {
        return this.b[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.a & 16) != 0) {
            return this.b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    public final boolean f(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final void g(Settings other) {
        t.g(other, "other");
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            if (other.f(i)) {
                h(i, other.a(i));
            }
            i = i2;
        }
    }

    public final Settings h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.a);
    }
}
