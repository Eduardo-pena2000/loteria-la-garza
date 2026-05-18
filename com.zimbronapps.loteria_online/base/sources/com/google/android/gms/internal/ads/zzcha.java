package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcha {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzatm zzatmVar;
        zzatl zzatlVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzath(new zzcgz(duplicate), zzche.zzb).zzc().iterator();
            while (true) {
                zzatmVar = null;
                if (!it.hasNext()) {
                    zzatlVar = null;
                    break;
                }
                zzatj zzatjVar = (zzatj) it.next();
                if (zzatjVar instanceof zzatl) {
                    zzatlVar = (zzatl) zzatjVar;
                    break;
                }
            }
            Iterator it2 = zzatlVar.zzc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzatj zzatjVar2 = (zzatj) it2.next();
                if (zzatjVar2 instanceof zzatm) {
                    zzatmVar = (zzatm) zzatjVar2;
                    break;
                }
            }
            long zzd = (zzatmVar.zzd() * 1000) / zzatmVar.zzc();
            this.zza = zzd;
            return zzd;
        } catch (RuntimeException | IOException unused) {
            return 0L;
        }
    }
}
