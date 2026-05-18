package t0;

import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o extends e.c implements n {
    public androidx.compose.ui.focus.j a;

    public o(androidx.compose.ui.focus.j jVar) {
        this.a = jVar;
    }

    public final androidx.compose.ui.focus.j E1() {
        return this.a;
    }

    public final void F1(androidx.compose.ui.focus.j jVar) {
        this.a = jVar;
    }

    public void onAttach() {
        super.onAttach();
        this.a.e().b(this);
    }

    public void onDetach() {
        this.a.e().s(this);
        super.onDetach();
    }
}
