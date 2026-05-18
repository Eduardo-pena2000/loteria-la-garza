package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgzv extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzgzu(null);
    private static final Runnable zzb = new zzgzu(null);

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgzt zzgztVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzgzt)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgztVar = (zzgzt) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzgztVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean zzd = zzd();
            if (!zzd) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    try {
                        zzhag.zza(th);
                        if (!compareAndSet(currentThread, zza)) {
                            zzb(currentThread);
                        }
                        zzg(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzb(currentThread);
                        }
                        zzf(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzb(currentThread);
            }
            if (zzd) {
                return;
            }
            zzf(obj);
        }
    }

    public final String toString() {
        String str;
        Thread thread = (Runnable) get();
        if (thread == zza) {
            str = "running=[DONE]";
        } else if (thread instanceof zzgzt) {
            str = "running=[INTERRUPTED]";
        } else if (thread instanceof Thread) {
            String name = thread.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzc = zzc();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(zzc).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzc);
        return sb2.toString();
    }

    public abstract Object zza() throws Exception;

    public abstract String zzc();

    public abstract boolean zzd();

    public abstract void zzf(Object obj);

    public abstract void zzg(Throwable th);

    public final void zzh() {
        Thread thread = (Runnable) get();
        if (thread instanceof Thread) {
            zzgzt zzgztVar = new zzgzt(this, null);
            zzgztVar.zza(Thread.currentThread());
            if (compareAndSet(thread, zzgztVar)) {
                try {
                    Thread thread2 = thread;
                    thread2.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread2);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                    throw th;
                }
            }
        }
    }
}
