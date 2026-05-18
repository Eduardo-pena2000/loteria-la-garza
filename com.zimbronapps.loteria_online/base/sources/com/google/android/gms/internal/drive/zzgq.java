package com.google.android.gms.internal.drive;

import L6.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import y6.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgq extends a {
    public static final Parcelable.Creator CREATOR = new zzgr();
    private final c zzir;

    @VisibleForTesting
    public zzgq(c cVar) {
        this.zzir = cVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 2, this.zzir, i, false);
        y6.c.b(parcel, a);
    }
}
