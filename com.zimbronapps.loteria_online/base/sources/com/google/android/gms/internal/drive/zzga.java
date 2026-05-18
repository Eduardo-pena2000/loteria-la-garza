package com.google.android.gms.internal.drive;

import H6.t;
import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzga extends a {
    public static final Parcelable.Creator CREATOR = new zzgb();
    private final zzgo zzil;

    public zzga(zzgo zzgoVar) {
        this.zzil = zzgoVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzil, i, false);
        c.b(parcel, a);
    }

    public final t zzax() {
        return this.zzil;
    }
}
