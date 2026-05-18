package H2;

import androidx.lifecycle.V;
import androidx.lifecycle.X;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final V a(X.c cVar, Xa.c cVar2, F2.a aVar) {
        t.g(cVar, "factory");
        t.g(cVar2, "modelClass");
        t.g(aVar, "extras");
        try {
            try {
                return cVar.create(cVar2, aVar);
            } catch (AbstractMethodError unused) {
                return cVar.create(Pa.a.a(cVar2));
            }
        } catch (AbstractMethodError unused2) {
            return cVar.create(Pa.a.a(cVar2), aVar);
        }
    }
}
