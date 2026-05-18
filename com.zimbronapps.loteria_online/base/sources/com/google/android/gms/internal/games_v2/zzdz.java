package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzdz implements zzap {
    public final /* synthetic */ boolean zza;

    public /* synthetic */ zzdz(boolean z) {
        this.zza = z;
    }

    public final Task zza(g gVar) {
        return gVar.doRead(w.builder().b(new zzdx(this.zza)).e(6710).a());
    }
}
