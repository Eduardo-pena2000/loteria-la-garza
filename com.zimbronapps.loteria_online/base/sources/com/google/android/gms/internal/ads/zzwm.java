package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzwm {
    default void zzA(zzak zzakVar) {
    }

    void zzD(zzwi zzwiVar);

    zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j);

    default zzbf zzH() {
        return null;
    }

    default boolean zzI() {
        return true;
    }

    zzak zzJ();

    void zzl(Handler handler, zzwv zzwvVar);

    void zzm(zzwv zzwvVar);

    void zzn(Handler handler, zztk zztkVar);

    void zzo(zztk zztkVar);

    void zzp(zzwl zzwlVar, zzhz zzhzVar, zzpq zzpqVar);

    void zzq(zzwl zzwlVar);

    void zzr(zzwl zzwlVar);

    void zzs(zzwl zzwlVar);

    void zzt() throws IOException;
}
