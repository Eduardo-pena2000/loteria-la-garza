package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgwn extends AbstractSet {
    public boolean removeAll(Collection collection) {
        return zzgwp.zzf(this, collection);
    }

    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super/*java.util.AbstractCollection*/.retainAll(collection);
    }
}
