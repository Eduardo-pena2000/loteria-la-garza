package o1;

import Ca.I;
import n1.m;
import w.j0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final b a;
    public static final float[] b;
    public static volatile j0 c;
    public static final Object[] d;
    public static final int e;

    static {
        b bVar = new b();
        a = bVar;
        b = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        c = new j0(0, 1, null);
        Object[] objArr = new Object[0];
        d = objArr;
        synchronized (objArr) {
            bVar.h(c, 1.15f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bVar.h(c, 1.3f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bVar.h(c, 1.5f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bVar.h(c, 1.8f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bVar.h(c, 2.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            I i = I.a;
        }
        if (!(bVar.e(c.g(0)) - 0.01f > 1.03f)) {
            m.b("You should only apply non-linear scaling to font scales > 1");
        }
        e = 8;
    }

    public final a a(a aVar, a aVar2, float f) {
        float[] fArr = b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f2 = b[i];
            fArr2[i] = d.a.b(aVar.b(f2), aVar2.b(f2), f);
        }
        return new c(b, fArr2);
    }

    public final a b(float f) {
        a aVar;
        if (!f(f)) {
            return null;
        }
        a c2 = a.c(f);
        if (c2 != null) {
            return c2;
        }
        int f2 = c.f(d(f));
        if (f2 >= 0) {
            return (a) c.j(f2);
        }
        int i = -(f2 + 1);
        int i2 = i - 1;
        float f3 = 1.0f;
        if (i >= c.i()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f});
            g(f, cVar);
            return cVar;
        }
        if (i2 < 0) {
            float[] fArr = b;
            aVar = new c(fArr, fArr);
        } else {
            f3 = e(c.g(i2));
            aVar = (a) c.j(i2);
        }
        a a2 = a(aVar, (a) c.j(i), d.a.a(0.0f, 1.0f, f3, e(c.g(i)), f));
        g(f, a2);
        return a2;
    }

    public final a c(float f) {
        return (a) c.e(d(f));
    }

    public final int d(float f) {
        return (int) (f * 100.0f);
    }

    public final float e(int i) {
        return i / 100.0f;
    }

    public final boolean f(float f) {
        return f >= 1.03f;
    }

    public final void g(float f, a aVar) {
        synchronized (d) {
            j0 clone = c.clone();
            a.h(clone, f, aVar);
            c = clone;
            I i = I.a;
        }
    }

    public final void h(j0 j0Var, float f, a aVar) {
        j0Var.h(d(f), aVar);
    }
}
