package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzge;
import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzga {
    private static final zzps zza = zzps.zza(new zzgd(), zzgb.class, zzba.class);
    private static final zzbh zzb = zzod.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzba.class, zzwx.zzb.SYMMETRIC, zzyo.zze());
    private static final zzot zzc = new zzgc();
    private static final zzor zzd = new zzgf();

    public static /* synthetic */ zzba zza(zzgb zzgbVar) {
        return zzik.zza() ? zzik.zza(zzgbVar) : zzaak.zza(zzgbVar);
    }

    public static zzgb zza(zzge zzgeVar, Integer num) throws GeneralSecurityException {
        return zzgb.zza(zzgeVar.zzb(), zzaal.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzij.zza();
            zzpa.zza().zza(zza);
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzge.zza(zzge.zza.zza));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzge.zza(zzge.zza.zzc));
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzop.zza().zza(zzd, zzge.class);
            zzou.zza().zza(zzc, zzge.class);
            zznq.zza().zza(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
