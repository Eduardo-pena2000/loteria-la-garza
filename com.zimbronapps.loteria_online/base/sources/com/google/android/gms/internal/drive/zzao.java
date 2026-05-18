package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.drive.DriveId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzao implements m {
    private final Status zzdy;
    private final DriveId zzk;

    public zzao(Status status, DriveId driveId) {
        this.zzdy = status;
        this.zzk = driveId;
    }

    public final DriveId getDriveId() {
        return this.zzk;
    }

    public final Status getStatus() {
        return this.zzdy;
    }
}
