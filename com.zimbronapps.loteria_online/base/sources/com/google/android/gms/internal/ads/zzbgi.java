package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbgi {
    zzbda zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbgi() {
        this.zzc = W5.c.b;
    }

    public final /* synthetic */ ExecutorService zza() {
        return this.zzc;
    }

    public zzbgi(Context context) {
        ExecutorService executorService = W5.c.b;
        this.zzc = executorService;
        executorService.execute(new zzbge(this, context));
    }
}
