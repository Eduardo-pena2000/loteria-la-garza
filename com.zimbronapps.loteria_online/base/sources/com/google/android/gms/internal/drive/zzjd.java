package com.google.android.gms.internal.drive;

import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjd extends zzjf {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzjc zznu;

    public zzjd(zzjc zzjcVar) {
        this.zznu = zzjcVar;
        this.limit = zzjcVar.size();
    }

    public final boolean hasNext() {
        return this.position < this.limit;
    }

    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        this.position = i + 1;
        return this.zznu.zzt(i);
    }
}
