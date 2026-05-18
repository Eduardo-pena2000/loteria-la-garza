package com.google.android.gms.internal.drive;

import K6.b;
import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzht extends b {
    public zzht(String str, Collection collection, Collection collection2, int i) {
        super(str, collection, collection2, 7000000);
    }

    public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        return zze(dataHolder, i, i2);
    }

    public final Boolean zze(DataHolder dataHolder, int i, int i2) {
        return Boolean.valueOf(dataHolder.N1("trashed", i, i2) == 2);
    }
}
