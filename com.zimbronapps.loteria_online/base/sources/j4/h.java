package j4;

import Ca.I;
import android.os.Bundle;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public static final a c = new a(null);
    public final l4.b a;
    public final f b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ I a(i iVar) {
            return c(iVar);
        }

        public static final I c(i iVar) {
            iVar.getLifecycle().addObserver(new b(iVar));
            return I.a;
        }

        public final h b(i iVar) {
            t.g(iVar, "owner");
            return new h(new l4.b(iVar, new g(iVar)), null);
        }

        public a() {
        }
    }

    public /* synthetic */ h(l4.b bVar, kotlin.jvm.internal.k kVar) {
        this(bVar);
    }

    public static final h a(i iVar) {
        return c.b(iVar);
    }

    public final f b() {
        return this.b;
    }

    public final void c() {
        this.a.f();
    }

    public final void d(Bundle bundle) {
        this.a.h(bundle);
    }

    public final void e(Bundle bundle) {
        t.g(bundle, "outBundle");
        this.a.i(bundle);
    }

    public h(l4.b bVar) {
        this.a = bVar;
        this.b = new f(bVar);
    }
}
