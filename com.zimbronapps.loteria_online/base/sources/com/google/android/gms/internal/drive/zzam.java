package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zzam extends zzau {
    public zzam(h hVar) {
        super(hVar);
    }

    public /* synthetic */ m createFailedResult(Status status) {
        return new zzal(status, null);
    }
}
