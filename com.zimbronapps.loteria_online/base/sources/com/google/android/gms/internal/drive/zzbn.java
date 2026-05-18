package com.google.android.gms.internal.drive;

import H6.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.drive.DriveId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbn extends zzdp implements h {
    public zzbn(DriveId driveId) {
        super(driveId);
    }

    public final i open(com.google.android.gms.common.api.h hVar, int i, h.a aVar) {
        if (i == 268435456 || i == 536870912 || i == 805306368) {
            return hVar.a(new zzbo(this, hVar, i, aVar == null ? null : new zzbp(hVar.j(aVar))));
        }
        throw new IllegalArgumentException("Invalid mode provided.");
    }
}
