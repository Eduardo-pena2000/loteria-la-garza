package k3;

import P2.F;
import P2.K;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l implements m {
    public static final c d = h(false, -9223372036854775807L);
    public static final c e = h(true, -9223372036854775807L);
    public static final c f = new c(2, -9223372036854775807L, null);
    public static final c g = new c(3, -9223372036854775807L, null);
    public final ExecutorService a;
    public d b;
    public IOException c;

    public interface b {
        void i(e eVar, long j, long j2);

        void k(e eVar, long j, long j2, boolean z);

        c o(e eVar, long j, long j2, IOException iOException, int i);
    }

    public static final class c {
        public final int a;
        public final long b;

        public /* synthetic */ c(int i, long j, a aVar) {
            this(i, j);
        }

        public static /* synthetic */ int a(c cVar) {
            return cVar.a;
        }

        public static /* synthetic */ long b(c cVar) {
            return cVar.b;
        }

        public boolean c() {
            int i = this.a;
            return i == 0 || i == 1;
        }

        public c(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public final class d extends Handler implements Runnable {
        public final int a;
        public final e b;
        public final long c;
        public b d;
        public IOException e;
        public int f;
        public Thread g;
        public boolean h;
        public volatile boolean i;

        public d(Looper looper, e eVar, b bVar, int i, long j) {
            super(looper);
            this.b = eVar;
            this.d = bVar;
            this.a = i;
            this.c = j;
        }

        public void a(boolean z) {
            this.i = z;
            this.e = null;
            if (hasMessages(1)) {
                this.h = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.h = true;
                        this.b.c();
                        Thread thread = this.g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) P2.a.e(this.d)).k(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        public final void b() {
            this.e = null;
            l.e(l.this).execute((Runnable) P2.a.e(l.b(l.this)));
        }

        public final void c() {
            l.c(l.this, null);
        }

        public final long d() {
            return Math.min((this.f - 1) * 1000, 5000);
        }

        public void e(int i) {
            IOException iOException = this.e;
            if (iOException != null && this.f > i) {
                throw iOException;
            }
        }

        public void f(long j) {
            P2.a.f(l.b(l.this) == null);
            l.c(l.this, this);
            if (j > 0) {
                sendEmptyMessageDelayed(1, j);
            } else {
                b();
            }
        }

        public void handleMessage(Message message) {
            if (this.i) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.c;
            b bVar = (b) P2.a.e(this.d);
            if (this.h) {
                bVar.k(this.b, elapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    bVar.i(this.b, elapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    P2.o.d("LoadTask", "Unexpected exception handling load completed", e);
                    l.d(l.this, new h(e));
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.e = iOException;
            int i3 = this.f + 1;
            this.f = i3;
            c o = bVar.o(this.b, elapsedRealtime, j, iOException, i3);
            if (c.a(o) == 3) {
                l.d(l.this, this.e);
            } else if (c.a(o) != 2) {
                if (c.a(o) == 1) {
                    this.f = 1;
                }
                f(c.b(o) != -9223372036854775807L ? c.b(o) : d());
            }
        }

        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.h;
                    this.g = Thread.currentThread();
                }
                if (!z) {
                    F.a("load:" + this.b.getClass().getSimpleName());
                    try {
                        this.b.b();
                        F.b();
                    } catch (Throwable th) {
                        F.b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.g = null;
                    Thread.interrupted();
                }
                if (this.i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.i) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (OutOfMemoryError e2) {
                if (this.i) {
                    return;
                }
                P2.o.d("LoadTask", "OutOfMemory error loading stream", e2);
                obtainMessage(3, new h(e2)).sendToTarget();
            } catch (Exception e3) {
                if (this.i) {
                    return;
                }
                P2.o.d("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(3, new h(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.i) {
                    P2.o.d("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    public interface e {
        void b();

        void c();
    }

    public interface f {
        void p();
    }

    public static final class g implements Runnable {
        public final f a;

        public g(f fVar) {
            this.a = fVar;
        }

        public void run() {
            this.a.p();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    public l(String str) {
        this.a = K.L0("ExoPlayer:Loader:" + str);
    }

    public static /* synthetic */ d b(l lVar) {
        return lVar.b;
    }

    public static /* synthetic */ d c(l lVar, d dVar) {
        lVar.b = dVar;
        return dVar;
    }

    public static /* synthetic */ IOException d(l lVar, IOException iOException) {
        lVar.c = iOException;
        return iOException;
    }

    public static /* synthetic */ ExecutorService e(l lVar) {
        return lVar.a;
    }

    public static c h(boolean z, long j) {
        return new c(z ? 1 : 0, j, null);
    }

    public void a() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) P2.a.h(this.b)).a(false);
    }

    public void g() {
        this.c = null;
    }

    public boolean i() {
        return this.c != null;
    }

    public boolean j() {
        return this.b != null;
    }

    public void k(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.b;
        if (dVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = dVar.a;
            }
            dVar.e(i);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.a.execute(new g(fVar));
        }
        this.a.shutdown();
    }

    public long n(e eVar, b bVar, int i) {
        Looper looper = (Looper) P2.a.h(Looper.myLooper());
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
