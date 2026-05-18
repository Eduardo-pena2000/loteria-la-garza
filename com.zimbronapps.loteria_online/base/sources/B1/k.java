package B1;

import B1.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k {
    public static boolean[] a = new boolean[3];

    public static void a(f fVar, u1.d dVar, e eVar) {
        eVar.t = -1;
        eVar.u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i = eVar.O.g;
            int Y = fVar.Y() - eVar.Q.g;
            d dVar2 = eVar.O;
            dVar2.i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.i = dVar.q(dVar3);
            dVar.f(eVar.O.i, i);
            dVar.f(eVar.Q.i, Y);
            eVar.t = 2;
            eVar.R0(i, Y);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i2 = eVar.P.g;
        int x = fVar.x() - eVar.R.g;
        d dVar4 = eVar.P;
        dVar4.i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.i = dVar.q(dVar5);
        dVar.f(eVar.P.i, i2);
        dVar.f(eVar.R.i, x);
        if (eVar.l0 > 0 || eVar.X() == 8) {
            d dVar6 = eVar.S;
            dVar6.i = dVar.q(dVar6);
            dVar.f(eVar.S.i, eVar.l0 + i2);
        }
        eVar.u = 2;
        eVar.i1(i2, x);
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
