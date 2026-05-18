package com.google.android.gms.internal.measurement;

import N6.b;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;
import k7.e3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzdr extends zzeq {
    final /* synthetic */ Context zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzfb zzfbVar, Context context, Bundle bundle) {
        super(zzfbVar, true);
        this.zza = context;
        this.zzb = bundle;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    public final void zza() {
        try {
            Context context = this.zza;
            t.l(context);
            String a = e3.a(context);
            t.l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(a)) {
                a = e3.a(context);
            }
            Boolean c = e3.c("google_analytics_force_disable_updates", resources, a);
            zzfb zzfbVar = this.zzc;
            zzfbVar.zzR(zzfbVar.zzc(context, c == null || !c.booleanValue()));
            if (zzfbVar.zzQ() == null) {
                Log.w(zzfbVar.zzO(), "Failed to connect to measurement client.");
                return;
            }
            int a2 = DynamiteModule.a(context, "com.google.android.gms.measurement.dynamite");
            ((zzcr) t.l(zzfbVar.zzQ())).initialize(b.s1(context), new zzdd(133005L, Math.max(a2, r0), Boolean.TRUE.equals(c) || DynamiteModule.c(context, "com.google.android.gms.measurement.dynamite") < a2, this.zzb, e3.a(context)), this.zzh);
        } catch (Exception e) {
            this.zzc.zzN(e, true, false);
        }
    }
}
