package k7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzin;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class i5 extends h2 {
    public JobScheduler c;

    public i5(q3 q3Var) {
        super(q3Var);
    }

    public final boolean m() {
        return true;
    }

    public final void n() {
        this.c = (JobScheduler) this.a.d().getSystemService("jobscheduler");
    }

    public final void o(long j) {
        j();
        h();
        JobScheduler jobScheduler = this.c;
        if (jobScheduler != null && jobScheduler.getPendingJob(p()) != null) {
            this.a.a().w().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        zzin q = q();
        if (q != zzin.zzb) {
            this.a.a().w().b("[sgtm] Not eligible for Scion upload", q.name());
            return;
        }
        q3 q3Var = this.a;
        q3Var.a().w().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        q3Var.a().w().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) com.google.android.gms.common.internal.t.l(this.c)).schedule(new JobInfo.Builder(p(), new ComponentName(q3Var.d(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    public final int p() {
        return "measurement-client".concat(String.valueOf(this.a.d().getPackageName())).hashCode();
    }

    public final zzin q() {
        j();
        h();
        if (this.c == null) {
            return zzin.zzg;
        }
        q3 q3Var = this.a;
        if (!q3Var.w().P()) {
            return zzin.zzh;
        }
        q3 q3Var2 = this.a;
        return q3Var2.L().u() >= 119000 ? !l7.F(q3Var.d(), "com.google.android.gms.measurement.AppMeasurementJobService") ? zzin.zzc : !q3Var2.J().y() ? zzin.zze : zzin.zzb : zzin.zzf;
    }
}
