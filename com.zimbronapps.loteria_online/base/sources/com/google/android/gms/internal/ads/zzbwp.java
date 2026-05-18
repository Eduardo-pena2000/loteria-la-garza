package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwp implements View.OnClickListener {
    final /* synthetic */ zzbwr zza;

    public zzbwp(zzbwr zzbwrVar) {
        Objects.requireNonNull(zzbwrVar);
        this.zza = zzbwrVar;
    }

    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
