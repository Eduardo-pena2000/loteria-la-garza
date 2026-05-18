package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbpv extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbpw();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    public zzbpv(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zza = z;
        this.zzb = str;
        this.zzc = i;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z2;
        this.zzh = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int a = y6.c.a(parcel);
        y6.c.g(parcel, 1, z);
        y6.c.E(parcel, 2, this.zzb, false);
        y6.c.t(parcel, 3, this.zzc);
        y6.c.k(parcel, 4, this.zzd, false);
        y6.c.F(parcel, 5, this.zze, false);
        y6.c.F(parcel, 6, this.zzf, false);
        y6.c.g(parcel, 7, this.zzg);
        y6.c.x(parcel, 8, this.zzh);
        y6.c.b(parcel, a);
    }
}
