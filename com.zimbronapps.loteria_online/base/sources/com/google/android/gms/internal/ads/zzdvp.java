package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdvp {
    private final zzfkg zza;
    private final zzdvm zzb;

    public zzdvp(zzfkg zzfkgVar, zzdvm zzdvmVar) {
        this.zza = zzfkgVar;
        this.zzb = zzdvmVar;
    }

    public final zzfki zza(String str, JSONObject jSONObject) throws zzfjr {
        zzbtw zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbuu(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbuu(new zzbwl());
            } else {
                zzbtt zzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = zzd.zzc(string) ? zzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzd.zzd(string) ? zzd.zzb(string) : zzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        int i = o0.b;
                        W5.p.d("Invalid custom event.", e);
                    }
                } else {
                    zzb = zzd.zzb(str);
                }
            }
            zzfki zzfkiVar = new zzfki(zzb);
            this.zzb.zza(str, zzfkiVar);
            return zzfkiVar;
        } catch (Throwable th) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkN)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfjr(th);
        }
    }

    public final zzbvs zzb(String str) throws RemoteException {
        zzbvs zze = zzd().zze(str);
        this.zzb.zzb(str, zze);
        return zze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    public final zzbtt zzd() throws RemoteException {
        zzbtt zzd = this.zza.zzd();
        if (zzd != null) {
            return zzd;
        }
        int i = o0.b;
        W5.p.f("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
