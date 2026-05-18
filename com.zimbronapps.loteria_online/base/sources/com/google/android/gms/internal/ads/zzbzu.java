package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzu extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbzv();
    public final Bundle zza;
    public final W5.a zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzflg zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final int zzo;

    public zzbzu(Bundle bundle, W5.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzflg zzflgVar, String str4, boolean z, boolean z2, Bundle bundle2, Bundle bundle3, int i) {
        this.zza = bundle;
        this.zzb = aVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzflgVar;
        this.zzj = str4;
        this.zzk = z;
        this.zzl = z2;
        this.zzm = bundle2;
        this.zzn = bundle3;
        this.zzo = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.zza;
        int a = y6.c.a(parcel);
        y6.c.j(parcel, 1, bundle, false);
        y6.c.C(parcel, 2, this.zzb, i, false);
        y6.c.C(parcel, 3, this.zzc, i, false);
        y6.c.E(parcel, 4, this.zzd, false);
        y6.c.G(parcel, 5, this.zze, false);
        y6.c.C(parcel, 6, this.zzf, i, false);
        y6.c.E(parcel, 7, this.zzg, false);
        y6.c.E(parcel, 9, this.zzh, false);
        y6.c.C(parcel, 10, this.zzi, i, false);
        y6.c.E(parcel, 11, this.zzj, false);
        y6.c.g(parcel, 12, this.zzk);
        y6.c.g(parcel, 13, this.zzl);
        y6.c.j(parcel, 14, this.zzm, false);
        y6.c.j(parcel, 15, this.zzn, false);
        y6.c.t(parcel, 16, this.zzo);
        y6.c.b(parcel, a);
    }
}
