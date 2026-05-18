package lb;

import hb.D;
import hb.E;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class l {
    public static final int a = E.g("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
    public static final D b = new D("PERMIT");
    public static final D c = new D("TAKEN");
    public static final D d = new D("BROKEN");
    public static final D e = new D("CANCELLED");
    public static final int f = E.g("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final h a(int i, int i2) {
        return new k(i, i2);
    }

    public static /* synthetic */ h b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return a(i, i2);
    }

    public static final /* synthetic */ m c(long j, m mVar) {
        return j(j, mVar);
    }

    public static final /* synthetic */ D d() {
        return d;
    }

    public static final /* synthetic */ D e() {
        return e;
    }

    public static final /* synthetic */ int f() {
        return a;
    }

    public static final /* synthetic */ D g() {
        return b;
    }

    public static final /* synthetic */ int h() {
        return f;
    }

    public static final /* synthetic */ D i() {
        return c;
    }

    public static final m j(long j, m mVar) {
        return new m(j, mVar, 0);
    }
}
