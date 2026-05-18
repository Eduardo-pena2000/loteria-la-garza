package com.google.android.gms.internal.games_v2;

import W6.y;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaf extends y {
    public static final Parcelable.Creator CREATOR = new zzag();
    private final Bundle zza;
    private final IBinder zzb;

    public zzaf(Bundle bundle, IBinder iBinder) {
        this.zza = bundle;
        this.zzb = iBinder;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.zza;
        int a = c.a(parcel);
        c.j(parcel, 1, bundle, false);
        c.s(parcel, 2, this.zzb, false);
        c.b(parcel, a);
    }

    public zzaf(zzae zzaeVar) {
        this.zza = zzaeVar.zza();
        this.zzb = zzaeVar.zza;
    }
}
