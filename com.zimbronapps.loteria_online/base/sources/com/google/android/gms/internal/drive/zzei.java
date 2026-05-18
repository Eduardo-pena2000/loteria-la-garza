package com.google.android.gms.internal.drive;

import H6.n;
import H6.t;
import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzei extends a implements n {
    public static final Parcelable.Creator CREATOR = new zzej();
    private int zzbn;
    private int zzgy;
    private boolean zzgz;

    public zzei(int i, int i2, boolean z) {
        this.zzgy = i;
        this.zzbn = i2;
        this.zzgz = z;
    }

    private static boolean zzh(int i) {
        return i == 1 || i == 2;
    }

    private static boolean zzi(int i) {
        return i == 256 || i == 257;
    }

    public final int getBatteryUsagePreference() {
        if (zzi(this.zzbn)) {
            return this.zzbn;
        }
        return 0;
    }

    public final int getNetworkTypePreference() {
        if (zzh(this.zzgy)) {
            return this.zzgy;
        }
        return 0;
    }

    public final boolean isRoamingAllowed() {
        return this.zzgz;
    }

    public final void setBatteryUsagePreference(int i) {
        if (!zzi(i)) {
            throw new IllegalArgumentException("Invalid battery usage preference value.");
        }
        this.zzbn = i;
    }

    public final void setNetworkTypePreference(int i) {
        if (!zzh(i)) {
            throw new IllegalArgumentException("Invalid data connection preference value.");
        }
        this.zzgy = i;
    }

    public final void setRoamingAllowed(boolean z) {
        this.zzgz = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 2, this.zzgy);
        c.t(parcel, 3, this.zzbn);
        c.g(parcel, 4, this.zzgz);
        c.b(parcel, a);
    }

    public zzei(t tVar) {
        this(tVar.getNetworkPreference(), tVar.getBatteryUsagePreference(), tVar.isRoamingAllowed());
    }
}
