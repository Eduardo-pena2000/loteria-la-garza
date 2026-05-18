package H0;

import O0.I0;
import O0.J0;
import O0.j;
import Qa.l;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {

    public static final class a extends u implements l {
        public final /* synthetic */ O a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(O o) {
            super(1);
            this.a = o;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(I0 i0) {
            boolean z;
            if (i0.getNode().isAttached()) {
                this.a.a = i0;
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final /* synthetic */ I0 a(I0 i0) {
        return b(i0);
    }

    public static final I0 b(I0 i0) {
        O o = new O();
        J0.d(i0, new a(o));
        return (I0) o.a;
    }

    public static final j c(H0.a aVar, b bVar) {
        return new c(aVar, bVar);
    }
}
