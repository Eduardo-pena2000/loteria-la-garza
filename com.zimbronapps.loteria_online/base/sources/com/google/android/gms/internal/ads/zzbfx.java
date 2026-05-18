package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.d;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbfx implements d.a {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbfp zza;
    final /* synthetic */ zzcen zzb;
    final /* synthetic */ zzbfz zzc;

    public zzbfx(zzbfz zzbfzVar, zzbfp zzbfpVar, zzcen zzcenVar) {
        this.zza = zzbfpVar;
        this.zzb = zzcenVar;
        Objects.requireNonNull(zzbfzVar);
        this.zzc = zzbfzVar;
    }

    public final void onConnected(Bundle bundle) {
        zzbfz zzbfzVar = this.zzc;
        synchronized (zzbfzVar.zzf()) {
            try {
                if (zzbfzVar.zzd()) {
                    return;
                }
                zzbfzVar.zze(true);
                zzbfo zzc = zzbfzVar.zzc();
                if (zzc == null) {
                    return;
                }
                zzgzy zzgzyVar = zzcei.zza;
                zzbfp zzbfpVar = this.zza;
                zzcen zzcenVar = this.zzb;
                zzcenVar.addListener(new zzbfv(zzcenVar, zzgzyVar.submit(new zzbfw(this, zzc, zzbfpVar, zzcenVar))), zzcei.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
