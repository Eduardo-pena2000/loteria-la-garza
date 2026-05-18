package cb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a0 extends hb.z {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public a0(Ga.i iVar, Ga.e eVar) {
        super(iVar, eVar);
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater S0() {
        return e;
    }

    private final boolean T0() {
        AtomicIntegerFieldUpdater S0 = S0();
        do {
            int i = S0.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!S0().compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean U0() {
        AtomicIntegerFieldUpdater S0 = S0();
        do {
            int i = S0.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!S0().compareAndSet(this, 0, 1));
        return true;
    }

    public void G(Object obj) {
        N0(obj);
    }

    public void N0(Object obj) {
        if (T0()) {
            return;
        }
        hb.i.b(Ha.b.c(this.d), E.a(obj, this.d));
    }

    public final Object R0() {
        if (U0()) {
            return Ha.c.f();
        }
        Object h = I0.h(c0());
        if (h instanceof C) {
            throw ((C) h).a;
        }
        return h;
    }
}
