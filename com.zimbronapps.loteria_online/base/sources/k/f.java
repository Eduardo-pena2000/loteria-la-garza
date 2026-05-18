package K;

import androidx.compose.ui.e;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends e.c {
    public b a;
    public final boolean b;

    public f(b bVar) {
        this.a = bVar;
    }

    public final void E1() {
        b bVar = this.a;
        if (bVar instanceof c) {
            t.e(bVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((c) bVar).b().s(this);
        }
    }

    public final void F1(b bVar) {
        E1();
        if (bVar instanceof c) {
            ((c) bVar).b().b(this);
        }
        this.a = bVar;
    }

    public boolean getShouldAutoInvalidate() {
        return this.b;
    }

    public void onAttach() {
        F1(this.a);
    }

    public void onDetach() {
        E1();
    }
}
