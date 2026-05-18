package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class bj extends y {
    final /* synthetic */ bk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j) {
        super(str, j);
        this.a = bkVar;
    }

    public final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", bk.f(this.a));
        return this.a.c.c(activity, bundle);
    }
}
