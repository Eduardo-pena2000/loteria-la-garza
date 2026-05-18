package hb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public p(boolean z) {
        this._cur$volatile = new q(8, z);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater d() {
        return a;
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater d = d();
        while (true) {
            q qVar = (q) d.get(this);
            int a2 = qVar.a(obj);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                s1.b.a(d(), this, qVar, qVar.l());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater d = d();
        while (true) {
            q qVar = (q) d.get(this);
            if (qVar.d()) {
                return;
            } else {
                s1.b.a(d(), this, qVar, qVar.l());
            }
        }
    }

    public final int c() {
        return ((q) d().get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater d = d();
        while (true) {
            q qVar = (q) d.get(this);
            Object m = qVar.m();
            if (m != q.h) {
                return m;
            }
            s1.b.a(d(), this, qVar, qVar.l());
        }
    }
}
