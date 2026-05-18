package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzpn {
    private final Map zza = new HashMap();

    public final zzpn zza(zzaaj zzaajVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzaajVar.zza() != 0 && zzaajVar.zza() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        if (this.zza.containsKey(zzaajVar)) {
            list = (List) this.zza.get(zzaajVar);
        } else {
            List arrayList = new ArrayList();
            this.zza.put(zzaajVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzpl zza() {
        return new zzpl(this.zza, null);
    }
}
