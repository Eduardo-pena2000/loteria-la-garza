package com.unity3d.ads.core.domain.work;

import androidx.work.b;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UniversalRequestWorkerData {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public UniversalRequestWorkerData(String universalRequestId) {
        t.g(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    public final b invoke() {
        b a = new b.a().e("universalRequestId", this.universalRequestId).a();
        t.f(a, "Builder()\n            .p…tId)\n            .build()");
        return a;
    }
}
