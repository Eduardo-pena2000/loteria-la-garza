package androidx.work.impl.background.systemalarm;

import G4.m;
import H4.i;
import Q4.k;
import Q4.n;
import Q4.r;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d implements H4.b {
    public static final String k = m.f("SystemAlarmDispatcher");
    public final Context a;
    public final S4.a b;
    public final r c;
    public final H4.d d;
    public final i e;
    public final androidx.work.impl.background.systemalarm.a f;
    public final Handler g;
    public final List h;
    public Intent i;
    public c j;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d dVar;
            d dVar2;
            synchronized (d.this.h) {
                d dVar3 = d.this;
                dVar3.i = (Intent) dVar3.h.get(0);
            }
            Intent intent = d.this.i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.i.getIntExtra("KEY_START_ID", 0);
                m c = m.c();
                String str = d.k;
                c.a(str, String.format("Processing command %s, %s", new Object[]{d.this.i, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b = n.b(d.this.a, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    m.c().a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.acquire();
                    d dVar4 = d.this;
                    dVar4.f.o(dVar4.i, intExtra, dVar4);
                    m.c().a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    dVar = d.this;
                    dVar2 = new d(dVar);
                } catch (Throwable th) {
                    try {
                        m c2 = m.c();
                        String str2 = d.k;
                        c2.b(str2, "Unexpected error in onHandleIntent", th);
                        m.c().a(str2, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                        b.release();
                        dVar = d.this;
                        dVar2 = new d(dVar);
                    } catch (Throwable th2) {
                        m.c().a(d.k, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                        b.release();
                        d dVar5 = d.this;
                        dVar5.k(new d(dVar5));
                        throw th2;
                    }
                }
                dVar.k(dVar2);
            }
        }
    }

    public static class b implements Runnable {
        public final d a;
        public final Intent b;
        public final int c;

        public b(d dVar, Intent intent, int i) {
            this.a = dVar;
            this.b = intent;
            this.c = i;
        }

        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    public interface c {
        void b();
    }

    public static class d implements Runnable {
        public final d a;

        public d(d dVar) {
            this.a = dVar;
        }

        public void run() {
            this.a.c();
        }
    }

    public d(Context context) {
        this(context, null, null);
    }

    public boolean a(Intent intent, int i) {
        m c2 = m.c();
        String str = k;
        c2.a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.h) {
            try {
                boolean isEmpty = this.h.isEmpty();
                this.h.add(intent);
                if (isEmpty) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void b() {
        if (this.g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        m c2 = m.c();
        String str = k;
        c2.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.h) {
            try {
                if (this.i != null) {
                    m.c().a(str, String.format("Removing command %s", new Object[]{this.i}), new Throwable[0]);
                    if (!((Intent) this.h.remove(0)).equals(this.i)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.i = null;
                }
                k backgroundExecutor = this.b.getBackgroundExecutor();
                if (!this.f.n() && this.h.isEmpty() && !backgroundExecutor.a()) {
                    m.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.j;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.h.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public H4.d d() {
        return this.d;
    }

    public void e(String str, boolean z) {
        k(new b(this, androidx.work.impl.background.systemalarm.a.c(this.a, str, z), 0));
    }

    public S4.a f() {
        return this.b;
    }

    public i g() {
        return this.e;
    }

    public r h() {
        return this.c;
    }

    public final boolean i(String str) {
        b();
        synchronized (this.h) {
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        m.c().a(k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.d.i(this);
        this.c.a();
        this.j = null;
    }

    public void k(Runnable runnable) {
        this.g.post(runnable);
    }

    public final void l() {
        b();
        PowerManager.WakeLock b2 = n.b(this.a, "ProcessCommand");
        try {
            b2.acquire();
            this.e.p().b(new a());
        } finally {
            b2.release();
        }
    }

    public void m(c cVar) {
        if (this.j != null) {
            m.c().b(k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.j = cVar;
        }
    }

    public d(Context context, H4.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.c = new r();
        iVar = iVar == null ? i.k(context) : iVar;
        this.e = iVar;
        dVar = dVar == null ? iVar.m() : dVar;
        this.d = dVar;
        this.b = iVar.p();
        dVar.c(this);
        this.h = new ArrayList();
        this.i = null;
        this.g = new Handler(Looper.getMainLooper());
    }
}
