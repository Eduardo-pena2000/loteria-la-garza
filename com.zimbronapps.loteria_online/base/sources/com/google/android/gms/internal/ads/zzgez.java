package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgez {
    private final zzgzy zza;
    private final zzgfe zzb;
    private final Set zzc;
    private final String zzd;
    private final zzawg zze;
    private final zzgfx zzf;
    private final zzgoe zzg;

    public zzgez(zzgzy zzgzyVar, zzgfe zzgfeVar, zzgfx zzgfxVar, zzgcc zzgccVar, String str, zzawg zzawgVar, zzikv zzikvVar, zzikv zzikvVar2, zzikv zzikvVar3, zzgoe zzgoeVar) {
        this.zza = zzgzyVar;
        this.zzb = zzgfeVar;
        this.zzd = str;
        this.zzf = zzgfxVar;
        this.zze = zzawgVar;
        this.zzg = zzgoeVar;
        int ordinal = zzgccVar.ordinal();
        if (ordinal == 0) {
            this.zzc = ((zziks) zzikvVar).zzc();
        } else if (ordinal == 1) {
            this.zzc = ((zziks) zzikvVar2).zzc();
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException();
            }
            this.zzc = ((zziks) zzikvVar3).zzc();
        }
    }

    public final x7.e zza() {
        if (!this.zzb.zzc()) {
            return zzgzo.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzgzo.zzd(new zzgey(this), this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.submit((zzgha) it.next()));
        }
        return zzgzo.zzn(arrayList).zza(new zzgew(this), zzhaf.zza());
    }

    public final /* synthetic */ String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    public final /* synthetic */ String zzc() {
        zzgex zzgexVar = new zzgex(this);
        zzgoc zza = this.zzg.zza(101);
        try {
            zza.zza();
            Object call = zzgexVar.call();
            zza.zzc();
            return (String) call;
        } finally {
        }
    }

    public final /* synthetic */ String zzd() {
        zzaxg zzaxgVar = (zzaxg) this.zze.zzbm();
        String str = this.zzd;
        zzgfe zzgfeVar = this.zzb;
        try {
            return Base64.encodeToString(((zzaxx) zzgfeVar.zzf(zzaxgVar.zzaN(), str).zzbm()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzgfeVar.zzg(4096, str);
        }
    }
}
