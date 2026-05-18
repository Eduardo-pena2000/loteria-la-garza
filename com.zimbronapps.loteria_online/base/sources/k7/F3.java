package k7;

import java.lang.Thread;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f3 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ i3 b;

    public f3(i3 i3Var, String str) {
        Objects.requireNonNull(i3Var);
        this.b = i3Var;
        com.google.android.gms.common.internal.t.l(str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.a.a().o().b(this.a, th);
    }
}
