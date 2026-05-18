package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Ca.t;
import E.j;
import E.k;
import E.o;
import Ha.c;
import Ia.f;
import Ia.l;
import M0.A;
import M0.C;
import M0.m;
import O0.E;
import O0.H;
import Qa.p;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import cb.O;
import cb.i;
import java.util.Map;
import kotlin.jvm.internal.M;
import n1.b;
import n1.h;
import z.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class ThumbNode extends e.c implements E {
    private boolean checked;
    private float initialOffset;
    private float initialSize;
    private k interactionSource;
    private boolean isPressed;
    private a offsetAnim;
    private a sizeAnim;

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.ThumbNode$onAttach$1", f = "Switch.kt", l = {333}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        int label;

        public static final class 1 implements fb.f {
            final /* synthetic */ M $pressCount;
            final /* synthetic */ ThumbNode this$0;

            public 1(M m, ThumbNode thumbNode) {
                this.$pressCount = m;
                this.this$0 = thumbNode;
            }

            public final Object emit(j jVar, Ga.e eVar) {
                if (jVar instanceof o.b) {
                    this.$pressCount.a++;
                } else if (jVar instanceof o.c) {
                    M m = this.$pressCount;
                    m.a--;
                } else if (jVar instanceof o.a) {
                    M m2 = this.$pressCount;
                    m2.a--;
                }
                boolean z = this.$pressCount.a > 0;
                if (ThumbNode.access$isPressed$p(this.this$0) != z) {
                    ThumbNode.access$setPressed$p(this.this$0, z);
                    H.b(this.this$0);
                }
                return I.a;
            }
        }

        public 1(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return ThumbNode.this.new 1(eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                M m = new M();
                fb.e b = ThumbNode.this.getInteractionSource().b();
                1 r3 = new 1(m, ThumbNode.this);
                this.label = 1;
                if (b.collect(r3, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public ThumbNode(k interactionSource, boolean z) {
        kotlin.jvm.internal.t.g(interactionSource, "interactionSource");
        this.interactionSource = interactionSource;
        this.checked = z;
        this.initialOffset = Float.NaN;
        this.initialSize = Float.NaN;
    }

    public static final /* synthetic */ a access$getOffsetAnim$p(ThumbNode thumbNode) {
        return thumbNode.offsetAnim;
    }

    public static final /* synthetic */ a access$getSizeAnim$p(ThumbNode thumbNode) {
        return thumbNode.sizeAnim;
    }

    public static final /* synthetic */ boolean access$isPressed$p(ThumbNode thumbNode) {
        return thumbNode.isPressed;
    }

    public static final /* synthetic */ void access$setPressed$p(ThumbNode thumbNode, boolean z) {
        thumbNode.isPressed = z;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final k getInteractionSource() {
        return this.interactionSource;
    }

    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(m mVar, M0.l lVar, int i) {
        return super.maxIntrinsicHeight(mVar, lVar, i);
    }

    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(m mVar, M0.l lVar, int i) {
        return super.maxIntrinsicWidth(mVar, lVar, i);
    }

    public C measure-3p2s80s(androidx.compose.ui.layout.l measure, A measurable, long j) {
        kotlin.jvm.internal.t.g(measure, "$this$measure");
        kotlin.jvm.internal.t.g(measurable, "measurable");
        float j1 = measure.j1(this.isPressed ? SwitchTokens.INSTANCE.getPressedHandleWidth-D9Ej5fM() : ((measurable.J(b.l(j)) != 0 && measurable.B0(b.k(j)) != 0) || this.checked) ? SwitchKt.access$getThumbDiameter$p() : SwitchKt.access$getUncheckedThumbDiameter$p());
        a aVar = this.sizeAnim;
        int floatValue = (int) (aVar != null ? ((Number) aVar.m()).floatValue() : j1);
        q C0 = measurable.C0(b.b.c(floatValue, floatValue));
        float j12 = measure.j1(h.g(h.g(SwitchKt.access$getSwitchHeight$p() - measure.a1(j1)) / 2.0f));
        float j13 = measure.j1(h.g(h.g(SwitchKt.access$getSwitchWidth$p() - SwitchKt.access$getThumbDiameter$p()) - SwitchKt.access$getThumbPadding$p()));
        boolean z = this.isPressed;
        if (z && this.checked) {
            j12 = j13 - measure.j1(SwitchTokens.INSTANCE.getTrackOutlineWidth-D9Ej5fM());
        } else if (z && !this.checked) {
            j12 = measure.j1(SwitchTokens.INSTANCE.getTrackOutlineWidth-D9Ej5fM());
        } else if (this.checked) {
            j12 = j13;
        }
        a aVar2 = this.sizeAnim;
        if (!kotlin.jvm.internal.t.b(aVar2 != null ? (Float) aVar2.k() : null, j1)) {
            i.d(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, j1, null), 3, null);
        }
        a aVar3 = this.offsetAnim;
        if (!kotlin.jvm.internal.t.b(aVar3 != null ? (Float) aVar3.k() : null, j12)) {
            i.d(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, j12, null), 3, null);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = j1;
            this.initialOffset = j12;
        }
        return androidx.compose.ui.layout.l.O0(measure, floatValue, floatValue, (Map) null, new ThumbNode$measure$3(C0, this, j12), 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ int minIntrinsicHeight(m mVar, M0.l lVar, int i) {
        return super.minIntrinsicHeight(mVar, lVar, i);
    }

    public /* bridge */ /* synthetic */ int minIntrinsicWidth(m mVar, M0.l lVar, int i) {
        return super.minIntrinsicWidth(mVar, lVar, i);
    }

    public void onAttach() {
        i.d(getCoroutineScope(), null, null, new 1(null), 3, null);
    }

    public /* bridge */ /* synthetic */ void onDensityChange() {
        super/*O0.j*/.onDensityChange();
    }

    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
        super/*O0.j*/.onLayoutDirectionChange();
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final void setInteractionSource(k kVar) {
        kotlin.jvm.internal.t.g(kVar, "<set-?>");
        this.interactionSource = kVar;
    }

    public final void update() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = z.b.b(this.initialSize, 0.0f, 2, (Object) null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = z.b.b(this.initialOffset, 0.0f, 2, (Object) null);
    }
}
