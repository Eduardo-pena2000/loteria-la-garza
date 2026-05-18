package com.google.android.gms.internal.ads;

import S5.l2;
import S5.q2;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcdh extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzcdi();
    public final String zza;
    public final String zzb;

    @Deprecated
    public final q2 zzc;
    public final l2 zzd;
    public final int zze;
    public final String zzf;

    public zzcdh(String str, String str2, q2 q2Var, l2 l2Var, int i, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = q2Var;
        this.zzd = l2Var;
        this.zze = i;
        this.zzf = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.E(parcel, 2, this.zzb, false);
        y6.c.C(parcel, 3, this.zzc, i, false);
        y6.c.C(parcel, 4, this.zzd, i, false);
        y6.c.t(parcel, 5, this.zze);
        y6.c.E(parcel, 6, this.zzf, false);
        y6.c.b(parcel, a);
    }
}
