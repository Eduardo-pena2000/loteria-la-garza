package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeba {
    private final zzeak zza;
    private final zzdvm zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzeba(zzeak zzeakVar, zzdvm zzdvmVar) {
        this.zza = zzeakVar;
        this.zzb = zzdvmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        String str;
        zzdvl zzc;
        zzbwh zzbwhVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbqg zzbqgVar = (zzbqg) it.next();
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzkM)).booleanValue()) {
                        zzdvl zzc2 = this.zzb.zzc(zzbqgVar.zza);
                        str = (zzc2 == null || (zzbwhVar = zzc2.zzc) == null) ? "" : zzbwhVar.toString();
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    boolean z = ((Boolean) S5.D.c().zzd(zzbhe.zzkN)).booleanValue() && (zzc = this.zzb.zzc(zzbqgVar.zza)) != null && zzc.zzd;
                    List list2 = this.zzd;
                    String str3 = zzbqgVar.zza;
                    list2.add(new zzeaz(str3, str2, this.zzb.zzd(str3), zzbqgVar.zzb ? 1 : 0, zzbqgVar.zzd, zzbqgVar.zzc, z));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        this.zza.zzb(new zzeay(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[Catch: all -> 0x001c, LOOP:0: B:15:0x0029->B:17:0x002f, LOOP_END, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:9:0x001e, B:10:0x0021, B:14:0x0023, B:15:0x0029, B:17:0x002f, B:19:0x003d), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONArray zzb() throws org.json.JSONException {
        /*
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = r4.zzc
            monitor-enter(r1)
            boolean r2 = r4.zze     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzeak r2 = r4.zza     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r2.zze()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            java.util.List r2 = r2.zzd()     // Catch: java.lang.Throwable -> L1c
            r4.zzc(r2)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r0 = move-exception
            goto L3f
        L1e:
            r4.zza()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            goto L3e
        L23:
            java.util.List r2 = r4.zzd     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1c
        L29:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.ads.zzeaz r3 = (com.google.android.gms.internal.ads.zzeaz) r3     // Catch: java.lang.Throwable -> L1c
            org.json.JSONObject r3 = r3.zza()     // Catch: java.lang.Throwable -> L1c
            r0.put(r3)     // Catch: java.lang.Throwable -> L1c
            goto L29
        L3d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
        L3e:
            return r0
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeba.zzb():org.json.JSONArray");
    }
}
