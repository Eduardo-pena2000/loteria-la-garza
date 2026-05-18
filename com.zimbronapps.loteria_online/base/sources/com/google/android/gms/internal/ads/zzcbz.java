package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbz implements zzcce {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzifv zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzccb zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcbz(Context context, W5.a aVar, zzccb zzccbVar, String str, zzcca zzccaVar) {
        com.google.android.gms.common.internal.t.m(zzccbVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzccbVar;
        Iterator it = zzccbVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzifv zzg = zzihz.zzg();
        zzg.zzn(9);
        if (str != null) {
            zzg.zzb(str);
            zzg.zzc(str);
        }
        zzifw zzc2 = zzifx.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc2.zza(str2);
        }
        zzg.zzd((zzifx) zzc2.zzbm());
        zzihl zzc3 = zzihm.zzc();
        zzc3.zzc(G6.e.a(this.zzh).g());
        String str3 = aVar.a;
        if (str3 != null) {
            zzc3.zza(str3);
        }
        long a = v6.h.f().a(this.zzh);
        if (a > 0) {
            zzc3.zzb(a);
        }
        zzg.zzk((zzihm) zzc3.zzbm());
        this.zzd = zzg;
    }

    public static /* synthetic */ List zzi() {
        return zzc;
    }

    public final zzccb zza() {
        return this.zzi;
    }

    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzccb r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L88
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L88
            R5.t.g()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L15
            goto L76
        L15:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L27
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L27
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L27
            if (r3 == 0) goto L29
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L27
            goto L2a
        L27:
            r2 = move-exception
            goto L30
        L29:
            r3 = r1
        L2a:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2e
            goto L38
        L2e:
            r2 = move-exception
            goto L31
        L30:
            r3 = r1
        L31:
            int r4 = V5.o0.b
            java.lang.String r4 = "Fail to capture the web view"
            W5.p.d(r4, r2)
        L38:
            if (r3 != 0) goto L75
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            if (r2 == 0) goto L65
            if (r3 != 0) goto L47
            goto L65
        L47:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L63
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L63
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L63
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L63
            r1 = r4
            goto L76
        L63:
            r8 = move-exception
            goto L6d
        L65:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = V5.o0.b     // Catch: java.lang.RuntimeException -> L63
            W5.p.f(r8)     // Catch: java.lang.RuntimeException -> L63
            goto L76
        L6d:
            int r2 = V5.o0.b
            java.lang.String r2 = "Fail to capture the webview"
            W5.p.d(r2, r8)
            goto L76
        L75:
            r1 = r3
        L76:
            if (r1 != 0) goto L7e
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzccd.zza(r8)
            return
        L7e:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzcby r8 = new com.google.android.gms.internal.ads.zzcby
            r8.<init>(r7, r1)
            V5.F0.U(r8)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbz.zzd(android.view.View):void");
    }

    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzihj) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzihj zze = zzihk.zze();
            int zza = zzihi.zza(i);
            if (zza != 0) {
                zze.zze(zza);
            }
            zze.zza(linkedHashMap.size());
            zze.zzb(str);
            zzigi zzc2 = zzigl.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzigg zzc3 = zzigh.zzc();
                        zzc3.zza(zzian.zzv(str2));
                        zzc3.zzb(zzian.zzv(str3));
                        zzc2.zza((zzigh) zzc3.zzbm());
                    }
                }
            }
            zze.zzc((zzigl) zzc2.zzbm());
            linkedHashMap.put(str, zze);
        }
    }

    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            x7.e zza = zzgzo.zza(Collections.emptyMap());
            zzcbv zzcbvVar = new zzcbv(this);
            zzgzy zzgzyVar = zzcei.zzg;
            x7.e zzj = zzgzo.zzj(zza, zzcbvVar, zzgzyVar);
            x7.e zzi = zzgzo.zzi(zzj, 10L, TimeUnit.SECONDS, zzcei.zzd);
            zzgzo.zzr(zzj, new zzcbu(this, zzi), zzgzyVar);
            zzc.add(zzi);
        }
    }

    public final /* synthetic */ void zzg(Bitmap bitmap) {
        zziam zzA = zzian.zzA();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzA);
        synchronized (this.zzj) {
            zzifv zzifvVar = this.zzd;
            zzihd zzc2 = zzihf.zzc();
            zzc2.zzb(zzA.zza());
            zzc2.zza("image/png");
            zzc2.zzc(2);
            zzifvVar.zzj((zzihf) zzc2.zzbm());
        }
    }

    public final /* synthetic */ x7.e zzh(Map map) {
        int length;
        zzihj zzihjVar;
        x7.e zzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = optJSONArray.length();
                                synchronized (obj) {
                                    zzihjVar = (zzihj) this.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzihjVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzccd.zza(sb.toString());
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzihjVar.zzd(optJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbjm.zza.zze()).booleanValue()) {
                    int i2 = o0.b;
                    W5.p.b("Failed to get SafeBrowsing metadata", e);
                }
                return zzgzo.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgzo.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzihk) ((zzihj) it.next()).zzbm());
                }
                zzifv zzifvVar = this.zzd;
                zzifvVar.zzl(this.zzf);
                zzifvVar.zzm(this.zzg);
                if (zzccd.zzb()) {
                    String zza = zzifvVar.zza();
                    String zzg = zzifvVar.zzg();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 38 + String.valueOf(zzg).length() + 15);
                    sb2.append("Sending SB report\n  url: ");
                    sb2.append(zza);
                    sb2.append("\n  clickUrl: ");
                    sb2.append(zzg);
                    sb2.append("\n  resources: \n");
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    for (zzihk zzihkVar : zzifvVar.zze()) {
                        sb3.append("    [");
                        sb3.append(zzihkVar.zzd());
                        sb3.append("] ");
                        sb3.append(zzihkVar.zzc());
                    }
                    zzccd.zza(sb3.toString());
                }
                x7.e b = new V5.N(this.zzh).b(1, this.zzi.zzb, null, ((zzihz) zzifvVar.zzbm()).zzaN());
                if (zzccd.zzb()) {
                    b.addListener(zzcbx.zza, zzcei.zza);
                }
                zzk = zzgzo.zzk(b, zzcbw.zza, zzcei.zzg);
            } finally {
            }
        }
        return zzk;
    }
}
