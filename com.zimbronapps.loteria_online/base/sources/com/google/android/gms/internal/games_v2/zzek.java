package com.google.android.gms.internal.games_v2;

import T6.z;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import v6.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzek extends g {
    private static final a.g zza;
    private static final a.a zzb;
    private static final a zzc;
    private final zzav zzd;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzei zzeiVar = new zzei();
        zzb = zzeiVar;
        zzc = new a("Recall.API", zzeiVar, gVar);
    }

    public zzek(Context context, zzav zzavVar) {
        super(context, zzc, a.d.Q8, g.a.c);
        this.zzd = zzavVar;
    }

    public final Task requestRecallAccess() {
        return this.zzd.zza().onSuccessTask(new zzeh(this, w.builder().e(6742).c(false).d(new d[]{z.e}).b(new zzeg(this)).a()));
    }
}
