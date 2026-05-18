package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzijx extends AbstractList {
    private static final zzijy zzc = zzijy.zzb(zzijx.class);
    final List zza;
    final Iterator zzb;

    public zzijx(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    public final Object get(int i) {
        List list = this.zza;
        if (list.size() > i) {
            return list.get(i);
        }
        Iterator it = this.zzb;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i);
    }

    public final Iterator iterator() {
        return new zzijw(this);
    }

    public final int size() {
        zzijy zzijyVar = zzc;
        zzijyVar.zza("potentially expensive size() call");
        zzijyVar.zza("blowup running");
        while (true) {
            Iterator it = this.zzb;
            if (!it.hasNext()) {
                return this.zza.size();
            }
            this.zza.add(it.next());
        }
    }
}
