package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zzea extends zzau {
    private zzea(zzdp zzdpVar, h hVar) {
        super(hVar);
    }

    public /* synthetic */ m createFailedResult(Status status) {
        return new zzdz(status, null);
    }

    public /* synthetic */ zzea(zzdp zzdpVar, h hVar, zzdq zzdqVar) {
        this(zzdpVar, hVar);
    }
}
