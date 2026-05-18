package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class IntegrityTokenResponse {
    public abstract Task showDialog(Activity activity, int i);

    public abstract String token();
}
