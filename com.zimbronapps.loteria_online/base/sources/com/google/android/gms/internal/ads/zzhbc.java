package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhbc {
    public static final zzhqf zza(zzhbp zzhbpVar) {
        try {
            return ((zzhlc) zzhkg.zza().zzk(null, zzhlc.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzhlm("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }

    public static final zzhbp zzb(zzhbp zzhbpVar) throws GeneralSecurityException {
        return zzhbpVar != null ? zzhbpVar : zzhbv.zzb(zza(null).zzaN());
    }
}
