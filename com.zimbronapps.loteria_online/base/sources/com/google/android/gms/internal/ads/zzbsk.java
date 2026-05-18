package com.google.android.gms.internal.ads;

import V5.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbsk extends zzceu {
    private final V5.E zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbsk(V5.E e) {
        this.zzb = e;
    }

    public final zzbsf zza() {
        zzbsf zzbsfVar = new zzbsf(this);
        o0.k("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            o0.k("createNewReference: Lock acquired");
            zze(new zzbsg(this, zzbsfVar), new zzbsh(this, zzbsfVar));
            com.google.android.gms.common.internal.t.o(this.zzd >= 0);
            this.zzd++;
        }
        o0.k("createNewReference: Lock released");
        return zzbsfVar;
    }

    public final void zzb() {
        o0.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            o0.k("releaseOneReference: Lock acquired");
            com.google.android.gms.common.internal.t.o(this.zzd > 0);
            o0.k("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzd();
        }
        o0.k("releaseOneReference: Lock released");
    }

    public final void zzc() {
        o0.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            o0.k("markAsDestroyable: Lock acquired");
            com.google.android.gms.common.internal.t.o(this.zzd >= 0);
            o0.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzd();
        }
        o0.k("markAsDestroyable: Lock released");
    }

    public final void zzd() {
        o0.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                o0.k("maybeDestroy: Lock acquired");
                com.google.android.gms.common.internal.t.o(this.zzd >= 0);
                if (this.zzc && this.zzd == 0) {
                    o0.k("No reference is left (including root). Cleaning up engine.");
                    zze(new zzbsj(this), new zzceq());
                } else {
                    o0.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o0.k("maybeDestroy: Lock released");
    }
}
