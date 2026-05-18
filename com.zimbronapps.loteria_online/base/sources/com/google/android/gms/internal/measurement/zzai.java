package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzai implements zzao, zzak {
    protected final String zzd;
    protected final Map zze = new HashMap();

    public zzai(String str) {
        this.zzd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        String str = this.zzd;
        if (str != null) {
            return str.equals(zzaiVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract zzao zza(zzg zzgVar, List list);

    public final String zzc() {
        return this.zzd;
    }

    public final zzao zzcA(String str, zzg zzgVar, List list) {
        return "toString".equals(str) ? new zzas(this.zzd) : zzak.zzu(this, new zzas(str), zzgVar, list);
    }

    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    public final Boolean zze() {
        return Boolean.TRUE;
    }

    public final Iterator zzf() {
        return zzak.zzv(this.zze);
    }

    public final String zzg() {
        return this.zzd;
    }

    public final boolean zzj(String str) {
        return this.zze.containsKey(str);
    }

    public final zzao zzk(String str) {
        Map map = this.zze;
        return map.containsKey(str) ? (zzao) map.get(str) : zzao.zzf;
    }

    public final void zzm(String str, zzao zzaoVar) {
        if (zzaoVar == null) {
            this.zze.remove(str);
        } else {
            this.zze.put(str, zzaoVar);
        }
    }

    public zzao zzt() {
        return this;
    }
}
