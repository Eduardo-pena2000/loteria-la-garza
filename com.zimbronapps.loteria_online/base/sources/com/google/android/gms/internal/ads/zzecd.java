package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzecd {
    private AdRequest zza;
    private com.google.android.gms.ads.nativead.b zzb;
    private L5.C zzc;
    private L5.h zzd = L5.h.i;
    private String zze = "";
    private String zzf = "";
    private boolean zzg = false;

    public zzecd() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        this.zza = ((AdRequest.Builder) new AdRequest.Builder().d(AdMobAdapter.class, bundle)).o();
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final AdRequest zzc() {
        return this.zza;
    }

    public final L5.h zzd() {
        return this.zzd;
    }

    public final com.google.android.gms.ads.nativead.b zze() {
        return this.zzb;
    }

    public final L5.C zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final void zzh(String str) {
        this.zze = str;
    }

    public final void zzi(String str) {
        this.zzf = str;
    }

    public final void zzj(AdRequest adRequest) {
        this.zza = adRequest;
    }

    public final void zzk(L5.h hVar) {
        this.zzd = hVar;
    }

    public final void zzl(com.google.android.gms.ads.nativead.b bVar) {
        this.zzb = bVar;
    }

    public final void zzm(L5.C c) {
        this.zzc = c;
    }

    public final void zzn(boolean z) {
        this.zzg = z;
    }
}
