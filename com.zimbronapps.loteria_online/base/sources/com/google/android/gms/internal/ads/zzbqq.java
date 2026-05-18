package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbqq extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbqr();
    public final String zza;
    public final Bundle zzb;

    public zzbqq(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.j(parcel, 2, this.zzb, false);
        y6.c.b(parcel, a);
    }
}
