package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzenr {
    private final E6.f zza;
    private final zzent zzb;
    private final zzfqk zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) S5.D.c().zzd(zzbhe.zzhL)).booleanValue();
    private final zzekl zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzenr(E6.f fVar, zzent zzentVar, zzekl zzeklVar, zzfqk zzfqkVar) {
        this.zza = fVar;
        this.zzb = zzentVar;
        this.zzf = zzeklVar;
        this.zzc = zzfqkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean zzi(zzfir zzfirVar) {
        zzenq zzenqVar = (zzenq) this.zzd.get(zzfirVar);
        if (zzenqVar == null) {
            return false;
        }
        return zzenqVar.zzc == 8;
    }

    public final synchronized void zza() {
        this.zzi = this.zza.b();
    }

    public final synchronized void zzb() {
        this.zzh = this.zza.b() - this.zzi;
    }

    public final synchronized void zzc(List list) {
        this.zzi = this.zza.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfir zzfirVar = (zzfir) it.next();
            String str = zzfirVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfirVar, new zzenq(str, zzfirVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzd(zzfir zzfirVar) {
        try {
            this.zzh = this.zza.b() - this.zzi;
            if (zzfirVar != null) {
                this.zzf.zzi(zzfirVar);
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized x7.e zze(zzfjc zzfjcVar, zzfir zzfirVar, x7.e eVar, zzfqg zzfqgVar) {
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        long b = this.zza.b();
        String str = zzfirVar.zzw;
        if (str != null) {
            this.zzd.put(zzfirVar, new zzenq(str, zzfirVar.zzaf, 9, 0L, null));
            zzgzo.zzr(eVar, new zzenp(this, b, zzfiuVar, zzfirVar, str, zzfqgVar, zzfjcVar), zzcei.zzg);
        }
        return eVar;
    }

    public final synchronized void zzf(zzfir zzfirVar) {
        zzenq zzenqVar = (zzenq) this.zzd.get(zzfirVar);
        if (zzenqVar == null || this.zzg) {
            return;
        }
        zzenqVar.zzc = 8;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzenq zzenqVar = (zzenq) ((Map.Entry) it.next()).getValue();
                if (zzenqVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzenqVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized long zzh() {
        return this.zzh;
    }

    public final /* synthetic */ E6.f zzj() {
        return this.zza;
    }

    public final /* synthetic */ zzent zzk() {
        return this.zzb;
    }

    public final /* synthetic */ zzfqk zzl() {
        return this.zzc;
    }

    public final /* synthetic */ LinkedHashMap zzm() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzn() {
        return this.zze;
    }

    public final /* synthetic */ zzekl zzo() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzp() {
        return this.zzg;
    }
}
