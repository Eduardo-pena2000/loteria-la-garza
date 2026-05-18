package androidx.work.impl.background.systemjob;

import G4.m;
import H4.b;
import H4.i;
import K4.h;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class SystemJobService extends JobService implements b {
    public static final String c = m.f("SystemJobService");
    public i a;
    public final Map b = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void e(String str, boolean z) {
        JobParameters jobParameters;
        m.c().a(c, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super/*android.app.Service*/.onCreate();
        try {
            i k = i.k(getApplicationContext());
            this.a = k;
            k.m().c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            m.c().h(c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    public void onDestroy() {
        super/*android.app.Service*/.onDestroy();
        i iVar = this.a;
        if (iVar != null) {
            iVar.m().i(this);
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            m.c().a(c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            m.c().b(c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(a)) {
                    m.c().a(c, String.format("Job is already being executed by SystemJobService: %s", new Object[]{a}), new Throwable[0]);
                    return false;
                }
                m.c().a(c, String.format("onStartJob for %s", new Object[]{a}), new Throwable[0]);
                this.b.put(a, jobParameters);
                int i = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    aVar.c = h.a(jobParameters);
                }
                this.a.v(a, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.a == null) {
            m.c().a(c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            m.c().b(c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        m.c().a(c, String.format("onStopJob for %s", new Object[]{a}), new Throwable[0]);
        synchronized (this.b) {
            this.b.remove(a);
        }
        this.a.x(a);
        return !this.a.m().f(a);
    }
}
