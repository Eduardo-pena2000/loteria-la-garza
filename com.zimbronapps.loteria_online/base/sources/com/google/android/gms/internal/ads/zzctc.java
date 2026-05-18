package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzctc implements zzbde {
    private zzcjl zza;
    private final Executor zzb;
    private final zzcso zzc;
    private final E6.f zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcsr zzg = new zzcsr();

    public zzctc(Executor executor, zzcso zzcsoVar, E6.f fVar) {
        this.zzb = executor;
        this.zzc = zzcsoVar;
        this.zzd = fVar;
    }

    private final void zzg() {
        try {
            JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new zzctb(this, zzb));
            }
        } catch (JSONException e) {
            o0.l("Failed to call video active view js", e);
        }
    }

    public final void zza(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    public final void zzdj(zzbdd zzbddVar) {
        boolean z = this.zzf ? false : zzbddVar.zzj;
        zzcsr zzcsrVar = this.zzg;
        zzcsrVar.zza = z;
        zzcsrVar.zzd = this.zzd.b();
        zzcsrVar.zzf = zzbddVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        String obj = jSONObject.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 31);
        sb.append("Calling AFMA_updateActiveView(");
        sb.append(obj);
        sb.append(")");
        String sb2 = sb.toString();
        int i = o0.b;
        W5.p.a(sb2);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
