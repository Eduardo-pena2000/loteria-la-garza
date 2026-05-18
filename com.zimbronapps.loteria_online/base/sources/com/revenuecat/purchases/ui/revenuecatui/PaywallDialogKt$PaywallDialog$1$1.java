package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import b0.C0;
import cb.O;
import cb.i;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$1$1", f = "PaywallDialog.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDialogKt$PaywallDialog$1$1 extends l implements p {
    final /* synthetic */ Qa.l $shouldDisplayBlock;
    final /* synthetic */ C0 $shouldDisplayDialog$delegate;
    private /* synthetic */ Object L$0;
    int label;

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$1$1$1", f = "PaywallDialog.kt", l = {53}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Qa.l $shouldDisplayBlock;
        final /* synthetic */ C0 $shouldDisplayDialog$delegate;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.l lVar, C0 c0, e eVar) {
            super(2, eVar);
            this.$shouldDisplayBlock = lVar;
            this.$shouldDisplayDialog$delegate = c0;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$shouldDisplayBlock, this.$shouldDisplayDialog$delegate, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            C0 c0;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                C0 c02 = this.$shouldDisplayDialog$delegate;
                Qa.l lVar = this.$shouldDisplayBlock;
                this.L$0 = c02;
                this.label = 1;
                Object shouldDisplayPaywall = HelperFunctionsKt.shouldDisplayPaywall(lVar, this);
                if (shouldDisplayPaywall == f) {
                    return f;
                }
                c0 = c02;
                obj = shouldDisplayPaywall;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0 = (C0) this.L$0;
                t.b(obj);
            }
            PaywallDialogKt.access$PaywallDialog$lambda$2(c0, ((Boolean) obj).booleanValue());
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDialogKt$PaywallDialog$1$1(Qa.l lVar, C0 c0, e eVar) {
        super(2, eVar);
        this.$shouldDisplayBlock = lVar;
        this.$shouldDisplayDialog$delegate = c0;
    }

    public final e create(Object obj, e eVar) {
        PaywallDialogKt$PaywallDialog$1$1 paywallDialogKt$PaywallDialog$1$1 = new PaywallDialogKt$PaywallDialog$1$1(this.$shouldDisplayBlock, this.$shouldDisplayDialog$delegate, eVar);
        paywallDialogKt$PaywallDialog$1$1.L$0 = obj;
        return paywallDialogKt$PaywallDialog$1$1;
    }

    public final Object invoke(O o, e eVar) {
        return ((PaywallDialogKt$PaywallDialog$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        i.d((O) this.L$0, null, null, new 1(this.$shouldDisplayBlock, this.$shouldDisplayDialog$delegate, null), 3, null);
        return I.a;
    }
}
