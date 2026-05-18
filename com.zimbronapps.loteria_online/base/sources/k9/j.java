package k9;

import Ca.o;
import Ca.q;
import android.media.MediaFormat;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j implements i9.a {
    public final e9.e a;
    public final h b;
    public e9.d c;
    public i9.b d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final Semaphore g;
    public boolean h;
    public final ExecutorService i;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e9.b.values().length];
            try {
                iArr[e9.b.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e9.b.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e9.b.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e9.b.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e9.b.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e9.b.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e9.b.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e9.b.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e9.b.j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr;
        }
    }

    public j(e9.e eVar, h hVar) {
        t.g(eVar, "config");
        t.g(hVar, "recorderListener");
        this.a = eVar;
        this.b = hVar;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new Semaphore(0);
        this.i = Executors.newSingleThreadExecutor();
    }

    public static /* synthetic */ void c(j jVar, CountDownLatch countDownLatch) {
        n(jVar, countDownLatch);
    }

    public static final void n(j jVar, CountDownLatch countDownLatch) {
        try {
            try {
                q h = jVar.l().h(jVar.a, jVar);
                i9.b bVar = (i9.b) h.a();
                e9.d dVar = new e9.d(jVar.a, (MediaFormat) h.b());
                jVar.c = dVar;
                t.d(dVar);
                dVar.n();
                jVar.d = bVar;
                t.d(bVar);
                bVar.b();
                jVar.j();
                countDownLatch.countDown();
                while (jVar.g()) {
                    if (jVar.f()) {
                        jVar.b.onPause();
                        jVar.g.acquire();
                    } else {
                        e9.d dVar2 = jVar.c;
                        t.d(dVar2);
                        byte[] k = dVar2.k();
                        if (!(k.length == 0)) {
                            i9.b bVar2 = jVar.d;
                            t.d(bVar2);
                            bVar2.encode(k);
                        }
                    }
                }
            } catch (Exception e) {
                jVar.b.onFailure(e);
            }
            countDownLatch.countDown();
            jVar.o();
        } catch (Throwable th) {
            countDownLatch.countDown();
            jVar.o();
            throw th;
        }
    }

    public void a(byte[] bArr) {
        t.g(bArr, "bytes");
        this.b.g(bArr);
    }

    public void b(Exception exc) {
        t.g(exc, "ex");
        this.b.onFailure(exc);
    }

    public final void d() {
        if (!g()) {
            b9.b.b(this.a.m());
        } else {
            this.h = true;
            p();
        }
    }

    public final double e() {
        e9.d dVar = this.c;
        if (dVar != null) {
            return dVar.e();
        }
        return -160.0d;
    }

    public final boolean f() {
        return this.d != null && this.f.get();
    }

    public final boolean g() {
        return this.d != null && this.e.get();
    }

    public final void h() {
        if (g()) {
            i();
        }
    }

    public final void i() {
        this.e.set(true);
        this.f.set(true);
    }

    public final void j() {
        this.e.set(true);
        this.f.set(false);
        this.g.release();
        this.b.h();
    }

    public final void k() {
        if (f()) {
            j();
        }
    }

    public final j9.f l() {
        switch (a.a[this.a.h().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new j9.a();
            case 4:
                return new j9.b();
            case 5:
                return new j9.c();
            case 6:
                return new j9.e();
            case 7:
                return new j9.h();
            case 8:
                return new j9.g();
            case 9:
                return new j9.i();
            default:
                throw new o();
        }
    }

    public final void m() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.i.execute(new i(this, countDownLatch));
        countDownLatch.await();
    }

    public final void o() {
        try {
            try {
                e9.d dVar = this.c;
                if (dVar != null) {
                    dVar.o();
                }
                e9.d dVar2 = this.c;
                if (dVar2 != null) {
                    dVar2.l();
                }
                this.c = null;
                i9.b bVar = this.d;
                if (bVar != null) {
                    bVar.a();
                }
                this.d = null;
                if (this.h) {
                    b9.b.b(this.a.m());
                }
            } catch (Exception e) {
                this.b.onFailure(e);
            }
            this.b.a();
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }

    public final void p() {
        if (g()) {
            this.e.set(false);
            this.f.set(false);
            this.g.release();
        }
    }
}
