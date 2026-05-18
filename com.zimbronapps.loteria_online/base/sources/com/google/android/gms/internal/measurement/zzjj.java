package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjj extends ContentObserver {
    final /* synthetic */ zzjl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjj(zzjl zzjlVar, Handler handler) {
        super((Handler) null);
        Objects.requireNonNull(zzjlVar);
        this.zza = zzjlVar;
    }

    public final void onChange(boolean z) {
        this.zza.zzb().set(true);
    }
}
