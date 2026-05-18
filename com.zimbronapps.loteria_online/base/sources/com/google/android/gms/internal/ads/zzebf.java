package com.google.android.gms.internal.ads;

import S5.P0;
import V5.o0;
import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzebf implements zzech, zzeaq {
    private final zzebq zza;
    private final zzeci zzb;
    private final zzear zzc;
    private final zzeba zzd;
    private final zzeap zze;
    private final zzecc zzf;
    private final zzebm zzg;
    private final zzebm zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private zzebb zzr = zzebb.NONE;
    private zzebe zzv = zzebe.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzebf(zzebq zzebqVar, zzeci zzeciVar, zzear zzearVar, Context context, W5.a aVar, zzeba zzebaVar, zzecc zzeccVar, zzebm zzebmVar, zzebm zzebmVar2, String str) {
        this.zza = zzebqVar;
        this.zzb = zzeciVar;
        this.zzc = zzearVar;
        this.zze = new zzeap(context);
        this.zzi = aVar.a;
        this.zzk = str;
        this.zzd = zzebaVar;
        this.zzf = zzeccVar;
        this.zzg = zzebmVar;
        this.zzh = zzebmVar2;
        this.zzj = context;
        R5.t.s().a(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzt(jSONObject.optBoolean("isTestMode", false), false);
            zzu((zzebb) Enum.valueOf(zzebb.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzt(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzkF     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzbhc r0 = S5.D.c()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.zzd(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            V5.y r2 = R5.t.s()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.k()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.zzx()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.zzs()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.zzy()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.zzz()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebf.zzt(boolean, boolean):void");
    }

    private final synchronized void zzu(zzebb zzebbVar, boolean z) {
        try {
            if (this.zzr != zzebbVar) {
                if (zzs()) {
                    zzy();
                }
                this.zzr = zzebbVar;
                if (zzs()) {
                    zzx();
                }
                if (z) {
                    zzz();
                }
            }
        } finally {
        }
    }

    private final synchronized JSONObject zzv() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzeat zzeatVar : (List) entry.getValue()) {
                    if (zzeatVar.zzc()) {
                        jSONArray.put(zzeatVar.zzg());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void zzw() {
        this.zzu = true;
        this.zzd.zza();
        this.zza.zzl(this);
        this.zzb.zza(this);
        this.zzc.zza(this);
        this.zzf.zzb(this);
        zzbgv zzbgvVar = zzbhe.zzkU;
        if (!TextUtils.isEmpty((CharSequence) S5.D.c().zzd(zzbgvVar))) {
            this.zzg.zza(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) S5.D.c().zzd(zzbgvVar)).split(",")));
        }
        zzbgv zzbgvVar2 = zzbhe.zzkV;
        if (!TextUtils.isEmpty((CharSequence) S5.D.c().zzd(zzbgvVar2))) {
            this.zzh.zza(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) S5.D.c().zzd(zzbgvVar2)).split(",")));
        }
        zzA(R5.t.l().zzo().zzH());
        this.zzx = R5.t.l().zzo().zzN();
    }

    private final synchronized void zzx() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzy() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzc();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    private final void zzz() {
        R5.t.l().zzo().b(zzh());
    }

    public final void zza() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue() && R5.t.l().zzo().zzJ()) {
                zzw();
                return;
            }
            String zzH = R5.t.l().zzo().zzH();
            if (TextUtils.isEmpty(zzH)) {
                return;
            }
            try {
                if (new JSONObject(zzH).optBoolean("isTestMode", false)) {
                    zzw();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzw()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzs
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzx()
            return
        L15:
            boolean r2 = r1.zzs()
            if (r2 != 0) goto L1e
            r1.zzy()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebf.zzb(boolean):void");
    }

    public final void zzc(boolean z) {
        if (!this.zzu && z) {
            zzw();
        }
        zzt(z, true);
    }

    public final synchronized boolean zzd() {
        return this.zzs;
    }

    public final void zze(zzebb zzebbVar) {
        zzu(zzebbVar, true);
    }

    public final zzebb zzf() {
        return this.zzr;
    }

    public final synchronized String zzg() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue() && zzs()) {
            if (this.zzq < R5.t.o().a() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzh() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > R5.t.o().a() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void zzi(String str, long j) {
        this.zzo = str;
        this.zzq = j;
        zzz();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        R5.t.l().zzo().h(this.zzx);
    }

    public final synchronized void zzk(String str, zzeat zzeatVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue() && zzs()) {
            if (this.zzt >= ((Integer) S5.D.c().zzd(zzbhe.zzks)).intValue()) {
                int i = o0.b;
                W5.p.f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.zzl;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) map.get(str)).add(zzeatVar);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkO)).booleanValue()) {
                String zzd = zzeatVar.zzd();
                this.zzm.put(zzd, zzeatVar);
                Map map2 = this.zzn;
                if (map2.containsKey(zzd)) {
                    List list = (List) map2.get(zzd);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcen) it.next()).zzc(zzeatVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void zzl(long j) {
        this.zzw += j;
    }

    public final boolean zzm() {
        return this.zzw < ((Long) S5.D.c().zzd(zzbhe.zzkL)).longValue();
    }

    public final synchronized x7.e zzn(String str) {
        zzcen zzcenVar;
        try {
            zzcenVar = new zzcen();
            Map map = this.zzm;
            if (map.containsKey(str)) {
                zzcenVar.zzc((zzeat) map.get(str));
            } else {
                Map map2 = this.zzn;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzcenVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzcenVar;
    }

    public final synchronized void zzo(P0 p0, zzebe zzebeVar) {
        if (!zzs()) {
            try {
                p0.zze(zzfkm.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = o0.b;
                W5.p.f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue()) {
            this.zzv = zzebeVar;
            this.zza.zzm(p0, new zzbpc(this), new zzbov(this.zzf), new zzboi(this));
            return;
        } else {
            try {
                p0.zze(zzfkm.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i2 = o0.b;
                W5.p.f("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzp(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final boolean zzq() {
        return this.zzp != null;
    }

    public final synchronized JSONObject zzr() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                String str = this.zzk;
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append("afma-sdk-a-v");
                    sb.append(str);
                    jSONObject.put("sdkVersion", sb.toString());
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zzb());
                if (((Boolean) S5.D.c().zzd(zzbhe.zzkR)).booleanValue()) {
                    String zzu = R5.t.l().zzu();
                    if (!TextUtils.isEmpty(zzu)) {
                        jSONObject.put("plugin", zzu);
                    }
                }
                if (this.zzq < R5.t.o().a() / 1000) {
                    this.zzo = "{}";
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzv());
                jSONObject.put("appInfo", this.zze.zza());
                String zzd = R5.t.l().zzo().zzi().zzd();
                if (!TextUtils.isEmpty(zzd)) {
                    jSONObject.put("cld", new JSONObject(zzd));
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zzkG)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    String obj = jSONObject2.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 13);
                    sb2.append("Server data: ");
                    sb2.append(obj);
                    String sb3 = sb2.toString();
                    int i = o0.b;
                    W5.p.a(sb3);
                    jSONObject.put("serverData", this.zzp);
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", R5.t.s().k());
                R5.t.g();
                S5.B.a();
                jSONObject.put("isSimulator", W5.g.D());
                if (((Boolean) S5.D.c().zzd(zzbhe.zzkT)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) S5.D.c().zzd(zzbhe.zzkV))) {
                    jSONObject.put("gmaDisk", this.zzh.zzb());
                }
                if (!TextUtils.isEmpty((CharSequence) S5.D.c().zzd(zzbhe.zzkU))) {
                    jSONObject.put("userDisk", this.zzg.zzb());
                }
            } catch (JSONException e) {
                R5.t.l().zzh(e, "Inspector.toJson");
                int i2 = o0.b;
                W5.p.g("Ad inspector encountered an error", e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized boolean zzs() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue()) {
            return this.zzs || R5.t.s().k();
        }
        return this.zzs;
    }
}
