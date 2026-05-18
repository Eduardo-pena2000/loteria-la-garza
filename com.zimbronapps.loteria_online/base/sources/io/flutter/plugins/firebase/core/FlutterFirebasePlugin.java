package io.flutter.plugins.firebase.core;

import B7.g;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    Task didReinitializeFirebaseCore();

    Task getPluginConstantsForFirebaseApp(g gVar);
}
