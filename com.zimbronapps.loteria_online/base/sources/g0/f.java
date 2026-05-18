package G0;

import Qa.l;
import android.view.KeyEvent;
import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends e.c implements e {
    public l a;
    public l b;

    public f(l lVar, l lVar2) {
        this.a = lVar;
        this.b = lVar2;
    }

    public final void E1(l lVar) {
        this.a = lVar;
    }

    public boolean F0(KeyEvent keyEvent) {
        l lVar = this.b;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void F1(l lVar) {
        this.b = lVar;
    }

    public boolean R0(KeyEvent keyEvent) {
        l lVar = this.a;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(b.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
