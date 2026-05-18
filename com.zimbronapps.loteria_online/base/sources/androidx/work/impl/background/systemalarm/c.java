package androidx.work.impl.background.systemalarm;

import G4.m;
import P4.p;
import Q4.n;
import Q4.r;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c implements L4.c, H4.b, r.b {
    public static final String j = m.f("DelayMetCommandHandler");
    public final Context a;
    public final int b;
    public final String c;
    public final d d;
    public final L4.d e;
    public PowerManager.WakeLock h;
    public boolean i = false;
    public int g = 0;
    public final Object f = new Object();

    public c(Context context, int i, String str, d dVar) {
        this.a = context;
        this.b = i;
        this.d = dVar;
        this.c = str;
        this.e = new L4.d(context, dVar.f(), this);
    }

    public void a(String str) {
        m.c().a(j, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        g();
    }

    public void b(List list) {
        g();
    }

    public final void c() {
        synchronized (this.f) {
            try {
                this.e.e();
                this.d.h().c(this.c);
                PowerManager.WakeLock wakeLock = this.h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    m.c().a(j, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.h, this.c}), new Throwable[0]);
                    this.h.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        this.h = n.b(this.a, String.format("%s (%s)", new Object[]{this.c, Integer.valueOf(this.b)}));
        m c = m.c();
        String str = j;
        c.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.h, this.c}), new Throwable[0]);
        this.h.acquire();
        p h = this.d.g().o().B().h(this.c);
        if (h == null) {
            g();
            return;
        }
        boolean b = h.b();
        this.i = b;
        if (b) {
            this.e.d(Collections.singletonList(h));
        } else {
            m.c().a(str, String.format("No constraints for %s", new Object[]{this.c}), new Throwable[0]);
            f(Collections.singletonList(this.c));
        }
    }

    public void e(String str, boolean z) {
        m.c().a(j, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        c();
        if (z) {
            Intent d = a.d(this.a, this.c);
            d dVar = this.d;
            dVar.k(new d.b(dVar, d, this.b));
        }
        if (this.i) {
            Intent a = a.a(this.a);
            d dVar2 = this.d;
            dVar2.k(new d.b(dVar2, a, this.b));
        }
    }

    public void f(List list) {
        if (list.contains(this.c)) {
            synchronized (this.f) {
                try {
                    if (this.g == 0) {
                        this.g = 1;
                        m.c().a(j, String.format("onAllConstraintsMet for %s", new Object[]{this.c}), new Throwable[0]);
                        if (this.d.d().j(this.c)) {
                            this.d.h().b(this.c, 600000L, this);
                        } else {
                            c();
                        }
                    } else {
                        m.c().a(j, String.format("Already started work for %s", new Object[]{this.c}), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f) {
            try {
                if (this.g < 2) {
                    this.g = 2;
                    m c = m.c();
                    String str = j;
                    c.a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.c}), new Throwable[0]);
                    Intent f = a.f(this.a, this.c);
                    d dVar = this.d;
                    dVar.k(new d.b(dVar, f, this.b));
                    if (this.d.d().g(this.c)) {
                        m.c().a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.c}), new Throwable[0]);
                        Intent d = a.d(this.a, this.c);
                        d dVar2 = this.d;
                        dVar2.k(new d.b(dVar2, d, this.b));
                    } else {
                        m.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.c}), new Throwable[0]);
                    }
                } else {
                    m.c().a(j, String.format("Already stopped work for %s", new Object[]{this.c}), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
