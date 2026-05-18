package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfad implements zzfax {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfae zzc = new zzfae(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzgzy zzd;
    private final ScheduledExecutorService zze;
    private final zzeqk zzf;
    private final Context zzg;
    private final zzfjk zzh;
    private final zzeqf zzi;
    private final zzdvp zzj;
    private final zzeam zzk;
    private final int zzl;

    public zzfad(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, String str, zzeqk zzeqkVar, Context context, zzfjk zzfjkVar, zzeqf zzeqfVar, zzdvp zzdvpVar, zzeam zzeamVar, int i) {
        this.zzd = zzgzyVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzeqkVar;
        this.zzg = context;
        this.zzh = zzfjkVar;
        this.zzi = zzeqfVar;
        this.zzj = zzdvpVar;
        this.zzk = zzeamVar;
        this.zzl = i;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzeqo zzeqoVar = (zzeqo) ((Map.Entry) it.next()).getValue();
            String str = zzeqoVar.zza;
            list.add(zzh(str, Collections.singletonList(zzeqoVar.zze), zzg(str), zzeqoVar.zzb, zzeqoVar.zzc));
        }
    }

    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.m;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgzg zzh(String str, List list, Bundle bundle, boolean z, boolean z2) {
        zzezy zzezyVar = new zzezy(this, str, list, bundle, z, z2);
        zzgzy zzgzyVar = this.zzd;
        zzgzg zzw = zzgzg.zzw(zzgzo.zzf(zzezyVar, zzgzyVar));
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzcf)).booleanValue()) {
            zzw = (zzgzg) zzgzo.zzi(zzw, ((Long) S5.D.c().zzd(zzbhe.zzbY)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgzg) zzgzo.zzg(zzw, Throwable.class, new zzezz(str), zzgzyVar);
    }

    private final void zzi(zzbvs zzbvsVar, Bundle bundle, List list, zzeqn zzeqnVar) throws RemoteException {
        zzbvsVar.zze(N6.b.s1(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzeqnVar);
    }

    public final x7.e zza() {
        if (this.zzl == 2) {
            return zzgzo.zza(zzc);
        }
        zzfjk zzfjkVar = this.zzh;
        if (zzfjkVar.zzs) {
            if (!Arrays.asList(((String) S5.D.c().zzd(zzbhe.zzcl)).split(",")).contains(b6.c.b(b6.c.c(zzfjkVar.zzd)))) {
                return zzgzo.zza(zzc);
            }
        }
        return zzgzo.zzf(new zzfab(this), this.zzd);
    }

    public final int zzb() {
        return 32;
    }

    public final /* synthetic */ x7.e zzc() {
        String str;
        String lowerCase = ((Boolean) S5.D.c().zzd(zzbhe.zzmr)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        Bundle zzg = ((Boolean) S5.D.c().zzd(zzbhe.zzcj)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfc)).booleanValue()) {
            int zzk = R5.t.l().zzo().zzi().zzk();
            str = zzk != 1 ? zzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcs)).booleanValue()) {
            zzf(arrayList, this.zzf.zzd(this.zza, lowerCase));
        } else {
            zzeqk zzeqkVar = this.zzf;
            for (Map.Entry entry : zzeqkVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzf(arrayList, zzeqkVar.zzb());
        }
        return zzgzo.zzp(arrayList).zza(new zzezx(arrayList, zzg, str), this.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ x7.e zzd(java.lang.String r9, java.util.List r10, android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzcen r7 = new com.google.android.gms.internal.ads.zzcen
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L24
            com.google.android.gms.internal.ads.zzbgv r13 = com.google.android.gms.internal.ads.zzbhe.zzck
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r13 = r1.zzd(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L24
            com.google.android.gms.internal.ads.zzeqf r13 = r8.zzi
            r13.zza(r9)
            com.google.android.gms.internal.ads.zzbvs r13 = r13.zzb(r9)
            goto L32
        L24:
            com.google.android.gms.internal.ads.zzdvp r13 = r8.zzj     // Catch: android.os.RemoteException -> L2b
            com.google.android.gms.internal.ads.zzbvs r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2b
            goto L32
        L2b:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            V5.o0.l(r1, r13)
            r13 = r0
        L32:
            if (r13 != 0) goto L4c
            com.google.android.gms.internal.ads.zzbgv r10 = com.google.android.gms.internal.ads.zzbhe.zzca
            com.google.android.gms.internal.ads.zzbhc r11 = S5.D.c()
            java.lang.Object r10 = r11.zzd(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4b
            com.google.android.gms.internal.ads.zzeqn.zzd(r9, r7)
            goto Lb8
        L4b:
            throw r0
        L4c:
            com.google.android.gms.internal.ads.zzeqn r6 = new com.google.android.gms.internal.ads.zzeqn
            E6.f r0 = R5.t.o()
            long r4 = r0.b()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbgv r9 = com.google.android.gms.internal.ads.zzbhe.zzcf
            com.google.android.gms.internal.ads.zzbhc r0 = S5.D.c()
            java.lang.Object r9 = r0.zzd(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8b
            java.util.concurrent.ScheduledExecutorService r9 = r8.zze
            com.google.android.gms.internal.ads.zzfac r0 = new com.google.android.gms.internal.ads.zzfac
            r0.<init>(r6)
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzbY
            com.google.android.gms.internal.ads.zzbhc r2 = S5.D.c()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8b:
            if (r12 == 0) goto Lb5
            com.google.android.gms.internal.ads.zzbgv r9 = com.google.android.gms.internal.ads.zzbhe.zzcm
            com.google.android.gms.internal.ads.zzbhc r12 = S5.D.c()
            java.lang.Object r9 = r12.zzd(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb1
            com.google.android.gms.internal.ads.zzgzy r9 = r8.zzd
            com.google.android.gms.internal.ads.zzfaa r12 = new com.google.android.gms.internal.ads.zzfaa
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.zza(r12)
            goto Lb8
        Lb1:
            r8.zzi(r13, r11, r10, r6)
            goto Lb8
        Lb5:
            r6.zzb()
        Lb8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfad.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):x7.e");
    }

    public final /* synthetic */ void zze(zzbvs zzbvsVar, Bundle bundle, List list, zzeqn zzeqnVar, zzcen zzcenVar) {
        try {
            zzi(zzbvsVar, bundle, list, zzeqnVar);
        } catch (RemoteException e) {
            zzcenVar.zzd(e);
        }
    }
}
