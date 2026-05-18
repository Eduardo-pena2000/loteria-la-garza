package com.google.android.gms.internal.drive;

import I6.p;
import com.google.android.gms.common.internal.r;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zze {
    private final p zzcv;
    private final long zzcw;
    private final long zzcx;

    public zze(zzh zzhVar) {
        this.zzcv = new zzf(zzhVar);
        this.zzcw = zzhVar.zzcw;
        this.zzcx = zzhVar.zzcx;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zze.class) {
            if (obj == this) {
                return true;
            }
            zze zzeVar = (zze) obj;
            if (r.b(this.zzcv, zzeVar.zzcv) && this.zzcw == zzeVar.zzcw && this.zzcx == zzeVar.zzcx) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r.c(new Object[]{Long.valueOf(this.zzcx), Long.valueOf(this.zzcw), Long.valueOf(this.zzcx)});
    }

    public final String toString() {
        return String.format(Locale.US, "FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", new Object[]{this.zzcv.toString(), Long.valueOf(this.zzcw), Long.valueOf(this.zzcx)});
    }
}
