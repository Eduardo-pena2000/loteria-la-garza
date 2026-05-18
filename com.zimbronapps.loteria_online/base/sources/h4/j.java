package H4;

import G4.m;
import G4.v;
import P4.p;
import P4.q;
import P4.t;
import Q4.o;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class j implements Runnable {
    public static final String t = m.f("WorkerWrapper");
    public Context a;
    public String b;
    public List c;
    public WorkerParameters.a d;
    public p e;
    public ListenableWorker f;
    public S4.a g;
    public androidx.work.a i;
    public O4.a j;
    public WorkDatabase k;
    public q l;
    public P4.b m;
    public t n;
    public List o;
    public String p;
    public volatile boolean s;
    public ListenableWorker.a h = ListenableWorker.a.a();
    public R4.c q = R4.c.s();
    public x7.e r = null;

    public class a implements Runnable {
        public final /* synthetic */ x7.e a;
        public final /* synthetic */ R4.c b;

        public a(x7.e eVar, R4.c cVar) {
            this.a = eVar;
            this.b = cVar;
        }

        public void run() {
            try {
                this.a.get();
                m.c().a(j.t, String.format("Starting work for %s", new Object[]{j.this.e.c}), new Throwable[0]);
                j jVar = j.this;
                jVar.r = jVar.f.startWork();
                this.b.q(j.this.r);
            } catch (Throwable th) {
                this.b.p(th);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ R4.c a;
        public final /* synthetic */ String b;

        public b(R4.c cVar, String str) {
            this.a = cVar;
            this.b = str;
        }

        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.a.get();
                    if (aVar == null) {
                        m.c().b(j.t, String.format("%s returned a null result. Treating it as a failure.", new Object[]{j.this.e.c}), new Throwable[0]);
                    } else {
                        m.c().a(j.t, String.format("%s returned a %s result.", new Object[]{j.this.e.c, aVar}), new Throwable[0]);
                        j.this.h = aVar;
                    }
                } catch (CancellationException e) {
                    m.c().d(j.t, String.format("%s was cancelled", new Object[]{this.b}), e);
                } catch (ExecutionException e2) {
                    e = e2;
                    m.c().b(j.t, String.format("%s failed because it threw an exception/error", new Object[]{this.b}), e);
                } catch (InterruptedException e3) {
                    e = e3;
                    m.c().b(j.t, String.format("%s failed because it threw an exception/error", new Object[]{this.b}), e);
                }
                j.this.f();
            } catch (Throwable th) {
                j.this.f();
                throw th;
            }
        }
    }

    public static class c {
        public Context a;
        public ListenableWorker b;
        public O4.a c;
        public S4.a d;
        public androidx.work.a e;
        public WorkDatabase f;
        public String g;
        public List h;
        public WorkerParameters.a i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, S4.a aVar2, O4.a aVar3, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.d = aVar2;
            this.c = aVar3;
            this.e = aVar;
            this.f = workDatabase;
            this.g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.i = aVar;
            }
            return this;
        }

        public c c(List list) {
            this.h = list;
            return this;
        }
    }

    public j(c cVar) {
        this.a = cVar.a;
        this.g = cVar.d;
        this.j = cVar.c;
        this.b = cVar.g;
        this.c = cVar.h;
        this.d = cVar.i;
        this.f = cVar.b;
        this.i = cVar.e;
        WorkDatabase workDatabase = cVar.f;
        this.k = workDatabase;
        this.l = workDatabase.B();
        this.m = this.k.t();
        this.n = this.k.C();
    }

    public final String a(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.b);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public x7.e b() {
        return this.q;
    }

    public final void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            m.c().d(t, String.format("Worker result SUCCESS for %s", new Object[]{this.p}), new Throwable[0]);
            if (this.e.d()) {
                h();
                return;
            } else {
                m();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            m.c().d(t, String.format("Worker result RETRY for %s", new Object[]{this.p}), new Throwable[0]);
            g();
            return;
        }
        m.c().d(t, String.format("Worker result FAILURE for %s", new Object[]{this.p}), new Throwable[0]);
        if (this.e.d()) {
            h();
        } else {
            l();
        }
    }

    public void d() {
        boolean z;
        this.s = true;
        n();
        x7.e eVar = this.r;
        if (eVar != null) {
            z = eVar.isDone();
            this.r.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f;
        if (listenableWorker != null && !z) {
            listenableWorker.stop();
        } else {
            m.c().a(t, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.e}), new Throwable[0]);
        }
    }

    public final void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.l.g(str2) != v.CANCELLED) {
                this.l.f(v.FAILED, str2);
            }
            linkedList.addAll(this.m.a(str2));
        }
    }

    public void f() {
        if (!n()) {
            this.k.c();
            try {
                v g = this.l.g(this.b);
                this.k.A().a(this.b);
                if (g == null) {
                    i(false);
                } else if (g == v.RUNNING) {
                    c(this.h);
                } else if (!g.a()) {
                    g();
                }
                this.k.r();
                this.k.g();
            } catch (Throwable th) {
                this.k.g();
                throw th;
            }
        }
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(this.b);
            }
            f.b(this.i, this.k, this.c);
        }
    }

    public final void g() {
        this.k.c();
        try {
            this.l.f(v.ENQUEUED, this.b);
            this.l.u(this.b, System.currentTimeMillis());
            this.l.m(this.b, -1L);
            this.k.r();
        } finally {
            this.k.g();
            i(true);
        }
    }

    public final void h() {
        this.k.c();
        try {
            this.l.u(this.b, System.currentTimeMillis());
            this.l.f(v.ENQUEUED, this.b);
            this.l.s(this.b);
            this.l.m(this.b, -1L);
            this.k.r();
        } finally {
            this.k.g();
            i(false);
        }
    }

    public final void i(boolean z) {
        ListenableWorker listenableWorker;
        this.k.c();
        try {
            if (!this.k.B().r()) {
                Q4.g.a(this.a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.l.f(v.ENQUEUED, this.b);
                this.l.m(this.b, -1L);
            }
            if (this.e != null && (listenableWorker = this.f) != null && listenableWorker.isRunInForeground()) {
                this.j.a(this.b);
            }
            this.k.r();
            this.k.g();
            this.q.o(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.k.g();
            throw th;
        }
    }

    public final void j() {
        v g = this.l.g(this.b);
        if (g == v.RUNNING) {
            m.c().a(t, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.b}), new Throwable[0]);
            i(true);
        } else {
            m.c().a(t, String.format("Status for %s is %s; not doing any work", new Object[]{this.b, g}), new Throwable[0]);
            i(false);
        }
    }

    public final void k() {
        androidx.work.b b2;
        if (n()) {
            return;
        }
        this.k.c();
        try {
            p h = this.l.h(this.b);
            this.e = h;
            if (h == null) {
                m.c().b(t, String.format("Didn't find WorkSpec for id %s", new Object[]{this.b}), new Throwable[0]);
                i(false);
                this.k.r();
                return;
            }
            if (h.b != v.ENQUEUED) {
                j();
                this.k.r();
                m.c().a(t, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.e.c}), new Throwable[0]);
                return;
            }
            if (h.d() || this.e.c()) {
                long currentTimeMillis = System.currentTimeMillis();
                p pVar = this.e;
                if (pVar.n != 0 && currentTimeMillis < pVar.a()) {
                    m.c().a(t, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.e.c}), new Throwable[0]);
                    i(true);
                    this.k.r();
                    return;
                }
            }
            this.k.r();
            this.k.g();
            if (this.e.d()) {
                b2 = this.e.e;
            } else {
                G4.i b3 = this.i.f().b(this.e.d);
                if (b3 == null) {
                    m.c().b(t, String.format("Could not create Input Merger %s", new Object[]{this.e.d}), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.e.e);
                    arrayList.addAll(this.l.j(this.b));
                    b2 = b3.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.b), b2, this.o, this.d, this.e.k, this.i.e(), this.g, this.i.m(), new Q4.q(this.k, this.g), new Q4.p(this.k, this.j, this.g));
            if (this.f == null) {
                this.f = this.i.m().b(this.a, this.e.c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f;
            if (listenableWorker == null) {
                m.c().b(t, String.format("Could not create Worker %s", new Object[]{this.e.c}), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                m.c().b(t, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.e.c}), new Throwable[0]);
                l();
                return;
            }
            this.f.setUsed();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            R4.c s = R4.c.s();
            o oVar = new o(this.a, this.e, this.f, workerParameters.b(), this.g);
            this.g.a().execute(oVar);
            x7.e a2 = oVar.a();
            a2.addListener(new a(a2, s), this.g.a());
            s.addListener(new b(s, this.p), this.g.getBackgroundExecutor());
        } finally {
            this.k.g();
        }
    }

    public void l() {
        this.k.c();
        try {
            e(this.b);
            this.l.p(this.b, ((ListenableWorker.a.a) this.h).e());
            this.k.r();
        } finally {
            this.k.g();
            i(false);
        }
    }

    public final void m() {
        this.k.c();
        try {
            this.l.f(v.SUCCEEDED, this.b);
            this.l.p(this.b, ((ListenableWorker.a.c) this.h).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.m.a(this.b)) {
                if (this.l.g(str) == v.BLOCKED && this.m.b(str)) {
                    m.c().d(t, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                    this.l.f(v.ENQUEUED, str);
                    this.l.u(str, currentTimeMillis);
                }
            }
            this.k.r();
            this.k.g();
            i(false);
        } catch (Throwable th) {
            this.k.g();
            i(false);
            throw th;
        }
    }

    public final boolean n() {
        if (!this.s) {
            return false;
        }
        m.c().a(t, String.format("Work interrupted for %s", new Object[]{this.p}), new Throwable[0]);
        if (this.l.g(this.b) == null) {
            i(false);
        } else {
            i(!r0.a());
        }
        return true;
    }

    public final boolean o() {
        boolean z;
        this.k.c();
        try {
            if (this.l.g(this.b) == v.ENQUEUED) {
                this.l.f(v.RUNNING, this.b);
                this.l.t(this.b);
                z = true;
            } else {
                z = false;
            }
            this.k.r();
            this.k.g();
            return z;
        } catch (Throwable th) {
            this.k.g();
            throw th;
        }
    }

    public void run() {
        List b2 = this.n.b(this.b);
        this.o = b2;
        this.p = a(b2);
        k();
    }
}
