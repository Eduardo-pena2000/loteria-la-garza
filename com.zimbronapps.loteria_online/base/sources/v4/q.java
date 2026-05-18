package V4;

import V4.p;
import android.content.Context;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.u;
import xb.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q {

    public static final class a extends u implements Qa.a {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        public final File invoke() {
            return j5.j.l(this.a);
        }
    }

    public static final class b extends u implements Qa.a {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.a = context;
        }

        public final File invoke() {
            return j5.j.l(this.a);
        }
    }

    public static final p a(xb.g gVar, Context context) {
        return new s(gVar, new a(context), null);
    }

    public static final p b(xb.g gVar, Context context, p.a aVar) {
        return new s(gVar, new b(context), aVar);
    }

    public static final p c(C c, xb.l lVar, String str, Closeable closeable) {
        return new o(c, lVar, str, closeable, null);
    }

    public static /* synthetic */ p d(C c, xb.l lVar, String str, Closeable closeable, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = xb.l.b;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            closeable = null;
        }
        return c(c, lVar, str, closeable);
    }
}
