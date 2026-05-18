package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgst extends zzgsr implements ListIterator {
    final /* synthetic */ zzgsu zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgst(zzgsu zzgsuVar) {
        super(zzgsuVar);
        Objects.requireNonNull(zzgsuVar);
        this.zzd = zzgsuVar;
    }

    public final void add(Object obj) {
        zzgsu zzgsuVar = this.zzd;
        boolean isEmpty = zzgsuVar.isEmpty();
        zza();
        this.zza.add(obj);
        zzgsv zzgsvVar = zzgsuVar.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + 1);
        if (isEmpty) {
            zzgsuVar.zzc();
        }
    }

    public final boolean hasPrevious() {
        zza();
        return this.zza.hasPrevious();
    }

    public final int nextIndex() {
        zza();
        return this.zza.nextIndex();
    }

    public final Object previous() {
        zza();
        return this.zza.previous();
    }

    public final int previousIndex() {
        zza();
        return this.zza.previousIndex();
    }

    public final void set(Object obj) {
        zza();
        this.zza.set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgst(zzgsu zzgsuVar, int i) {
        super(zzgsuVar, zzgsuVar.zzb.listIterator(i));
        Objects.requireNonNull(zzgsuVar);
        this.zzd = zzgsuVar;
    }
}
