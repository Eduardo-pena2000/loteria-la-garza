package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzqm extends zzpa {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzsq zzc = zzsq.zzc();

    public static /* bridge */ /* synthetic */ boolean zzC(zzqm zzqmVar, boolean z) {
        return zzc(zzqmVar, false);
    }

    private final int zza(zzsa zzsaVar) {
        return zzrx.zza().zzb(getClass()).zza(this);
    }

    private static final boolean zzc(zzqm zzqmVar, boolean z) {
        byte byteValue = ((Byte) zzqmVar.zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzh = zzrx.zza().zzb(zzqmVar.getClass()).zzh(zzqmVar);
        if (z) {
            zzqmVar.zzb(2, true != zzh ? null : zzqmVar, null);
        }
        return zzh;
    }

    public static zzqm zzq(Class cls) {
        Map map = zzb;
        zzqm zzqmVar = (zzqm) map.get(cls);
        if (zzqmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzqmVar = (zzqm) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzqmVar == null) {
            zzqmVar = (zzqm) ((zzqm) zzsw.zze(cls)).zzb(6, null, null);
            if (zzqmVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzqmVar);
        }
        return zzqmVar;
    }

    public static zzqq zzs() {
        return zzqn.zzf();
    }

    public static zzqr zzt() {
        return zzry.zze();
    }

    public static Object zzv(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            Error cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        }
    }

    public static Object zzw(zzrq zzrqVar, String str, Object[] objArr) {
        return new zzrz(zzrqVar, str, objArr);
    }

    public static void zzz(Class cls, zzqm zzqmVar) {
        zzqmVar.zzy();
        zzb.put(cls, zzqmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzrx.zza().zzb(getClass()).zzg(this, (zzqm) obj);
    }

    public final int hashCode() {
        if (zzD()) {
            return zzm();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzm = zzm();
        this.zza = zzm;
        return zzm;
    }

    public final String toString() {
        return zzrs.zza(this, super.toString());
    }

    public final void zzA(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final void zzB(zzpv zzpvVar) throws IOException {
        zzrx.zza().zzb(getClass()).zzf(this, zzpw.zza(zzpvVar));
    }

    public final boolean zzD() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    public final int zzj(zzsa zzsaVar) {
        if (zzD()) {
            int zza = zzsaVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzsaVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    public final /* synthetic */ zzrq zzl() {
        return (zzqm) zzb(6, null, null);
    }

    public final int zzm() {
        return zzrx.zza().zzb(getClass()).zzb(this);
    }

    public final int zzn() {
        int i;
        if (zzD()) {
            i = zza(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zza(null);
                if (i < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }

    public final boolean zzo() {
        return zzc(this, true);
    }

    public final zzqj zzp() {
        return (zzqj) zzb(5, null, null);
    }

    public final zzqm zzr() {
        return (zzqm) zzb(4, null, null);
    }

    public final /* synthetic */ zzrp zzu() {
        return (zzqj) zzb(5, null, null);
    }

    public final void zzx() {
        zzrx.zza().zzb(getClass()).zzd(this);
        zzy();
    }

    public final void zzy() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
