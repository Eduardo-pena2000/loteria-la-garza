package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjw extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjw(zzjy zzjyVar, Handler handler) {
        super((Handler) null);
        Objects.requireNonNull(zzjyVar);
    }

    public final void onChange(boolean z) {
        zzkm.zzc();
    }
}
