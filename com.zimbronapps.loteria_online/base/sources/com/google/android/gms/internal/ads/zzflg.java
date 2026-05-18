package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzflg extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzflh();
    public final Context zza;
    public final zzfld zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfld[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzflg(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfld[] values = zzfld.values();
        this.zzh = values;
        int[] zza = zzfle.zza();
        this.zzl = zza;
        int[] zza2 = zzflf.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    public static zzflg zza(zzfld zzfldVar, Context context) {
        if (zzfldVar == zzfld.Rewarded) {
            return new zzflg(context, zzfldVar, ((Integer) S5.D.c().zzd(zzbhe.zzhm)).intValue(), ((Integer) S5.D.c().zzd(zzbhe.zzhs)).intValue(), ((Integer) S5.D.c().zzd(zzbhe.zzhu)).intValue(), (String) S5.D.c().zzd(zzbhe.zzhw), (String) S5.D.c().zzd(zzbhe.zzho), (String) S5.D.c().zzd(zzbhe.zzhq));
        }
        if (zzfldVar == zzfld.Interstitial) {
            return new zzflg(context, zzfldVar, ((Integer) S5.D.c().zzd(zzbhe.zzhn)).intValue(), ((Integer) S5.D.c().zzd(zzbhe.zzht)).intValue(), ((Integer) S5.D.c().zzd(zzbhe.zzhv)).intValue(), (String) S5.D.c().zzd(zzbhe.zzhx), (String) S5.D.c().zzd(zzbhe.zzhp), (String) S5.D.c().zzd(zzbhe.zzhr));
        }
        if (zzfldVar != zzfld.AppOpen) {
            return null;
        }
        return new zzflg(context, zzfldVar, ((Integer) S5.D.c().zzd(zzbhe.zzhA)).intValue(), ((Integer) S5.D.c().zzd(zzbhe.zzhC)).intValue(), ((Integer) S5.D.c().zzd(zzbhe.zzhD)).intValue(), (String) S5.D.c().zzd(zzbhe.zzhy), (String) S5.D.c().zzd(zzbhe.zzhz), (String) S5.D.c().zzd(zzbhe.zzhB));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.t(parcel, 2, this.zzc);
        y6.c.t(parcel, 3, this.zzd);
        y6.c.t(parcel, 4, this.zze);
        y6.c.E(parcel, 5, this.zzf, false);
        y6.c.t(parcel, 6, this.zzj);
        y6.c.t(parcel, 7, this.zzk);
        y6.c.b(parcel, a);
    }

    private zzflg(Context context, zzfld zzfldVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfld.values();
        this.zzl = zzfle.zza();
        this.zzm = zzflf.zza();
        this.zza = context;
        this.zzi = zzfldVar.ordinal();
        this.zzb = zzfldVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        this.zzk = 0;
    }
}
