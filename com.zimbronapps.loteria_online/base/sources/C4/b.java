package c4;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final a a = new a(null);

    public static final class a {

        public static final class a extends u implements Qa.l {
            public final /* synthetic */ Context a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(1);
                this.a = context;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(Context context) {
                t.g(context, "it");
                return new d(this.a);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final b a(Context context) {
            t.g(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            Y3.a aVar = Y3.a.a;
            sb.append(aVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (aVar.a() >= 5) {
                return new g(context);
            }
            if (aVar.b() >= 9) {
                return (b) Y3.b.a.a(context, "MeasurementManager", new a(context));
            }
            return null;
        }

        public a() {
        }
    }

    public abstract Object a(c4.a aVar, Ga.e eVar);

    public abstract Object b(Ga.e eVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, Ga.e eVar);

    public abstract Object d(m mVar, Ga.e eVar);

    public abstract Object e(Uri uri, Ga.e eVar);

    public abstract Object f(n nVar, Ga.e eVar);

    public abstract Object g(o oVar, Ga.e eVar);
}
