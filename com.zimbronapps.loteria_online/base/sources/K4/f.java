package K4;

import G4.c;
import G4.m;
import G4.n;
import P4.p;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f {
    public static final String b = m.f("SystemJobInfoConverter");
    public final ComponentName a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n.values().length];
            a = iArr;
            try {
                iArr[n.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[n.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[n.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[n.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[n.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public f(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(c.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    public static int c(n nVar) {
        int i = a.a[nVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        m.c().a(b, String.format("API version too low. Cannot convert network type value %s", new Object[]{nVar}), new Throwable[0]);
        return 1;
    }

    public static void d(JobInfo.Builder builder, n nVar) {
        if (Build.VERSION.SDK_INT < 30 || nVar != n.f) {
            builder.setRequiredNetworkType(c(nVar));
        } else {
            e.a(builder, new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(p pVar, int i) {
        G4.b bVar = pVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.b());
        if (!bVar.h()) {
            extras.setBackoffCriteria(pVar.m, pVar.l == G4.a.b ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.q) {
            K4.a.a(extras, true);
        }
        if (bVar.e()) {
            Iterator it = bVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((c.a) it.next()));
            }
            extras.setTriggerContentUpdateDelay(bVar.c());
            extras.setTriggerContentMaxDelay(bVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(extras, bVar.f());
            c.a(extras, bVar.i());
        }
        boolean z = pVar.k > 0;
        if (P1.a.b() && pVar.q && !z) {
            d.a(extras, true);
        }
        return extras.build();
    }
}
