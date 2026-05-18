package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzavc implements Comparator {
    private final boolean zza;

    public zzavc(boolean z) {
        this.zza = z;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparator;
        List zzn;
        List zzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        int i10 = i8 % 496612959;
        zzavg zzavgVar = (zzavg) obj;
        zzavg zzavgVar2 = (zzavg) obj2;
        int i11 = zzavgVar.zza;
        if (i11 != zzavgVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i12 = i10 ^ i9;
        try {
            if (i11 == 0) {
                throw null;
            }
            switch (i11 + i12) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzavgVar.zzl() != zzavgVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzavgVar.zzm(), zzavgVar2.zzm());
                case 3:
                    comparator = zzauk.zzc;
                    zzn = zzavgVar.zzn();
                    zzn2 = zzavgVar2.zzn();
                    return comparator.compare(zzn, zzn2);
                case 4:
                    zzn = zzavgVar.zzo();
                    zzn2 = zzavgVar2.zzo();
                    comparator = zzgtp.zza(this);
                    return comparator.compare(zzn, zzn2);
                case 5:
                    if (!this.zza) {
                        throw new IllegalArgumentException();
                    }
                    if (zzavgVar.zzp() == zzavgVar2.zzp()) {
                        return 0;
                    }
                case 6:
                    return Double.compare(zzavgVar.zzq(), zzavgVar2.zzq());
                default:
                    return 0;
            }
        } catch (zzavd e) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
