package com.unity3d.ads.core.domain.work;

import G4.b;
import G4.n;
import G4.o;
import G4.w;
import android.content.Context;
import androidx.work.ListenableWorker;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BackgroundWorker {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "UnityAdsBackgroundWorker";
    private final w workManager;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public BackgroundWorker(Context applicationContext) {
        t.g(applicationContext, "applicationContext");
        w d = w.d(applicationContext);
        t.f(d, "getInstance(applicationContext)");
        this.workManager = d;
    }

    public final w getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        t.g(universalRequestWorkerData, "universalRequestWorkerData");
        b a = new b.a().b(n.b).a();
        t.f(a, "Builder()\n            .s…TED)\n            .build()");
        t.l(4, "T");
        o b = new o.a(ListenableWorker.class).e(a).f(universalRequestWorkerData.invoke()).a("UnityAdsBackgroundWorker").b();
        t.f(b, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
        getWorkManager().b(b);
    }
}
