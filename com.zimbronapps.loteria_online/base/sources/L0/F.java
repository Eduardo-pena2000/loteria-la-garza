package l0;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends l {
    public final Qa.l g;
    public final l h;

    public f(long j, p pVar, Qa.l lVar, l lVar2) {
        super(j, pVar, null);
        this.g = lVar;
        this.h = lVar2;
        lVar2.m(this);
    }

    public final l A() {
        return this.h;
    }

    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Qa.l g() {
        return this.g;
    }

    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void m(l lVar) {
        H.b();
        throw new Ca.i();
    }

    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void n(l lVar) {
        H.b();
        throw new Ca.i();
    }

    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void p(U u) {
        v.w();
        throw new Ca.i();
    }

    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public f x(Qa.l lVar) {
        Map map;
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
        f fVar = new f(i(), f(), v.Q(lVar, g(), false, 4, null), A());
        if (a != null) {
            m0.b.b(a, this, fVar, map);
        }
        return fVar;
    }

    public void d() {
        if (e()) {
            return;
        }
        if (i() != this.h.i()) {
            b();
        }
        this.h.n(this);
        super.d();
        m0.b.d(this);
    }

    public boolean h() {
        return true;
    }

    public Qa.l k() {
        return null;
    }

    public void o() {
    }
}
