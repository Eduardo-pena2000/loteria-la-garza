package O0;

import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e.c cVar, Qa.a aVar) {
        l0 ownerScope$ui_release = cVar.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new l0((j0) cVar);
            cVar.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        k.o(cVar).getSnapshotObserver().i(ownerScope$ui_release, l0.b.a(), aVar);
    }
}
