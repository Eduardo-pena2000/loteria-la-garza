package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbb extends a {
    public static final Parcelable.Creator CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(int i, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        this.zzb = (String) t.l(str);
        this.zzc = (PendingIntent) t.l(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.E(parcel, 2, this.zzb, false);
        c.C(parcel, 3, this.zzc, i, false);
        c.b(parcel, a);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
