package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaep {
    private final zzaeo zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzaep(zzaeo zzaeoVar) {
        this.zza = zzaeoVar;
    }

    public final zzaeu zza(Object... objArr) {
        Constructor zza;
        AtomicBoolean atomicBoolean = this.zzb;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    zza = this.zza.zza();
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (zzaeu) zza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
