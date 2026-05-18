package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzb extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbzc();
    public final boolean zza;
    public final List zzb;

    public zzbzb() {
        this(false, Collections.emptyList());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int a = y6.c.a(parcel);
        y6.c.g(parcel, 2, z);
        y6.c.G(parcel, 3, this.zzb, false);
        y6.c.b(parcel, a);
    }

    public zzbzb(boolean z, List list) {
        this.zza = z;
        this.zzb = list;
    }
}
