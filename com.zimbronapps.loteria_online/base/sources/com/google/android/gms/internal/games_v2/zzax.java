package com.google.android.gms.internal.games_v2;

import W6.x;
import Z6.b;
import android.app.Application;
import com.google.android.gms.common.internal.t;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzax {
    private static final AtomicReference zza = new AtomicReference();

    public static zzav zza(Application application) {
        AtomicReference atomicReference = zza;
        zzav zzavVar = (zzav) atomicReference.get();
        if (zzavVar != null) {
            return zzavVar;
        }
        zzg zza2 = zzi.zza();
        zza2.zza(9);
        zza2.zzb(application.getPackageName());
        zzi zzc = zza2.zzc();
        x b = x.b(application);
        zzbl zzblVar = new zzbl(application, b, b.a(), new zzbp(application, b, new zzaw(application, zzc)));
        while (!Y.a(atomicReference, (Object) null, zzblVar) && atomicReference.get() == null) {
        }
        return (zzav) t.l((zzav) zza.get());
    }
}
