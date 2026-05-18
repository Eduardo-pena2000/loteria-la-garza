package com.google.android.gms.internal.ads;

import N6.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbyk extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbyl();
    public final View zza;
    public final Map zzb;

    public zzbyk(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) N6.b.r1(a.a.q1(iBinder));
        this.zzb = (Map) N6.b.r1(a.a.q1(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        View view = this.zza;
        int a = y6.c.a(parcel);
        y6.c.s(parcel, 1, N6.b.s1(view).asBinder(), false);
        y6.c.s(parcel, 2, N6.b.s1(this.zzb).asBinder(), false);
        y6.c.b(parcel, a);
    }
}
