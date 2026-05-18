package Pb;

import Sb.A;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class e {
    public final A a;
    public final Qb.l b;
    public final Qb.l c;
    public final boolean d;
    public final e e;
    public final f f;
    public boolean g = true;
    public boolean h = false;

    public e(A a, Qb.l lVar, Qb.l lVar2, e eVar, f fVar, boolean z) {
        this.a = a;
        this.b = lVar;
        this.c = lVar2;
        this.d = z;
        this.e = eVar;
        this.f = fVar;
    }

    public static e a(A a, Qb.l lVar, Qb.l lVar2, e eVar, f fVar) {
        return new e(a, lVar, lVar2, eVar, fVar, true);
    }

    public static e b(A a, Qb.l lVar, Qb.l lVar2, e eVar, f fVar) {
        return new e(a, lVar, lVar2, eVar, fVar, false);
    }
}
