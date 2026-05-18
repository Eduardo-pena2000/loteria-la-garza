package com.google.android.gms.internal.drive;

import H6.c;
import H6.d;
import H6.f;
import H6.s;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbb extends f {
    public zzbb(Context context, d.a aVar) {
        super(context, aVar);
    }

    public final Task getDriveId(String str) {
        t.m(str, "resourceId must not be null");
        return doRead(new zzbc(this, str));
    }

    public final Task getUploadPreferences() {
        return doRead(new zzbd(this));
    }

    public final Task newCreateFileActivityIntentSender(c cVar) {
        return doRead(new zzbg(this, cVar));
    }

    public final Task newOpenFileActivityIntentSender(s sVar) {
        return doRead(new zzbf(this, sVar));
    }

    public final Task requestSync() {
        return doWrite(new zzbh(this));
    }

    public final Task setUploadPreferences(H6.t tVar) {
        t.m(tVar, "transferPreferences cannot be null.");
        return doWrite(new zzbe(this, tVar));
    }

    public zzbb(Activity activity, d.a aVar) {
        super(activity, aVar);
    }
}
