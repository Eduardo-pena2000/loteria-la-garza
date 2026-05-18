package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z implements i.a {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ B b;

    public z(B b, BasePendingResult basePendingResult) {
        this.b = b;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        B.a(this.b).remove(this.a);
    }
}
