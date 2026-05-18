package db;

import Ca.s;
import Ca.t;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class g {
    public static final f a;
    private static volatile Choreographer choreographer;

    static {
        Object b;
        try {
            s.a aVar = s.b;
            b = s.b(new e(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(t.a(th));
        }
        a = (f) (s.g(b) ? null : b);
    }

    public static final Handler a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            kotlin.jvm.internal.t.e(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final f b(Handler handler, String str) {
        return new e(handler, str);
    }
}
