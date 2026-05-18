package cb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Z0 extends G0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(Z0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public g0 f;

    public static final /* synthetic */ AtomicIntegerFieldUpdater y() {
        return g;
    }

    public final void A(B0 b0) {
        int i;
        this.f = E0.o(b0, false, this, 1, null);
        AtomicIntegerFieldUpdater y = y();
        do {
            i = y.get(this);
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                z(i);
                throw new Ca.i();
            }
        } while (!y().compareAndSet(this, i, 0));
    }

    public boolean u() {
        return true;
    }

    public void v(Throwable th) {
        int i;
        AtomicIntegerFieldUpdater y = y();
        do {
            i = y.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                z(i);
                throw new Ca.i();
            }
        } while (!y().compareAndSet(this, i, 2));
        this.e.interrupt();
        y().set(this, 3);
    }

    public final void x() {
        AtomicIntegerFieldUpdater y = y();
        while (true) {
            int i = y.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        z(i);
                        throw new Ca.i();
                    }
                }
            } else if (y().compareAndSet(this, i, 1)) {
                g0 g0Var = this.f;
                if (g0Var != null) {
                    g0Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final Void z(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }
}
