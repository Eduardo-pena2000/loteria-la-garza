package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzayx implements zzfwx {
    final /* synthetic */ zzfvc zza;

    public zzayx(zzayz zzayzVar, zzfvc zzfvcVar) {
        this.zza = zzfvcVar;
        Objects.requireNonNull(zzayzVar);
    }

    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
