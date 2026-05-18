package U1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends ClickableSpan {
    public final int a;
    public final v b;
    public final int c;

    public a(int i, v vVar, int i2) {
        this.a = i;
        this.b = vVar;
        this.c = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.X(this.c, bundle);
    }
}
