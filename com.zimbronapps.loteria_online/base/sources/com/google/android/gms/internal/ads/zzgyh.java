package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgyh extends zzgyi {

    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgyi.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        public zza(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    final class zzb implements Runnable {
        final zzgyh zza;
        final x7.e zzb;

        public zzb(zzgyh zzgyhVar, x7.e eVar) {
            this.zza = zzgyhVar;
            this.zzb = eVar;
        }

        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzgyi.zzr(this.zza, this, zzgyh.zzn(this.zzb))) {
                zzgyh.zzo(this.zza, false);
            }
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new 1("Failure occurred while trying to finish a future."));
        final Throwable zzb;

        public class 1 extends Throwable {
            public 1(String str) {
                super("Failure occurred while trying to finish a future.");
            }

            public final Throwable fillInStackTrace() {
                return this;
            }
        }

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    interface zze extends x7.e {
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    abstract class zzf extends zzgyh implements zze {
    }

    private static Object zze(x7.e eVar) {
        Throwable zzl;
        if (eVar instanceof zze) {
            Object obj = ((zzgyh) eVar).valueField;
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                if (zzaVar.zzc) {
                    Throwable th = zzaVar.zzd;
                    obj = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((eVar instanceof zzhaq) && (zzl = ((zzhaq) eVar).zzl()) != null) {
            return new zzc(zzl);
        }
        boolean isCancelled = eVar.isCancelled();
        if ((!zzgyi.zzg) && isCancelled) {
            zza zzaVar2 = zza.zzb;
            Objects.requireNonNull(zzaVar2);
            return zzaVar2;
        }
        try {
            Object zzf2 = zzf(eVar);
            if (!isCancelled) {
                return zzf2 == null ? zzgyi.zze : zzf2;
            }
            String valueOf = String.valueOf(eVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new zza(false, new IllegalArgumentException(sb.toString()));
        } catch (Exception e) {
            e = e;
            return new zzc(e);
        } catch (ExecutionException e2) {
            return isCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(eVar)), e2)) : new zzc(e2.getCause());
        } catch (Error e3) {
            e = e3;
            return new zzc(e);
        } catch (CancellationException e4) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(eVar)), e4)) : new zza(false, e4);
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object zzg(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzgyi.zze) {
            return null;
        }
        return obj;
    }

    public static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    public static /* synthetic */ Object zzn(x7.e eVar) {
        return zze(eVar);
    }

    public static /* synthetic */ void zzo(zzgyh zzgyhVar, boolean z) {
        zzw(zzgyhVar, false);
    }

    private static void zzw(zzgyh zzgyhVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            zzgyhVar.zzs();
            if (z) {
                zzgyhVar.zzi();
            }
            zzgyhVar.zzc();
            zzd zzdVar2 = zzdVar;
            zzd zzq = zzgyhVar.zzq(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzq != null) {
                zzd zzdVar4 = zzq.next;
                zzq.next = zzdVar3;
                zzdVar3 = zzq;
                zzq = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzgyhVar = zzbVar.zza;
                    if (zzgyhVar.valueField == zzbVar && zzgyi.zzr(zzgyhVar, zzbVar, zze(zzbVar.zzb))) {
                        break;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private final void zzx(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append("null");
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append("]");
        } catch (Exception e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger zza2 = zzgyi.zzf.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e);
        }
    }

    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzgrc.zzk(runnable, "Runnable was null.");
        zzgrc.zzk(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    public boolean cancel(boolean z) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzgyi.zzg) {
            zzaVar = new zza(z, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzgyh zzgyhVar = this;
        boolean z2 = false;
        while (true) {
            if (zzgyi.zzr(zzgyhVar, obj, zzaVar)) {
                zzw(zzgyhVar, z);
                if (!(obj instanceof zzb)) {
                    break;
                }
                x7.e eVar = ((zzb) obj).zzb;
                if (!(eVar instanceof zze)) {
                    eVar.cancel(z);
                    break;
                }
                zzgyhVar = (zzgyh) eVar;
                obj = zzgyhVar.valueField;
                if (!(obj == null) && !(obj instanceof zzb)) {
                    break;
                }
                z2 = true;
            } else {
                obj = zzgyhVar.valueField;
                if (zzh(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public Object get() throws InterruptedException, ExecutionException {
        return zzu();
    }

    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzx(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                x7.e eVar = ((zzb) obj).zzb;
                try {
                    if (eVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(eVar);
                    }
                } catch (Throwable th) {
                    zzhag.zzb(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = zzgrt.zzb(zzd());
                } catch (Throwable th2) {
                    zzhag.zzb(th2);
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzx(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean zza(Object obj) {
        if (obj == null) {
            obj = zzgyi.zze;
        }
        if (!zzgyi.zzr(this, null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public boolean zzb(Throwable th) {
        th.getClass();
        if (!zzgyi.zzr(this, null, new zzc(th))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public void zzc() {
    }

    public String zzd() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public void zzi() {
    }

    public final boolean zzj() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    public final boolean zzk(x7.e eVar) {
        zzc zzcVar;
        eVar.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (eVar.isDone()) {
                if (!zzgyi.zzr(this, null, zze(eVar))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, eVar);
            if (zzgyi.zzr(this, null, zzbVar)) {
                try {
                    eVar.addListener(zzbVar, zzgzd.zza);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Exception | Error unused) {
                        zzcVar = zzc.zza;
                    }
                    zzgyi.zzr(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            eVar.cancel(((zza) obj).zzc);
        }
        return false;
    }

    public final Throwable zzl() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public final void zzm(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzj());
        }
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return zzt(j, timeUnit);
    }
}
