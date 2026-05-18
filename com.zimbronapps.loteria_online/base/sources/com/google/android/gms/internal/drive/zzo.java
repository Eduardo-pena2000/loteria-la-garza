package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzo extends a {
    public static final Parcelable.Creator CREATOR = new zzp();
    private final H6.a zzdf;
    private final int zzdh;
    private final Boolean zzdj;

    @VisibleForTesting
    public zzo(H6.a aVar, Boolean bool, int i) {
        this.zzdf = aVar;
        this.zzdj = bool;
        this.zzdh = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzdf, i, false);
        c.i(parcel, 3, this.zzdj, false);
        c.t(parcel, 4, this.zzdh);
        c.b(parcel, a);
    }

    @VisibleForTesting
    public zzo(int i, boolean z) {
        this(null, Boolean.FALSE, i);
    }
}
