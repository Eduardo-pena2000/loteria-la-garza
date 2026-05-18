package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import v6.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzp extends g implements AppSetIdClient {
    private static final a.g zza;
    private static final a.a zzb;
    private static final a zzc;
    private final Context zzd;
    private final h zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a("AppSet.API", zznVar, gVar);
    }

    public zzp(Context context, h hVar) {
        super(context, zzc, a.d.Q8, g.a.c);
        this.zzd = context;
        this.zze = hVar;
    }

    public final Task getAppSetIdInfo() {
        return this.zze.h(this.zzd, 212800000) == 0 ? doRead(w.builder().d(com.google.android.gms.appset.zze.zza).b(new zzm(this)).c(false).e(27601).a()) : Tasks.forException(new b(new Status(17)));
    }
}
