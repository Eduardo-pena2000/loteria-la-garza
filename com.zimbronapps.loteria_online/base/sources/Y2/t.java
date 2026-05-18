package Y2;

import android.os.Handler;
import g3.w;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface t {

    public static class a {
        public final int a;
        public final w.b b;
        public final CopyOnWriteArrayList c;

        public static final class a {
            public Handler a;
            public t b;

            public a(Handler handler, t tVar) {
                this.a = handler;
                this.b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void a(a aVar, t tVar) {
            aVar.p(tVar);
        }

        public static /* synthetic */ void b(a aVar, t tVar) {
            aVar.s(tVar);
        }

        public static /* synthetic */ void c(a aVar, t tVar, int i) {
            aVar.q(tVar, i);
        }

        public static /* synthetic */ void d(a aVar, t tVar) {
            aVar.n(tVar);
        }

        public static /* synthetic */ void e(a aVar, t tVar, Exception exc) {
            aVar.r(tVar, exc);
        }

        public static /* synthetic */ void f(a aVar, t tVar) {
            aVar.o(tVar);
        }

        public void g(Handler handler, t tVar) {
            P2.a.e(handler);
            P2.a.e(tVar);
            this.c.add(new a(handler, tVar));
        }

        public void h() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                P2.K.T0(aVar.a, new s(this, aVar.b));
            }
        }

        public void i() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                P2.K.T0(aVar.a, new q(this, aVar.b));
            }
        }

        public void j() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                P2.K.T0(aVar.a, new r(this, aVar.b));
            }
        }

        public void k(int i) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                P2.K.T0(aVar.a, new o(this, aVar.b, i));
            }
        }

        public void l(Exception exc) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                P2.K.T0(aVar.a, new n(this, aVar.b, exc));
            }
        }

        public void m() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                P2.K.T0(aVar.a, new p(this, aVar.b));
            }
        }

        public final /* synthetic */ void n(t tVar) {
            tVar.p0(this.a, this.b);
        }

        public final /* synthetic */ void o(t tVar) {
            tVar.m0(this.a, this.b);
        }

        public final /* synthetic */ void p(t tVar) {
            tVar.l0(this.a, this.b);
        }

        public final /* synthetic */ void q(t tVar, int i) {
            tVar.i0(this.a, this.b);
            tVar.X(this.a, this.b, i);
        }

        public final /* synthetic */ void r(t tVar, Exception exc) {
            tVar.Y(this.a, this.b, exc);
        }

        public final /* synthetic */ void s(t tVar) {
            tVar.f0(this.a, this.b);
        }

        public void t(t tVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.b == tVar) {
                    this.c.remove(aVar);
                }
            }
        }

        public a u(int i, w.b bVar) {
            return new a(this.c, i, bVar);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i, w.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    void X(int i, w.b bVar, int i2);

    void Y(int i, w.b bVar, Exception exc);

    void f0(int i, w.b bVar);

    void l0(int i, w.b bVar);

    void m0(int i, w.b bVar);

    void p0(int i, w.b bVar);

    default void i0(int i, w.b bVar) {
    }
}
