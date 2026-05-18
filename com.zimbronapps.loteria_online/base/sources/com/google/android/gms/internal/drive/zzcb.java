package com.google.android.gms.internal.drive;

import H6.j;
import H6.n;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcb implements j {
    public final i getFileUploadPreferences(h hVar) {
        return hVar.a(new zzcc(this, hVar));
    }

    public final i setFileUploadPreferences(h hVar, n nVar) {
        if (nVar instanceof zzei) {
            return hVar.b(new zzcd(this, hVar, (zzei) nVar));
        }
        throw new IllegalArgumentException("Invalid preference value");
    }
}
