package com.google.android.gms.internal.drive;

import com.google.android.gms.common.internal.r;
import com.google.android.gms.drive.DriveId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzf {
    private final int status;
    private final int zzct;
    private final DriveId zzk;

    public zzf(zzh zzhVar) {
        this.zzk = zzhVar.zzk;
        this.zzct = zzhVar.zzct;
        this.status = zzhVar.status;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzf.class) {
            if (obj == this) {
                return true;
            }
            zzf zzfVar = (zzf) obj;
            if (r.b(this.zzk, zzfVar.zzk) && this.zzct == zzfVar.zzct && this.status == zzfVar.status) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r.c(new Object[]{this.zzk, Integer.valueOf(this.zzct), Integer.valueOf(this.status)});
    }

    public final String toString() {
        return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", new Object[]{Integer.valueOf(this.zzct), this.zzk, Integer.valueOf(this.status)});
    }
}
