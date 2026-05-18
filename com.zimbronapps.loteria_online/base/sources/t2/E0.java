package T2;

import M2.C;
import M2.G;
import M2.l;
import T2.R0;
import T2.U0;
import T2.b;
import T2.d1;
import T2.m;
import T2.s0;
import T2.v;
import U2.v1;
import U2.x1;
import V2.y;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import g3.S;
import g3.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e0 extends M2.f implements v {
    public final T2.b A;
    public final m B;
    public final d1 C;
    public final f1 D;
    public final g1 E;
    public final long F;
    public AudioManager G;
    public final boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public a1 N;
    public g3.S O;
    public v.c P;
    public boolean Q;
    public C.b R;
    public M2.w S;
    public M2.w T;
    public M2.q U;
    public M2.q V;
    public AudioTrack W;
    public Object X;
    public Surface Y;
    public SurfaceHolder Z;
    public boolean a0;
    public final j3.D b;
    public TextureView b0;
    public final C.b c;
    public int c0;
    public final P2.f d;
    public int d0;
    public final Context e;
    public P2.A e0;
    public final M2.C f;
    public o f0;
    public final W0[] g;
    public o g0;
    public final j3.C h;
    public int h0;
    public final P2.k i;
    public M2.b i0;
    public final s0.f j;
    public float j0;
    public final s0 k;
    public boolean k0;
    public final P2.n l;
    public O2.b l0;
    public final CopyOnWriteArraySet m;
    public boolean m0;
    public final G.b n;
    public boolean n0;
    public final List o;
    public int o0;
    public final boolean p;
    public boolean p0;
    public final w.a q;
    public boolean q0;
    public final U2.a r;
    public M2.l r0;
    public final Looper s;
    public M2.N s0;
    public final k3.d t;
    public M2.w t0;
    public final long u;
    public T0 u0;
    public final long v;
    public int v0;
    public final long w;
    public int w0;
    public final P2.c x;
    public long x0;
    public final d y;
    public final e z;

    public static final class b {
        public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!P2.K.F0(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i = P2.K.a;
                if (i >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    public static final class c {
        public static x1 a(Context context, e0 e0Var, boolean z, String str) {
            v1 x0 = v1.x0(context);
            if (x0 == null) {
                P2.o.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new x1(f0.a(), str);
            }
            if (z) {
                e0Var.e1(x0);
            }
            return new x1(x0.E0(), str);
        }
    }

    public final class d implements m3.C, V2.x, i3.h, d3.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, m.b, b.b, d1.b, v.a {
        public d() {
        }

        public static /* synthetic */ void G(int i, boolean z, C.d dVar) {
            U(i, z, dVar);
        }

        public static /* synthetic */ void H(List list, C.d dVar) {
            O(list, dVar);
        }

        public static /* synthetic */ void I(M2.x xVar, C.d dVar) {
            R(xVar, dVar);
        }

        public static /* synthetic */ void J(O2.b bVar, C.d dVar) {
            P(bVar, dVar);
        }

        public static /* synthetic */ void K(M2.N n, C.d dVar) {
            V(n, dVar);
        }

        public static /* synthetic */ void L(M2.l lVar, C.d dVar) {
            T(lVar, dVar);
        }

        public static /* synthetic */ void M(boolean z, C.d dVar) {
            S(z, dVar);
        }

        public static /* synthetic */ void N(d dVar, C.d dVar2) {
            dVar.Q(dVar2);
        }

        public static /* synthetic */ void O(List list, C.d dVar) {
            dVar.o(list);
        }

        public static /* synthetic */ void P(O2.b bVar, C.d dVar) {
            dVar.i(bVar);
        }

        public static /* synthetic */ void R(M2.x xVar, C.d dVar) {
            dVar.h(xVar);
        }

        public static /* synthetic */ void S(boolean z, C.d dVar) {
            dVar.a(z);
        }

        public static /* synthetic */ void T(M2.l lVar, C.d dVar) {
            dVar.M(lVar);
        }

        public static /* synthetic */ void U(int i, boolean z, C.d dVar) {
            dVar.N(i, z);
        }

        public static /* synthetic */ void V(M2.N n, C.d dVar) {
            dVar.c(n);
        }

        public void A() {
            e0.P0(e0.this, false, -1, 3);
        }

        public void C(int i, boolean z) {
            e0.c1(e0.this).k(30, new l0(i, z));
        }

        public void D(boolean z) {
            e0.U0(e0.this);
        }

        public void E(float f) {
            e0.N0(e0.this);
        }

        public void F(int i) {
            e0.P0(e0.this, e0.this.z(), i, e0.O0(i));
        }

        public final /* synthetic */ void Q(C.d dVar) {
            dVar.O(e0.H0(e0.this));
        }

        public void a(boolean z) {
            if (e0.B0(e0.this) == z) {
                return;
            }
            e0.C0(e0.this, z);
            e0.c1(e0.this).k(23, new o0(z));
        }

        public void b(Exception exc) {
            e0.Z0(e0.this).b(exc);
        }

        public void c(M2.N n) {
            e0.b1(e0.this, n);
            e0.c1(e0.this).k(25, new m0(n));
        }

        public void d(y.a aVar) {
            e0.Z0(e0.this).d(aVar);
        }

        public void e(y.a aVar) {
            e0.Z0(e0.this).e(aVar);
        }

        public void f(String str) {
            e0.Z0(e0.this).f(str);
        }

        public void g(String str, long j, long j2) {
            e0.Z0(e0.this).g(str, j, j2);
        }

        public void h(M2.x xVar) {
            e0 e0Var = e0.this;
            e0.F0(e0Var, e0.E0(e0Var).a().L(xVar).I());
            M2.w G0 = e0.G0(e0.this);
            if (!G0.equals(e0.H0(e0.this))) {
                e0.I0(e0.this, G0);
                e0.c1(e0.this).i(14, new h0(this));
            }
            e0.c1(e0.this).i(28, new i0(xVar));
            e0.c1(e0.this).f();
        }

        public void i(O2.b bVar) {
            e0.D0(e0.this, bVar);
            e0.c1(e0.this).k(27, new g0(bVar));
        }

        public void j(String str) {
            e0.Z0(e0.this).j(str);
        }

        public void k(M2.q qVar, p pVar) {
            e0.A0(e0.this, qVar);
            e0.Z0(e0.this).k(qVar, pVar);
        }

        public void l(String str, long j, long j2) {
            e0.Z0(e0.this).l(str, j, j2);
        }

        public void m(int i) {
            M2.l R0 = e0.R0(e0.Q0(e0.this));
            if (R0.equals(e0.S0(e0.this))) {
                return;
            }
            e0.T0(e0.this, R0);
            e0.c1(e0.this).k(29, new k0(R0));
        }

        public void n(o oVar) {
            e0.Y0(e0.this, oVar);
            e0.Z0(e0.this).n(oVar);
        }

        public void o(List list) {
            e0.c1(e0.this).k(27, new j0(list));
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            e0.M0(e0.this, surfaceTexture);
            e0.L0(e0.this, i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            e0.K0(e0.this, null);
            e0.L0(e0.this, 0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            e0.L0(e0.this, i, i2);
        }

        public void p(long j) {
            e0.Z0(e0.this).p(j);
        }

        public void q(M2.q qVar, p pVar) {
            e0.a1(e0.this, qVar);
            e0.Z0(e0.this).q(qVar, pVar);
        }

        public void r(Exception exc) {
            e0.Z0(e0.this).r(exc);
        }

        public void s(o oVar) {
            e0.Z0(e0.this).s(oVar);
            e0.A0(e0.this, null);
            e0.z0(e0.this, null);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            e0.L0(e0.this, i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (e0.J0(e0.this)) {
                e0.K0(e0.this, surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (e0.J0(e0.this)) {
                e0.K0(e0.this, null);
            }
            e0.L0(e0.this, 0, 0);
        }

        public void t(o oVar) {
            e0.z0(e0.this, oVar);
            e0.Z0(e0.this).t(oVar);
        }

        public void u(int i, long j) {
            e0.Z0(e0.this).u(i, j);
        }

        public void v(Object obj, long j) {
            e0.Z0(e0.this).v(obj, j);
            if (e0.d1(e0.this) == obj) {
                e0.c1(e0.this).k(26, new n0());
            }
        }

        public void w(o oVar) {
            e0.Z0(e0.this).w(oVar);
            e0.a1(e0.this, null);
            e0.Y0(e0.this, null);
        }

        public void x(Exception exc) {
            e0.Z0(e0.this).x(exc);
        }

        public void y(int i, long j, long j2) {
            e0.Z0(e0.this).y(i, j, j2);
        }

        public void z(long j, int i) {
            e0.Z0(e0.this).z(j, i);
        }

        public /* synthetic */ d(e0 e0Var, a aVar) {
            this();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public static final class e implements m3.n, n3.a, U0.b {
        public m3.n a;
        public n3.a b;
        public m3.n c;
        public n3.a d;

        public e() {
        }

        public void a(long j, long j2, M2.q qVar, MediaFormat mediaFormat) {
            m3.n nVar = this.c;
            if (nVar != null) {
                nVar.a(j, j2, qVar, mediaFormat);
            }
            m3.n nVar2 = this.a;
            if (nVar2 != null) {
                nVar2.a(j, j2, qVar, mediaFormat);
            }
        }

        public void c(long j, float[] fArr) {
            n3.a aVar = this.d;
            if (aVar != null) {
                aVar.c(j, fArr);
            }
            n3.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.c(j, fArr);
            }
        }

        public void d() {
            n3.a aVar = this.d;
            if (aVar != null) {
                aVar.d();
            }
            n3.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.d();
            }
        }

        public void v(int i, Object obj) {
            if (i == 7) {
                this.a = (m3.n) obj;
                return;
            }
            if (i == 8) {
                this.b = (n3.a) obj;
            } else {
                if (i != 10000) {
                    return;
                }
                android.support.v4.media.session.b.a(obj);
                this.c = null;
                this.d = null;
            }
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public static final class f implements D0 {
        public final Object a;
        public final g3.w b;
        public M2.G c;

        public f(Object obj, g3.t tVar) {
            this.a = obj;
            this.b = tVar;
            this.c = tVar.Z();
        }

        public M2.G a() {
            return this.c;
        }

        public Object b() {
            return this.a;
        }

        public void c(M2.G g) {
            this.c = g;
        }
    }

    public final class g extends AudioDeviceCallback {
        public g() {
        }

        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (e0.V0(e0.this) && e0.W0(e0.this).n == 3) {
                e0 e0Var = e0.this;
                e0.X0(e0Var, e0.W0(e0Var).l, 1, 0);
            }
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (e0.V0(e0.this)) {
                return;
            }
            e0 e0Var = e0.this;
            e0.X0(e0Var, e0.W0(e0Var).l, 1, 3);
        }

        public /* synthetic */ g(e0 e0Var, a aVar) {
            this();
        }
    }

    static {
        M2.v.a("media3.exoplayer");
    }

    public e0(v.b bVar, M2.C c2) {
        boolean z;
        d1 d1Var;
        P2.f fVar = new P2.f();
        this.d = fVar;
        try {
            P2.o.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + P2.K.e + "]");
            Context applicationContext = bVar.a.getApplicationContext();
            this.e = applicationContext;
            U2.a aVar = (U2.a) bVar.i.apply(bVar.b);
            this.r = aVar;
            this.o0 = bVar.k;
            this.i0 = bVar.l;
            this.c0 = bVar.r;
            this.d0 = bVar.s;
            this.k0 = bVar.p;
            this.F = bVar.A;
            d dVar = new d(this, null);
            this.y = dVar;
            e eVar = new e(null);
            this.z = eVar;
            Handler handler = new Handler(bVar.j);
            W0[] a2 = ((Z0) bVar.d.get()).a(handler, dVar, dVar, dVar, dVar);
            this.g = a2;
            P2.a.f(a2.length > 0);
            j3.C c3 = (j3.C) bVar.f.get();
            this.h = c3;
            this.q = (w.a) bVar.e.get();
            k3.d dVar2 = (k3.d) bVar.h.get();
            this.t = dVar2;
            this.p = bVar.t;
            this.N = bVar.u;
            this.u = bVar.v;
            this.v = bVar.w;
            this.w = bVar.x;
            this.Q = bVar.B;
            Looper looper = bVar.j;
            this.s = looper;
            P2.c cVar = bVar.b;
            this.x = cVar;
            M2.C c4 = c2 == null ? this : c2;
            this.f = c4;
            boolean z2 = bVar.F;
            this.H = z2;
            this.l = new P2.n(looper, cVar, new N(this));
            this.m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.O = new S.a(0);
            this.P = v.c.b;
            j3.D d2 = new j3.D(new Y0[a2.length], new j3.x[a2.length], M2.J.b, null);
            this.b = d2;
            this.n = new G.b();
            C.b e2 = new C.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, c3.h()).d(23, bVar.q).d(25, bVar.q).d(33, bVar.q).d(26, bVar.q).d(34, bVar.q).e();
            this.c = e2;
            this.R = new C.b.a().b(e2).a(4).a(10).e();
            this.i = cVar.d(looper, null);
            P p = new P(this);
            this.j = p;
            this.u0 = T0.k(d2);
            aVar.T(c4, looper);
            int i = P2.K.a;
            s0 s0Var = new s0(a2, c3, d2, (w0) bVar.g.get(), dVar2, this.I, this.J, aVar, this.N, bVar.y, bVar.z, this.Q, bVar.H, looper, cVar, p, i < 31 ? new x1(bVar.G) : c.a(applicationContext, this, bVar.C, bVar.G), bVar.D, this.P);
            this.k = s0Var;
            this.j0 = 1.0f;
            this.I = 0;
            M2.w wVar = M2.w.H;
            this.S = wVar;
            this.T = wVar;
            this.t0 = wVar;
            this.v0 = -1;
            if (i < 21) {
                z = false;
                this.h0 = B1(0);
            } else {
                z = false;
                this.h0 = P2.K.J(applicationContext);
            }
            this.l0 = O2.b.c;
            this.m0 = true;
            l(aVar);
            dVar2.g(new Handler(looper), aVar);
            f1(dVar);
            long j = bVar.c;
            if (j > 0) {
                s0Var.C(j);
            }
            T2.b bVar2 = new T2.b(bVar.a, handler, dVar);
            this.A = bVar2;
            bVar2.b(bVar.o);
            m mVar = new m(bVar.a, handler, dVar);
            this.B = mVar;
            mVar.m(bVar.m ? this.i0 : null);
            if (!z2 || i < 23) {
                d1Var = null;
            } else {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.G = audioManager;
                d1Var = null;
                b.b(audioManager, new g(this, null), new Handler(looper));
            }
            if (bVar.q) {
                d1 d1Var2 = new d1(bVar.a, handler, dVar);
                this.C = d1Var2;
                d1Var2.h(P2.K.k0(this.i0.c));
            } else {
                this.C = d1Var;
            }
            f1 f1Var = new f1(bVar.a);
            this.D = f1Var;
            f1Var.a(bVar.n != 0 ? true : z);
            g1 g1Var = new g1(bVar.a);
            this.E = g1Var;
            g1Var.a(bVar.n == 2 ? true : z);
            this.r0 = k1(this.C);
            this.s0 = M2.N.e;
            this.e0 = P2.A.c;
            c3.l(this.i0);
            k2(1, 10, Integer.valueOf(this.h0));
            k2(2, 10, Integer.valueOf(this.h0));
            k2(1, 3, this.i0);
            k2(2, 4, Integer.valueOf(this.c0));
            k2(2, 5, Integer.valueOf(this.d0));
            k2(1, 9, Boolean.valueOf(this.k0));
            k2(2, 7, eVar);
            k2(6, 8, eVar);
            l2(16, Integer.valueOf(this.o0));
            fVar.e();
        } catch (Throwable th) {
            this.d.e();
            throw th;
        }
    }

    public static /* synthetic */ M2.q A0(e0 e0Var, M2.q qVar) {
        e0Var.V = qVar;
        return qVar;
    }

    public static /* synthetic */ boolean B0(e0 e0Var) {
        return e0Var.k0;
    }

    public static /* synthetic */ boolean C0(e0 e0Var, boolean z) {
        e0Var.k0 = z;
        return z;
    }

    public static /* synthetic */ O2.b D0(e0 e0Var, O2.b bVar) {
        e0Var.l0 = bVar;
        return bVar;
    }

    public static /* synthetic */ void D1(int i, int i2, C.d dVar) {
        dVar.W(i, i2);
    }

    public static /* synthetic */ M2.w E0(e0 e0Var) {
        return e0Var.t0;
    }

    public static /* synthetic */ M2.w F0(e0 e0Var, M2.w wVar) {
        e0Var.t0 = wVar;
        return wVar;
    }

    public static /* synthetic */ M2.w G0(e0 e0Var) {
        return e0Var.i1();
    }

    public static /* synthetic */ M2.w H0(e0 e0Var) {
        return e0Var.S;
    }

    public static /* synthetic */ void H1(C.d dVar) {
        dVar.k0(u.d(new t0(1), 1003));
    }

    public static /* synthetic */ M2.w I0(e0 e0Var, M2.w wVar) {
        e0Var.S = wVar;
        return wVar;
    }

    public static /* synthetic */ void I1(M2.b bVar, C.d dVar) {
        dVar.q0(bVar);
    }

    public static /* synthetic */ boolean J0(e0 e0Var) {
        return e0Var.a0;
    }

    public static /* synthetic */ void J1(int i, C.d dVar) {
        dVar.j0(i);
    }

    public static /* synthetic */ void K0(e0 e0Var, Object obj) {
        e0Var.q2(obj);
    }

    public static /* synthetic */ void K1(boolean z, C.d dVar) {
        dVar.H(z);
    }

    public static /* synthetic */ void L0(e0 e0Var, int i, int i2) {
        e0Var.f2(i, i2);
    }

    public static /* synthetic */ void L1(boolean z, C.d dVar) {
        dVar.a(z);
    }

    public static /* synthetic */ void M0(e0 e0Var, SurfaceTexture surfaceTexture) {
        e0Var.p2(surfaceTexture);
    }

    public static /* synthetic */ void M1(M2.I i, C.d dVar) {
        dVar.J(i);
    }

    public static /* synthetic */ void N0(e0 e0Var) {
        e0Var.m2();
    }

    public static /* synthetic */ void N1(float f2, C.d dVar) {
        dVar.c0(f2);
    }

    public static /* synthetic */ int O0(int i) {
        return u1(i);
    }

    public static /* synthetic */ void P0(e0 e0Var, boolean z, int i, int i2) {
        e0Var.t2(z, i, i2);
    }

    public static /* synthetic */ void P1(T0 t0, int i, C.d dVar) {
        dVar.F(t0.a, i);
    }

    public static /* synthetic */ d1 Q0(e0 e0Var) {
        return e0Var.C;
    }

    public static /* synthetic */ void Q1(int i, C.e eVar, C.e eVar2, C.d dVar) {
        dVar.Z(i);
        dVar.C(eVar, eVar2, i);
    }

    public static /* synthetic */ M2.l R0(d1 d1Var) {
        return k1(d1Var);
    }

    public static /* synthetic */ void R1(M2.u uVar, int i, C.d dVar) {
        dVar.K(uVar, i);
    }

    public static /* synthetic */ M2.l S0(e0 e0Var) {
        return e0Var.r0;
    }

    public static /* synthetic */ void S1(T0 t0, C.d dVar) {
        dVar.S(t0.f);
    }

    public static /* synthetic */ M2.l T0(e0 e0Var, M2.l lVar) {
        e0Var.r0 = lVar;
        return lVar;
    }

    public static /* synthetic */ void T1(T0 t0, C.d dVar) {
        dVar.k0(t0.f);
    }

    public static /* synthetic */ void U0(e0 e0Var) {
        e0Var.x2();
    }

    public static /* synthetic */ void U1(T0 t0, C.d dVar) {
        dVar.U(t0.i.d);
    }

    public static /* synthetic */ boolean V0(e0 e0Var) {
        return e0Var.A1();
    }

    public static /* synthetic */ void V1(M2.w wVar, C.d dVar) {
        dVar.O(wVar);
    }

    public static /* synthetic */ T0 W0(e0 e0Var) {
        return e0Var.u0;
    }

    public static /* synthetic */ void W1(T0 t0, C.d dVar) {
        dVar.B(t0.g);
        dVar.b0(t0.g);
    }

    public static /* synthetic */ void X0(e0 e0Var, boolean z, int i, int i2) {
        e0Var.v2(z, i, i2);
    }

    public static /* synthetic */ void X1(T0 t0, C.d dVar) {
        dVar.g0(t0.l, t0.e);
    }

    public static /* synthetic */ o Y0(e0 e0Var, o oVar) {
        e0Var.f0 = oVar;
        return oVar;
    }

    public static /* synthetic */ void Y1(T0 t0, C.d dVar) {
        dVar.D(t0.e);
    }

    public static /* synthetic */ void Z(T0 t0, C.d dVar) {
        Y1(t0, dVar);
    }

    public static /* synthetic */ U2.a Z0(e0 e0Var) {
        return e0Var.r;
    }

    public static /* synthetic */ void Z1(T0 t0, C.d dVar) {
        dVar.n0(t0.l, t0.m);
    }

    public static /* synthetic */ void a0(e0 e0Var, C.d dVar) {
        e0Var.O1(dVar);
    }

    public static /* synthetic */ M2.q a1(e0 e0Var, M2.q qVar) {
        e0Var.U = qVar;
        return qVar;
    }

    public static /* synthetic */ void a2(T0 t0, C.d dVar) {
        dVar.A(t0.n);
    }

    public static /* synthetic */ void b0(int i, C.d dVar) {
        J1(i, dVar);
    }

    public static /* synthetic */ M2.N b1(e0 e0Var, M2.N n) {
        e0Var.s0 = n;
        return n;
    }

    public static /* synthetic */ void b2(T0 t0, C.d dVar) {
        dVar.r0(t0.n());
    }

    public static /* synthetic */ void c0(T0 t0, C.d dVar) {
        c2(t0, dVar);
    }

    public static /* synthetic */ P2.n c1(e0 e0Var) {
        return e0Var.l;
    }

    public static /* synthetic */ void c2(T0 t0, C.d dVar) {
        dVar.m(t0.o);
    }

    public static /* synthetic */ void d0(T0 t0, C.d dVar) {
        a2(t0, dVar);
    }

    public static /* synthetic */ Object d1(e0 e0Var) {
        return e0Var.X;
    }

    public static /* synthetic */ void e0(int i, C.e eVar, C.e eVar2, C.d dVar) {
        Q1(i, eVar, eVar2, dVar);
    }

    public static /* synthetic */ void f0(boolean z, C.d dVar) {
        L1(z, dVar);
    }

    public static /* synthetic */ void g0(boolean z, C.d dVar) {
        K1(z, dVar);
    }

    public static /* synthetic */ void h0(e0 e0Var, C.d dVar, M2.p pVar) {
        e0Var.E1(dVar, pVar);
    }

    public static /* synthetic */ void i0(T0 t0, C.d dVar) {
        T1(t0, dVar);
    }

    public static /* synthetic */ void j0(T0 t0, C.d dVar) {
        S1(t0, dVar);
    }

    public static /* synthetic */ void k0(float f2, C.d dVar) {
        N1(f2, dVar);
    }

    public static M2.l k1(d1 d1Var) {
        return new l.b(0).g(d1Var != null ? d1Var.d() : 0).f(d1Var != null ? d1Var.c() : 0).e();
    }

    public static /* synthetic */ void l0(int i, int i2, C.d dVar) {
        D1(i, i2, dVar);
    }

    public static /* synthetic */ void m0(T0 t0, C.d dVar) {
        Z1(t0, dVar);
    }

    public static /* synthetic */ void n0(T0 t0, C.d dVar) {
        W1(t0, dVar);
    }

    public static /* synthetic */ void o0(M2.u uVar, int i, C.d dVar) {
        R1(uVar, i, dVar);
    }

    public static /* synthetic */ void p0(M2.b bVar, C.d dVar) {
        I1(bVar, dVar);
    }

    public static /* synthetic */ void q0(M2.w wVar, C.d dVar) {
        V1(wVar, dVar);
    }

    public static /* synthetic */ void r0(T0 t0, C.d dVar) {
        b2(t0, dVar);
    }

    public static /* synthetic */ void s0(M2.I i, C.d dVar) {
        M1(i, dVar);
    }

    public static /* synthetic */ void t0(e0 e0Var, s0.e eVar) {
        e0Var.F1(eVar);
    }

    public static /* synthetic */ void u0(T0 t0, int i, C.d dVar) {
        P1(t0, i, dVar);
    }

    public static int u1(int i) {
        return i == -1 ? 2 : 1;
    }

    public static /* synthetic */ void v0(e0 e0Var, s0.e eVar) {
        e0Var.G1(eVar);
    }

    public static /* synthetic */ void w0(C.d dVar) {
        H1(dVar);
    }

    public static /* synthetic */ void x0(T0 t0, C.d dVar) {
        X1(t0, dVar);
    }

    public static /* synthetic */ void y0(T0 t0, C.d dVar) {
        U1(t0, dVar);
    }

    public static long y1(T0 t0) {
        G.c cVar = new G.c();
        G.b bVar = new G.b();
        t0.a.h(t0.b.a, bVar);
        return t0.c == -9223372036854775807L ? t0.a.n(bVar.c, cVar).c() : bVar.n() + t0.c;
    }

    public static /* synthetic */ o z0(e0 e0Var, o oVar) {
        e0Var.g0 = oVar;
        return oVar;
    }

    public void A(boolean z) {
        y2();
        if (this.J != z) {
            this.J = z;
            this.k.l1(z);
            this.l.i(9, new M(z));
            s2();
            this.l.f();
        }
    }

    public final boolean A1() {
        AudioManager audioManager = this.G;
        if (audioManager == null || P2.K.a < 23) {
            return true;
        }
        return b.a(this.e, audioManager.getDevices(2));
    }

    public void B(g3.S s) {
        y2();
        P2.a.a(s.a() == this.o.size());
        this.O = s;
        M2.G l1 = l1();
        T0 d2 = d2(this.u0, l1, e2(l1, L(), getCurrentPosition()));
        this.K++;
        this.k.n1(s);
        u2(d2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final int B1(int i) {
        AudioTrack audioTrack = this.W;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.W.release();
            this.W = null;
        }
        if (this.W == null) {
            this.W = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.W.getAudioSessionId();
    }

    public void C(int i, List list) {
        y2();
        P2.a.a(i >= 0);
        int min = Math.min(i, this.o.size());
        if (this.o.isEmpty()) {
            n2(list, this.v0 == -1);
        } else {
            u2(h1(this.u0, min, list), 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public boolean C1() {
        y2();
        return this.u0.p;
    }

    public int D() {
        y2();
        if (this.u0.a.q()) {
            return this.w0;
        }
        T0 t0 = this.u0;
        return t0.a.b(t0.b.a);
    }

    public final /* synthetic */ void E1(C.d dVar, M2.p pVar) {
        dVar.d0(this.f, new C.c(pVar));
    }

    public int F() {
        y2();
        if (h()) {
            return this.u0.b.c;
        }
        return -1;
    }

    public long G() {
        y2();
        return q1(this.u0);
    }

    public final /* synthetic */ void G1(s0.e eVar) {
        this.i.i(new U(this, eVar));
    }

    public long H() {
        y2();
        if (!h()) {
            return p1();
        }
        T0 t0 = this.u0;
        return t0.k.equals(t0.b) ? P2.K.j1(this.u0.q) : getDuration();
    }

    public int J() {
        y2();
        return this.u0.e;
    }

    public void K(M2.b bVar, boolean z) {
        y2();
        if (this.q0) {
            return;
        }
        if (!P2.K.c(this.i0, bVar)) {
            this.i0 = bVar;
            k2(1, 3, bVar);
            d1 d1Var = this.C;
            if (d1Var != null) {
                d1Var.h(P2.K.k0(bVar.c));
            }
            this.l.i(20, new Q(bVar));
        }
        this.B.m(z ? bVar : null);
        this.h.l(bVar);
        boolean z2 = z();
        int p = this.B.p(z2, J());
        t2(z2, p, u1(p));
        this.l.f();
    }

    public int L() {
        y2();
        int s1 = s1(this.u0);
        if (s1 == -1) {
            return 0;
        }
        return s1;
    }

    public void M(int i) {
        y2();
        if (this.I != i) {
            this.I = i;
            this.k.i1(i);
            this.l.i(8, new L(i));
            s2();
            this.l.f();
        }
    }

    public void O(int i, int i2, int i3) {
        y2();
        P2.a.a(i >= 0 && i <= i2 && i3 >= 0);
        int size = this.o.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i >= size || i == min || i == min2) {
            return;
        }
        M2.G v = v();
        this.K++;
        P2.K.J0(this.o, i, min, min2);
        M2.G l1 = l1();
        T0 t0 = this.u0;
        T0 d2 = d2(t0, l1, t1(v, l1, s1(t0), q1(this.u0)));
        this.k.o0(i, min, min2, this.O);
        u2(d2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final /* synthetic */ void O1(C.d dVar) {
        dVar.L(this.R);
    }

    public int P() {
        y2();
        return this.I;
    }

    public boolean Q() {
        y2();
        return this.J;
    }

    public void W(int i, long j, int i2, boolean z) {
        y2();
        if (i == -1) {
            return;
        }
        P2.a.a(i >= 0);
        M2.G g2 = this.u0.a;
        if (g2.q() || i < g2.p()) {
            this.r.G();
            this.K++;
            if (h()) {
                P2.o.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                s0.e eVar = new s0.e(this.u0);
                eVar.b(1);
                this.j.a(eVar);
                return;
            }
            T0 t0 = this.u0;
            int i3 = t0.e;
            if (i3 == 3 || (i3 == 4 && !g2.q())) {
                t0 = this.u0.h(2);
            }
            int L = L();
            T0 d2 = d2(t0, g2, e2(g2, i, j));
            this.k.N0(g2, i, P2.K.K0(j));
            u2(d2, 0, true, 1, r1(d2), L, z);
        }
    }

    public M2.B c() {
        y2();
        return this.u0.o;
    }

    public void d(M2.B b2) {
        y2();
        if (b2 == null) {
            b2 = M2.B.d;
        }
        if (this.u0.o.equals(b2)) {
            return;
        }
        T0 g2 = this.u0.g(b2);
        this.K++;
        this.k.f1(b2);
        u2(g2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final T0 d2(T0 t0, M2.G g2, Pair pair) {
        P2.a.a(g2.q() || pair != null);
        M2.G g3 = t0.a;
        long q1 = q1(t0);
        T0 j = t0.j(g2);
        if (g2.q()) {
            w.b l = T0.l();
            long K0 = P2.K.K0(this.x0);
            T0 c2 = j.d(l, K0, K0, K0, 0L, g3.Y.d, this.b, t7.r.s()).c(l);
            c2.q = c2.s;
            return c2;
        }
        Object obj = j.b.a;
        boolean equals = obj.equals(((Pair) P2.K.i(pair)).first);
        w.b bVar = !equals ? new w.b(pair.first) : j.b;
        long longValue = ((Long) pair.second).longValue();
        long K02 = P2.K.K0(q1);
        if (!g3.q()) {
            K02 -= g3.h(obj, this.n).n();
        }
        if (!equals || longValue < K02) {
            P2.a.f(!bVar.b());
            T0 c3 = j.d(bVar, longValue, longValue, longValue, 0L, !equals ? g3.Y.d : j.h, !equals ? this.b : j.i, !equals ? t7.r.s() : j.j).c(bVar);
            c3.q = longValue;
            return c3;
        }
        if (longValue == K02) {
            int b2 = g2.b(j.k.a);
            if (b2 == -1 || g2.f(b2, this.n).c != g2.h(bVar.a, this.n).c) {
                g2.h(bVar.a, this.n);
                long b3 = bVar.b() ? this.n.b(bVar.b, bVar.c) : this.n.d;
                j = j.d(bVar, j.s, j.s, j.d, b3 - j.s, j.h, j.i, j.j).c(bVar);
                j.q = b3;
            }
        } else {
            P2.a.f(!bVar.b());
            long max = Math.max(0L, j.r - (longValue - K02));
            long j2 = j.q;
            if (j.k.equals(j.b)) {
                j2 = longValue + max;
            }
            j = j.d(bVar, longValue, longValue, longValue, max, j.h, j.i, j.j);
            j.q = j2;
        }
        return j;
    }

    public void e() {
        y2();
        boolean z = z();
        int p = this.B.p(z, 2);
        t2(z, p, u1(p));
        T0 t0 = this.u0;
        if (t0.e != 1) {
            return;
        }
        T0 f2 = t0.f(null);
        T0 h = f2.h(f2.a.q() ? 4 : 2);
        this.K++;
        this.k.t0();
        u2(h, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public void e1(U2.b bVar) {
        this.r.V((U2.b) P2.a.e(bVar));
    }

    public final Pair e2(M2.G g2, int i, long j) {
        if (g2.q()) {
            this.v0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.x0 = j;
            this.w0 = 0;
            return null;
        }
        if (i == -1 || i >= g2.p()) {
            i = g2.a(this.J);
            j = g2.n(i, this.a).b();
        }
        return g2.j(this.a, this.n, i, P2.K.K0(j));
    }

    public void f(float f2) {
        y2();
        float o = P2.K.o(f2, 0.0f, 1.0f);
        if (this.j0 == o) {
            return;
        }
        this.j0 = o;
        m2();
        this.l.k(22, new J(o));
    }

    public void f1(v.a aVar) {
        this.m.add(aVar);
    }

    public final void f2(int i, int i2) {
        if (i == this.e0.b() && i2 == this.e0.a()) {
            return;
        }
        this.e0 = new P2.A(i, i2);
        this.l.k(24, new T(i, i2));
        k2(2, 14, new P2.A(i, i2));
    }

    public void g(boolean z) {
        y2();
        if (this.k0 == z) {
            return;
        }
        this.k0 = z;
        k2(1, 9, Boolean.valueOf(z));
        this.l.k(23, new I(z));
    }

    public final List g1(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            R0.c cVar = new R0.c((g3.w) list.get(i2), this.p);
            arrayList.add(cVar);
            this.o.add(i2 + i, new f(cVar.b, cVar.a));
        }
        this.O = this.O.h(i, arrayList.size());
        return arrayList;
    }

    public final long g2(M2.G g2, w.b bVar, long j) {
        g2.h(bVar.a, this.n);
        return j + this.n.n();
    }

    public int getAudioSessionId() {
        y2();
        return this.h0;
    }

    public long getCurrentPosition() {
        y2();
        return P2.K.j1(r1(this.u0));
    }

    public long getDuration() {
        y2();
        if (!h()) {
            return a();
        }
        T0 t0 = this.u0;
        w.b bVar = t0.b;
        t0.a.h(bVar.a, this.n);
        return P2.K.j1(this.n.b(bVar.b, bVar.c));
    }

    public boolean h() {
        y2();
        return this.u0.b.b();
    }

    public final T0 h1(T0 t0, int i, List list) {
        M2.G g2 = t0.a;
        this.K++;
        List g1 = g1(i, list);
        M2.G l1 = l1();
        T0 d2 = d2(t0, l1, t1(g2, l1, s1(t0), q1(t0)));
        this.k.r(i, g1, this.O);
        return d2;
    }

    public final T0 h2(T0 t0, int i, int i2) {
        int s1 = s1(t0);
        long q1 = q1(t0);
        M2.G g2 = t0.a;
        int size = this.o.size();
        this.K++;
        i2(i, i2);
        M2.G l1 = l1();
        T0 d2 = d2(t0, l1, t1(g2, l1, s1, q1));
        int i3 = d2.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && s1 >= d2.a.p()) {
            d2 = d2.h(4);
        }
        this.k.z0(i, i2, this.O);
        return d2;
    }

    public long i() {
        y2();
        return P2.K.j1(this.u0.r);
    }

    public final M2.w i1() {
        M2.G v = v();
        if (v.q()) {
            return this.t0;
        }
        return this.t0.a().K(v.n(L(), this.a).c.e).I();
    }

    public final void i2(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.o.remove(i3);
        }
        this.O = this.O.b(i, i2);
    }

    public final int j1(boolean z, int i) {
        if (i == 0) {
            return 1;
        }
        if (!this.H) {
            return 0;
        }
        if (!z || A1()) {
            return (z || this.u0.n != 3) ? 0 : 3;
        }
        return 3;
    }

    public final void j2() {
        TextureView textureView = this.b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.y) {
                P2.o.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.b0.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.b0 = null;
        }
        SurfaceHolder surfaceHolder = this.Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.y);
            this.Z = null;
        }
    }

    public void k(int i, int i2) {
        y2();
        P2.a.a(i >= 0 && i2 >= i);
        int size = this.o.size();
        int min = Math.min(i2, size);
        if (i >= size || i == min) {
            return;
        }
        T0 h2 = h2(this.u0, i, min);
        u2(h2, 0, !h2.b.a.equals(this.u0.b.a), 4, r1(h2), -1, false);
    }

    public final void k2(int i, int i2, Object obj) {
        for (W0 w0 : this.g) {
            if (i == -1 || w0.g() == i) {
                m1(w0).n(i2).m(obj).l();
            }
        }
    }

    public void l(C.d dVar) {
        this.l.c((C.d) P2.a.e(dVar));
    }

    public final M2.G l1() {
        return new V0(this.o, this.O);
    }

    public final void l2(int i, Object obj) {
        k2(-1, i, obj);
    }

    public final U0 m1(U0.b bVar) {
        int s1 = s1(this.u0);
        s0 s0Var = this.k;
        M2.G g2 = this.u0.a;
        if (s1 == -1) {
            s1 = 0;
        }
        return new U0(s0Var, bVar, g2, s1, this.x, s0Var.J());
    }

    public final void m2() {
        k2(1, 2, Float.valueOf(this.j0 * this.B.g()));
    }

    public void n(boolean z) {
        y2();
        int p = this.B.p(z, J());
        t2(z, p, u1(p));
    }

    public final Pair n1(T0 t0, T0 t02, boolean z, int i, boolean z2, boolean z3) {
        M2.G g2 = t02.a;
        M2.G g3 = t0.a;
        if (g3.q() && g2.q()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (g3.q() != g2.q()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (g2.n(g2.h(t02.b.a, this.n).c, this.a).a.equals(g3.n(g3.h(t0.b.a, this.n).c, this.a).a)) {
            return (z && i == 0 && t02.b.d < t0.b.d) ? new Pair(Boolean.TRUE, 0) : (z && i == 1 && z3) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i2));
    }

    public void n2(List list, boolean z) {
        y2();
        o2(list, -1, -9223372036854775807L, z);
    }

    public Looper o1() {
        return this.s;
    }

    public final void o2(List list, int i, long j, boolean z) {
        int i2;
        long j2;
        int s1 = s1(this.u0);
        long currentPosition = getCurrentPosition();
        this.K++;
        if (!this.o.isEmpty()) {
            i2(0, this.o.size());
        }
        List g1 = g1(0, list);
        M2.G l1 = l1();
        if (!l1.q() && i >= l1.p()) {
            throw new M2.s(l1, i, j);
        }
        if (z) {
            j2 = -9223372036854775807L;
            i2 = l1.a(this.J);
        } else if (i == -1) {
            i2 = s1;
            j2 = currentPosition;
        } else {
            i2 = i;
            j2 = j;
        }
        T0 d2 = d2(this.u0, l1, e2(l1, i2, j2));
        int i3 = d2.e;
        if (i2 != -1 && i3 != 1) {
            i3 = (l1.q() || i2 >= l1.p()) ? 4 : 2;
        }
        T0 h = d2.h(i3);
        this.k.a1(g1, i2, P2.K.K0(j2), this.O);
        u2(h, 0, (this.u0.b.a.equals(h.b.a) || this.u0.a.q()) ? false : true, 4, r1(h), -1, false);
    }

    public M2.J p() {
        y2();
        return this.u0.i.d;
    }

    public long p1() {
        y2();
        if (this.u0.a.q()) {
            return this.x0;
        }
        T0 t0 = this.u0;
        if (t0.k.d != t0.b.d) {
            return t0.a.n(L(), this.a).d();
        }
        long j = t0.q;
        if (this.u0.k.b()) {
            T0 t02 = this.u0;
            G.b h = t02.a.h(t02.k.a, this.n);
            long f2 = h.f(this.u0.k.b);
            j = f2 == Long.MIN_VALUE ? h.d : f2;
        }
        T0 t03 = this.u0;
        return P2.K.j1(g2(t03.a, t03.k, j));
    }

    public final void p2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        q2(surface);
        this.Y = surface;
    }

    public final long q1(T0 t0) {
        if (!t0.b.b()) {
            return P2.K.j1(r1(t0));
        }
        t0.a.h(t0.b.a, this.n);
        return t0.c == -9223372036854775807L ? t0.a.n(s1(t0), this.a).b() : this.n.m() + P2.K.j1(t0.c);
    }

    public final void q2(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (W0 w0 : this.g) {
            if (w0.g() == 2) {
                arrayList.add(m1(w0).n(1).m(obj).l());
            }
        }
        Object obj2 = this.X;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((U0) it.next()).a(this.F);
                }
            } catch (TimeoutException unused) {
                z = true;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
            Object obj3 = this.X;
            Surface surface = this.Y;
            if (obj3 == surface) {
                surface.release();
                this.Y = null;
            }
        }
        this.X = obj;
        if (z) {
            r2(u.d(new t0(3), 1003));
        }
    }

    public int r() {
        y2();
        if (h()) {
            return this.u0.b.b;
        }
        return -1;
    }

    public final long r1(T0 t0) {
        if (t0.a.q()) {
            return P2.K.K0(this.x0);
        }
        long m = t0.p ? t0.m() : t0.s;
        return t0.b.b() ? m : g2(t0.a, t0.b, m);
    }

    public final void r2(u uVar) {
        T0 t0 = this.u0;
        T0 c2 = t0.c(t0.b);
        c2.q = c2.s;
        c2.r = 0L;
        T0 h = c2.h(1);
        if (uVar != null) {
            h = h.f(uVar);
        }
        this.K++;
        this.k.w1();
        u2(h, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public void release() {
        AudioTrack audioTrack;
        P2.o.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + P2.K.e + "] [" + M2.v.b() + "]");
        y2();
        if (P2.K.a < 21 && (audioTrack = this.W) != null) {
            audioTrack.release();
            this.W = null;
        }
        this.A.b(false);
        d1 d1Var = this.C;
        if (d1Var != null) {
            d1Var.g();
        }
        this.D.b(false);
        this.E.b(false);
        this.B.i();
        if (!this.k.v0()) {
            this.l.k(10, new K());
        }
        this.l.j();
        this.i.f(null);
        this.t.f(this.r);
        T0 t0 = this.u0;
        if (t0.p) {
            this.u0 = t0.a();
        }
        T0 h = this.u0.h(1);
        this.u0 = h;
        T0 c2 = h.c(h.b);
        this.u0 = c2;
        c2.q = c2.s;
        this.u0.r = 0L;
        this.r.release();
        this.h.j();
        j2();
        Surface surface = this.Y;
        if (surface != null) {
            surface.release();
            this.Y = null;
        }
        if (this.p0) {
            android.support.v4.media.session.b.a(P2.a.e(null));
            throw null;
        }
        this.l0 = O2.b.c;
        this.q0 = true;
    }

    public void s(List list, int i, long j) {
        y2();
        o2(list, i, j, false);
    }

    public final int s1(T0 t0) {
        return t0.a.q() ? this.v0 : t0.a.h(t0.b.a, this.n).c;
    }

    public final void s2() {
        C.b bVar = this.R;
        C.b N = P2.K.N(this.f, this.c);
        this.R = N;
        if (N.equals(bVar)) {
            return;
        }
        this.l.i(13, new V(this));
    }

    public void stop() {
        y2();
        this.B.p(z(), 1);
        r2(null);
        this.l0 = new O2.b(t7.r.s(), this.u0.s);
    }

    public final Pair t1(M2.G g2, M2.G g3, int i, long j) {
        if (g2.q() || g3.q()) {
            boolean z = !g2.q() && g3.q();
            return e2(g3, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair j2 = g2.j(this.a, this.n, i, P2.K.K0(j));
        Object obj = ((Pair) P2.K.i(j2)).first;
        if (g3.b(obj) != -1) {
            return j2;
        }
        int L0 = s0.L0(this.a, this.n, this.I, this.J, obj, g2, g3);
        return L0 != -1 ? e2(g3, L0, g3.n(L0, this.a).b()) : e2(g3, -1, -9223372036854775807L);
    }

    public final void t2(boolean z, int i, int i2) {
        boolean z2 = z && i != -1;
        int j1 = j1(z2, i);
        T0 t0 = this.u0;
        if (t0.l == z2 && t0.n == j1 && t0.m == i2) {
            return;
        }
        v2(z2, i2, j1);
    }

    public int u() {
        y2();
        return this.u0.n;
    }

    public final void u2(T0 t0, int i, boolean z, int i2, long j, int i3, boolean z2) {
        T0 t02 = this.u0;
        this.u0 = t0;
        boolean equals = t02.a.equals(t0.a);
        Pair n1 = n1(t0, t02, z, i2, !equals, z2);
        boolean booleanValue = ((Boolean) n1.first).booleanValue();
        int intValue = ((Integer) n1.second).intValue();
        if (booleanValue) {
            r2 = t0.a.q() ? null : t0.a.n(t0.a.h(t0.b.a, this.n).c, this.a).c;
            this.t0 = M2.w.H;
        }
        if (booleanValue || !t02.j.equals(t0.j)) {
            this.t0 = this.t0.a().M(t0.j).I();
        }
        M2.w i1 = i1();
        boolean equals2 = i1.equals(this.S);
        this.S = i1;
        boolean z3 = t02.l != t0.l;
        boolean z4 = t02.e != t0.e;
        if (z4 || z3) {
            x2();
        }
        boolean z5 = t02.g;
        boolean z6 = t0.g;
        boolean z7 = z5 != z6;
        if (z7) {
            w2(z6);
        }
        if (!equals) {
            this.l.i(0, new D(t0, i));
        }
        if (z) {
            this.l.i(11, new Z(i2, x1(i2, t02, i3), w1(j)));
        }
        if (booleanValue) {
            this.l.i(1, new a0(r2, intValue));
        }
        if (t02.f != t0.f) {
            this.l.i(10, new b0(t0));
            if (t0.f != null) {
                this.l.i(10, new c0(t0));
            }
        }
        j3.D d2 = t02.i;
        j3.D d3 = t0.i;
        if (d2 != d3) {
            this.h.i(d3.e);
            this.l.i(2, new d0(t0));
        }
        if (!equals2) {
            this.l.i(14, new E(this.S));
        }
        if (z7) {
            this.l.i(3, new F(t0));
        }
        if (z4 || z3) {
            this.l.i(-1, new G(t0));
        }
        if (z4) {
            this.l.i(4, new H(t0));
        }
        if (z3 || t02.m != t0.m) {
            this.l.i(5, new O(t0));
        }
        if (t02.n != t0.n) {
            this.l.i(6, new W(t0));
        }
        if (t02.n() != t0.n()) {
            this.l.i(7, new X(t0));
        }
        if (!t02.o.equals(t0.o)) {
            this.l.i(12, new Y(t0));
        }
        s2();
        this.l.f();
        if (t02.p != t0.p) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((v.a) it.next()).D(t0.p);
            }
        }
    }

    public M2.G v() {
        y2();
        return this.u0.a;
    }

    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public u m() {
        y2();
        return this.u0.f;
    }

    public final void v2(boolean z, int i, int i2) {
        this.K++;
        T0 t0 = this.u0;
        if (t0.p) {
            t0 = t0.a();
        }
        T0 e2 = t0.e(z, i, i2);
        this.k.d1(z, i, i2);
        u2(e2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public void w(M2.I i) {
        y2();
        if (!this.h.h() || i.equals(this.h.c())) {
            return;
        }
        this.h.m(i);
        this.l.k(19, new S(i));
    }

    public final C.e w1(long j) {
        M2.u uVar;
        Object obj;
        int i;
        Object obj2;
        int L = L();
        if (this.u0.a.q()) {
            uVar = null;
            obj = null;
            i = -1;
            obj2 = null;
        } else {
            T0 t0 = this.u0;
            Object obj3 = t0.b.a;
            t0.a.h(obj3, this.n);
            i = this.u0.a.b(obj3);
            obj = obj3;
            obj2 = this.u0.a.n(L, this.a).a;
            uVar = this.a.c;
        }
        long j1 = P2.K.j1(j);
        long j12 = this.u0.b.b() ? P2.K.j1(y1(this.u0)) : j1;
        w.b bVar = this.u0.b;
        return new C.e(obj2, L, uVar, obj, i, j1, j12, bVar.b, bVar.c);
    }

    public M2.I x() {
        y2();
        return this.h.c();
    }

    public final C.e x1(int i, T0 t0, int i2) {
        int i3;
        Object obj;
        M2.u uVar;
        Object obj2;
        int i4;
        long j;
        long y1;
        G.b bVar = new G.b();
        if (t0.a.q()) {
            i3 = i2;
            obj = null;
            uVar = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = t0.b.a;
            t0.a.h(obj3, bVar);
            int i5 = bVar.c;
            int b2 = t0.a.b(obj3);
            Object obj4 = t0.a.n(i5, this.a).a;
            uVar = this.a.c;
            obj2 = obj3;
            i4 = b2;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            if (t0.b.b()) {
                w.b bVar2 = t0.b;
                j = bVar.b(bVar2.b, bVar2.c);
                y1 = y1(t0);
            } else {
                j = t0.b.e != -1 ? y1(this.u0) : bVar.e + bVar.d;
                y1 = j;
            }
        } else if (t0.b.b()) {
            j = t0.s;
            y1 = y1(t0);
        } else {
            j = bVar.e + t0.s;
            y1 = j;
        }
        long j1 = P2.K.j1(j);
        long j12 = P2.K.j1(y1);
        w.b bVar3 = t0.b;
        return new C.e(obj, i3, uVar, obj2, i4, j1, j12, bVar3.b, bVar3.c);
    }

    public final void x2() {
        int J = J();
        if (J != 1) {
            if (J == 2 || J == 3) {
                this.D.b(z() && !C1());
                this.E.b(z());
                return;
            } else if (J != 4) {
                throw new IllegalStateException();
            }
        }
        this.D.b(false);
        this.E.b(false);
    }

    public final void y2() {
        this.d.b();
        if (Thread.currentThread() != o1().getThread()) {
            String G = P2.K.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), o1().getThread().getName());
            if (this.m0) {
                throw new IllegalStateException(G);
            }
            P2.o.i("ExoPlayerImpl", G, this.n0 ? null : new IllegalStateException());
            this.n0 = true;
        }
    }

    public boolean z() {
        y2();
        return this.u0.l;
    }

    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public final void F1(s0.e eVar) {
        long j;
        int i = this.K - eVar.c;
        this.K = i;
        boolean z = true;
        if (eVar.d) {
            this.L = eVar.e;
            this.M = true;
        }
        if (i == 0) {
            M2.G g2 = eVar.b.a;
            if (!this.u0.a.q() && g2.q()) {
                this.v0 = -1;
                this.x0 = 0L;
                this.w0 = 0;
            }
            if (!g2.q()) {
                List F = ((V0) g2).F();
                P2.a.f(F.size() == this.o.size());
                for (int i2 = 0; i2 < F.size(); i2++) {
                    ((f) this.o.get(i2)).c((M2.G) F.get(i2));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.M) {
                if (eVar.b.b.equals(this.u0.b) && eVar.b.d == this.u0.s) {
                    z = false;
                }
                if (z) {
                    if (g2.q() || eVar.b.b.b()) {
                        j = eVar.b.d;
                    } else {
                        T0 t0 = eVar.b;
                        j = g2(g2, t0.b, t0.d);
                    }
                    j2 = j;
                }
            } else {
                z = false;
            }
            this.M = false;
            u2(eVar.b, 1, z, this.L, j2, -1, false);
        }
    }

    public final void w2(boolean z) {
    }
}
