package g7;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.o;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class g {
    public static final a.g a;
    public static final a b;
    public static final com.google.android.gms.common.api.a c;

    public static final class a extends a.a {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d buildClient(Context context, Looper looper, com.google.android.gms.common.internal.f fVar, a.d.b bVar, com.google.android.gms.common.api.internal.f fVar2, o oVar) {
            t.g(context, "context");
            t.g(looper, "looper");
            t.g(fVar, "commonSettings");
            t.g(bVar, "apiOptions");
            t.g(fVar2, "connectedListener");
            t.g(oVar, "connectionFailedListener");
            return new d(context, looper, fVar, fVar2, oVar);
        }
    }

    static {
        a.g gVar = new a.g();
        a = gVar;
        a aVar = new a();
        b = aVar;
        c = new com.google.android.gms.common.api.a("IdentityCredentials.API", aVar, gVar);
    }

    public static final /* synthetic */ com.google.android.gms.common.api.a a() {
        return c;
    }
}
