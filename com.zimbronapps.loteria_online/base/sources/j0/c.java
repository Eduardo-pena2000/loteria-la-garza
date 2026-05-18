package J0;

import Ca.o;
import Da.p;
import Wa.n;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public final boolean a;
    public final a b;
    public final int c;
    public final J0.a[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a = new a("Lsq2", 0);
        public static final a b = new a("Impulse", 1);
        public static final /* synthetic */ a[] c;
        public static final /* synthetic */ Ja.a d;

        static {
            a[] a2 = a();
            c = a2;
            d = Ja.b.a(a2);
        }

        public a(String str, int i) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public c(boolean z, a aVar) {
        this.a = z;
        this.b = aVar;
        if (z && aVar.equals(a.a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = b.a[aVar.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new o();
            }
            i2 = 3;
        }
        this.c = i2;
        this.d = new J0.a[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        e.b(this.d, i, j, f);
    }

    public final float b(float[] fArr, float[] fArr2, int i) {
        try {
            return e.j(fArr2, fArr, i, 2, this.h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final float c() {
        float a2;
        float[] fArr = this.f;
        float[] fArr2 = this.g;
        int i = this.e;
        J0.a aVar = this.d[i];
        if (aVar == null) {
            return 0.0f;
        }
        int i2 = 0;
        J0.a aVar2 = aVar;
        while (true) {
            J0.a aVar3 = this.d[i];
            if (aVar3 != null) {
                float b2 = aVar.b() - aVar3.b();
                float abs = Math.abs(aVar3.b() - aVar2.b());
                J0.a aVar4 = (this.b == a.a || this.a) ? aVar3 : aVar;
                if (b2 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i2] = aVar3.a();
                fArr2[i2] = -b2;
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                aVar2 = aVar4;
            } else {
                break;
            }
        }
        if (i2 < this.c) {
            return 0.0f;
        }
        int i3 = b.a[this.b.ordinal()];
        if (i3 == 1) {
            a2 = e.a(fArr, fArr2, i2, this.a);
        } else {
            if (i3 != 2) {
                throw new o();
            }
            a2 = b(fArr, fArr2, i2);
        }
        return a2 * 1000;
    }

    public final float d(float f) {
        if (!(f > 0.0f)) {
            L0.a.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float c = c();
        if (c == 0.0f || Float.isNaN(c)) {
            return 0.0f;
        }
        return c > 0.0f ? n.h(c, f) : n.d(c, -f);
    }

    public final void e() {
        p.x(this.d, (Object) null, 0, 0, 6, (Object) null);
        this.e = 0;
    }

    public /* synthetic */ c(boolean z, a aVar, int i, k kVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? a.a : aVar);
    }
}
