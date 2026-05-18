package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.drive.DriveId;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzh extends a {
    public static final Parcelable.Creator CREATOR = new zzi();
    final int status;
    final int zzct;
    final long zzcw;
    final long zzcx;
    final DriveId zzk;

    public zzh(int i, DriveId driveId, int i2, long j, long j2) {
        this.zzct = i;
        this.zzk = driveId;
        this.status = i2;
        this.zzcw = j;
        this.zzcx = j2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzh.class) {
            if (obj == this) {
                return true;
            }
            zzh zzhVar = (zzh) obj;
            if (this.zzct == zzhVar.zzct && r.b(this.zzk, zzhVar.zzk) && this.status == zzhVar.status && this.zzcw == zzhVar.zzcw && this.zzcx == zzhVar.zzcx) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r.c(new Object[]{Integer.valueOf(this.zzct), this.zzk, Integer.valueOf(this.status), Long.valueOf(this.zzcw), Long.valueOf(this.zzcx)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 2, this.zzct);
        c.C(parcel, 3, this.zzk, i, false);
        c.t(parcel, 4, this.status);
        c.x(parcel, 5, this.zzcw);
        c.x(parcel, 6, this.zzcx);
        c.b(parcel, a);
    }
}
