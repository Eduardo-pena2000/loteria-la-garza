package H4;

import G4.m;
import G4.p;
import G4.s;
import G4.w;
import Q4.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class i extends w {
    public static final String j = m.f("WorkManagerImpl");
    public static i k = null;
    public static i l = null;
    public static final Object m = new Object();
    public Context a;
    public androidx.work.a b;
    public WorkDatabase c;
    public S4.a d;
    public List e;
    public d f;
    public Q4.h g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;

    public i(Context context, androidx.work.a aVar, S4.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(s.a));
    }

    public static void e(Context context, androidx.work.a aVar) {
        synchronized (m) {
            try {
                i iVar = k;
                if (iVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (iVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new i(applicationContext, aVar, new S4.b(aVar.l()));
                    }
                    k = l;
                }
            } finally {
            }
        }
    }

    public static i j() {
        synchronized (m) {
            try {
                i iVar = k;
                if (iVar != null) {
                    return iVar;
                }
                return l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static i k(Context context) {
        i j2;
        synchronized (m) {
            try {
                j2 = j();
                if (j2 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    public p a(String str) {
        Q4.a d = Q4.a.d(str, this);
        this.d.b(d);
        return d.e();
    }

    public p c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).a();
    }

    public p f(UUID uuid) {
        Q4.a b = Q4.a.b(uuid, this);
        this.d.b(b);
        return b.e();
    }

    public List g(Context context, androidx.work.a aVar, S4.a aVar2) {
        return Arrays.asList(new e[]{f.a(context, this), new I4.b(context, aVar, aVar2, this)});
    }

    public Context h() {
        return this.a;
    }

    public androidx.work.a i() {
        return this.b;
    }

    public Q4.h l() {
        return this.g;
    }

    public d m() {
        return this.f;
    }

    public List n() {
        return this.e;
    }

    public WorkDatabase o() {
        return this.c;
    }

    public S4.a p() {
        return this.d;
    }

    public final void q(Context context, androidx.work.a aVar, S4.a aVar2, WorkDatabase workDatabase, List list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = aVar;
        this.d = aVar2;
        this.c = workDatabase;
        this.e = list;
        this.f = dVar;
        this.g = new Q4.h(workDatabase);
        this.h = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void r() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        K4.g.b(h());
        o().B().l();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (m) {
            try {
                this.i = pendingResult;
                if (this.h) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.d.b(new l(this, str, aVar));
    }

    public void w(String str) {
        this.d.b(new Q4.m(this, str, true));
    }

    public void x(String str) {
        this.d.b(new Q4.m(this, str, false));
    }

    public i(Context context, androidx.work.a aVar, S4.a aVar2, boolean z) {
        this(context, aVar, aVar2, WorkDatabase.s(context.getApplicationContext(), aVar2.getBackgroundExecutor(), z));
    }

    public i(Context context, androidx.work.a aVar, S4.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        m.e(new m.a(aVar.j()));
        List g = g(applicationContext, aVar, aVar2);
        q(context, aVar, aVar2, workDatabase, g, new d(context, aVar, aVar2, workDatabase, g));
    }
}
