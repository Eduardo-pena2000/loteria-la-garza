package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzegw extends zzbzg {
    private final Context zza;
    private final zzgzy zzb;
    private final zzehe zzc;
    private final zzcqi zzd;
    private final ArrayDeque zze;
    private final zzfor zzf;
    private final zzcac zzg;

    public zzegw(Context context, zzgzy zzgzyVar, zzcac zzcacVar, zzcqi zzcqiVar, zzehe zzeheVar, ArrayDeque arrayDeque, zzehb zzehbVar, zzfor zzforVar) {
        zzbhe.zza(context);
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzg = zzcacVar;
        this.zzc = zzeheVar;
        this.zzd = zzcqiVar;
        this.zze = arrayDeque;
        this.zzf = zzforVar;
    }

    private static x7.e zzm(zzbzu zzbzuVar, zzfnu zzfnuVar, zzfbz zzfbzVar) {
        zzegk zzegkVar = new zzegk(zzfbzVar, zzbzuVar);
        return zzfnuVar.zza(zzfno.GMS_SIGNALS, zzgzo.zza(zzbzuVar.zza)).zzc(zzegkVar).zzb(zzegl.zza).zzi();
    }

    private static x7.e zzn(x7.e eVar, zzfnu zzfnuVar, zzbsz zzbszVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzbsp zza = zzbszVar.zza("AFMA_getAdDictionary", zzbsw.zza, zzegq.zza);
        zzfon.zzb(eVar, zzfoeVar);
        zzfnb zzi = zzfnuVar.zza(zzfno.BUILD_URL, eVar).zzc(zza).zzi();
        zzfon.zzf(zzi, zzfooVar, zzfoeVar);
        return zzi;
    }

    private final void zzo(x7.e eVar, zzbzl zzbzlVar, zzbzu zzbzuVar) {
        zzgzo.zzr(zzgzo.zzj(eVar, new zzego(this), zzcei.zza), new zzegh(this, zzbzuVar, zzbzlVar), zzcei.zzg);
    }

    private final synchronized void zzp() {
        int intValue = ((Long) zzbjl.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzegr zzegrVar) {
        zzp();
        this.zze.addLast(zzegrVar);
    }

    private final synchronized zzegr zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzegr zzegrVar = (zzegr) it.next();
            if (zzegrVar.zzc.equals(str)) {
                it.remove();
                return zzegrVar;
            }
        }
        return null;
    }

    public final x7.e zzb(zzbzu zzbzuVar, int i) {
        zzegr zzr;
        zzfnb zzi;
        zzbsq v = R5.t.v();
        Context context = this.zza;
        zzbsz zza = v.zza(context, W5.a.M1(), this.zzf);
        zzfbz zzy = this.zzd.zzy(zzbzuVar, i);
        zzbsp zza2 = zza.zza("google.afma.response.normalize", zzegt.zzd, zzbsw.zzb);
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            zzr = zzr(zzbzuVar.zzh);
            if (zzr == null) {
                o0.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbzuVar.zzj;
            zzr = null;
            if (str != null && !str.isEmpty()) {
                o0.k("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzegr zzegrVar = zzr;
        zzfoe zzn = zzegrVar == null ? zzfoe.zzn(context, 9) : zzegrVar.zzd;
        zzfoo zzf = zzy.zzf();
        zzf.zzb(zzbzuVar.zza.getStringArrayList("ad_types"));
        zzehd zzehdVar = new zzehd(zzbzuVar.zzg, zzf, zzn);
        zzeha zzehaVar = new zzeha(context, zzbzuVar.zzb.a, this.zzg, i, null);
        zzfnu zze = zzy.zze();
        zzfoe zzn2 = zzfoe.zzn(context, 11);
        if (zzegrVar == null) {
            x7.e zzm = zzm(zzbzuVar, zze, zzy);
            x7.e zzn3 = zzn(zzm, zze, zza, zzf, zzn);
            zzfoe zzn4 = zzfoe.zzn(context, 10);
            zzfnb zzi2 = zze.zzb(zzfno.HTTP, zzn3, zzm).zza(new zzegp(zzn3, zzbzuVar, zzm)).zzb(zzehdVar).zzb(zzfon.zzc(zzn4)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzi2, zzf, zzn4);
            zzfon.zzb(zzi2, zzn2);
            zzi = zze.zzb(zzfno.PRE_PROCESS, zzm, zzn3, zzi2).zza(new zzegi(zzbzuVar, zzi2, zzm, zzn3)).zzc(zza2).zzi();
        } else {
            zzehc zzehcVar = new zzehc(zzegrVar.zzb, zzegrVar.zza);
            zzfoe zzn5 = zzfoe.zzn(context, 10);
            zzfnb zzi3 = zze.zza(zzfno.HTTP, zzgzo.zza(zzehcVar)).zzb(zzehdVar).zzb(zzfon.zzc(zzn5)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzi3, zzf, zzn5);
            x7.e zza3 = zzgzo.zza(zzegrVar);
            zzfon.zzb(zzi3, zzn2);
            zzi = zze.zzb(zzfno.PRE_PROCESS, zzi3, zza3).zza(new zzegj(zzi3, zza3)).zzc(zza2).zzi();
        }
        zzfon.zzd(zzi, zzf, zzn2);
        return zzi;
    }

    public final x7.e zzc(zzbzu zzbzuVar, int i) {
        if (!((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Split request is disabled."));
        }
        zzflg zzflgVar = zzbzuVar.zzi;
        if (zzflgVar == null) {
            return zzgzo.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzflgVar.zzc == 0 || zzflgVar.zzd == 0) {
            return zzgzo.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbsz zza = R5.t.v().zza(context, W5.a.M1(), this.zzf);
        zzfbz zzy = this.zzd.zzy(zzbzuVar, i);
        zzfnu zze = zzy.zze();
        x7.e zzm = zzm(zzbzuVar, zze, zzy);
        zzfoo zzf = zzy.zzf();
        zzfoe zzn = zzfoe.zzn(context, 9);
        x7.e zzn2 = zzn(zzm, zze, zza, zzf, zzn);
        return zze.zzb(zzfno.GET_URL_AND_CACHE_KEY, zzm, zzn2).zza(new zzegm(this, zzn2, zzm, zzbzuVar, zzn)).zzi();
    }

    public final x7.e zzd(String str) {
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzr(str) == null ? zzgzo.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgzo.zza(new zzegg(this));
        }
        return zzgzo.zzc(new Exception("Split request is disabled."));
    }

    public final void zze(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.SERVICE_CONNECTED.zza(), R5.t.o().a());
        }
        x7.e zzb = zzb(zzbzuVar, Binder.getCallingUid());
        zzo(zzb, zzbzlVar, zzbzuVar);
        if (((Boolean) zzbje.zzi.zze()).booleanValue()) {
            zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            zzb.addListener(new zzegv(zzeheVar), this.zzb);
        }
    }

    public final void zzf(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.SERVICE_CONNECTED.zza(), R5.t.o().a());
        }
        zzo(zzk(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    public final void zzg(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        zzo(zzc(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    public final void zzh(String str, zzbzl zzbzlVar) {
        zzo(zzd(str), zzbzlVar, null);
    }

    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpz)).booleanValue()) {
            CharSequence charSequence = (String) S5.D.c().zzd(zzbhe.zzpA);
            if (charSequence.isEmpty()) {
                return;
            }
            Iterable<String> zzd = zzgrr.zza(zzgqq.zzc(',')).zzd(charSequence);
            o0.k("AdRequestServiceImpl: Preconnecting");
            for (String str2 : zzd) {
                Context context = this.zza;
                zzeha zzehaVar = new zzeha(context, str, this.zzg, callingUid, "HEAD");
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", R5.t.g().R(context, str));
                try {
                    zzegz zzb = zzehaVar.zzb(new zzegy(str2, 30000, hashMap, new byte[0], "", false));
                    if (zzb.zza != 200) {
                        int i = zzb.zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            }
        }
    }

    public final void zzj(zzbzd zzbzdVar, zzbzm zzbzmVar) {
        if (((Boolean) zzbjt.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzbzdVar.zza;
            zzgzo.zzr(zzgzo.zza(null), new zzegf(this, zzbzmVar, zzbzdVar), zzcei.zzg);
        } else {
            try {
                zzbzmVar.zze("", zzbzdVar);
            } catch (RemoteException e) {
                o0.l("Service can't call client", e);
            }
        }
    }

    public final x7.e zzk(zzbzu zzbzuVar, int i) {
        zzbsq v = R5.t.v();
        Context context = this.zza;
        zzbsz zza = v.zza(context, W5.a.M1(), this.zzf);
        if (!((Boolean) zzbjr.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Signal collection disabled."));
        }
        zzfbz zzy = this.zzd.zzy(zzbzuVar, i);
        zzfba zzd = zzy.zzd();
        zzbsp zza2 = zza.zza("google.afma.request.getSignals", zzbsw.zza, zzbsw.zzb);
        zzfoe zzn = zzfoe.zzn(context, 22);
        zzfnu zze = zzy.zze();
        zzfno zzfnoVar = zzfno.GET_SIGNALS;
        Bundle bundle = zzbzuVar.zza;
        zzfnb zzi = zze.zza(zzfnoVar, zzgzo.zza(bundle)).zzb(zzfon.zzc(zzn)).zzc(new zzegn(zzd, zzbzuVar)).zzj(zzfno.JS_SIGNALS).zzc(zza2).zzi();
        zzfoo zzf = zzy.zzf();
        zzf.zzb(bundle.getStringArrayList("ad_types"));
        zzf.zzd(bundle.getBundle("extras"));
        zzfon.zze(zzi, zzf, zzn);
        if (((Boolean) zzbje.zzj.zze()).booleanValue()) {
            zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            zzi.addListener(new zzegu(zzeheVar), this.zzb);
        }
        return zzi;
    }

    public final /* synthetic */ InputStream zzl(x7.e eVar, x7.e eVar2, zzbzu zzbzuVar, zzfoe zzfoeVar) {
        String zzi = ((zzbzw) eVar.get()).zzi();
        zzq(new zzegr((zzbzw) eVar.get(), (JSONObject) eVar2.get(), zzbzuVar.zzh, zzi, zzfoeVar));
        return new ByteArrayInputStream(zzi.getBytes(StandardCharsets.UTF_8));
    }
}
