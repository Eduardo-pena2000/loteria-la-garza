package com.google.android.gms.internal.ads;

import V5.o0;
import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzehl implements zzgzl {
    final /* synthetic */ zzfmu zza;

    public zzehl(zzehn zzehnVar, zzfmu zzfmuVar) {
        this.zza = zzfmuVar;
        Objects.requireNonNull(zzehnVar);
    }

    public final void zza(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        int i = o0.b;
        W5.p.c("Failed to get offline signal database: ".concat(valueOf));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            int i = o0.b;
            W5.p.c("Error executing function on offline signal database: ".concat(valueOf));
        }
    }
}
