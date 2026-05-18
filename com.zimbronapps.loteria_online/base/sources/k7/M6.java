package k7;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzfb;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class m6 {
    public final Context a;

    public m6(Context context) {
        com.google.android.gms.common.internal.t.l(context);
        this.a = context;
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public static final boolean j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    public final void a() {
        Log.v("FA", this.a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void b() {
        Log.v("FA", this.a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final int c(Intent intent, int i, int i2) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.a;
        q3 O = q3.O(context, null, null);
        C2 a = O.a();
        String action = intent.getAction();
        O.c();
        a.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(b7.F(context), new l6(this, i2, a, intent));
        }
        return 2;
    }

    public final IBinder d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new S3(b7.F(this.a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final boolean e(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) com.google.android.gms.common.internal.t.l(string);
            b7 F = b7.F(this.a);
            C2 a = F.a();
            F.c();
            a.w().b("Local AppMeasurementJobService called. action", str);
            k(F, new j6(this, a, jobParameters));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        zzfb.zza(this.a, null).zzw(new k6(this, jobParameters));
        return true;
    }

    public final /* synthetic */ void f(int i, C2 c2, Intent intent) {
        i6 i6Var = this.a;
        i6 i6Var2 = i6Var;
        if (i6Var2.zza(i)) {
            c2.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            q3.O(i6Var, null, null).a().w().a("Completed wakeful intent.");
            i6Var2.a(intent);
        }
    }

    public final /* synthetic */ void g(C2 c2, JobParameters jobParameters) {
        c2.w().a("AppMeasurementJobService processed last upload request.");
        this.a.b(jobParameters, false);
    }

    public final /* synthetic */ void h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        this.a.b(jobParameters, false);
    }

    public final void k(b7 b7Var, Runnable runnable) {
        b7Var.b().t(new h6(this, b7Var, runnable));
    }
}
