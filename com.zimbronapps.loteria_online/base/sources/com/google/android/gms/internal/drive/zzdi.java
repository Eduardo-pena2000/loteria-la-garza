package com.google.android.gms.internal.drive;

import I6.f;
import I6.o;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.drive.DriveId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdi {
    private f zzgg;
    private zzee zzgh;
    private DriveId zzk;

    public zzdi(zzch zzchVar, f fVar, DriveId driveId) {
        t.o(o.a(1, driveId));
        this.zzk = driveId;
        Looper looper = zzchVar.getLooper();
        Context applicationContext = zzchVar.getApplicationContext();
        fVar.getClass();
        zzee zzeeVar = new zzee(looper, applicationContext, 1, zzdj.zza(fVar));
        this.zzgh = zzeeVar;
        zzeeVar.zzf(1);
    }

    public static /* synthetic */ zzee zza(zzdi zzdiVar) {
        return zzdiVar.zzgh;
    }
}
