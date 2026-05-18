package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import androidx.compose.ui.graphics.c;
import v0.A;
import v0.B;
import v0.C;
import v0.k;
import v0.l;
import v0.m;
import v0.n;
import v0.o;
import v0.p;
import v0.q;
import v0.r;
import v0.s;
import v0.t;
import v0.u;
import v0.v;
import v0.w;
import v0.x;
import v0.y;
import v0.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final BlendMode a(int i) {
        c.a aVar = c.b;
        return c.G(i, aVar.a()) ? v0.a.a() : c.G(i, aVar.x()) ? v0.c.a() : c.G(i, aVar.g()) ? o.a() : c.G(i, aVar.B()) ? n.a() : c.G(i, aVar.k()) ? p.a() : c.G(i, aVar.z()) ? q.a() : c.G(i, aVar.i()) ? r.a() : c.G(i, aVar.A()) ? s.a() : c.G(i, aVar.j()) ? t.a() : c.G(i, aVar.y()) ? u.a() : c.G(i, aVar.h()) ? l.a() : c.G(i, aVar.C()) ? v.a() : c.G(i, aVar.t()) ? w.a() : c.G(i, aVar.q()) ? x.a() : c.G(i, aVar.v()) ? y.a() : c.G(i, aVar.s()) ? z.a() : c.G(i, aVar.e()) ? A.a() : c.G(i, aVar.o()) ? B.a() : c.G(i, aVar.d()) ? C.a() : c.G(i, aVar.c()) ? v0.b.a() : c.G(i, aVar.m()) ? v0.d.a() : c.G(i, aVar.w()) ? v0.e.a() : c.G(i, aVar.f()) ? v0.f.a() : c.G(i, aVar.l()) ? v0.g.a() : c.G(i, aVar.r()) ? v0.h.a() : c.G(i, aVar.n()) ? v0.i.a() : c.G(i, aVar.u()) ? v0.j.a() : c.G(i, aVar.b()) ? k.a() : c.G(i, aVar.p()) ? m.a() : n.a();
    }

    public static final PorterDuff.Mode b(int i) {
        c.a aVar = c.b;
        return c.G(i, aVar.a()) ? PorterDuff.Mode.CLEAR : c.G(i, aVar.x()) ? PorterDuff.Mode.SRC : c.G(i, aVar.g()) ? PorterDuff.Mode.DST : c.G(i, aVar.B()) ? PorterDuff.Mode.SRC_OVER : c.G(i, aVar.k()) ? PorterDuff.Mode.DST_OVER : c.G(i, aVar.z()) ? PorterDuff.Mode.SRC_IN : c.G(i, aVar.i()) ? PorterDuff.Mode.DST_IN : c.G(i, aVar.A()) ? PorterDuff.Mode.SRC_OUT : c.G(i, aVar.j()) ? PorterDuff.Mode.DST_OUT : c.G(i, aVar.y()) ? PorterDuff.Mode.SRC_ATOP : c.G(i, aVar.h()) ? PorterDuff.Mode.DST_ATOP : c.G(i, aVar.C()) ? PorterDuff.Mode.XOR : c.G(i, aVar.t()) ? PorterDuff.Mode.ADD : c.G(i, aVar.v()) ? PorterDuff.Mode.SCREEN : c.G(i, aVar.s()) ? PorterDuff.Mode.OVERLAY : c.G(i, aVar.e()) ? PorterDuff.Mode.DARKEN : c.G(i, aVar.o()) ? PorterDuff.Mode.LIGHTEN : c.G(i, aVar.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
