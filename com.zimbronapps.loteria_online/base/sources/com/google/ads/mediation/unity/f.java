package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.metadata.MediationMetaData;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f {
    public static f b;
    public final c a = new c();

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            try {
                if (b == null) {
                    b = new f();
                }
                fVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public void b(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (this.a.f()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData a = this.a.a(context);
        a.setName("AdMob");
        a.setVersion(this.a.d());
        a.set("adapter_version", "4.16.6.0");
        a.commit();
        this.a.e(context, str, iUnityAdsInitializationListener);
    }
}
