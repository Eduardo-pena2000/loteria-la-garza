package b2;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public static final /* synthetic */ Object a(a aVar, a2.e eVar, String str, Object obj) {
            return aVar.b(eVar, str, obj);
        }

        public final Object b(a2.e eVar, String str, Object obj) {
            if (obj instanceof b2.a) {
                return new b2.a(eVar, str);
            }
            if (obj instanceof d) {
                return new d(eVar, str);
            }
            throw new c2.b();
        }

        public a() {
        }
    }
}
