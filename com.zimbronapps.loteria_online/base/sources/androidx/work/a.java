package androidx.work;

import G4.h;
import G4.j;
import G4.t;
import G4.y;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public final Executor a;
    public final Executor b;
    public final y c;
    public final j d;
    public final t e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;

    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(0);
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.b ? "WM.task-" : "androidx.work-") + this.a.incrementAndGet());
        }
    }

    public static final class b {
        public Executor a;
        public y b;
        public j c;
        public Executor d;
        public t e;
        public String f;
        public int g = 4;
        public int h = 0;
        public int i = Integer.MAX_VALUE;
        public int j = 20;

        public a a() {
            return new a(this);
        }
    }

    public a(b bVar) {
        Executor executor = bVar.a;
        if (executor == null) {
            this.a = a(false);
        } else {
            this.a = executor;
        }
        Executor executor2 = bVar.d;
        if (executor2 == null) {
            this.k = true;
            this.b = a(true);
        } else {
            this.k = false;
            this.b = executor2;
        }
        y yVar = bVar.b;
        if (yVar == null) {
            this.c = y.c();
        } else {
            this.c = yVar;
        }
        j jVar = bVar.c;
        if (jVar == null) {
            this.d = j.c();
        } else {
            this.d = jVar;
        }
        t tVar = bVar.e;
        if (tVar == null) {
            this.e = new H4.a();
        } else {
            this.e = tVar;
        }
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.f = bVar.f;
    }

    public final Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z));
    }

    public final ThreadFactory b(boolean z) {
        return new a(z);
    }

    public String c() {
        return this.f;
    }

    public h d() {
        return null;
    }

    public Executor e() {
        return this.a;
    }

    public j f() {
        return this.d;
    }

    public int g() {
        return this.i;
    }

    public int h() {
        return this.j;
    }

    public int i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public t k() {
        return this.e;
    }

    public Executor l() {
        return this.b;
    }

    public y m() {
        return this.c;
    }
}
