package y;

import b0.h2;
import v0.r0;
import z.h0;
import z.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z {
    public static final h0 a = z.j.h(0.0f, 0.0f, null, 7, null);

    public static final h2 a(long j, z.i iVar, String str, Qa.l lVar, b0.m mVar, int i, int i2) {
        z.i iVar2 = (i2 & 2) != 0 ? a : iVar;
        String str2 = (i2 & 4) != 0 ? "ColorAnimation" : str;
        Qa.l lVar2 = (i2 & 8) != 0 ? null : lVar;
        if (b0.w.L()) {
            b0.w.U(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean U = mVar.U(r0.v(j));
        Object C = mVar.C();
        if (U || C == b0.m.a.a()) {
            C = (s0) j.a(r0.b).invoke(r0.v(j));
            mVar.t(C);
        }
        int i3 = i << 6;
        h2 e = z.c.e(r0.m(j), (s0) C, iVar2, null, str2, lVar2, mVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (b0.w.L()) {
            b0.w.T();
        }
        return e;
    }
}
