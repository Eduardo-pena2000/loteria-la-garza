package j3;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class q {
    public static /* bridge */ /* synthetic */ void a(Spatializer spatializer, Executor executor, Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener) {
        spatializer.addOnSpatializerStateChangedListener(executor, spatializer$OnSpatializerStateChangedListener);
    }
}
