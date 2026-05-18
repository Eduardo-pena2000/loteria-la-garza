package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzidg implements zzidu {
    private final zzidc zza;
    private final zzief zzb;
    private final boolean zzc;
    private final zzibc zzd;

    private zzidg(zzief zziefVar, zzibc zzibcVar, zzidc zzidcVar) {
        this.zzb = zziefVar;
        this.zzc = zzidcVar instanceof zzibn;
        this.zzd = zzibcVar;
        this.zza = zzidcVar;
    }

    public static zzidg zzh(zzief zziefVar, zzibc zzibcVar, zzidc zzidcVar) {
        return new zzidg(zziefVar, zzibcVar, zzidcVar);
    }

    public final Object zza() {
        zzidc zzidcVar = this.zza;
        return zzidcVar instanceof zzibr ? ((zzibr) zzidcVar).zzbg() : zzidcVar.zzcY().zzbt();
    }

    public final boolean zzb(Object obj, Object obj2) {
        if (!((zzibr) obj).zzt.equals(((zzibr) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzibn) obj).zza.equals(((zzibn) obj2).zza);
        }
        return true;
    }

    public final int zzc(Object obj) {
        int hashCode = ((zzibr) obj).zzt.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzibn) obj).zza.zza.hashCode() : hashCode;
    }

    public final void zzd(Object obj, Object obj2) {
        zzidw.zzI(this.zzb, obj, obj2);
        if (this.zzc) {
            zzidw.zzH(this.zzd, obj, obj2);
        }
    }

    public final int zze(Object obj) {
        int zzh = ((zzibr) obj).zzt.zzh();
        return this.zzc ? zzh + ((zzibn) obj).zza.zzg() : zzh;
    }

    public final void zzf(Object obj, zzieu zzieuVar) throws IOException {
        Iterator zzc = ((zzibn) obj).zza.zzc();
        while (zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) zzc.next();
            zzibf zzibfVar = (zzibf) entry.getKey();
            if (zzibfVar.zzc() != zziet.zzi || zzibfVar.zzd() || zzibfVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzicj) {
                zzieuVar.zzv(zzibfVar.zza(), ((zzicj) entry).zza().zzc());
            } else {
                zzieuVar.zzv(zzibfVar.zza(), entry.getValue());
            }
        }
        ((zzibr) obj).zzt.zzf(zzieuVar);
    }

    public final void zzg(Object obj, zzidp zzidpVar, zzibb zzibbVar) throws IOException {
        this.zzb.zzh(obj);
        throw null;
    }

    public final void zzj(Object obj, byte[] bArr, int i, int i2, zziab zziabVar) throws IOException {
        zzibr zzibrVar = (zzibr) obj;
        if (zzibrVar.zzt == zzieg.zza()) {
            zzibrVar.zzt = zzieg.zzb();
        }
        throw null;
    }

    public final void zzk(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zza(obj);
    }

    public final boolean zzl(Object obj) {
        return ((zzibn) obj).zza.zze();
    }
}
