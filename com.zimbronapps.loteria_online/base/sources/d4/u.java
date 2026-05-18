package d4;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u {
    public static final a a = new a(null);

    public static final class a {

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ Context a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(1);
                this.a = context;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w invoke(Context context) {
                kotlin.jvm.internal.t.g(context, "it");
                return new w(this.a);
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ Context a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context) {
                super(1);
                this.a = context;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x invoke(Context context) {
                kotlin.jvm.internal.t.g(context, "it");
                return new x(this.a);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final u a(Context context) {
            kotlin.jvm.internal.t.g(context, "context");
            Y3.a aVar = Y3.a.a;
            if (aVar.a() >= 11) {
                return new A(context);
            }
            if (aVar.a() >= 5) {
                return new C(context);
            }
            if (aVar.a() == 4) {
                return new B(context);
            }
            if (aVar.b() >= 11) {
                return (u) Y3.b.a.a(context, "TopicsManager", new a(context));
            }
            if (aVar.b() >= 9) {
                return (u) Y3.b.a.a(context, "TopicsManager", new b(context));
            }
            return null;
        }

        public a() {
        }
    }

    public abstract Object a(b bVar, Ga.e eVar);
}
