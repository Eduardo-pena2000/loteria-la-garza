package H4;

import G4.m;
import H4.j;
import Q4.n;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d implements b, O4.a {
    public static final String l = m.f("Processor");
    public Context b;
    public androidx.work.a c;
    public S4.a d;
    public WorkDatabase e;
    public List h;
    public Map g = new HashMap();
    public Map f = new HashMap();
    public Set i = new HashSet();
    public final List j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();

    public static class a implements Runnable {
        public b a;
        public String b;
        public x7.e c;

        public a(b bVar, String str, x7.e eVar) {
            this.a = bVar;
            this.b = str;
            this.c = eVar;
        }

        public void run() {
            boolean z;
            try {
                z = ((Boolean) this.c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.a.e(this.b, z);
        }
    }

    public d(Context context, androidx.work.a aVar, S4.a aVar2, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = aVar;
        this.d = aVar2;
        this.e = workDatabase;
        this.h = list;
    }

    public static boolean d(String str, j jVar) {
        if (jVar == null) {
            m.c().a(l, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
        jVar.d();
        m.c().a(l, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
        return true;
    }

    public void a(String str) {
        synchronized (this.k) {
            this.f.remove(str);
            m();
        }
    }

    public void b(String str, G4.f fVar) {
        synchronized (this.k) {
            try {
                m.c().d(l, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
                j jVar = (j) this.g.remove(str);
                if (jVar != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock b = n.b(this.b, "ProcessorForegroundLck");
                        this.a = b;
                        b.acquire();
                    }
                    this.f.put(str, jVar);
                    H1.a.startForegroundService(this.b, androidx.work.impl.foreground.a.c(this.b, str, fVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.k) {
            this.j.add(bVar);
        }
    }

    public void e(String str, boolean z) {
        synchronized (this.k) {
            try {
                this.g.remove(str);
                m.c().a(l, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).e(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.k) {
            contains = this.i.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z;
        synchronized (this.k) {
            try {
                z = this.g.containsKey(str) || this.f.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.k) {
            containsKey = this.f.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.k) {
            this.j.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.k) {
            try {
                if (g(str)) {
                    m.c().a(l, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                    return false;
                }
                j a2 = new j.c(this.b, this.c, this.d, this, this.e, str).c(this.h).b(aVar).a();
                x7.e b = a2.b();
                b.addListener(new a(this, str, b), this.d.a());
                this.g.put(str, a2);
                this.d.getBackgroundExecutor().execute(a2);
                m.c().a(l, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean l(String str) {
        boolean d;
        synchronized (this.k) {
            try {
                m.c().a(l, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
                this.i.add(str);
                j jVar = (j) this.f.remove(str);
                boolean z = jVar != null;
                if (jVar == null) {
                    jVar = (j) this.g.remove(str);
                }
                d = d(str, jVar);
                if (z) {
                    m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public final void m() {
        synchronized (this.k) {
            try {
                if (this.f.isEmpty()) {
                    try {
                        this.b.startService(androidx.work.impl.foreground.a.d(this.b));
                    } catch (Throwable th) {
                        m.c().b(l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean n(String str) {
        boolean d;
        synchronized (this.k) {
            m.c().a(l, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            d = d(str, (j) this.f.remove(str));
        }
        return d;
    }

    public boolean o(String str) {
        boolean d;
        synchronized (this.k) {
            m.c().a(l, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            d = d(str, (j) this.g.remove(str));
        }
        return d;
    }
}
