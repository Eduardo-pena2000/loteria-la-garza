package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzvs extends zzvj {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhz zzc;

    public final void zzM() {
        for (zzvr zzvrVar : this.zza.values()) {
            zzvrVar.zza.zzq(zzvrVar.zzb);
        }
    }

    public void zza(zzhz zzhzVar) {
        this.zzc = zzhzVar;
        this.zzb = zzfj.zzc(null);
    }

    public final void zzc() {
        for (zzvr zzvrVar : this.zza.values()) {
            zzvrVar.zza.zzr(zzvrVar.zzb);
        }
    }

    public void zzd() {
        HashMap hashMap = this.zza;
        for (zzvr zzvrVar : hashMap.values()) {
            zzwm zzwmVar = zzvrVar.zza;
            zzwmVar.zzs(zzvrVar.zzb);
            zzvq zzvqVar = zzvrVar.zzc;
            zzwmVar.zzm(zzvqVar);
            zzwmVar.zzo(zzvqVar);
        }
        hashMap.clear();
    }

    public void zzt() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzvr) it.next()).zza.zzt();
        }
    }

    public abstract void zzu(Object obj, zzwm zzwmVar, zzbf zzbfVar);

    public final void zzv(Object obj, zzwm zzwmVar) {
        HashMap hashMap = this.zza;
        zzgrc.zza(!hashMap.containsKey(obj));
        zzwl zzvpVar = new zzvp(this, obj);
        zzvq zzvqVar = new zzvq(this, obj);
        hashMap.put(obj, new zzvr(zzwmVar, zzvpVar, zzvqVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzwmVar.zzl(handler, zzvqVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzwmVar.zzn(handler2, zzvqVar);
        zzwmVar.zzp(zzvpVar, this.zzc, zzk());
        if (zzj()) {
            return;
        }
        zzwmVar.zzr(zzvpVar);
    }

    public int zzw(Object obj, int i) {
        return 0;
    }

    public zzwk zzx(Object obj, zzwk zzwkVar) {
        throw null;
    }

    public long zzy(Object obj, long j, zzwk zzwkVar) {
        return j;
    }
}
