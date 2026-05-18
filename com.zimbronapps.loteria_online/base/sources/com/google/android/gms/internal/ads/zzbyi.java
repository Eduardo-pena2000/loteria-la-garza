package com.google.android.gms.internal.ads;

import S5.E1;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbyi extends zzccz {
    final /* synthetic */ e6.b zza;

    public zzbyi(zzbyj zzbyjVar, e6.b bVar) {
        this.zza = bVar;
        Objects.requireNonNull(zzbyjVar);
    }

    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new e6.a(new E1(str, bundle, str2)));
    }
}
