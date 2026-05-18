package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbn extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzcbo();
    public final String zza;
    public final String zzb;

    public zzcbn(f6.e eVar) {
        this(eVar.b(), eVar.a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.E(parcel, 2, this.zzb, false);
        y6.c.b(parcel, a);
    }

    public zzcbn(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
