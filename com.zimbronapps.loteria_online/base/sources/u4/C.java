package U4;

import Ca.i;
import P0.M0;
import android.graphics.drawable.Drawable;
import b0.m;
import b0.w;
import e5.h;
import f5.c;
import f5.h;
import u0.l;
import v0.b1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final a a = new a();

    public static final class a implements i5.d {
        public Drawable d() {
            return null;
        }
    }

    public static final /* synthetic */ a a() {
        return a;
    }

    public static final /* synthetic */ h b(long j) {
        return f(j);
    }

    public static final boolean c(long j) {
        return ((double) l.i(j)) >= 0.5d && ((double) l.g(j)) >= 0.5d;
    }

    public static final b d(Object obj, T4.d dVar, A0.c cVar, A0.c cVar2, A0.c cVar3, Qa.l lVar, Qa.l lVar2, Qa.l lVar3, M0.f fVar, int i, m mVar, int i2, int i3) {
        mVar.B(2140758544);
        A0.c cVar4 = (i3 & 4) != 0 ? null : cVar;
        A0.c cVar5 = (i3 & 8) != 0 ? null : cVar2;
        A0.c cVar6 = (i3 & 16) != 0 ? cVar5 : cVar3;
        Qa.l lVar4 = (i3 & 32) != 0 ? null : lVar;
        Qa.l lVar5 = (i3 & 64) != 0 ? null : lVar2;
        Qa.l lVar6 = (i3 & 128) == 0 ? lVar3 : null;
        M0.f b = (i3 & 256) != 0 ? M0.f.a.b() : fVar;
        int b2 = (i3 & 512) != 0 ? x0.f.a9.b() : i;
        if (w.L()) {
            w.U(2140758544, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:83)");
        }
        int i4 = i2 >> 12;
        b e = e(obj, dVar, g.h(cVar4, cVar5, cVar6), g.d(lVar4, lVar5, lVar6), b, b2, mVar, (57344 & i4) | 72 | (i4 & 458752), 0);
        if (w.L()) {
            w.T();
        }
        mVar.T();
        return e;
    }

    public static final b e(Object obj, T4.d dVar, Qa.l lVar, Qa.l lVar2, M0.f fVar, int i, m mVar, int i2, int i3) {
        mVar.B(-2020614074);
        if ((i3 & 4) != 0) {
            lVar = b.v.a();
        }
        if ((i3 & 8) != 0) {
            lVar2 = null;
        }
        if ((i3 & 16) != 0) {
            fVar = M0.f.a.b();
        }
        if ((i3 & 32) != 0) {
            i = x0.f.a9.b();
        }
        if (w.L()) {
            w.U(-2020614074, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:128)");
        }
        e5.h e = g.e(obj, mVar, 8);
        i(e);
        mVar.B(-492369756);
        Object C = mVar.C();
        if (C == m.a.a()) {
            C = new b(e, dVar);
            mVar.t(C);
        }
        mVar.T();
        b bVar = (b) C;
        bVar.K(lVar);
        bVar.F(lVar2);
        bVar.C(fVar);
        bVar.D(i);
        bVar.H(((Boolean) mVar.x(M0.a())).booleanValue());
        bVar.E(dVar);
        bVar.I(e);
        bVar.c();
        if (w.L()) {
            w.T();
        }
        mVar.T();
        return bVar;
    }

    public static final h f(long j) {
        if (j == l.b.a()) {
            return h.d;
        }
        if (!c(j)) {
            return null;
        }
        float i = l.i(j);
        f5.c a2 = (Float.isInfinite(i) || Float.isNaN(i)) ? c.b.a : f5.a.a(Sa.c.d(l.i(j)));
        float g = l.g(j);
        return new h(a2, (Float.isInfinite(g) || Float.isNaN(g)) ? c.b.a : f5.a.a(Sa.c.d(l.g(j))));
    }

    public static final Void g(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    public static /* synthetic */ Void h(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return g(str, str2);
    }

    public static final void i(e5.h hVar) {
        Object m = hVar.m();
        if (m instanceof h.a) {
            g("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new i();
        }
        if (m instanceof b1) {
            h("ImageBitmap", null, 2, null);
            throw new i();
        }
        if (m instanceof B0.d) {
            h("ImageVector", null, 2, null);
            throw new i();
        }
        if (m instanceof A0.c) {
            h("Painter", null, 2, null);
            throw new i();
        }
        if (hVar.M() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
