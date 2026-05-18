package androidx.lifecycle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface DefaultLifecycleObserver extends q {
    default void onCreate(r rVar) {
        kotlin.jvm.internal.t.g(rVar, "owner");
    }

    default void onDestroy(r rVar) {
        kotlin.jvm.internal.t.g(rVar, "owner");
    }

    default void onPause(r rVar) {
        kotlin.jvm.internal.t.g(rVar, "owner");
    }

    default void onResume(r rVar) {
        kotlin.jvm.internal.t.g(rVar, "owner");
    }

    default void onStart(r rVar) {
        kotlin.jvm.internal.t.g(rVar, "owner");
    }

    default void onStop(r rVar) {
        kotlin.jvm.internal.t.g(rVar, "owner");
    }
}
