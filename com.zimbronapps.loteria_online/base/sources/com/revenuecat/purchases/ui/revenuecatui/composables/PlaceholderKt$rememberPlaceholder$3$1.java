package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt$rememberPlaceholder$3$1", f = "Placeholder.kt", l = {120, 122}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PlaceholderKt$rememberPlaceholder$3$1 extends l implements p {
    final /* synthetic */ boolean $inPreviewMode;
    final /* synthetic */ Placeholder $placeholder;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderKt$rememberPlaceholder$3$1(boolean z, boolean z2, Placeholder placeholder, e eVar) {
        super(2, eVar);
        this.$visible = z;
        this.$inPreviewMode = z2;
        this.$placeholder = placeholder;
    }

    public final e create(Object obj, e eVar) {
        return new PlaceholderKt$rememberPlaceholder$3$1(this.$visible, this.$inPreviewMode, this.$placeholder, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((PlaceholderKt$rememberPlaceholder$3$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            if (!this.$visible || this.$inPreviewMode) {
                Placeholder placeholder = this.$placeholder;
                this.label = 2;
                if (placeholder.stopAnimation$revenuecatui_defaultsBc8Release(this) == f) {
                    return f;
                }
            } else {
                Placeholder placeholder2 = this.$placeholder;
                this.label = 1;
                if (placeholder2.startAnimation$revenuecatui_defaultsBc8Release(this) == f) {
                    return f;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}
