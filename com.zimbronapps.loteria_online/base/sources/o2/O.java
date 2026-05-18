package o2;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o implements J {
    public static final b d = new b(null);
    public static final Set e = new LinkedHashSet();
    public static final Object f = new Object();
    public final E a;
    public final Qa.l b;
    public final Qa.a c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(File file) {
            kotlin.jvm.internal.t.g(file, "it");
            return v.a(file);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final Set a() {
            return o.b();
        }

        public final Object b() {
            return o.c();
        }

        public b() {
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(0);
            this.a = file;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            b bVar = o.d;
            Object b = bVar.b();
            File file = this.a;
            synchronized (b) {
                bVar.a().remove(file.getAbsolutePath());
                Ca.I i = Ca.I.a;
            }
        }
    }

    public o(E e2, Qa.l lVar, Qa.a aVar) {
        kotlin.jvm.internal.t.g(e2, "serializer");
        kotlin.jvm.internal.t.g(lVar, "coordinatorProducer");
        kotlin.jvm.internal.t.g(aVar, "produceFile");
        this.a = e2;
        this.b = lVar;
        this.c = aVar;
    }

    public static final /* synthetic */ Set b() {
        return e;
    }

    public static final /* synthetic */ Object c() {
        return f;
    }

    public K a() {
        File canonicalFile = ((File) this.c.invoke()).getCanonicalFile();
        synchronized (f) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set set = e;
            if (set.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            kotlin.jvm.internal.t.f(absolutePath, "path");
            set.add(absolutePath);
        }
        kotlin.jvm.internal.t.f(canonicalFile, "file");
        return new p(canonicalFile, this.a, (t) this.b.invoke(canonicalFile), new c(canonicalFile));
    }

    public /* synthetic */ o(E e2, Qa.l lVar, Qa.a aVar, int i, kotlin.jvm.internal.k kVar) {
        this(e2, (i & 2) != 0 ? a.a : lVar, aVar);
    }
}
