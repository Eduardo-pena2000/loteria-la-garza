package com.google.android.gms.internal.drive;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjk {
    private final byte[] buffer;
    private final zzjr zznx;

    private zzjk(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zznx = zzjr.zzb(bArr);
    }

    public final zzjc zzbx() {
        this.zznx.zzcb();
        return new zzjm(this.buffer);
    }

    public final zzjr zzby() {
        return this.zznx;
    }

    public /* synthetic */ zzjk(int i, zzjd zzjdVar) {
        this(i);
    }
}
