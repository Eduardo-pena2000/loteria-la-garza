package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzfi extends zzds {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzhi zzc = zzhi.zzc();

    private static final boolean zzA(zzfi zzfiVar, boolean z) {
        byte byteValue = ((Byte) zzfiVar.zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgs.zza().zzb(zzfiVar.getClass()).zzk(zzfiVar);
        if (z) {
            zzfiVar.zzb(2, true != zzk ? null : zzfiVar, null);
        }
        return zzk;
    }

    private final int zzc(zzgv zzgvVar) {
        return zzgs.zza().zzb(getClass()).zza(this);
    }

    private static zzfi zzd(zzfi zzfiVar, byte[] bArr, int i, int i2, zzeu zzeuVar) throws zzfq {
        if (i2 == 0) {
            return zzfiVar;
        }
        zzfi zzo = zzfiVar.zzo();
        try {
            zzgv zzb2 = zzgs.zza().zzb(zzo.getClass());
            zzb2.zzh(zzo, bArr, 0, i2, new zzdw(zzeuVar));
            zzb2.zzf(zzo);
            return zzo;
        } catch (zzfq e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzfq) {
                throw e2.getCause();
            }
            throw new zzfq(e2);
        } catch (zzhg e3) {
            throw e3.zza();
        }
    }

    public static zzfi zzn(Class cls) {
        Map map = zzb;
        zzfi zzfiVar = (zzfi) map.get(cls);
        if (zzfiVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfiVar = (zzfi) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfiVar == null) {
            zzfiVar = (zzfi) ((zzfi) zzho.zze(cls)).zzb(6, null, null);
            if (zzfiVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzfiVar);
        }
        return zzfiVar;
    }

    public static zzfi zzp(zzfi zzfiVar, byte[] bArr, zzeu zzeuVar) throws zzfq {
        zzfi zzd = zzd(zzfiVar, bArr, 0, bArr.length, zzeuVar);
        if (zzd == null || zzA(zzd, true)) {
            return zzd;
        }
        throw new zzhg(zzd).zza();
    }

    public static zzfm zzq() {
        return zzfj.zzf();
    }

    public static zzfn zzr() {
        return zzgt.zze();
    }

    public static Object zzs(Method method, Object obj, Object... objArr) {
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

    public static Object zzt(zzgl zzglVar, String str, Object[] objArr) {
        return new zzgu(zzglVar, str, objArr);
    }

    public static void zzw(Class cls, zzfi zzfiVar) {
        zzfiVar.zzv();
        zzb.put(cls, zzfiVar);
    }

    public static /* bridge */ /* synthetic */ boolean zzy(zzfi zzfiVar, boolean z) {
        return zzA(zzfiVar, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgs.zza().zzb(getClass()).zzj(this, (zzfi) obj);
    }

    public final int hashCode() {
        if (zzz()) {
            return zzi();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    public final String toString() {
        return zzgn.zza(this, super.toString());
    }

    public final /* synthetic */ zzgk zzK() {
        return (zzfe) zzb(5, null, null);
    }

    public final void zzL(zzep zzepVar) throws IOException {
        zzgs.zza().zzb(getClass()).zzi(this, zzeq.zza(zzepVar));
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    public final int zze(zzgv zzgvVar) {
        if (zzz()) {
            int zza = zzgvVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzgvVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    public final /* synthetic */ zzgl zzh() {
        return (zzfi) zzb(6, null, null);
    }

    public final int zzi() {
        return zzgs.zza().zzb(getClass()).zzb(this);
    }

    public final int zzj() {
        int i;
        if (zzz()) {
            i = zzc(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zzc(null);
                if (i < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }

    public final boolean zzk() {
        return zzA(this, true);
    }

    public final zzfe zzl() {
        return (zzfe) zzb(5, null, null);
    }

    public final zzfe zzm() {
        zzfe zzfeVar = (zzfe) zzb(5, null, null);
        zzfeVar.zzd(this);
        return zzfeVar;
    }

    public final zzfi zzo() {
        return (zzfi) zzb(4, null, null);
    }

    public final void zzu() {
        zzgs.zza().zzb(getClass()).zzf(this);
        zzv();
    }

    public final void zzv() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzx(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzz() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
