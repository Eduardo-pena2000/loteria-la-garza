package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfsd extends zzgtx {
    private final LinkedList zza = new LinkedList();

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzfro zzfroVar = (zzfro) obj;
        if (zzfroVar.zzf() != 3) {
            this.zza.add(zzfroVar);
            return true;
        }
        LinkedList linkedList = this.zza;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zzfro zzfroVar2 = (zzfro) listIterator.next();
            if (zzfroVar2.zzf() == 3) {
                double zze = zzfroVar2.zze();
                double zze2 = zzfroVar.zze();
                if (zze < zze2 || (zze == zze2 && zzfroVar2.zzc() > zzfroVar.zzc())) {
                    listIterator.set(zzfroVar);
                    zzfroVar = zzfroVar2;
                }
            }
        }
        linkedList.add(zzfroVar);
        return true;
    }

    public final Queue zza() {
        return this.zza;
    }

    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    public final /* synthetic */ Collection zzc() {
        return this.zza;
    }
}
