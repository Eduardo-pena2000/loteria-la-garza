package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhky {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzhky(zzhkv zzhkvVar, byte[] bArr) {
        this.zza = new HashMap(zzhkvVar.zzd());
        this.zzb = new HashMap(zzhkvVar.zze());
    }

    public static zzhkv zza() {
        return new zzhkv(null);
    }

    public final Object zzb(zzhaz zzhazVar, Class cls) throws GeneralSecurityException {
        zzhkw zzhkwVar = new zzhkw(zzhazVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhkwVar)) {
            return ((zzhku) map.get(zzhkwVar)).zza(zzhazVar);
        }
        String obj = zzhkwVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 102);
        sb.append("No PrimitiveConstructor for ");
        sb.append(obj);
        sb.append(" available, see https://developers.google.com/tink/faq/registration_errors");
        throw new GeneralSecurityException(sb.toString());
    }

    public final Object zzc(zzhjj zzhjjVar, zzhjr zzhjrVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzhla zzhlaVar = (zzhla) map.get(cls);
        return zzhlaVar.zze(zzhjjVar, zzhjrVar, new zzhkx(this, zzhlaVar));
    }

    public final /* synthetic */ Map zzd() {
        return this.zza;
    }

    public final /* synthetic */ Map zze() {
        return this.zzb;
    }
}
