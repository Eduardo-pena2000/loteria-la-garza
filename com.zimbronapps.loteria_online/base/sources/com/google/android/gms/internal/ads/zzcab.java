package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcab {
    private final WeakHashMap zza = new WeakHashMap();

    public final Future zza(Context context) {
        return zzcei.zza.submit(new zzbzz(this, context));
    }

    public final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }
}
