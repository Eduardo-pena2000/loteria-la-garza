package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzepi implements zzekg {
    private final zzeki zza;
    private final zzekm zzb;
    private final zzfnu zzc;
    private final zzgzy zzd;

    public zzepi(zzfnu zzfnuVar, zzgzy zzgzyVar, zzeki zzekiVar, zzekm zzekmVar) {
        this.zzc = zzfnuVar;
        this.zzd = zzgzyVar;
        this.zzb = zzekmVar;
        this.zza = zzekiVar;
    }

    public static final String zze(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        return !zzfirVar.zzt.isEmpty();
    }

    public final x7.e zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzekj zzekjVar;
        Iterator it = zzfirVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzekjVar = null;
                break;
            }
            try {
                zzekjVar = this.zza.zza((String) it.next(), zzfirVar.zzv);
                break;
            } catch (zzfjr unused) {
            }
        }
        if (zzekjVar == null) {
            return zzgzo.zzc(new zzemz("Unable to instantiate mediation adapter class."));
        }
        zzcen zzcenVar = new zzcen();
        zzekjVar.zzc.zza(new zzepf(this, zzekjVar, zzcenVar));
        if (zzfirVar.zzM) {
            Bundle bundle = zzfjcVar.zza.zza.zzd.m;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfnu zzfnuVar = this.zzc;
        zzfno zzfnoVar = zzfno.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zzd(new zzeph(this, zzfjcVar, zzfirVar, zzekjVar), this.zzd, zzfnoVar, zzfnuVar).zzj(zzfno.ADAPTER_LOAD_AD_ACK).zze(zzcenVar).zzj(zzfno.ADAPTER_WRAP_ADAPTER).zzb(new zzepg(this, zzfjcVar, zzfirVar, zzekjVar)).zzi();
    }

    public final /* synthetic */ void zzc(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        this.zzb.zza(zzfjcVar, zzfirVar, zzekjVar);
    }

    public final /* synthetic */ Object zzd(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar, Void r4) {
        return this.zzb.zzb(zzfjcVar, zzfirVar, zzekjVar);
    }
}
