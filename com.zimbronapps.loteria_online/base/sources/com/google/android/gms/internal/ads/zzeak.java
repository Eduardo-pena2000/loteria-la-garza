package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeak {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdvp zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdyk zzl;
    private final W5.a zzm;
    private final zzdil zzo;
    private final zzfor zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcen zze = new zzcen();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = R5.t.o().b();

    public zzeak(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdvp zzdvpVar, ScheduledExecutorService scheduledExecutorService, zzdyk zzdykVar, W5.a aVar, zzdil zzdilVar, zzfor zzforVar) {
        this.zzh = zzdvpVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdykVar;
        this.zzm = aVar;
        this.zzo = zzdilVar;
        this.zzp = zzforVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized x7.e zzu() {
        String zzd = R5.t.l().zzo().zzi().zzd();
        if (!TextUtils.isEmpty(zzd)) {
            return zzgzo.zza(zzd);
        }
        zzcen zzcenVar = new zzcen();
        R5.t.l().zzo().l(new zzead(this, zzcenVar));
        return zzcenVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbqg(str, z, i, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(zzbqn zzbqnVar) {
        this.zze.addListener(new zzeaj(this, zzbqnVar), this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbjk.zza.zze()).booleanValue()) {
            if (this.zzm.c >= ((Integer) S5.D.c().zzd(zzbhe.zzct)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zze();
                        this.zzo.zze();
                        zzcen zzcenVar = this.zze;
                        zzeac zzeacVar = new zzeac(this);
                        Executor executor = this.zzi;
                        zzcenVar.addListener(zzeacVar, executor);
                        this.zza = true;
                        x7.e zzu = zzu();
                        this.zzk.schedule(new zzeae(this), ((Long) S5.D.c().zzd(zzbhe.zzcv)).longValue(), TimeUnit.SECONDS);
                        zzgzo.zzr(zzu, new zzeaa(this), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbqg zzbqgVar = (zzbqg) map.get(str);
            arrayList.add(new zzbqg(str, zzbqgVar.zzb, zzbqgVar.zzc, zzbqgVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    public final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    public final /* synthetic */ void zzg(zzcen zzcenVar) {
        this.zzi.execute(new zzeai(this, zzcenVar));
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (R5.t.o().b() - this.zzd));
                this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzi(Object obj, zzcen zzcenVar, String str, long j, zzfoe zzfoeVar) {
        synchronized (obj) {
            try {
                if (!zzcenVar.isDone()) {
                    zzm(str, false, "Timeout.", (int) (R5.t.o().b() - j));
                    this.zzl.zzc(str, "timeout");
                    this.zzo.zzc(str, "timeout");
                    zzfor zzforVar = this.zzp;
                    zzfoeVar.zzk("Timeout");
                    zzfoeVar.zzd(false);
                    zzforVar.zzb(zzfoeVar.zzm());
                    zzcenVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzj(zzfoe zzfoeVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfoeVar.zzd(true);
        this.zzp.zzb(zzfoeVar.zzm());
        return null;
    }

    public final /* synthetic */ void zzk(String str, zzbqk zzbqkVar, zzfki zzfkiVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbqkVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfkiVar.zzA(context, zzbqkVar, list);
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.d("", e);
            }
        } catch (zzfjr unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzbqkVar.zzf(sb.toString());
        } catch (RemoteException e2) {
            throw new zzgsa(e2);
        }
    }

    public final /* synthetic */ void zzl(String str) {
        Context context = this.zzf;
        int i = 5;
        zzfoe zzn = zzfoe.zzn(context, 5);
        zzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                zzfoe zzn2 = zzfoe.zzn(context, i);
                zzn2.zza();
                zzn2.zzi(str2);
                Object obj = new Object();
                zzcen zzcenVar = new zzcen();
                x7.e zzi = zzgzo.zzi(zzcenVar, ((Long) S5.D.c().zzd(zzbhe.zzcu)).longValue(), TimeUnit.SECONDS, this.zzk);
                this.zzl.zza(str2);
                this.zzo.zza(str2);
                long b = R5.t.o().b();
                Context context2 = context;
                JSONObject jSONObject2 = jSONObject;
                zzi.addListener(new zzeaf(this, obj, zzcenVar, str2, b, zzn2), this.zzi);
                arrayList.add(zzi);
                zzeab zzeabVar = new zzeab(this, obj, str2, b, zzn2, zzcenVar);
                JSONObject optJSONObject = jSONObject2.optJSONObject(str2);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject3.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject3.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String str3 = (String) keys2.next();
                                    bundle.putString(str3, optJSONObject2.optString(str3, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbqq(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzm(str2, false, "", 0);
                try {
                    this.zzj.execute(new zzeah(this, str2, zzeabVar, this.zzh.zza(str2, new JSONObject()), arrayList2));
                } catch (zzfjr e) {
                    try {
                        String str4 = "Failed to create Adapter.";
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzox)).booleanValue()) {
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                            sb.append("Failed to create Adapter.");
                            sb.append(" ");
                            sb.append(message);
                            str4 = sb.toString();
                        }
                        zzeabVar.zzf(str4);
                    } catch (RemoteException e2) {
                        int i3 = o0.b;
                        W5.p.d("", e2);
                    }
                }
                jSONObject = jSONObject2;
                context = context2;
                i = 5;
            }
            zzgzo.zzn(arrayList).zza(new zzeag(this, zzn), this.zzi);
        } catch (JSONException e3) {
            o0.l("Malformed CLD response", e3);
            this.zzo.zzd("MalformedJson");
            this.zzl.zzd("MalformedJson");
            this.zze.zzd(e3);
            R5.t.l().zzg(e3, "AdapterInitializer.updateAdapterStatus");
            zzfor zzforVar = this.zzp;
            zzn.zzj(e3);
            zzn.zzd(false);
            zzforVar.zzb(zzn.zzm());
        }
    }

    public final /* synthetic */ void zzn(boolean z) {
        this.zzc = true;
    }

    public final /* synthetic */ long zzo() {
        return this.zzd;
    }

    public final /* synthetic */ zzcen zzp() {
        return this.zze;
    }

    public final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    public final /* synthetic */ zzdyk zzr() {
        return this.zzl;
    }

    public final /* synthetic */ zzdil zzs() {
        return this.zzo;
    }

    public final /* synthetic */ zzfor zzt() {
        return this.zzp;
    }
}
