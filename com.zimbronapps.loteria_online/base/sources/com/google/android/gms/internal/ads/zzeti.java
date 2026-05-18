package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import com.applovin.impl.L3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeti implements zzfax {
    private final zzfax zza;
    private final zzfjk zzb;
    private final Context zzc;
    private final zzcdu zzd;

    public zzeti(zzevl zzevlVar, zzfjk zzfjkVar, Context context, zzcdu zzcduVar) {
        this.zza = zzevlVar;
        this.zzb = zzfjkVar;
        this.zzc = context;
        this.zzd = zzcduVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i) {
        RoundedCorner a = w.a(windowInsets, i);
        if (a != null) {
            return L3.a(a);
        }
        return 0;
    }

    private static final int zze(int i, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f);
    }

    private static final K1.b zzf(K1.b bVar, float f) {
        return f == 0.0f ? K1.b.e : K1.b.b((int) Math.ceil(bVar.a / f), (int) Math.ceil(bVar.b / f), (int) Math.ceil(bVar.c / f), (int) Math.ceil(bVar.d / f));
    }

    public final x7.e zza() {
        return zzgzo.zzk(this.zza.zza(), new zzeth(this), zzcei.zzg);
    }

    public final int zzb() {
        return 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0222 A[PHI: r11
      0x0222: PHI (r11v6 K1.b) = (r11v5 K1.b), (r11v5 K1.b), (r11v10 K1.b), (r11v10 K1.b), (r11v15 K1.b) binds: [B:87:0x01ed, B:92:0x0236, B:94:0x0254, B:96:0x025c, B:90:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzetj zzc(com.google.android.gms.internal.ads.zzfbg r23) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeti.zzc(com.google.android.gms.internal.ads.zzfbg):com.google.android.gms.internal.ads.zzetj");
    }
}
