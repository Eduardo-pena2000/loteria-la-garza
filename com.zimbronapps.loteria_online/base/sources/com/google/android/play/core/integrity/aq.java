package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class aq extends IntegrityTokenResponse {
    private final String a;
    private final y b;

    public aq(String str, y yVar) {
        this.a = str;
        this.b = yVar;
    }

    public final Task showDialog(Activity activity, int i) {
        return this.b.a(activity, i);
    }

    public final String token() {
        return this.a;
    }
}
