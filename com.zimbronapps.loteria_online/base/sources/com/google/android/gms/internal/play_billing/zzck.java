package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzcj;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zzck extends zzdf implements zzcz {
    static final Object zza = new Object();
    static final zzcy zzb = new zzcy(zzcj.class);
    static final boolean zzc;
    private static final zza zzd;
    volatile zzcj.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    abstract class zza {
        public /* synthetic */ zza(zzco zzcoVar) {
        }

        public abstract zzcj.zzd zza(zzck zzckVar, zzcj.zzd zzdVar);

        public abstract zze zzb(zzck zzckVar, zze zzeVar);

        public abstract void zzc(zze zzeVar, zze zzeVar2);

        public abstract void zzd(zze zzeVar, Thread thread);

        public abstract boolean zze(zzck zzckVar, zzcj.zzd zzdVar, zzcj.zzd zzdVar2);

        public abstract boolean zzf(zzck zzckVar, Object obj, Object obj2);

        public abstract boolean zzg(zzck zzckVar, zze zzeVar, zze zzeVar2);
    }

    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater zzc = AtomicReferenceFieldUpdater.newUpdater(zzck.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater zzd = AtomicReferenceFieldUpdater.newUpdater(zzck.class, zzcj.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater zze = AtomicReferenceFieldUpdater.newUpdater(zzck.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        public final zzcj.zzd zza(zzck zzckVar, zzcj.zzd zzdVar) {
            return (zzcj.zzd) zzd.getAndSet(zzckVar, zzdVar);
        }

        public final zze zzb(zzck zzckVar, zze zzeVar) {
            return (zze) zzc.getAndSet(zzckVar, zzeVar);
        }

        public final void zzc(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        public final void zzd(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        public final boolean zze(zzck zzckVar, zzcj.zzd zzdVar, zzcj.zzd zzdVar2) {
            return zzcl.zza(zzd, zzckVar, zzdVar, zzdVar2);
        }

        public final boolean zzf(zzck zzckVar, Object obj, Object obj2) {
            return zzcl.zza(zze, zzckVar, obj, obj2);
        }

        public final boolean zzg(zzck zzckVar, zze zzeVar, zze zzeVar2) {
            return zzcl.zza(zzc, zzckVar, zzeVar, zzeVar2);
        }

        public /* synthetic */ zzb(zzco zzcoVar) {
            super(null);
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        public final zzcj.zzd zza(zzck zzckVar, zzcj.zzd zzdVar) {
            zzcj.zzd zzdVar2;
            synchronized (zzckVar) {
                try {
                    zzdVar2 = zzckVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzckVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        public final zze zzb(zzck zzckVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzckVar) {
                try {
                    zzeVar2 = zzckVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzckVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        public final void zzc(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        public final void zzd(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        public final boolean zze(zzck zzckVar, zzcj.zzd zzdVar, zzcj.zzd zzdVar2) {
            synchronized (zzckVar) {
                try {
                    if (zzckVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzckVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean zzf(zzck zzckVar, Object obj, Object obj2) {
            synchronized (zzckVar) {
                try {
                    if (zzckVar.valueField != obj) {
                        return false;
                    }
                    zzckVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean zzg(zzck zzckVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzckVar) {
                try {
                    if (zzckVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzckVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzc(zzco zzcoVar) {
            super(null);
        }
    }

    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new zzcn());
            }
            try {
                zzc = unsafe.objectFieldOffset(zzck.class.getDeclaredField("waitersField"));
                zzb = unsafe.objectFieldOffset(zzck.class.getDeclaredField("listenersField"));
                zzd = unsafe.objectFieldOffset(zzck.class.getDeclaredField("valueField"));
                zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        }

        private zzd() {
            throw null;
        }

        public final zzcj.zzd zza(zzck zzckVar, zzcj.zzd zzdVar) {
            zzcj.zzd zzdVar2;
            do {
                zzdVar2 = zzckVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzckVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        public final zze zzb(zzck zzckVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzckVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzg(zzckVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        public final void zzc(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        public final void zzd(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        public final boolean zze(zzck zzckVar, zzcj.zzd zzdVar, zzcj.zzd zzdVar2) {
            return zzcm.zza(zza, zzckVar, zzb, zzdVar, zzdVar2);
        }

        public final boolean zzf(zzck zzckVar, Object obj, Object obj2) {
            return zzcm.zza(zza, zzckVar, zzd, obj, obj2);
        }

        public final boolean zzg(zzck zzckVar, zze zzeVar, zze zzeVar2) {
            return zzcm.zza(zza, zzckVar, zzc, zzeVar, zzeVar2);
        }

        public /* synthetic */ zzd(zzco zzcoVar) {
            super(null);
        }
    }

    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z) {
        }

        public zze() {
            zzck.zzn(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzc = z;
        String property = System.getProperty("java.runtime.name", "");
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(null);
            } catch (Exception | Error e) {
                try {
                    th = e;
                    th2 = null;
                    zzcVar = new zzb(null);
                } catch (Exception | Error e2) {
                    th = e;
                    th2 = e2;
                    zzcVar = new zzc(null);
                }
            }
        } else {
            try {
                zzcVar = new zzb(null);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(null);
            }
        }
        th2 = null;
        th = null;
        zzd = zzcVar;
        if (th2 != null) {
            zzcy zzcyVar = zzb;
            Logger zza2 = zzcyVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zzcyVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzd.zzg(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static /* synthetic */ void zzn(zze zzeVar, Thread thread) {
        zzd.zzd(zzeVar, thread);
    }

    public static boolean zzq(zzck zzckVar, Object obj, Object obj2) {
        return zzd.zzf(zzckVar, obj, obj2);
    }

    public final zzcj.zzd zzk(zzcj.zzd zzdVar) {
        return zzd.zza(this, zzdVar);
    }

    public final Object zzl() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzcj.zzh(obj2)) {
            return zzcj.zzc(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzd;
                zzaVar.zzc(zzeVar2, zzeVar);
                if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzcj.zzh(obj)));
                    return zzcj.zzc(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzcj.zzc(obj3);
    }

    public final Object zzm(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        boolean z = true;
        if ((obj != null) && zzcj.zzh(obj)) {
            return zzcj.zzc(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzd;
                    zzaVar.zzc(zzeVar2, zzeVar);
                    if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzcj.zzh(obj2)) {
                                return zzcj.zzc(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzcj.zzc(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzcj.zzh(obj4)) {
                return zzcj.zzc(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj5 = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + obj5);
    }

    public final void zzo() {
        for (zze zzb2 = zzd.zzb(this, zze.zza); zzb2 != null; zzb2 = zzb2.next) {
            Thread thread = zzb2.thread;
            if (thread != null) {
                zzb2.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final boolean zzp(zzcj.zzd zzdVar, zzcj.zzd zzdVar2) {
        return zzd.zze(this, zzdVar, zzdVar2);
    }
}
