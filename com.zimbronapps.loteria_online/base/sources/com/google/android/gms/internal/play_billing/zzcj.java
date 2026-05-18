package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzcj extends zzck {

    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzck.zzc) {
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
        final zzcj zza;
        final zzcz zzb;

        public zzb(zzcj zzcjVar, zzcz zzczVar) {
            this.zza = zzcjVar;
            this.zzb = zzczVar;
        }

        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzck.zzq(this.zza, this, zzcj.zza(this.zzb))) {
                zzcj.zzf(this.zza, false);
            }
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new 1("Failure occurred while trying to finish a future."));
        static final zzc zzb = new zzc(new 2("Failure.exception is unexpectedly null."));
        final Throwable zzc;

        public class 1 extends Throwable {
            public 1(String str) {
                super("Failure occurred while trying to finish a future.");
            }

            public final Throwable fillInStackTrace() {
                return this;
            }
        }

        public class 2 extends Throwable {
            public 2(String str) {
                super("Failure.exception is unexpectedly null.");
            }

            public final Throwable fillInStackTrace() {
                return this;
            }
        }

        public zzc(Throwable th) {
            th.getClass();
            this.zzc = th;
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

    interface zze extends zzcz {
    }

    public static /* bridge */ /* synthetic */ Object zza(zzcz zzczVar) {
        return zzr(zzczVar);
    }

    public static Object zzc(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (!(obj instanceof zzc)) {
            if (obj == zzck.zza) {
                return null;
            }
            return obj;
        }
        Throwable th2 = ((zzc) obj).zzc;
        if (th2 != null) {
            throw new ExecutionException(th2);
        }
        zzck.zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(zzc.zzb.zzc);
    }

    public static /* bridge */ /* synthetic */ void zzf(zzcj zzcjVar, boolean z) {
        zzu(zzcjVar, false);
    }

    public static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object zzr(zzcz zzczVar) {
        Throwable zze2;
        if (zzczVar instanceof zze) {
            Object obj = ((zzcj) zzczVar).valueField;
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
        if ((zzczVar instanceof zzdf) && (zze2 = ((zzdf) zzczVar).zze()) != null) {
            return new zzc(zze2);
        }
        boolean isCancelled = zzczVar.isCancelled();
        if ((!zzck.zzc) && isCancelled) {
            zza zzaVar2 = zza.zzb;
            Objects.requireNonNull(zzaVar2);
            return zzaVar2;
        }
        try {
            Object zzs = zzs(zzczVar);
            if (!isCancelled) {
                return zzs == null ? zzck.zza : zzs;
            }
            return new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(zzczVar)));
        } catch (Error e) {
            e = e;
            return new zzc(e);
        } catch (ExecutionException e2) {
            return isCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzczVar)), e2)) : new zzc(e2.getCause());
        } catch (CancellationException e3) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzczVar)), e3)) : new zza(false, e3);
        } catch (Exception e4) {
            e = e4;
            return new zzc(e);
        }
    }

    private static Object zzs(Future future) throws ExecutionException {
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

    private final void zzt(StringBuilder sb) {
        try {
            Object zzs = zzs(this);
            sb.append("SUCCESS, result=[");
            if (zzs == null) {
                sb.append("null");
            } else if (zzs == this) {
                sb.append("this future");
            } else {
                sb.append(zzs.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzs)));
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

    private static void zzu(zzcj zzcjVar, boolean z) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            zzcjVar.zzo();
            zzcjVar.zzg();
            zzd zzdVar3 = zzdVar2;
            zzd zzk = zzcjVar.zzk(zzd.zza);
            zzd zzdVar4 = zzdVar3;
            while (zzk != null) {
                zzd zzdVar5 = zzk.next;
                zzk.next = zzdVar4;
                zzdVar4 = zzk;
                zzk = zzdVar5;
            }
            while (zzdVar4 != null) {
                Runnable runnable = zzdVar4.zzb;
                zzdVar = zzdVar4.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzcjVar = zzbVar.zza;
                    if (zzcjVar.valueField == zzbVar && zzck.zzq(zzcjVar, zzbVar, zzr(zzbVar.zzb))) {
                        break;
                    }
                } else {
                    Executor executor = zzdVar4.zzc;
                    Objects.requireNonNull(executor);
                    zzv(runnable2, executor);
                }
                zzdVar4 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private static void zzv(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zzck.zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), e);
        }
    }

    public final boolean cancel(boolean z) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzck.zzc) {
            zzaVar = new zza(z, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzcj zzcjVar = this;
        boolean z2 = false;
        while (true) {
            if (zzck.zzq(zzcjVar, obj, zzaVar)) {
                zzu(zzcjVar, z);
                if (!(obj instanceof zzb)) {
                    break;
                }
                zzcz zzczVar = ((zzb) obj).zzb;
                if (!(zzczVar instanceof zze)) {
                    zzczVar.cancel(z);
                    break;
                }
                zzcjVar = (zzcj) zzczVar;
                obj = zzcjVar.valueField;
                if (!(obj == null) && !(obj instanceof zzb)) {
                    break;
                }
                z2 = true;
            } else {
                obj = zzcjVar.valueField;
                if (zzh(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return zzl();
    }

    public final boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    public final boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            java.lang.Object r1 = r6.valueField
            boolean r1 = r1 instanceof com.google.android.gms.internal.play_billing.zzcj.zza
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Ld0
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.zzt(r0)
            goto Ld0
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.valueField
            boolean r4 = r3 instanceof com.google.android.gms.internal.play_billing.zzcj.zzb
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L94
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.play_billing.zzcj$zzb r3 = (com.google.android.gms.internal.play_billing.zzcj.zzb) r3
            com.google.android.gms.internal.play_billing.zzcz r3 = r3.zzb
            if (r3 != r6) goto L7f
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L90
        L7d:
            r3 = move-exception
            goto L83
        L7f:
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L90
        L83:
            com.google.android.gms.internal.play_billing.zzda.zza(r3)
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L90:
            r0.append(r2)
            goto Lc0
        L94:
            java.lang.String r3 = r6.zzd()     // Catch: java.lang.Throwable -> La3
            r4 = 0
            if (r3 == 0) goto La1
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> La3
            if (r5 == 0) goto Lb3
        La1:
            r3 = r4
            goto Lb3
        La3:
            r3 = move-exception
            com.google.android.gms.internal.play_billing.zzda.zza(r3)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lb3:
            if (r3 == 0) goto Lc0
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lc0:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Ld0
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.zzt(r0)
        Ld0:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzcj.toString():java.lang.String");
    }

    public final void zzb(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzbg.zzc(executor, "Executor was null.");
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
        zzv(runnable, executor);
    }

    public String zzd() {
        throw null;
    }

    public final Throwable zze() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzc;
        }
        return null;
    }

    public void zzg() {
    }

    public final boolean zzi(Throwable th) {
        if (!zzck.zzq(this, null, new zzc(th))) {
            return false;
        }
        zzu(this, false);
        return true;
    }

    public final boolean zzj(zzcz zzczVar) {
        zzc zzcVar;
        Object obj = this.valueField;
        if (obj == null) {
            if (zzczVar.isDone()) {
                if (!zzck.zzq(this, null, zzr(zzczVar))) {
                    return false;
                }
                zzu(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, zzczVar);
            if (zzck.zzq(this, null, zzbVar)) {
                try {
                    zzczVar.zzb(zzbVar, zzcp.zza);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Exception | Error unused) {
                        zzcVar = zzc.zza;
                    }
                    zzck.zzq(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            zzczVar.cancel(((zza) obj).zzc);
        }
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return zzm(j, timeUnit);
    }
}
