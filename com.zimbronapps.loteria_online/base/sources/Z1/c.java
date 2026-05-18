package z1;

import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c extends y1.e {
    public g.c q0;
    public int r0;
    public B1.a s0;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.c.values().length];
            a = iArr;
            try {
                iArr[g.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.c.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.c.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.c.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.c.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(y1.g gVar) {
        super(gVar, g.d.BARRIER);
    }

    public y1.a J(int i) {
        this.r0 = i;
        return this;
    }

    public y1.a K(Object obj) {
        J(this.m0.e(obj));
        return this;
    }

    public void apply() {
        u0();
        int i = a.a[this.q0.ordinal()];
        int i2 = 3;
        if (i == 3 || i == 4) {
            i2 = 1;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        this.s0.D1(i2);
        this.s0.E1(this.r0);
    }

    public B1.j u0() {
        if (this.s0 == null) {
            this.s0 = new B1.a();
        }
        return this.s0;
    }

    public void w0(g.c cVar) {
        this.q0 = cVar;
    }
}
