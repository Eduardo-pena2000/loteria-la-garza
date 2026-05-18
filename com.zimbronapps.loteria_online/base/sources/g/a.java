package G;

import I.D;
import I.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements w {
    public final int a;
    public int b = -1;
    public D.b c;
    public boolean d;

    public a(int i) {
        this.a = i;
    }

    public void a(L l, int i) {
        int i2 = this.a;
        for (int i3 = 0; i3 < i2; i3++) {
            l.a(i + i3);
        }
    }

    public void c(v vVar, q qVar) {
        if (this.b == -1 || qVar.h().isEmpty()) {
            return;
        }
        if (this.b != (this.d ? ((l) Da.D.p0(qVar.h())).getIndex() + 1 : ((l) Da.D.f0(qVar.h())).getIndex() - 1)) {
            this.b = -1;
            D.b bVar = this.c;
            if (bVar != null) {
                bVar.cancel();
            }
            this.c = null;
        }
    }

    public void d(v vVar, float f, q qVar) {
        D.b bVar;
        D.b bVar2;
        D.b bVar3;
        if (qVar.h().isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        int index = z ? ((l) Da.D.p0(qVar.h())).getIndex() + 1 : ((l) Da.D.f0(qVar.h())).getIndex() - 1;
        if (index < 0 || index >= qVar.f()) {
            return;
        }
        if (index != this.b) {
            if (this.d != z && (bVar3 = this.c) != null) {
                bVar3.cancel();
            }
            this.d = z;
            this.b = index;
            this.c = vVar.a(index);
        }
        if (!z) {
            if (qVar.e() - ((l) Da.D.f0(qVar.h())).a() >= f || (bVar = this.c) == null) {
                return;
            }
            bVar.a();
            return;
        }
        l lVar = (l) Da.D.p0(qVar.h());
        if (((lVar.a() + lVar.getSize()) + qVar.g()) - qVar.c() >= (-f) || (bVar2 = this.c) == null) {
            return;
        }
        bVar2.a();
    }
}
