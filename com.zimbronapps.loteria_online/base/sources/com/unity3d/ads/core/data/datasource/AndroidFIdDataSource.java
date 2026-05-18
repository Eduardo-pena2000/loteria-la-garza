package com.unity3d.ads.core.data.datasource;

import Ca.s;
import android.content.Context;
import cb.i;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.fid.FIdBridge;
import com.unity3d.services.core.fid.FIdStaticBridge;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidFIdDataSource implements FIdDataSource {
    private FIdStaticBridge bridge;
    private final Context context;

    public AndroidFIdDataSource(Context context) {
        t.g(context, "context");
        this.context = context;
        this.bridge = new FIdStaticBridge();
    }

    public String invoke() {
        Task appInstanceId;
        try {
            s.a aVar = s.b;
            FIdBridge fIdStaticBridge = this.bridge.getInstance(this.context);
            if (fIdStaticBridge != null && (appInstanceId = fIdStaticBridge.getAppInstanceId()) != null) {
                return (String) i.f(null, new AndroidFIdDataSource$invoke$1$1(appInstanceId, null), 1, null);
            }
            return null;
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            Object b = s.b(Ca.t.a(th));
            return (String) (s.g(b) ? null : b);
        }
    }
}
