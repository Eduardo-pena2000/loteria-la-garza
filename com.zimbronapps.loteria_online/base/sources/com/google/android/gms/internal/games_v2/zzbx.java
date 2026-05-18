package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbx implements zzap {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbx(String str) {
        this.zza = str;
    }

    public final Task zza(g gVar) {
        return gVar.doWrite(w.builder().b(new zzbs(this.zza)).e(6695).a());
    }
}
