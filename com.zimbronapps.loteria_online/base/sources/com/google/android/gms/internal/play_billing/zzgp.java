package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzgp implements zzgv {
    private final zzgl zza;
    private final zzhh zzb;
    private final boolean zzc;
    private final zzev zzd;

    private zzgp(zzhh zzhhVar, zzev zzevVar, zzgl zzglVar) {
        this.zzb = zzhhVar;
        this.zzc = zzglVar instanceof zzff;
        this.zzd = zzevVar;
        this.zza = zzglVar;
    }

    public static zzgp zzc(zzhh zzhhVar, zzev zzevVar, zzgl zzglVar) {
        return new zzgp(zzhhVar, zzevVar, zzglVar);
    }

    public final int zza(Object obj) {
        int zzb = ((zzfi) obj).zzc.zzb();
        return this.zzc ? zzb + ((zzff) obj).zzb.zzd() : zzb;
    }

    public final int zzb(Object obj) {
        int hashCode = ((zzfi) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzff) obj).zzb.zza.hashCode() : hashCode;
    }

    public final Object zze() {
        zzgl zzglVar = this.zza;
        return zzglVar instanceof zzfi ? ((zzfi) zzglVar).zzo() : zzglVar.zzK().zzg();
    }

    public final void zzf(Object obj) {
        this.zzb.zzb(obj);
        this.zzd.zza(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzgx.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgx.zzo(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzdw zzdwVar) throws IOException {
        zzfi zzfiVar = (zzfi) obj;
        if (zzfiVar.zzc == zzhi.zzc()) {
            zzfiVar.zzc = zzhi.zzf();
        }
        throw null;
    }

    public final void zzi(Object obj, zzhu zzhuVar) throws IOException {
        Iterator zzf = ((zzff) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzey zzeyVar = (zzey) entry.getKey();
            if (zzeyVar.zzc() != zzht.zzi || zzeyVar.zze() || zzeyVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzfs) {
                zzhuVar.zzw(zzeyVar.zza(), ((zzfs) entry).zza().zzb());
            } else {
                zzhuVar.zzw(zzeyVar.zza(), entry.getValue());
            }
        }
        ((zzfi) obj).zzc.zzk(zzhuVar);
    }

    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzfi) obj).zzc.equals(((zzfi) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzff) obj).zzb.equals(((zzff) obj2).zzb);
        }
        return true;
    }

    public final boolean zzk(Object obj) {
        return ((zzff) obj).zzb.zzi();
    }
}
