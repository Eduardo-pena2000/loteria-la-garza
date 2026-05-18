package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgti implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzgtm zze;

    public /* synthetic */ zzgti(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zze = zzgtmVar;
        this.zzb = zzgtmVar.zzs();
        this.zzc = zzgtmVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        Object zza = zza(i);
        this.zzc = this.zze.zzg(this.zzc);
        return zza;
    }

    public final void remove() {
        zzb();
        zzgrc.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzgtm zzgtmVar = this.zze;
        zzgtmVar.remove(zzgtmVar.zzo(i));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}
