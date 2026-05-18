package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbl implements n {
    public zzbl(zzbi zzbiVar) {
    }

    public final /* synthetic */ void onResult(m mVar) {
        Status status = (Status) mVar;
        if (status.R1()) {
            return;
        }
        zzbi.zzx().f("DriveContentsImpl", "Error discarding contents, status: %s", new Object[]{status});
    }
}
