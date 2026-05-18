package com.google.android.gms.internal.drive;

import H6.t;
import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgo extends a implements t {
    public static final Parcelable.Creator CREATOR = new zzgp();
    private final boolean zzbm;
    private final int zzbn;
    private final int zzgy;

    public zzgo(int i, int i2, boolean z) {
        this.zzgy = i;
        this.zzbn = i2;
        this.zzbm = z;
    }

    public final int getBatteryUsagePreference() {
        return this.zzbn;
    }

    public final int getNetworkPreference() {
        return this.zzgy;
    }

    public final boolean isRoamingAllowed() {
        return this.zzbm;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 2, this.zzgy);
        c.t(parcel, 3, this.zzbn);
        c.g(parcel, 4, this.zzbm);
        c.b(parcel, a);
    }
}
