package gb;

import kotlin.jvm.internal.V;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class v {
    public static final Qa.q a;

    public /* synthetic */ class a extends kotlin.jvm.internal.q implements Qa.q {
        public static final a a = new a();

        public a() {
            super(3, fb.f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fb.f fVar, Object obj, Ga.e eVar) {
            return fVar.emit(obj, eVar);
        }
    }

    static {
        a aVar = a.a;
        kotlin.jvm.internal.t.e(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        a = (Qa.q) V.e(aVar, 3);
    }

    public static final /* synthetic */ Qa.q a() {
        return a;
    }
}
