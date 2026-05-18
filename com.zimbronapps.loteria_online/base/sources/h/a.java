package H;

import I.D;
import I.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements A {
    public final int a;
    public int b = -1;
    public final d0.c c = new d0.c(new D.b[16], 0);
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

    public void c(z zVar, s sVar) {
        int g;
        if (this.b == -1 || sVar.h().isEmpty()) {
            return;
        }
        if (this.d) {
            k kVar = (k) Da.D.p0(sVar.h());
            g = (sVar.getOrientation() == C.q.Vertical ? kVar.g() : kVar.b()) + 1;
        } else {
            k kVar2 = (k) Da.D.f0(sVar.h());
            g = (sVar.getOrientation() == C.q.Vertical ? kVar2.g() : kVar2.b()) - 1;
        }
        if (this.b != g) {
            this.b = -1;
            d0.c cVar = this.c;
            int m = cVar.m();
            if (m > 0) {
                Object[] l = cVar.l();
                int i = 0;
                do {
                    ((D.b) l[i]).cancel();
                    i++;
                } while (i < m);
            }
            this.c.h();
        }
    }

    public void d(z zVar, float f, s sVar) {
        int g;
        int index;
        d0.c cVar;
        int m;
        d0.c cVar2;
        int m2;
        d0.c cVar3;
        int m3;
        if (sVar.h().isEmpty()) {
            return;
        }
        int i = 0;
        boolean z = f < 0.0f;
        if (z) {
            k kVar = (k) Da.D.p0(sVar.h());
            g = (sVar.getOrientation() == C.q.Vertical ? kVar.g() : kVar.b()) + 1;
            index = ((k) Da.D.p0(sVar.h())).getIndex() + 1;
        } else {
            k kVar2 = (k) Da.D.f0(sVar.h());
            g = (sVar.getOrientation() == C.q.Vertical ? kVar2.g() : kVar2.b()) - 1;
            index = ((k) Da.D.f0(sVar.h())).getIndex() - 1;
        }
        if (index < 0 || index >= sVar.f()) {
            return;
        }
        if (g != this.b) {
            if (this.d != z && (m3 = (cVar3 = this.c).m()) > 0) {
                Object[] l = cVar3.l();
                int i2 = 0;
                do {
                    ((D.b) l[i2]).cancel();
                    i2++;
                } while (i2 < m3);
            }
            this.d = z;
            this.b = g;
            this.c.h();
            d0.c cVar4 = this.c;
            cVar4.e(cVar4.m(), zVar.a(g));
        }
        if (!z) {
            if (sVar.e() - D.e.a((k) Da.D.f0(sVar.h()), sVar.getOrientation()) >= f || (m = (cVar = this.c).m()) <= 0) {
                return;
            }
            Object[] l2 = cVar.l();
            do {
                ((D.b) l2[i]).a();
                i++;
            } while (i < m);
            return;
        }
        k kVar3 = (k) Da.D.p0(sVar.h());
        if (((D.e.a(kVar3, sVar.getOrientation()) + D.e.b(kVar3, sVar.getOrientation())) + sVar.g()) - sVar.c() >= (-f) || (m2 = (cVar2 = this.c).m()) <= 0) {
            return;
        }
        Object[] l3 = cVar2.l();
        do {
            ((D.b) l3[i]).a();
            i++;
        } while (i < m2);
    }
}
