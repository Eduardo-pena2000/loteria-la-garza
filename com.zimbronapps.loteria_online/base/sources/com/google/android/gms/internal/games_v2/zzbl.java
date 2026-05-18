package com.google.android.gms.internal.games_v2;

import E6.e;
import T6.H;
import T6.J;
import T6.c;
import W6.A;
import W6.C;
import W6.x;
import Z6.b;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.pm.PackageInfo;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbl implements zzav {
    private final AtomicReference zza = new AtomicReference(zzbi.UNINITIALIZED);
    private final AtomicReference zzb = new AtomicReference(zzbh.AUTOMATIC);
    private final Queue zzc = new ArrayDeque();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final Application zzf;
    private final x zzg;
    private final zzbm zzh;

    public zzbl(Application application, x xVar, b bVar, zzbm zzbmVar) {
        this.zzf = application;
        this.zzg = xVar;
        this.zzh = zzbmVar;
    }

    private static com.google.android.gms.common.api.b zzj() {
        return new com.google.android.gms.common.api.b(new Status(4));
    }

    private static Task zzk(AtomicReference atomicReference, TaskCompletionSource taskCompletionSource) {
        int ordinal = ((zzbi) atomicReference.get()).ordinal();
        if (ordinal == 0) {
            return Tasks.forException(new com.google.android.gms.common.api.b(new Status(10)));
        }
        if (ordinal == 2) {
            return Tasks.forResult(c.b);
        }
        if (ordinal == 3) {
            return Tasks.forResult(c.c);
        }
        if (taskCompletionSource == null) {
            return Tasks.forResult(c.c);
        }
        Task task = taskCompletionSource.getTask();
        if (task.isSuccessful()) {
            return ((Boolean) task.getResult()).booleanValue() ? Tasks.forResult(c.b) : Tasks.forResult(c.c);
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        task.addOnCompleteListener(zzge.zza(), new zzbf(taskCompletionSource2));
        return taskCompletionSource2.getTask();
    }

    private static Task zzl(zzgf zzgfVar) {
        if (zzp()) {
            return (Task) zzgfVar.zza();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskExecutors.MAIN_THREAD.execute(new zzbd(zzgfVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private final void zzm(TaskCompletionSource taskCompletionSource, zzq zzqVar) {
        zzfg.zza("GamesApiManager", "Attempting authentication: ".concat(zzqVar.toString()));
        this.zzh.zza(zzqVar).addOnCompleteListener(TaskExecutors.MAIN_THREAD, new zzbe(this, taskCompletionSource, zzqVar));
    }

    private final void zzn(TaskCompletionSource taskCompletionSource, int i, PendingIntent pendingIntent, boolean z, boolean z2) {
        Activity a;
        t.e("Must be called on the main thread.");
        int a2 = e.a(this.zzf, "com.google.android.gms");
        Locale locale = Locale.US;
        zzfg.zza("GamesApiManager", String.format(locale, "GmsCore version is %d", new Object[]{Integer.valueOf(a2)}));
        if (a2 < 220812000) {
            PackageInfo b = e.b(this.zzf, "com.android.vending");
            if (b == null) {
                zzfg.zza("GamesApiManager", "PlayStore is not installed");
            } else {
                int i2 = b.versionCode;
                if (i2 < 82470600) {
                    zzfg.zza("GamesApiManager", String.format(locale, "PlayStore version is below resolution threshold: %s", new Object[]{Integer.valueOf(i2)}));
                } else {
                    zzfg.zza("GamesApiManager", "Installed PlayStore version can be used for resolution.");
                }
            }
            zzfg.zzg("GamesApiManager", "PlayStore is too old or not available and the version of GmsCore would attempt PGA installation on automatic sign-in. Skipping it.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            this.zza.set(zzbi.AUTHENTICATION_FAILED);
            return;
        }
        if (z && pendingIntent != null && (a = this.zzg.a()) != null) {
            b.b(a, pendingIntent).addOnCompleteListener(TaskExecutors.MAIN_THREAD, new zzaz(this, taskCompletionSource, i));
            zzfg.zza("GamesApiManager", "Resolution triggered");
            return;
        }
        boolean zza = zzay.zza(this.zzb, zzbh.AUTOMATIC_PENDING_EXPLICIT, zzbh.EXPLICIT);
        if (!z2 && zza) {
            zzfg.zza("GamesApiManager", "Consumed pending explicit sign-in. Attempting explicit sign-in");
            zzm(taskCompletionSource, zzq.zzb(0));
            return;
        }
        taskCompletionSource.trySetResult(Boolean.FALSE);
        this.zza.set(zzbi.AUTHENTICATION_FAILED);
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            ((zzbk) it.next()).zzc(zzj());
            it.remove();
        }
    }

    private final void zzo(int i) {
        zzbh zzbhVar;
        zzfg.zza("GamesApiManager", "startAuthenticationIfNecessary() signInType: " + i);
        t.e("Must be called on the main thread.");
        AtomicReference atomicReference = this.zza;
        zzbi zzbiVar = zzbi.UNINITIALIZED;
        zzbi zzbiVar2 = zzbi.AUTHENTICATING;
        boolean zza = zzay.zza(atomicReference, zzbiVar, zzbiVar2);
        int i2 = 0;
        if (!zza) {
            if (i != 1) {
                if (zzay.zza(this.zza, zzbi.AUTHENTICATION_FAILED, zzbiVar2)) {
                    i = 0;
                } else {
                    zzfg.zza("GamesApiManager", "Explicit sign-in during existing authentication. Marking pending explicit sign-in: " + zzay.zza(this.zzb, zzbh.AUTOMATIC, zzbh.AUTOMATIC_PENDING_EXPLICIT));
                }
            }
            zzfg.zza("GamesApiManager", "Authentication attempt skipped. Already authenticated or authenticating. State: ".concat(String.valueOf(this.zza.get())));
            return;
        }
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zzd.get();
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(new IllegalStateException("New authentication attempt in progress"));
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        this.zzd.set(taskCompletionSource2);
        AtomicReference atomicReference2 = this.zzb;
        if (i == 0) {
            zzbhVar = zzbh.EXPLICIT;
        } else {
            zzbhVar = zzbh.AUTOMATIC;
            i2 = 1;
        }
        atomicReference2.set(zzbhVar);
        zzm(taskCompletionSource2, zzq.zzb(i2));
    }

    private static boolean zzp() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final Task zza() {
        return zzl(new zzbc(this));
    }

    public final Task zzb() {
        return zzl(new zzbg(this));
    }

    public final Task zzc() {
        return zzk(this.zza, (TaskCompletionSource) this.zzd.get());
    }

    public final Task zzd(zzao zzaoVar) {
        zzbi zzbiVar = (zzbi) this.zza.get();
        zzfg.zzf("GamesApiManager", "Executing API call with authentication state: ".concat(String.valueOf(zzbiVar)));
        if (zzbiVar == zzbi.AUTHENTICATED) {
            return zzaoVar.zza((g) this.zze.get());
        }
        if (zzbiVar == zzbi.AUTHENTICATION_FAILED) {
            return Tasks.forException(zzj());
        }
        if (zzbiVar == zzbi.UNINITIALIZED) {
            return Tasks.forException(new com.google.android.gms.common.api.b(new Status(10)));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzba zzbaVar = new zzba(this, new zzbk(zzaoVar, taskCompletionSource));
        if (zzp()) {
            zzbaVar.run();
        } else {
            TaskExecutors.MAIN_THREAD.execute(zzbaVar);
        }
        return taskCompletionSource.getTask();
    }

    public final /* synthetic */ Task zze() {
        zzo(1);
        return zzk(this.zza, (TaskCompletionSource) this.zzd.get());
    }

    public final /* synthetic */ Task zzf() {
        zzo(0);
        return zzk(this.zza, (TaskCompletionSource) this.zzd.get());
    }

    public final /* synthetic */ void zzg(TaskCompletionSource taskCompletionSource, zzq zzqVar, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            zzfq.zza(exception);
            zzfg.zzb("GamesApiManager", "Authentication task failed", exception);
            zzn(taskCompletionSource, zzqVar.zza(), null, false, !zzqVar.zzd());
            return;
        }
        zzbq zzbqVar = (zzbq) task.getResult();
        if (!zzbqVar.zze()) {
            zzfg.zza("GamesApiManager", "Failed to authenticate: ".concat(String.valueOf(zzbqVar)));
            zzn(taskCompletionSource, zzqVar.zza(), zzbqVar.zza(), true, !zzqVar.zzd());
            return;
        }
        String zzd = zzbqVar.zzd();
        if (zzd == null) {
            zzfg.zzg("GamesApiManager", "Unexpected state: game run token absent");
            zzn(taskCompletionSource, zzqVar.zza(), null, false, !zzqVar.zzd());
            return;
        }
        zzfg.zza("GamesApiManager", "Successfully authenticated");
        t.e("Must be called on the main thread.");
        H b = J.b();
        b.d(2101523);
        b.c(GoogleSignInAccount.M1());
        b.a(zzd);
        A a = C.a();
        a.b(true);
        a.c(true);
        a.a(true);
        b.b(a.d());
        zzd zzdVar = new zzd(this.zzf, b.e());
        this.zze.set(zzdVar);
        this.zza.set(zzbi.AUTHENTICATED);
        taskCompletionSource.trySetResult(Boolean.TRUE);
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            ((zzbk) it.next()).zza(zzdVar);
            it.remove();
        }
    }

    public final /* synthetic */ void zzh(TaskCompletionSource taskCompletionSource, int i, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            zzfq.zza(exception);
            zzfg.zzh("GamesApiManager", "Resolution failed", exception);
            zzn(taskCompletionSource, i, null, false, true);
            return;
        }
        Z6.c cVar = (Z6.c) task.getResult();
        if (cVar.d()) {
            zzfg.zza("GamesApiManager", "Resolution successful");
            zzm(taskCompletionSource, zzq.zzc(i, zzx.zza(cVar.a())));
        } else {
            zzfg.zza("GamesApiManager", "Resolution attempt was canceled");
            zzn(taskCompletionSource, i, null, false, true);
        }
    }

    public final /* synthetic */ void zzi(zzbk zzbkVar) {
        t.e("Must be called on the main thread.");
        zzbi zzbiVar = (zzbi) this.zza.get();
        if (zzbiVar == zzbi.AUTHENTICATED) {
            zzbkVar.zza((g) this.zze.get());
        } else if (zzbiVar == zzbi.AUTHENTICATION_FAILED) {
            zzbkVar.zzc(zzj());
        } else {
            this.zzc.add(zzbkVar);
        }
    }
}
