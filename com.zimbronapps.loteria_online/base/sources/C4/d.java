package c4;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) {
        t.g(context, "context");
        MeasurementManager a = c.a(context);
        t.f(a, "get(context)");
        super(a);
    }
}
