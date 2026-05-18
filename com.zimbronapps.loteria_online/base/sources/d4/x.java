package d4;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x extends F {
    /* JADX WARN: Illegal instructions before constructor call */
    public x(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        TopicsManager a = v.a(context);
        kotlin.jvm.internal.t.f(a, "get(context)");
        super(a);
    }

    public GetTopicsRequest c(b bVar) {
        kotlin.jvm.internal.t.g(bVar, "request");
        return g.a.a(bVar);
    }
}
