package w4;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Object obj, String str, j jVar, g gVar, int i, Object obj2) {
            if ((i & 2) != 0) {
                jVar = c.a.a();
            }
            if ((i & 4) != 0) {
                gVar = w4.a.a;
            }
            return aVar.a(obj, str, jVar, gVar);
        }

        public final h a(Object obj, String str, j jVar, g gVar) {
            t.g(obj, "<this>");
            t.g(str, "tag");
            t.g(jVar, "verificationMode");
            t.g(gVar, "logger");
            return new i(obj, str, jVar, gVar);
        }

        public a() {
        }
    }

    public abstract Object a();

    public final String b(Object obj, String str) {
        t.g(obj, "value");
        t.g(str, "message");
        return str + " value: " + obj;
    }

    public abstract h c(String str, Qa.l lVar);
}
