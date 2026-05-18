package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import z.a;
import z.d0;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.ThumbNode$measure$2", f = "Switch.kt", l = {385}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ThumbNode$measure$2 extends l implements p {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ ThumbNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$measure$2(ThumbNode thumbNode, float f, e eVar) {
        super(2, eVar);
        this.this$0 = thumbNode;
        this.$offset = f;
    }

    public final e create(Object obj, e eVar) {
        return new ThumbNode$measure$2(this.this$0, this.$offset, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((ThumbNode$measure$2) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            a access$getOffsetAnim$p = ThumbNode.access$getOffsetAnim$p(this.this$0);
            if (access$getOffsetAnim$p != null) {
                Float c = b.c(this.$offset);
                d0 access$getSnapSpec$p = ThumbNode.access$isPressed$p(this.this$0) ? SwitchKt.access$getSnapSpec$p() : SwitchKt.access$getAnimationSpec$p();
                this.label = 1;
                obj = a.f(access$getOffsetAnim$p, c, access$getSnapSpec$p, (Object) null, (Qa.l) null, this, 12, (Object) null);
                if (obj == f) {
                    return f;
                }
            }
            return I.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        return I.a;
    }
}
