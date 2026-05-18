package com.google.android.gms.internal.drive;

import H6.g;
import H6.i;
import H6.m;
import H6.q;
import K6.k;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdh extends w {
    private final i zzfj;
    private final q zzgc;
    private m zzgd;
    private String zzge = null;
    private k zzgf;
    private final g zzo;

    public zzdh(i iVar, q qVar, g gVar, m mVar, String str) {
        this.zzfj = iVar;
        this.zzgc = qVar;
        this.zzo = gVar;
        this.zzgd = mVar;
        t.m(iVar, "DriveFolder must not be null");
        t.m(iVar.getDriveId(), "Folder's DriveId must not be null");
        t.m(qVar, "MetadataChangeSet must not be null");
        t.m(mVar, "ExecutionOptions must not be null");
        k c = k.c(qVar.a());
        this.zzgf = c;
        if (c != null && c.a()) {
            throw new IllegalArgumentException("May not create folders using this method. Use DriveFolderManagerClient#createFolder() instead of mime type application/vnd.google-apps.folder");
        }
        if (gVar != null) {
            if (!(gVar instanceof zzbi)) {
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if (gVar.getDriveId() != null) {
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (gVar.zzk()) {
                throw new IllegalArgumentException("DriveContents are already closed.");
            }
        }
    }

    public final /* synthetic */ void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzaw zzawVar = (zzaw) bVar;
        this.zzgd.b(zzawVar);
        q qVar = this.zzgc;
        qVar.b().O1(zzawVar.getContext());
        int zza = zzbs.zza(this.zzo, this.zzgf);
        k kVar = this.zzgf;
        ((zzeo) zzawVar.getService()).zza(new zzw(this.zzfj.getDriveId(), qVar.b(), zza, (kVar == null || !kVar.b()) ? 0 : 1, this.zzgd), new zzhj(taskCompletionSource));
    }
}
