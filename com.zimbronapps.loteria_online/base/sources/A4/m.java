package A4;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface m {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static Qa.l b = a.a;

        public static final class a extends u implements Qa.l {
            public static final a a = new a();

            public a() {
                super(1);
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m invoke(m mVar) {
                t.g(mVar, "it");
                return mVar;
            }
        }

        public final m a() {
            return (m) b.invoke(n.b);
        }
    }

    static m a() {
        return a.a();
    }

    l b(Context context);

    l c(Activity activity);

    l d(Activity activity);
}
