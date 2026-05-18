package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabr implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzabs zzb;

    public zzabr(zzabs zzabsVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzabsVar);
        this.zzb = zzabsVar;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzajl zzajlVar = (zzajl) obj;
        if (!TextUtils.isEmpty(zzajlVar.zza()) && !TextUtils.isEmpty(zzajlVar.zzb())) {
            zzaar.zza(this.zzb.zza, new zzahv(zzajlVar.zzb(), zzajlVar.zza(), Long.valueOf(zzahx.zza(zzajlVar.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
            return;
        }
        this.zza.zza(q.a("INTERNAL_SUCCESS_SIGN_OUT"));
    }
}
