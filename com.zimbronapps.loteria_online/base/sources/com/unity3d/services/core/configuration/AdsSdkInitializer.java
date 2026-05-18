package com.unity3d.services.core.configuration;

import Ca.I;
import Da.v;
import android.app.Application;
import android.content.Context;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.List;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import l7.a;
import o4.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdsSdkInitializer implements b {
    public /* bridge */ /* synthetic */ Object create(Context context) {
        create(context);
        return I.a;
    }

    public List dependencies() {
        return v.n();
    }

    public void create(Context context) {
        t.g(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Application applicationContext = context.getApplicationContext();
            t.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication(applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        ((OrientationRepository) ServiceProvider.INSTANCE.getRegistry().getService("", P.b(OrientationRepository.class))).invoke();
        try {
            a.a(context);
        } catch (Throwable unused) {
        }
    }
}
