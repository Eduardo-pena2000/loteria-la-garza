package P0;

import android.content.Context;
import android.util.AttributeSet;
import b0.U1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o0 extends P0.a {
    public final b0.C0 a;
    public boolean b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.b = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            o0.this.Content(mVar, b0.g1.a(this.b | 1));
        }
    }

    public /* synthetic */ o0(Context context, AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.k kVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void Content(b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(420213850);
        if ((i & 6) == 0) {
            i2 = (i3.E(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (i3.o((i2 & 3) != 2, i2 & 1)) {
            if (b0.w.L()) {
                b0.w.U(420213850, i2, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:429)");
            }
            Qa.p pVar = (Qa.p) this.a.getValue();
            if (pVar == null) {
                i3.V(-1238798753);
            } else {
                i3.V(98586082);
                pVar.invoke(i3, 0);
            }
            i3.P();
            if (b0.w.L()) {
                b0.w.T();
            }
        } else {
            i3.M();
        }
        b0.B1 l = i3.l();
        if (l != null) {
            l.a(new a(i));
        }
    }

    public CharSequence getAccessibilityClassName() {
        return o0.class.getName();
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.b;
    }

    public final void setContent(Qa.p pVar) {
        this.b = true;
        this.a.setValue(pVar);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    public o0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = U1.i(null, null, 2, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
