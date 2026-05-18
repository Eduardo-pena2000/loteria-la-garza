package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaad extends ThreadLocal {
    private final /* synthetic */ zzaae zza;

    public zzaad(zzaae zzaaeVar) {
        Objects.requireNonNull(zzaaeVar);
        this.zza = zzaaeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzzj.zzb.zza(zzaae.zza(this.zza));
            mac.init(zzaae.zzb(this.zza));
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
