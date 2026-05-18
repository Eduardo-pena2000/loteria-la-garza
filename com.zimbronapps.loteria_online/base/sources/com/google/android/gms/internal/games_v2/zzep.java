package com.google.android.gms.internal.games_v2;

import W6.k;
import c7.b;
import c7.g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzep implements r {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ g zzc;
    public final /* synthetic */ b zzd;

    public /* synthetic */ zzep(String str, String str2, g gVar, b bVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = gVar;
        this.zzd = bVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((k) obj).r((TaskCompletionSource) obj2, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
