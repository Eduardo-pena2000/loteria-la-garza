package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Qa.l;
import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import fb.P;
import fb.z;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidAppSetIdDataSource {
    private final z _appSetIdFlow;
    private final Context applicationContext;
    private final z isCollecting;

    public static final class 2 extends u implements l {
        public 2() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AppSetIdInfo) obj);
            return I.a;
        }

        public final void invoke(AppSetIdInfo appSetIdInfo) {
            String id = appSetIdInfo.getId();
            t.f(id, "it.id");
            AndroidAppSetIdDataSource.access$get_appSetIdFlow$p(AndroidAppSetIdDataSource.this).setValue(id);
        }
    }

    public AndroidAppSetIdDataSource(Context applicationContext) {
        t.g(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = P.a(Boolean.FALSE);
        this._appSetIdFlow = P.a(null);
    }

    public static /* synthetic */ void a(l lVar, Object obj) {
        invoke$lambda$1(lVar, obj);
    }

    public static final /* synthetic */ z access$get_appSetIdFlow$p(AndroidAppSetIdDataSource androidAppSetIdDataSource) {
        return androidAppSetIdDataSource._appSetIdFlow;
    }

    private static final void invoke$lambda$1(l tmp0, Object obj) {
        t.g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final String getAppSetId() {
        return (String) this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Object value;
        Boolean bool;
        z zVar = this.isCollecting;
        do {
            value = zVar.getValue();
            bool = (Boolean) value;
            bool.booleanValue();
        } while (!zVar.e(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            AppSet.getClient(this.applicationContext).getAppSetIdInfo().addOnSuccessListener(new a(new 2()));
        } catch (Throwable unused) {
        }
    }
}
