package com.google.android.gms.internal.drive;

import H6.N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzft extends N {
    public static final Parcelable.Creator CREATOR = new zzfu();
    final boolean zzea;
    final DataHolder zzii;

    public zzft(DataHolder dataHolder, boolean z) {
        this.zzii = dataHolder;
        this.zzea = z;
    }

    public final void zza(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzii, i, false);
        c.g(parcel, 3, this.zzea);
        c.b(parcel, a);
    }

    public final DataHolder zzau() {
        return this.zzii;
    }
}
