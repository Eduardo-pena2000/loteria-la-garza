package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhe extends AbstractList implements RandomAccess, zzff {
    private final zzff zza;

    public zzhe(zzff zzffVar) {
        this.zza = zzffVar;
    }

    public static /* bridge */ /* synthetic */ zzff zza(zzhe zzheVar) {
        return zzheVar.zza;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzfe) this.zza).get(i);
    }

    public final Iterator iterator() {
        return new zzhd(this);
    }

    public final ListIterator listIterator(int i) {
        return new zzhc(this, i);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzff zze() {
        return this;
    }

    public final List zzg() {
        return this.zza.zzg();
    }
}
