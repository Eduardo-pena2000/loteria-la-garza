package D;

import C.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements b {
    public final z.i a;

    public m(z.i iVar) {
        this.a = iVar;
    }

    public /* bridge */ /* synthetic */ Object a(u uVar, Object obj, Object obj2, Qa.l lVar, Ga.e eVar) {
        return b(uVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), lVar, eVar);
    }

    public Object b(u uVar, float f, float f2, Qa.l lVar, Ga.e eVar) {
        Object c = i.c(uVar, Math.abs(f) * Math.signum(f2), f, z.l.c(0.0f, f2, 0L, 0L, false, 28, null), this.a, lVar, eVar);
        return c == Ha.c.f() ? c : (a) c;
    }
}
