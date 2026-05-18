package T2;

import T2.q;
import android.content.Context;
import android.os.Looper;
import g3.w;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface v extends M2.C {

    public static class c {
        public static final c b = new c(-9223372036854775807L);
        public final long a;

        public c(long j) {
            this.a = j;
        }
    }

    void B(g3.S s);

    void C(int i, List list);

    void g(boolean z);

    int getAudioSessionId();

    void release();

    void s(List list, int i, long j);

    public static final class b {
        public long A;
        public boolean B;
        public boolean C;
        public Looper D;
        public boolean E;
        public boolean F;
        public String G;
        public boolean H;
        public final Context a;
        public P2.c b;
        public long c;
        public s7.s d;
        public s7.s e;
        public s7.s f;
        public s7.s g;
        public s7.s h;
        public s7.g i;
        public Looper j;
        public int k;
        public M2.b l;
        public boolean m;
        public int n;
        public boolean o;
        public boolean p;
        public boolean q;
        public int r;
        public int s;
        public boolean t;
        public a1 u;
        public long v;
        public long w;
        public long x;
        public v0 y;
        public long z;

        public b(Context context, Z0 z0) {
            this(context, new x(z0), new y(context));
            P2.a.e(z0);
        }

        public static /* synthetic */ w.a a(Context context) {
            return j(context);
        }

        public static /* synthetic */ w0 b(w0 w0Var) {
            return k(w0Var);
        }

        public static /* synthetic */ k3.d c(Context context) {
            return h(context);
        }

        public static /* synthetic */ Z0 d(Z0 z0) {
            return i(z0);
        }

        public static /* synthetic */ j3.C e(Context context) {
            return g(context);
        }

        public static /* synthetic */ j3.C g(Context context) {
            return new j3.n(context);
        }

        public static /* synthetic */ k3.d h(Context context) {
            return k3.i.n(context);
        }

        public static /* synthetic */ w.a j(Context context) {
            return new g3.n(context, new o3.l());
        }

        public v f() {
            P2.a.f(!this.E);
            this.E = true;
            return new e0(this, null);
        }

        public b l(v0 v0Var) {
            P2.a.f(!this.E);
            this.y = (v0) P2.a.e(v0Var);
            return this;
        }

        public b m(w0 w0Var) {
            P2.a.f(!this.E);
            P2.a.e(w0Var);
            this.g = new w(w0Var);
            return this;
        }

        public b n(boolean z) {
            P2.a.f(!this.E);
            this.t = z;
            return this;
        }

        public b(Context context, s7.s sVar, s7.s sVar2) {
            this(context, sVar, sVar2, new z(context), new A(), new B(context), new C());
        }

        public b(Context context, s7.s sVar, s7.s sVar2, s7.s sVar3, s7.s sVar4, s7.s sVar5, s7.g gVar) {
            this.a = (Context) P2.a.e(context);
            this.d = sVar;
            this.e = sVar2;
            this.f = sVar3;
            this.g = sVar4;
            this.h = sVar5;
            this.i = gVar;
            this.j = P2.K.U();
            this.l = M2.b.g;
            this.n = 0;
            this.r = 1;
            this.s = 0;
            this.t = true;
            this.u = a1.g;
            this.v = 5000L;
            this.w = 15000L;
            this.x = 3000L;
            this.y = new q.b().a();
            this.b = P2.c.a;
            this.z = 500L;
            this.A = 2000L;
            this.C = true;
            this.G = "";
            this.k = -1000;
        }

        public static /* synthetic */ Z0 i(Z0 z0) {
            return z0;
        }

        public static /* synthetic */ w0 k(w0 w0Var) {
            return w0Var;
        }
    }

    public interface a {
        void D(boolean z);

        default void B(boolean z) {
        }
    }
}
