package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjo extends ContentObserver {
    final /* synthetic */ zzjr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjo(zzjr zzjrVar, Handler handler) {
        super((Handler) null);
        Objects.requireNonNull(zzjrVar);
        this.zza = zzjrVar;
    }

    public final void onChange(boolean z) {
        this.zza.zzc();
    }
}
