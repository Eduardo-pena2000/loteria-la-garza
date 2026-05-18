package H2;

import F2.a;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public static final j a = new j();

    public final F2.a a(Z z) {
        t.g(z, "owner");
        return z instanceof androidx.lifecycle.h ? ((androidx.lifecycle.h) z).getDefaultViewModelCreationExtras() : a.b.c;
    }

    public final X.c b(Z z) {
        t.g(z, "owner");
        return z instanceof androidx.lifecycle.h ? ((androidx.lifecycle.h) z).getDefaultViewModelProviderFactory() : d.b;
    }

    public final String c(Xa.c cVar) {
        t.g(cVar, "modelClass");
        String a2 = a.a(cVar);
        if (a2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + a2;
    }

    public final V d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
