package G2;

import F2.a;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.h;
import b0.m;
import b0.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class e {
    public static final V a(Z z, Xa.c cVar, String str, X.c cVar2, F2.a aVar) {
        X a = cVar2 != null ? X.b.a(z.getViewModelStore(), cVar2, aVar) : z instanceof h ? X.b.a(z.getViewModelStore(), ((h) z).getDefaultViewModelProviderFactory(), aVar) : X.b.c(X.b, z, null, null, 6, null);
        return str != null ? a.c(str, cVar) : a.a(cVar);
    }

    public static final V b(Xa.c cVar, Z z, String str, X.c cVar2, F2.a aVar, m mVar, int i, int i2) {
        if ((i2 & 2) != 0 && (z = b.a.c(mVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            cVar2 = null;
        }
        if ((i2 & 16) != 0) {
            aVar = z instanceof h ? ((h) z).getDefaultViewModelCreationExtras() : a.b.c;
        }
        if (w.L()) {
            w.U(1673618944, i, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:105)");
        }
        V a = d.a(z, cVar, str, cVar2, aVar);
        if (w.L()) {
            w.T();
        }
        return a;
    }
}
