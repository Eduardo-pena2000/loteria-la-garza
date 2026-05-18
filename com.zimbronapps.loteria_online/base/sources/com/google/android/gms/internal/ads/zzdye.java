package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdye extends zzdyi {
    private final c6.a zzf;

    public zzdye(Executor executor, W5.v vVar, c6.a aVar, c6.c cVar, Context context) {
        super(executor, vVar, cVar, context);
        this.zzf = aVar;
        aVar.a(this.zza);
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}
