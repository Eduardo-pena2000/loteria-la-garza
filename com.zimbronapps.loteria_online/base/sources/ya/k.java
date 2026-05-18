package Ya;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class k {

    public static final class a implements h {
        public final /* synthetic */ Qa.p a;

        public a(Qa.p pVar) {
            this.a = pVar;
        }

        public Iterator iterator() {
            return k.a(this.a);
        }
    }

    public static Iterator a(Qa.p block) {
        kotlin.jvm.internal.t.g(block, "block");
        i iVar = new i();
        iVar.f(Ha.b.a(block, iVar, iVar));
        return iVar;
    }

    public static h b(Qa.p block) {
        kotlin.jvm.internal.t.g(block, "block");
        return new a(block);
    }
}
