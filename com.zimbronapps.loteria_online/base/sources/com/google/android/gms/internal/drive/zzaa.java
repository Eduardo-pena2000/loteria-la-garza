package com.google.android.gms.internal.drive;

import H6.o;
import J6.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaa extends o {
    private final MetadataBundle zzdt;

    public zzaa(MetadataBundle metadataBundle) {
        this.zzdt = metadataBundle;
    }

    public final /* synthetic */ Object freeze() {
        return new zzaa(this.zzdt.R1());
    }

    public final boolean isDataValid() {
        return this.zzdt != null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzdt);
        StringBuilder sb = new StringBuilder(valueOf.length() + 17);
        sb.append("Metadata [mImpl=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final Object zza(b bVar) {
        return this.zzdt.N1(bVar);
    }
}
