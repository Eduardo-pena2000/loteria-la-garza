package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaz extends a {
    public static final Parcelable.Creator CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(int i, String str, byte[] bArr) {
        this.zza = 1;
        this.zzb = (String) t.l(str);
        this.zzc = (byte[]) t.l(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.E(parcel, 2, this.zzb, false);
        c.k(parcel, 3, this.zzc, false);
        c.b(parcel, a);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
