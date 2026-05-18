package K0;

import Qa.l;
import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends e.c implements a {
    public l a;
    public l b;

    public b(l lVar, l lVar2) {
        this.a = lVar;
        this.b = lVar2;
    }

    public boolean B0(c cVar) {
        l lVar = this.a;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(cVar)).booleanValue();
        }
        return false;
    }

    public final void E1(l lVar) {
        this.a = lVar;
    }

    public final void F1(l lVar) {
        this.b = lVar;
    }

    public boolean v0(c cVar) {
        l lVar = this.b;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(cVar)).booleanValue();
        }
        return false;
    }
}
