package com.google.android.gms.internal.drive;

import I6.g;
import android.support.v4.media.session.b;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final /* synthetic */ class zzdl implements zzdg {
    private final zzdk zzgl;
    private final Status zzgm;

    public zzdl(zzdk zzdkVar, Status status) {
        this.zzgl = zzdkVar;
        this.zzgm = status;
    }

    public final void accept(Object obj) {
        zzdk zzdkVar = this.zzgl;
        Status status = this.zzgm;
        b.a(obj);
        zzdkVar.zza(status, (g) null);
    }
}
