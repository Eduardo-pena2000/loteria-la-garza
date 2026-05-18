package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzeb implements zzap {
    public final /* synthetic */ String zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzeb(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final Task zza(g gVar) {
        return gVar.doRead(w.builder().b(new zzdu(this.zza, this.zzb)).e(6711).a());
    }
}
