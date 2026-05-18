package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgia implements zzgdv {
    private final zzika zza;
    private final zzika zzb;
    private final zzika zzc;
    private final boolean zzd;
    private final long zze;

    public zzgia(zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, boolean z, long j) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = zzikaVar3;
        this.zzd = z;
        this.zze = j;
    }

    public final String zza() {
        return ((zzgjf) this.zzb.zzb()).zza();
    }

    public final x7.e zzb() {
        if (this.zzd) {
            return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(((zzgis) this.zza.zzb()).zzb()), Throwable.class, zzghw.zza, zzhaf.zza()), new zzghx(this), zzhaf.zza()), new zzghy(this), zzhaf.zza());
        }
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(((zzgkx) this.zzc.zzb()).zza()), Throwable.class, zzghz.zza, zzhaf.zza()), new zzghu(this), zzhaf.zza());
        zzgzgVar.addListener(new zzghv(this), zzhaf.zza());
        return zzgzgVar;
    }

    public final x7.e zzc(Context context) {
        return ((zzgjf) this.zzb.zzb()).zzc(context);
    }

    public final x7.e zzd(Context context, String str, View view, Activity activity) {
        return ((zzgjf) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    public final x7.e zze(Context context, String str, View view, Activity activity) {
        return ((zzgjf) this.zzb.zzb()).zze(context, str, view, null);
    }

    public final void zzf(InputEvent inputEvent) {
        ((zzgjf) this.zzb.zzb()).zzf(inputEvent);
    }

    public final int zzg() {
        return ((zzgjf) this.zzb.zzb()).zzg();
    }

    public final /* synthetic */ x7.e zzh(Boolean bool) {
        return ((zzgjf) this.zzb.zzb()).zzb();
    }

    public final /* synthetic */ void zzi() {
        ((zzgis) this.zza.zzb()).zza(this.zze);
    }

    public final /* synthetic */ x7.e zzj(zzgir zzgirVar) {
        return ((zzgkx) this.zzc.zzb()).zza();
    }

    public final /* synthetic */ x7.e zzk(Boolean bool) {
        return ((zzgjf) this.zzb.zzb()).zzb();
    }
}
