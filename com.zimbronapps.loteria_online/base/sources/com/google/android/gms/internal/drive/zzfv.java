package com.google.android.gms.internal.drive;

import H6.N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfv extends N {
    public static final Parcelable.Creator CREATOR = new zzfw();
    final DataHolder zzij;

    public zzfv(DataHolder dataHolder) {
        this.zzij = dataHolder;
    }

    public final void zza(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzij, i, false);
        c.b(parcel, a);
    }

    public final DataHolder zzav() {
        return this.zzij;
    }
}
