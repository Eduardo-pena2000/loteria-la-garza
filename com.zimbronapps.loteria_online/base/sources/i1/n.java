package i1;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n extends ClickableSpan {
    public final Z0.j a;

    public n(Z0.j jVar) {
        this.a = jVar;
    }

    public void onClick(View view) {
        this.a.a();
    }
}
