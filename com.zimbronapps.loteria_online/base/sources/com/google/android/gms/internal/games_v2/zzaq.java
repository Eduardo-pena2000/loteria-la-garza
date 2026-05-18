package com.google.android.gms.internal.games_v2;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaq {
    private final zzav zza;

    private zzaq(zzav zzavVar) {
        this.zza = zzavVar;
    }

    public static zzaq zza(Application application) {
        return new zzaq(zzax.zza(application));
    }

    public final Task zzb(zzap zzapVar) {
        Objects.requireNonNull(zzapVar);
        return this.zza.zzd(new zzao(zzapVar));
    }
}
