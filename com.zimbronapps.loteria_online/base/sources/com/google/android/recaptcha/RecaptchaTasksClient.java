package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface RecaptchaTasksClient {
    Task executeTask(RecaptchaAction recaptchaAction);

    Task executeTask(RecaptchaAction recaptchaAction, long j);
}
