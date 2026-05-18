package K4;

import G4.m;
import G4.v;
import H4.i;
import P4.p;
import P4.q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g implements H4.e {
    public static final String e = m.f("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final i c;
    public final f d;

    public g(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new f(context));
    }

    public static void b(Context context) {
        List g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g = g(context, jobScheduler)) == null || g.isEmpty()) {
            return;
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            e(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static void e(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            m.c().b(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m.c().b(e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = g(context, jobScheduler);
        List c = iVar.o().y().c();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                String h = h(jobInfo);
                if (TextUtils.isEmpty(h)) {
                    e(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(h);
                }
            }
        }
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                m.c().a(e, "Reconciling jobs", new Throwable[0]);
                z = true;
                break;
            }
        }
        if (z) {
            WorkDatabase o = iVar.o();
            o.c();
            try {
                q B = o.B();
                Iterator it2 = c.iterator();
                while (it2.hasNext()) {
                    B.m((String) it2.next(), -1L);
                }
                o.r();
                o.g();
            } catch (Throwable th) {
                o.g();
                throw th;
            }
        }
        return z;
    }

    public void a(String str) {
        List f = f(this.a, this.b, str);
        if (f == null || f.isEmpty()) {
            return;
        }
        Iterator it = f.iterator();
        while (it.hasNext()) {
            e(this.b, ((Integer) it.next()).intValue());
        }
        this.c.o().y().d(str);
    }

    public void c(p... pVarArr) {
        WorkDatabase o = this.c.o();
        Q4.f fVar = new Q4.f(o);
        for (p pVar : pVarArr) {
            o.c();
            try {
                p h = o.B().h(pVar.a);
                if (h == null) {
                    m.c().h(e, "Skipping scheduling " + pVar.a + " because it's no longer in the DB", new Throwable[0]);
                    o.r();
                } else if (h.b != v.a) {
                    m.c().h(e, "Skipping scheduling " + pVar.a + " because it is no longer enqueued", new Throwable[0]);
                    o.r();
                } else {
                    P4.g a = o.y().a(pVar.a);
                    int d = a != null ? a.b : fVar.d(this.c.i().i(), this.c.i().g());
                    if (a == null) {
                        this.c.o().y().b(new P4.g(pVar.a, d));
                    }
                    j(pVar, d);
                    o.r();
                }
            } finally {
                o.g();
            }
        }
    }

    public boolean d() {
        return true;
    }

    public void j(p pVar, int i) {
        JobInfo a = this.d.a(pVar, i);
        m c = m.c();
        String str = e;
        c.a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{pVar.a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            if (this.b.schedule(a) == 0) {
                m.c().h(str, String.format("Unable to schedule work ID %s", new Object[]{pVar.a}), new Throwable[0]);
                if (pVar.q && pVar.r == G4.q.a) {
                    pVar.q = false;
                    m.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{pVar.a}), new Throwable[0]);
                    j(pVar, i);
                }
            }
        } catch (IllegalStateException e2) {
            List g = g(this.a, this.b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(g != null ? g.size() : 0), Integer.valueOf(this.c.o().B().d().size()), Integer.valueOf(this.c.i().h())});
            m.c().b(e, format, new Throwable[0]);
            throw new IllegalStateException(format, e2);
        } catch (Throwable th) {
            m.c().b(e, String.format("Unable to schedule %s", new Object[]{pVar}), th);
        }
    }

    public g(Context context, i iVar, JobScheduler jobScheduler, f fVar) {
        this.a = context;
        this.c = iVar;
        this.b = jobScheduler;
        this.d = fVar;
    }
}
