package com.google.android.gms.internal.auth_blockstore;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import q6.b;
import q6.c;
import q6.d;
import q6.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaa extends g implements b {
    private static final a.g zza;
    private static final a.a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzc = new a("Blockstore.API", zzuVar, gVar);
    }

    public zzaa(Context context) {
        super(context, zzc, a.d.Q8, g.a.c);
    }

    public final Task deleteBytes(c cVar) {
        t.m(cVar, "DeleteBytesRequest cannot be null");
        return doWrite(w.builder().d(zzab.zzg).b(new zzp(this, cVar)).c(false).e(1669).a());
    }

    public final Task isEndToEndEncryptionAvailable() {
        return doRead(w.builder().d(zzab.zze).b(new zzr(this)).c(false).e(1651).a());
    }

    public final Task retrieveBytes() {
        return doRead(w.builder().d(zzab.zza).b(new zzt(this)).c(false).e(1570).a());
    }

    public final Task storeBytes(f fVar) {
        return doWrite(w.builder().d(zzab.zzd, zzab.zzf).b(new zzq(this, fVar)).e(1645).c(false).a());
    }

    public final Task retrieveBytes(d dVar) {
        t.m(dVar, "RetrieveBytesRequest cannot be null");
        return doRead(w.builder().d(zzab.zzh).b(new zzs(this, dVar)).c(false).e(1668).a());
    }
}
