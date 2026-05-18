package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzids implements Iterator {
    private final ArrayDeque zza;
    private zziak zzb;

    public /* synthetic */ zzids(zzian zzianVar, byte[] bArr) {
        if (!(zzianVar instanceof zzidt)) {
            this.zza = null;
            this.zzb = (zziak) zzianVar;
            return;
        }
        zzidt zzidtVar = (zzidt) zzianVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzidtVar.zzp());
        this.zza = arrayDeque;
        arrayDeque.push(zzidtVar);
        this.zzb = zzb(zzidtVar.zzo());
    }

    private final zziak zzb(zzian zzianVar) {
        while (zzianVar instanceof zzidt) {
            zzidt zzidtVar = (zzidt) zzianVar;
            this.zza.push(zzidtVar);
            zzianVar = zzidtVar.zzo();
        }
        return (zziak) zzianVar;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zziak next() {
        zziak zziakVar;
        zziak zziakVar2 = this.zzb;
        if (zziakVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zziakVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zziakVar = zzb(((zzidt) arrayDeque.pop()).zzE());
        } while (zziakVar.zzc() == 0);
        this.zzb = zziakVar;
        return zziakVar2;
    }
}
