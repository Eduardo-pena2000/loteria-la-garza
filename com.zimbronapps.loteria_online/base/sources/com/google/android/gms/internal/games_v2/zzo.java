package com.google.android.gms.internal.games_v2;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzo extends g implements zzk {
    private static final a.g zza;
    private static final a.a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzm zzmVar = new zzm();
        zzb = zzmVar;
        zzc = new a("GamesConnect.API", zzmVar, gVar);
    }

    public zzo(Context context, zzi zziVar) {
        super(context, zzc, zziVar, g.a.c);
    }

    public final Task zza(zzq zzqVar, boolean z) {
        w a = w.builder().b(new zzl(this, zzqVar)).e(6737).c(z).a();
        return z ? doWrite(a) : doBestEffortWrite(a);
    }
}
