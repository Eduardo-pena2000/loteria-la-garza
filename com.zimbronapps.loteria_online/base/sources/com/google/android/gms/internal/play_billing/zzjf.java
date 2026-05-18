package com.google.android.gms.internal.play_billing;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzjf extends zzfi implements zzgm {
    private static final zzjf zzb;
    private int zzd;
    private zzfn zze = zzfi.zzr();
    private String zzf = "";
    private boolean zzg;

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzfi.zzw(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    public static /* synthetic */ void zzA(zzjf zzjfVar, boolean z) {
        zzjfVar.zzd |= 2;
        zzjfVar.zzg = z;
    }

    public static /* bridge */ /* synthetic */ zzjf zzc() {
        return zzb;
    }

    public static zzjf zzd() {
        return zzb;
    }

    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", zzjd.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzjf();
        }
        if (i2 == 4) {
            return new zzja(null);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
