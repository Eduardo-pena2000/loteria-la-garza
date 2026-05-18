package l0;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i extends l {
    public final Qa.l g;
    public int h;

    public i(long j, p pVar, Qa.l lVar) {
        super(j, pVar, null);
        this.g = lVar;
        this.h = 1;
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Qa.l g() {
        return this.g;
    }

    public void d() {
        if (e()) {
            return;
        }
        n(this);
        super.d();
        m0.b.d(this);
    }

    public boolean h() {
        return true;
    }

    public Qa.l k() {
        return null;
    }

    public void m(l lVar) {
        this.h++;
    }

    public void n(l lVar) {
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            b();
        }
    }

    public void p(U u) {
        v.w();
        throw new Ca.i();
    }

    public l x(Qa.l lVar) {
        Map map;
        v.D(this);
        e0.e a = m0.b.a();
        if (a != null) {
            Ca.q e = m0.b.e(a, this, true, lVar, null);
            m0.a aVar = (m0.a) e.c();
            Qa.l a2 = aVar.a();
            aVar.b();
            map = (Map) e.d();
            lVar = a2;
        } else {
            map = null;
        }
        f fVar = new f(i(), f(), v.Q(lVar, g(), false, 4, null), this);
        if (a != null) {
            m0.b.b(a, this, fVar, map);
        }
        return fVar;
    }

    public void o() {
    }
}
