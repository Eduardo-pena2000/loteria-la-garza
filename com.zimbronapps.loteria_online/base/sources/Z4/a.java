package z4;

import A4.f;
import S1.b;
import android.app.Activity;
import android.content.Context;
import fb.e;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements f {
    public final f b;
    public final y4.a c;

    public a(f fVar, y4.a aVar) {
        this.b = fVar;
        this.c = aVar;
    }

    public e a(Activity activity) {
        t.g(activity, "activity");
        return this.b.a(activity);
    }

    public e b(Context context) {
        t.g(context, "context");
        return this.b.b(context);
    }

    public final void c(Activity activity, Executor executor, b bVar) {
        t.g(activity, "activity");
        t.g(executor, "executor");
        t.g(bVar, "consumer");
        this.c.a(executor, bVar, this.b.a(activity));
    }

    public final void d(b bVar) {
        t.g(bVar, "consumer");
        this.c.b(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar, new y4.a());
        t.g(fVar, "tracker");
    }
}
