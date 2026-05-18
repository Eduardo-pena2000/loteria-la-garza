package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.drive.DriveId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzba extends zzav {
    private final /* synthetic */ DriveId zzen;
    private final /* synthetic */ int zzeo = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzba(zzaw zzawVar, h hVar, DriveId driveId, int i) {
        super(hVar);
        this.zzen = driveId;
    }

    public final /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzeo) ((zzaw) bVar).getService()).zza(new zzgs(this.zzen, this.zzeo), (zzes) null, (String) null, new zzgy(this));
    }
}
