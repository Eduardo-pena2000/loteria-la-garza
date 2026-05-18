package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface d extends l {
    default float A(int i) {
        return h.g(i / getDensity());
    }

    default long N(long j) {
        return j != 9205357640488583168L ? i.b(a1(Float.intBitsToFloat((int) (j >> 32))), a1(Float.intBitsToFloat((int) (j & 4294967295L)))) : k.b.a();
    }

    default long X(float f) {
        return M(a1(f));
    }

    default float a1(float f) {
        return h.g(f / getDensity());
    }

    float getDensity();

    default float j1(float f) {
        return f * getDensity();
    }

    default int s0(float f) {
        float j1 = j1(f);
        if (Float.isInfinite(j1)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(j1);
    }

    default long w1(long j) {
        if (j == 9205357640488583168L) {
            return u0.l.b.a();
        }
        float j1 = j1(k.h(j));
        float j12 = j1(k.g(j));
        return u0.l.d((Float.floatToRawIntBits(j12) & 4294967295L) | (Float.floatToRawIntBits(j1) << 32));
    }

    default float y0(long j) {
        if (!x.g(v.g(j), x.b.b())) {
            m.b("Only Sp can convert to Px");
        }
        return j1(S(j));
    }
}
