package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzftg extends zzftj {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzftg zzb = new zzftg();

    private zzftg() {
    }

    public static zzftg zza() {
        return zzb;
    }

    public final boolean zzb() {
        Iterator it = zzfth.zza().zzf().iterator();
        while (it.hasNext()) {
            View zzi = ((zzfsn) it.next()).zzi();
            if (zzi != null && zzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    public final void zzc(boolean z) {
        Iterator it = zzfth.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfsn) it.next()).zzg().zzf(z);
        }
    }
}
