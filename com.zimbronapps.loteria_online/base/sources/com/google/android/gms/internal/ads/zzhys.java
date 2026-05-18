package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzhys {
    public abstract void zza(zzhzs zzhzsVar, Object obj) throws IOException;

    public final zzhys zzc() {
        return !(this instanceof zzhyr) ? new zzhyr(this, null) : this;
    }
}
