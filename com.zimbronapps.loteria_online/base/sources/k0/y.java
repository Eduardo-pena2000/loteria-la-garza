package k0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class y {
    public static final v a = e(new w(), new x());

    public static final class a implements v {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ Qa.l b;

        public a(Qa.p pVar, Qa.l lVar) {
            this.a = pVar;
            this.b = lVar;
        }

        public Object a(Object obj) {
            return this.b.invoke(obj);
        }

        public Object b(z zVar, Object obj) {
            return this.a.invoke(zVar, obj);
        }
    }

    public static /* synthetic */ Object a(z zVar, Object obj) {
        return c(zVar, obj);
    }

    public static /* synthetic */ Object b(Object obj) {
        return d(obj);
    }

    public static final v e(Qa.p pVar, Qa.l lVar) {
        return new a(pVar, lVar);
    }

    public static final v f() {
        v vVar = a;
        kotlin.jvm.internal.t.e(vVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return vVar;
    }

    public static final Object d(Object obj) {
        return obj;
    }

    public static final Object c(z zVar, Object obj) {
        return obj;
    }
}
