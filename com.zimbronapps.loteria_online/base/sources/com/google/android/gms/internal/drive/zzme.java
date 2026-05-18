package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzme implements zzlo {
    private final int flags;
    private final String info;
    private final Object[] zzue;
    private final zzlq zzuh;

    public zzme(zzlq zzlqVar, String str, Object[] objArr) {
        this.zzuh = zzlqVar;
        this.info = str;
        this.zzue = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int zzec() {
        return (this.flags & 1) == 1 ? zzkk.zze.zzsf : zzkk.zze.zzsg;
    }

    public final boolean zzed() {
        return (this.flags & 2) == 2;
    }

    public final zzlq zzee() {
        return this.zzuh;
    }

    public final String zzek() {
        return this.info;
    }

    public final Object[] zzel() {
        return this.zzue;
    }
}
