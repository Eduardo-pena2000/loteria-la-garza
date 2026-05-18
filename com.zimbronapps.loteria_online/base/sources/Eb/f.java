package eb;

import hb.D;
import hb.E;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f {
    public static final m a = new m(-1, null, null, 0);
    public static final int b = E.g("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
    public static final int c = E.g("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
    public static final D d = new D("BUFFERED");
    public static final D e = new D("SHOULD_BUFFER");
    public static final D f = new D("S_RESUMING_BY_RCV");
    public static final D g = new D("RESUMING_BY_EB");
    public static final D h = new D("POISONED");
    public static final D i = new D("DONE_RCV");
    public static final D j = new D("INTERRUPTED_SEND");
    public static final D k = new D("INTERRUPTED_RCV");
    public static final D l = new D("CHANNEL_CLOSED");
    public static final D m = new D("SUSPEND");
    public static final D n = new D("SUSPEND_NO_WAITER");
    public static final D o = new D("FAILED");
    public static final D p = new D("NO_RECEIVE_RESULT");
    public static final D q = new D("CLOSE_HANDLER_CLOSED");
    public static final D r = new D("CLOSE_HANDLER_INVOKED");
    public static final D s = new D("NO_CLOSE_CAUSE");

    public /* synthetic */ class a extends kotlin.jvm.internal.q implements Qa.p {
        public static final a a = new a();

        public a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final m b(long j, m mVar) {
            return f.c(j, mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (m) obj2);
        }
    }

    public static final long A(int i2) {
        if (i2 == 0) {
            return 0L;
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(cb.n nVar, Object obj, Qa.q qVar) {
        Object g2 = nVar.g(obj, null, qVar);
        if (g2 == null) {
            return false;
        }
        nVar.B(g2);
        return true;
    }

    public static /* synthetic */ boolean C(cb.n nVar, Object obj, Qa.q qVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            qVar = null;
        }
        return B(nVar, obj, qVar);
    }

    public static final /* synthetic */ long a(long j2, boolean z) {
        return v(j2, z);
    }

    public static final /* synthetic */ long b(long j2, int i2) {
        return w(j2, i2);
    }

    public static final /* synthetic */ m c(long j2, m mVar) {
        return x(j2, mVar);
    }

    public static final /* synthetic */ D d() {
        return q;
    }

    public static final /* synthetic */ D e() {
        return r;
    }

    public static final /* synthetic */ D f() {
        return i;
    }

    public static final /* synthetic */ int g() {
        return c;
    }

    public static final /* synthetic */ D h() {
        return o;
    }

    public static final /* synthetic */ D i() {
        return k;
    }

    public static final /* synthetic */ D j() {
        return j;
    }

    public static final /* synthetic */ D k() {
        return e;
    }

    public static final /* synthetic */ D l() {
        return s;
    }

    public static final /* synthetic */ D m() {
        return p;
    }

    public static final /* synthetic */ m n() {
        return a;
    }

    public static final /* synthetic */ D o() {
        return h;
    }

    public static final /* synthetic */ D p() {
        return g;
    }

    public static final /* synthetic */ D q() {
        return f;
    }

    public static final /* synthetic */ D r() {
        return m;
    }

    public static final /* synthetic */ D s() {
        return n;
    }

    public static final /* synthetic */ long t(int i2) {
        return A(i2);
    }

    public static final /* synthetic */ boolean u(cb.n nVar, Object obj, Qa.q qVar) {
        return B(nVar, obj, qVar);
    }

    public static final long v(long j2, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j2;
    }

    public static final long w(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final m x(long j2, m mVar) {
        return new m(j2, mVar, mVar.y(), 0);
    }

    public static final Xa.f y() {
        return a.a;
    }

    public static final D z() {
        return l;
    }
}
