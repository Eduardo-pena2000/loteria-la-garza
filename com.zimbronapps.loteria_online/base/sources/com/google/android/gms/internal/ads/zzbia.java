package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbia extends v.b {
    final /* synthetic */ zzbid zza;

    public zzbia(zzbid zzbidVar) {
        Objects.requireNonNull(zzbidVar);
        this.zza = zzbidVar;
    }

    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.zzc(i);
    }
}
