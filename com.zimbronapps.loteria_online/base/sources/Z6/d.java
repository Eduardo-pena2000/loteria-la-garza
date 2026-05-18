package z6;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d extends g implements z {
    public static final a.g a;
    public static final a.a b;
    public static final com.google.android.gms.common.api.a c;

    static {
        a.g gVar = new a.g();
        a = gVar;
        c cVar = new c();
        b = cVar;
        c = new com.google.android.gms.common.api.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, A a2) {
        super(context, c, a2, g.a.c);
    }

    public final Task a(x xVar) {
        w.a builder = w.builder();
        builder.d(zaf.zaa);
        builder.c(false);
        builder.b(new b(xVar));
        return doBestEffortWrite(builder.a());
    }
}
