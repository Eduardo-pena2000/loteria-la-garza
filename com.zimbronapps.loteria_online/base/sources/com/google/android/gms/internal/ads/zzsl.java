package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzsl extends zzcp {
    private int[] zzd;
    private int[] zze;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsl.zzd(java.nio.ByteBuffer):void");
    }

    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i = zzclVar.zzd;
        if (!zzfj.zzA(i)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i2 = zzclVar.zzc;
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 >= length) {
                return z ? new zzcl(zzclVar.zzb, length, i) : zzcl.zza;
            }
            int i4 = iArr[i3];
            if (i4 >= i2) {
                String arrays = Arrays.toString(iArr);
                StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 59);
                sb.append("Channel map (");
                sb.append(arrays);
                sb.append(") trying to access non-existent input channel.");
                throw new zzcn(sb.toString(), zzclVar);
            }
            z |= i4 != i3;
            i3++;
        }
    }

    public final void zzo() {
        this.zze = this.zzd;
    }

    public final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(int[] iArr) {
        this.zzd = iArr;
    }
}
