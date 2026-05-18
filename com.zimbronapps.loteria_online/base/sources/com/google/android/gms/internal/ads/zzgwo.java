package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgwo extends AbstractSet {
    private zzgwo() {
        throw null;
    }

    public static int zzd(Set set) {
        return set instanceof zzgwo ? ((zzgwo) set).zzc() : set.size();
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        zzgwo zzgwoVar;
        int zzd;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (zzd = zzd((zzgwoVar = (Set) obj))) < 0) {
            return false;
        }
        if (zzgwoVar instanceof zzgwo) {
            zzgwoVar.zzb();
            size = 0;
        } else {
            size = zzgwoVar.size();
        }
        if (zzc() < size) {
            return false;
        }
        zzgwt it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!zzgwoVar.contains(it.next())) {
                return false;
            }
            i++;
        }
        if (i == zzd) {
            return true;
        }
        if (i < size) {
            return false;
        }
        Iterator it2 = zzgwoVar.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 > i) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgwt iterator();

    public abstract int zzb();

    public abstract int zzc();

    public /* synthetic */ zzgwo(byte[] bArr) {
    }
}
