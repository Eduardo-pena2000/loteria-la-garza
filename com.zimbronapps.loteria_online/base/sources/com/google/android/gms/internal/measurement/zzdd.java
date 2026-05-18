package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdd extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzde();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final Bundle zzd;
    public final String zze;

    public zzdd(long j, long j2, boolean z, Bundle bundle, String str) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = bundle;
        this.zze = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int a = c.a(parcel);
        c.x(parcel, 1, j);
        c.x(parcel, 2, this.zzb);
        c.g(parcel, 3, this.zzc);
        c.j(parcel, 7, this.zzd, false);
        c.E(parcel, 8, this.zze, false);
        c.b(parcel, a);
    }
}
