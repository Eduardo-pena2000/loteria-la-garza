package io.flutter.plugins.firebase.core;

import B7.g;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import ka.k;
import ka.l;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FlutterFirebasePluginRegistry {
    private static final Map registeredPlugins = new WeakHashMap();

    public static /* synthetic */ void a(TaskCompletionSource taskCompletionSource) {
        lambda$didReinitializeFirebaseCore$1(taskCompletionSource);
    }

    public static /* synthetic */ void b(g gVar, TaskCompletionSource taskCompletionSource) {
        lambda$getPluginConstantsForFirebaseApp$0(gVar, taskCompletionSource);
    }

    public static Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public static Task getPluginConstantsForFirebaseApp(g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(gVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(TaskCompletionSource taskCompletionSource) {
        try {
            Iterator it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                Tasks.await(((FlutterFirebasePlugin) ((Map.Entry) it.next()).getValue()).didReinitializeFirebaseCore());
            }
            taskCompletionSource.setResult((Object) null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(g gVar, TaskCompletionSource taskCompletionSource) {
        try {
            Map map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put((String) entry.getKey(), Tasks.await(((FlutterFirebasePlugin) entry.getValue()).getPluginConstantsForFirebaseApp(gVar)));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
