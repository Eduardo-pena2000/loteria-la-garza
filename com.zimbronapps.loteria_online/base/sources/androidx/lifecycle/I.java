package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.k;
import j4.f;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public static final i a = new i();

    public static final class a implements f.a {
        public void a(j4.i iVar) {
            kotlin.jvm.internal.t.g(iVar, "owner");
            if (!(iVar instanceof Z)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + iVar).toString());
            }
            Y viewModelStore = ((Z) iVar).getViewModelStore();
            j4.f savedStateRegistry = iVar.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                V b = viewModelStore.b((String) it.next());
                if (b != null) {
                    i.a(b, savedStateRegistry, iVar.getLifecycle());
                }
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    public static final class b implements o {
        public final /* synthetic */ k a;
        public final /* synthetic */ j4.f b;

        public b(k kVar, j4.f fVar) {
            this.a = kVar;
            this.b = fVar;
        }

        public void onStateChanged(r rVar, k.a aVar) {
            kotlin.jvm.internal.t.g(rVar, "source");
            kotlin.jvm.internal.t.g(aVar, "event");
            if (aVar == k.a.ON_START) {
                this.a.removeObserver(this);
                this.b.d(a.class);
            }
        }
    }

    public static final void a(V v, j4.f fVar, k kVar) {
        kotlin.jvm.internal.t.g(v, "viewModel");
        kotlin.jvm.internal.t.g(fVar, "registry");
        kotlin.jvm.internal.t.g(kVar, "lifecycle");
        L l = (L) v.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (l == null || l.d()) {
            return;
        }
        l.b(fVar, kVar);
        a.c(fVar, kVar);
    }

    public static final L b(j4.f fVar, k kVar, String str, Bundle bundle) {
        kotlin.jvm.internal.t.g(fVar, "registry");
        kotlin.jvm.internal.t.g(kVar, "lifecycle");
        kotlin.jvm.internal.t.d(str);
        L l = new L(str, J.c.a(fVar.a(str), bundle));
        l.b(fVar, kVar);
        a.c(fVar, kVar);
        return l;
    }

    public final void c(j4.f fVar, k kVar) {
        k.b currentState = kVar.getCurrentState();
        if (currentState == k.b.b || currentState.b(k.b.d)) {
            fVar.d(a.class);
        } else {
            kVar.addObserver(new b(kVar, fVar));
        }
    }
}
