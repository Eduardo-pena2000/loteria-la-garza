package androidx.compose.ui.platform;

import O0.Y;
import P0.N0;
import P0.f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class AndroidComposeView$bringIntoViewNode$1 extends Y {
    public final /* synthetic */ AndroidComposeView b;

    public AndroidComposeView$bringIntoViewNode$1(AndroidComposeView androidComposeView) {
        this.b = androidComposeView;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f0 create() {
        return new f0(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(f0 f0Var) {
        f0Var.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("BringIntoViewOnScreen");
    }
}
