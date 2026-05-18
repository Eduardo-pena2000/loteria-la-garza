package V4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public static final h a = new h();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f5.g.values().length];
            try {
                iArr[f5.g.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f5.g.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final int a(int i, int i2, int i3, int i4, f5.g gVar) {
        int min;
        int highestOneBit = Integer.highestOneBit(i / i3);
        int highestOneBit2 = Integer.highestOneBit(i2 / i4);
        int i5 = a.a[gVar.ordinal()];
        if (i5 == 1) {
            min = Math.min(highestOneBit, highestOneBit2);
        } else {
            if (i5 != 2) {
                throw new Ca.o();
            }
            min = Math.max(highestOneBit, highestOneBit2);
        }
        return Wa.n.e(min, 1);
    }

    public static final double b(double d, double d2, double d3, double d4, f5.g gVar) {
        double d5 = d3 / d;
        double d6 = d4 / d2;
        int i = a.a[gVar.ordinal()];
        if (i == 1) {
            return Math.max(d5, d6);
        }
        if (i == 2) {
            return Math.min(d5, d6);
        }
        throw new Ca.o();
    }

    public static final double c(int i, int i2, int i3, int i4, f5.g gVar) {
        double d = i3 / i;
        double d2 = i4 / i2;
        int i5 = a.a[gVar.ordinal()];
        if (i5 == 1) {
            return Math.max(d, d2);
        }
        if (i5 == 2) {
            return Math.min(d, d2);
        }
        throw new Ca.o();
    }
}
