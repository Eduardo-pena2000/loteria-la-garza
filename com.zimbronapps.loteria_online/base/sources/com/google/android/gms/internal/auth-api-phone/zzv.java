package com.google.android.gms.internal.auth-api-phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzv extends g {
    private static final a.g zza;
    private static final a.a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, zzc, a.d.Q8, g.a.c);
    }

    public final Task startSmsCodeRetriever() {
        return doWrite(w.builder().d(zzac.zzb).b(new zzs(this)).e(1566).a());
    }

    public zzv(Context context) {
        super(context, zzc, a.d.Q8, g.a.c);
    }
}
