package okhttp3.internal.cache2;

import Ca.I;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import xb.L;
import xb.M;
import xb.e;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Relay {
    public static final Companion k = new Companion(null);
    public static final h l;
    public static final h m;
    public RandomAccessFile a;
    public L b;
    public long c;
    public final h d;
    public final long e;
    public Thread f;
    public final e g;
    public boolean h;
    public final e i;
    public int j;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public final class RelaySource implements L {
        public final M a;
        public FileOperator b;
        public long c;
        public final /* synthetic */ Relay d;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            if (r0 != 2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        
            r10 = java.lang.Math.min(r23, r21.d.i() - r21.c);
            r2 = r21.b;
            kotlin.jvm.internal.t.d(r2);
            r2.a(r21.c + 32, r22, r10);
            r21.c += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
        
            r0 = r21.d.g();
            kotlin.jvm.internal.t.d(r0);
            r11 = r0.F(r21.d.h(), r21.d.c());
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
        
            if (r11 != (-1)) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
        
            r0 = r21.d;
            r0.a(r0.i());
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
        
            r2 = r21.d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
        
            r2.o(null);
            r2.notifyAll();
            r0 = Ca.I.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
        
            r19 = java.lang.Math.min(r11, r23);
            r21.d.h().f(r22, 0, r19);
            r21.c += r19;
            r13 = r21.b;
            kotlin.jvm.internal.t.d(r13);
            r13.b(r21.d.i() + 32, r21.d.h().clone(), r11);
            r2 = r21.d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x010d, code lost:
        
            r2.b().j1(r2.h(), r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
        
            if (r2.b().A() <= r2.c()) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0128, code lost:
        
            r2.b().skip(r2.b().A() - r2.c());
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
        
            r2.n(r2.i() + r11);
            r0 = Ca.I.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0149, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x014a, code lost:
        
            r2 = r21.d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x014c, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x014d, code lost:
        
            r2.o(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0153, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0154, code lost:
        
            return r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x013d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
        
            r2 = r21.d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
        
            r2.o(null);
            r2.notifyAll();
            r3 = Ca.I.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0166, code lost:
        
            throw r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long F(xb.e r22, long r23) {
            /*
                Method dump skipped, instructions count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.F(xb.e, long):long");
        }

        public void close() {
            if (this.b == null) {
                return;
            }
            Closeable closeable = null;
            this.b = null;
            Relay relay = this.d;
            synchronized (relay) {
                try {
                    relay.m(relay.f() - 1);
                    if (relay.f() == 0) {
                        Closeable e = relay.e();
                        relay.l(null);
                        closeable = e;
                    }
                    I i = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (closeable == null) {
                return;
            }
            Util.m(closeable);
        }

        public M timeout() {
            return this.a;
        }
    }

    static {
        h.a aVar = h.d;
        l = aVar.d("OkHttp cache v1\n");
        m = aVar.d("OkHttp DIRTY :(\n");
    }

    public final void a(long j) {
        q(j);
        RandomAccessFile randomAccessFile = this.a;
        t.d(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        p(l, j, this.d.size());
        RandomAccessFile randomAccessFile2 = this.a;
        t.d(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            k(true);
            I i = I.a;
        }
        L l2 = this.b;
        if (l2 != null) {
            Util.m(l2);
        }
        this.b = null;
    }

    public final e b() {
        return this.i;
    }

    public final long c() {
        return this.e;
    }

    public final boolean d() {
        return this.h;
    }

    public final RandomAccessFile e() {
        return this.a;
    }

    public final int f() {
        return this.j;
    }

    public final L g() {
        return this.b;
    }

    public final e h() {
        return this.g;
    }

    public final long i() {
        return this.c;
    }

    public final Thread j() {
        return this.f;
    }

    public final void k(boolean z) {
        this.h = z;
    }

    public final void l(RandomAccessFile randomAccessFile) {
        this.a = randomAccessFile;
    }

    public final void m(int i) {
        this.j = i;
    }

    public final void n(long j) {
        this.c = j;
    }

    public final void o(Thread thread) {
        this.f = thread;
    }

    public final void p(h hVar, long j, long j2) {
        e eVar = new e();
        eVar.m0(hVar);
        eVar.R(j);
        eVar.R(j2);
        if (eVar.A() != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.a;
        t.d(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        t.f(channel, "file!!.channel");
        new FileOperator(channel).b(0L, eVar, 32L);
    }

    public final void q(long j) {
        e eVar = new e();
        eVar.m0(this.d);
        RandomAccessFile randomAccessFile = this.a;
        t.d(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        t.f(channel, "file!!.channel");
        new FileOperator(channel).b(32 + j, eVar, this.d.size());
    }
}
