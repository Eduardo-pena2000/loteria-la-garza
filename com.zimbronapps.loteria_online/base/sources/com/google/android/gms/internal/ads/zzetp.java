package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzetp implements zzfax {
    private final zzgzy zza;
    private final zzdvp zzb;
    private final zzeak zzc;
    private final zzetr zzd;

    public zzetp(zzgzy zzgzyVar, zzdvp zzdvpVar, zzeak zzeakVar, zzetr zzetrVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdvpVar;
        this.zzc = zzeakVar;
        this.zzd = zzetrVar;
    }

    public final x7.e zza() {
        zzbgv zzbgvVar = zzbhe.zznc;
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            zzetr zzetrVar = this.zzd;
            if (zzetrVar.zzd() != null) {
                zzetq zzd = zzetrVar.zzd();
                zzd.getClass();
                return zzgzo.zza(zzd);
            }
        }
        if (zzgrt.zzc((String) S5.D.c().zzd(zzbhe.zzbX)) || (!((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzgzo.zza(new zzetq(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new zzeto(this));
    }

    public final int zzb() {
        return 1;
    }

    public final /* synthetic */ zzetq zzc() {
        List<String> asList = Arrays.asList(((String) S5.D.c().zzd(zzbhe.zzbX)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfki zza = this.zzb.zza(str, new JSONObject());
                zza.zzn();
                boolean zze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) S5.D.c().zzd(zzbhe.zznc)).booleanValue() || zze) {
                    try {
                        zzbwh zzC = zza.zzC();
                        if (zzC != null) {
                            bundle2.putString("sdk_version", zzC.toString());
                        }
                    } catch (zzfjr unused) {
                    }
                }
                try {
                    zzbwh zzB = zza.zzB();
                    if (zzB != null) {
                        bundle2.putString("adapter_version", zzB.toString());
                    }
                } catch (zzfjr unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfjr unused3) {
            }
        }
        zzetq zzetqVar = new zzetq(bundle);
        if (((Boolean) S5.D.c().zzd(zzbhe.zznc)).booleanValue()) {
            this.zzd.zzc(zzetqVar);
        }
        return zzetqVar;
    }
}
