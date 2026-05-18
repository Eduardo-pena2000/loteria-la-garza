package m3;

import P2.K;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q {
    public final i a = new i();
    public final b b;
    public final c c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public static final class a {
        public static void a(Surface surface, float f) {
            try {
                p.a(surface, f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                P2.o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public static final class c implements Choreographer.FrameCallback, Handler.Callback {
        public static final c f = new c();
        public volatile long a = -9223372036854775807L;
        public final Handler b;
        public final HandlerThread c;
        public Choreographer d;
        public int e;

        public c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.c = handlerThread;
            handlerThread.start();
            Handler z = K.z(handlerThread.getLooper(), this);
            this.b = z;
            z.sendEmptyMessage(1);
        }

        public static c d() {
            return f;
        }

        public void a() {
            this.b.sendEmptyMessage(2);
        }

        public final void b() {
            Choreographer choreographer = this.d;
            if (choreographer != null) {
                int i = this.e + 1;
                this.e = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public final void c() {
            try {
                this.d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                P2.o.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        public void doFrame(long j) {
            this.a = j;
            ((Choreographer) P2.a.e(this.d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.b.sendEmptyMessage(3);
        }

        public final void f() {
            Choreographer choreographer = this.d;
            if (choreographer != null) {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.a = -9223372036854775807L;
                }
            }
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                c();
                return true;
            }
            if (i == 2) {
                b();
                return true;
            }
            if (i != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public q(Context context) {
        b f = f(context);
        this.b = f;
        this.c = f != null ? c.d() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static /* synthetic */ void a(q qVar, Display display) {
        qVar.p(display);
    }

    public static boolean c(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    public static long e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    public long b(long j) {
        long j2;
        if (this.p == -1 || !this.a.e()) {
            j2 = j;
        } else {
            long a2 = this.q + ((long) ((this.a.a() * (this.m - this.p)) / this.i));
            if (c(j, a2)) {
                j2 = a2;
            } else {
                n();
                j2 = j;
            }
        }
        this.n = this.m;
        this.o = j2;
        c cVar = this.c;
        if (cVar == null || this.k == -9223372036854775807L) {
            return j2;
        }
        long j3 = cVar.a;
        return j3 == -9223372036854775807L ? j2 : e(j2, j3, this.k) - this.l;
    }

    public final void d() {
        Surface surface;
        if (K.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        a.a(surface, 0.0f);
    }

    public final b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    public void g(float f) {
        this.f = f;
        this.a.g();
        q();
    }

    public void h(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.a.f(j * 1000);
        q();
    }

    public void i(float f) {
        this.i = f;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.d = true;
        n();
        if (this.b != null) {
            ((c) P2.a.e(this.c)).a();
            this.b.b();
        }
        r(false);
    }

    public void l() {
        this.d = false;
        b bVar = this.b;
        if (bVar != null) {
            bVar.c();
            ((c) P2.a.e(this.c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof m) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        d();
        this.e = surface;
        r(true);
    }

    public final void n() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public void o(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        r(true);
    }

    public final void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            P2.o.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
        }
    }

    public final void q() {
        if (K.a < 30 || this.e == null) {
            return;
        }
        float b2 = this.a.e() ? this.a.b() : this.f;
        float f = this.g;
        if (b2 == f) {
            return;
        }
        if (b2 != -1.0f && f != -1.0f) {
            if (Math.abs(b2 - this.g) < ((!this.a.e() || this.a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b2 == -1.0f && this.a.c() < 30) {
            return;
        }
        this.g = b2;
        r(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(boolean r4) {
        /*
            r3 = this;
            int r0 = P2.K.a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.e
            if (r0 == 0) goto L30
            int r1 = r3.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.d
            if (r1 == 0) goto L21
            float r1 = r3.g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            return
        L2b:
            r3.h = r1
            m3.q.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.q.r(boolean):void");
    }

    public final class b implements DisplayManager.DisplayListener {
        public final DisplayManager a;

        public b(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public final Display a() {
            return this.a.getDisplay(0);
        }

        public void b() {
            this.a.registerDisplayListener(this, K.A());
            q.a(q.this, a());
        }

        public void c() {
            this.a.unregisterDisplayListener(this);
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                q.a(q.this, a());
            }
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayRemoved(int i) {
        }
    }
}
