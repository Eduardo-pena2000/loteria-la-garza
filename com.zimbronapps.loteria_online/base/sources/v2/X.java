package V2;

import V2.y;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface x {

    public static final class a {
        public final Handler a;
        public final x b;

        public a(Handler handler, x xVar) {
            this.a = xVar != null ? (Handler) P2.a.e(handler) : null;
            this.b = xVar;
        }

        public static /* synthetic */ void a(a aVar, boolean z) {
            aVar.F(z);
        }

        public static /* synthetic */ void b(a aVar, int i, long j, long j2) {
            aVar.G(i, j, j2);
        }

        public static /* synthetic */ void c(a aVar, T2.o oVar) {
            aVar.C(oVar);
        }

        public static /* synthetic */ void d(a aVar, T2.o oVar) {
            aVar.B(oVar);
        }

        public static /* synthetic */ void e(a aVar, long j) {
            aVar.E(j);
        }

        public static /* synthetic */ void f(a aVar, y.a aVar2) {
            aVar.y(aVar2);
        }

        public static /* synthetic */ void g(a aVar, Exception exc) {
            aVar.v(exc);
        }

        public static /* synthetic */ void h(a aVar, M2.q qVar, T2.p pVar) {
            aVar.D(qVar, pVar);
        }

        public static /* synthetic */ void i(a aVar, y.a aVar2) {
            aVar.x(aVar2);
        }

        public static /* synthetic */ void j(a aVar, Exception exc) {
            aVar.w(exc);
        }

        public static /* synthetic */ void k(a aVar, String str, long j, long j2) {
            aVar.z(str, j, j2);
        }

        public static /* synthetic */ void l(a aVar, String str) {
            aVar.A(str);
        }

        public final /* synthetic */ void A(String str) {
            ((x) P2.K.i(this.b)).j(str);
        }

        public final /* synthetic */ void B(T2.o oVar) {
            oVar.c();
            ((x) P2.K.i(this.b)).s(oVar);
        }

        public final /* synthetic */ void C(T2.o oVar) {
            ((x) P2.K.i(this.b)).t(oVar);
        }

        public final /* synthetic */ void D(M2.q qVar, T2.p pVar) {
            ((x) P2.K.i(this.b)).k(qVar, pVar);
        }

        public final /* synthetic */ void E(long j) {
            ((x) P2.K.i(this.b)).p(j);
        }

        public final /* synthetic */ void F(boolean z) {
            ((x) P2.K.i(this.b)).a(z);
        }

        public final /* synthetic */ void G(int i, long j, long j2) {
            ((x) P2.K.i(this.b)).y(i, j, j2);
        }

        public void H(long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new u(this, j));
            }
        }

        public void I(boolean z) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new w(this, z));
            }
        }

        public void J(int i, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new v(this, i, j, j2));
            }
        }

        public void m(Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new o(this, exc));
            }
        }

        public void n(Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new p(this, exc));
            }
        }

        public void o(y.a aVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new m(this, aVar));
            }
        }

        public void p(y.a aVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new n(this, aVar));
            }
        }

        public void q(String str, long j, long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new r(this, str, j, j2));
            }
        }

        public void r(String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new s(this, str));
            }
        }

        public void s(T2.o oVar) {
            oVar.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new t(this, oVar));
            }
        }

        public void t(T2.o oVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new l(this, oVar));
            }
        }

        public void u(M2.q qVar, T2.p pVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new q(this, qVar, pVar));
            }
        }

        public final /* synthetic */ void v(Exception exc) {
            ((x) P2.K.i(this.b)).x(exc);
        }

        public final /* synthetic */ void w(Exception exc) {
            ((x) P2.K.i(this.b)).b(exc);
        }

        public final /* synthetic */ void x(y.a aVar) {
            ((x) P2.K.i(this.b)).e(aVar);
        }

        public final /* synthetic */ void y(y.a aVar) {
            ((x) P2.K.i(this.b)).d(aVar);
        }

        public final /* synthetic */ void z(String str, long j, long j2) {
            ((x) P2.K.i(this.b)).l(str, j, j2);
        }
    }

    void a(boolean z);

    void b(Exception exc);

    void d(y.a aVar);

    void e(y.a aVar);

    void j(String str);

    void k(M2.q qVar, T2.p pVar);

    void l(String str, long j, long j2);

    void p(long j);

    void s(T2.o oVar);

    void t(T2.o oVar);

    void x(Exception exc);

    void y(int i, long j, long j2);
}
