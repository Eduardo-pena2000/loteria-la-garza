package U5;

import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n implements View.OnClickListener {
    public final /* synthetic */ z a;

    public n(z zVar) {
        Objects.requireNonNull(zVar);
        this.a = zVar;
    }

    public final void onClick(View view) {
        z zVar = this.a;
        zVar.v = 2;
        zVar.a.finish();
    }
}
