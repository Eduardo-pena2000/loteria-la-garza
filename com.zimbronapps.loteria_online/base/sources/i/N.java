package I;

import I.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n {

    public interface a {

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final Void a(int i) {
                return null;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        Qa.l getKey();

        default Qa.l getType() {
            return a.a;
        }
    }

    public final Object f(int i) {
        e.a aVar = g().get(i);
        return ((a) aVar.c()).getType().invoke(Integer.valueOf(i - aVar.b()));
    }

    public abstract e g();

    public final int h() {
        return g().getSize();
    }

    public final Object i(int i) {
        Object invoke;
        e.a aVar = g().get(i);
        int b = i - aVar.b();
        Qa.l key = ((a) aVar.c()).getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(b))) == null) ? I.a(i) : invoke;
    }
}
