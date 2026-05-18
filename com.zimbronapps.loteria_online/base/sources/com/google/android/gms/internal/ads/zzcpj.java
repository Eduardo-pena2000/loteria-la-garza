package com.google.android.gms.internal.ads;

import S5.C0;
import S5.P0;
import S5.Y1;
import V5.F0;
import V5.o0;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcpj extends C0 {
    private final Context zza;
    private final W5.a zzb;
    private final zzdvp zzc;
    private final zzeki zzd;
    private final zzeqk zze;
    private final zzeak zzf;
    private final zzccq zzg;
    private final zzdvu zzh;
    private final zzebf zzi;
    private final zzbjy zzj;
    private final zzfor zzk;
    private final zzfkg zzl;
    private final zzcyq zzm;
    private final zzdxz zzn;
    private final zzecm zzo;
    private boolean zzp = false;
    private final Long zzq = Long.valueOf(R5.t.o().b());

    public zzcpj(Context context, W5.a aVar, zzdvp zzdvpVar, zzeki zzekiVar, zzeqk zzeqkVar, zzeak zzeakVar, zzccq zzccqVar, zzdvu zzdvuVar, zzebf zzebfVar, zzbjy zzbjyVar, zzfor zzforVar, zzfkg zzfkgVar, zzcyq zzcyqVar, zzdxz zzdxzVar, zzecm zzecmVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = zzdvpVar;
        this.zzd = zzekiVar;
        this.zze = zzeqkVar;
        this.zzf = zzeakVar;
        this.zzg = zzccqVar;
        this.zzh = zzdvuVar;
        this.zzi = zzebfVar;
        this.zzj = zzbjyVar;
        this.zzk = zzforVar;
        this.zzl = zzfkgVar;
        this.zzm = zzcyqVar;
        this.zzn = zzdxzVar;
        this.zzo = zzecmVar;
    }

    public final void zzb() {
        if (R5.t.l().zzo().zzJ()) {
            String zzL = R5.t.l().zzo().zzL();
            if (R5.t.s().e(this.zza, zzL, this.zzb.a)) {
                return;
            }
            R5.t.l().zzo().zzK(false);
            R5.t.l().zzo().f("");
        }
    }

    public final /* synthetic */ void zzc() {
        zzfkp.zza(this.zza, true);
    }

    public final /* synthetic */ void zzd() {
        R5.t.r().zza(this.zza, this.zzn);
    }

    public final synchronized void zze() {
        if (this.zzp) {
            int i = o0.b;
            W5.p.f("Mobile ads is initialized already.");
            return;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcZ)).booleanValue()) {
            S5.B.c();
        }
        Context context = this.zza;
        zzbhe.zza(context);
        R5.t.l().zze(context, this.zzb, this.zzn);
        this.zzm.zzc();
        R5.t.n().zza(context);
        this.zzp = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzeU)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue()) {
            zzcei.zza.execute(new zzcpi(this));
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmt)).booleanValue()) {
            zzcei.zza.execute(new zzcpf(this));
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzdO)).booleanValue()) {
            zzcei.zza.execute(new zzcpd(this));
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfz)).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzfA)).booleanValue()) {
                zzcei.zza.execute(new zzcpe(this));
            }
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfN)).booleanValue()) {
            zzecm zzecmVar = this.zzo;
            zzgzy zzgzyVar = zzcei.zzf;
            Objects.requireNonNull(zzecmVar);
            zzgzyVar.execute(new zzcpc(zzecmVar));
        }
    }

    public final synchronized void zzf(float f) {
        R5.t.m().a(f);
    }

    public final synchronized void zzg(String str) {
        Context context = this.zza;
        zzbhe.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzeS)).booleanValue()) {
                R5.t.p().a(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    public final synchronized void zzh(boolean z) {
        R5.t.m().c(z);
    }

    public final void zzi(N6.a aVar, String str) {
        if (aVar == null) {
            int i = o0.b;
            W5.p.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) N6.b.r1(aVar);
        if (context == null) {
            int i2 = o0.b;
            W5.p.c("Context is null. Failed to open debug menu.");
        } else {
            V5.u uVar = new V5.u(context);
            uVar.c(str);
            uVar.d(this.zzb.a);
            uVar.b();
        }
    }

    public final void zzj(String str, N6.a aVar) {
        String g0;
        zzcpg zzcpgVar;
        Context context = this.zza;
        zzbhe.zza(context);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzeZ)).booleanValue()) {
            try {
                R5.t.g();
                g0 = F0.g0(context);
            } catch (RuntimeException | RemoteException e) {
                R5.t.l().zzg(e, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            g0 = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(g0) ? str : g0;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean booleanValue = ((Boolean) S5.D.c().zzd(zzbhe.zzeS)).booleanValue();
        zzbgv zzbgvVar = zzbhe.zzby;
        boolean booleanValue2 = booleanValue | ((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue();
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            zzcpgVar = new zzcpg(this, (Runnable) N6.b.r1(aVar));
        } else {
            zzcpgVar = null;
            z = booleanValue2;
        }
        zzcpg zzcpgVar2 = zzcpgVar;
        if (z) {
            R5.t.p().a(this.zza, this.zzb, str2, zzcpgVar2, this.zzk, this.zzn, this.zzq, this.zzi.zzs());
        }
    }

    public final synchronized float zzk() {
        return R5.t.m().b();
    }

    public final synchronized boolean zzl() {
        return R5.t.m().d();
    }

    public final String zzm() {
        return this.zzb.a;
    }

    public final void zzn(String str) {
        this.zze.zze(str);
    }

    public final void zzo(zzbtt zzbttVar) throws RemoteException {
        this.zzl.zzc(zzbttVar);
    }

    public final void zzp(zzbqn zzbqnVar) throws RemoteException {
        this.zzf.zzb(zzbqnVar);
    }

    public final List zzq() throws RemoteException {
        return this.zzf.zzd();
    }

    public final void zzr(Y1 y1) throws RemoteException {
        this.zzg.zzb(this.zza, y1);
    }

    public final void zzs() {
        this.zzf.zza();
    }

    public final void zzt(P0 p0) throws RemoteException {
        this.zzi.zzo(p0, zzebe.API);
    }

    public final void zzu(boolean z) throws RemoteException {
        try {
            Context context = this.zza;
            zzgai.zza(context).zzb(z);
            if (z) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e) {
                R5.t.l().zzg(e, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    public final void zzv(String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkR)).booleanValue()) {
            R5.t.l().zzt(str);
        }
    }

    public final synchronized void zzw() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcY)).booleanValue()) {
            R5.t.v().zzc();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcZ)).booleanValue()) {
                S5.B.d();
            }
        }
    }

    public final /* synthetic */ void zzx() {
        this.zzj.zza(new zzbyt());
    }

    public final /* synthetic */ void zzy(Runnable runnable) {
        com.google.android.gms.common.internal.t.e("Adapters must be initialized on the main thread.");
        Map zzf = R5.t.l().zzo().zzi().zzf();
        if (zzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i = o0.b;
                W5.p.g("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzc()) {
            HashMap hashMap = new HashMap();
            Iterator it = zzf.values().iterator();
            while (it.hasNext()) {
                for (zzbtm zzbtmVar : ((zzbtn) it.next()).zza) {
                    String str = zzbtmVar.zzb;
                    for (String str2 : zzbtmVar.zza) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzekj zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzfki zzfkiVar = (zzfki) zza.zzb;
                        if (!zzfkiVar.zzn() && zzfkiVar.zzq()) {
                            zzfkiVar.zzr(this.zza, (zzelw) zza.zzc, (List) entry.getValue());
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb.append("Initialized rewarded video mediation adapter ");
                            sb.append(str3);
                            String sb2 = sb.toString();
                            int i2 = o0.b;
                            W5.p.a(sb2);
                        }
                    }
                } catch (zzfjr e) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb3.append("Failed to initialize rewarded video mediation adapter \"");
                    sb3.append(str3);
                    sb3.append("\"");
                    String sb4 = sb3.toString();
                    int i3 = o0.b;
                    W5.p.g(sb4, e);
                }
            }
        }
    }
}
