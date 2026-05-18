package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.p;
import W0.h;
import androidx.compose.ui.e;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1 extends u implements p {
    final /* synthetic */ Qa.a $onCardClick;

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ Qa.a $onCardClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.a aVar) {
            super(0);
            this.$onCardClick = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            Qa.a aVar = this.$onCardClick;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1(Qa.a aVar) {
        super(2);
        this.$onCardClick = aVar;
    }

    public final e invoke(e applyIfNotNull, Qa.a it) {
        t.g(applyIfNotNull, "$this$applyIfNotNull");
        t.g(it, "it");
        return androidx.compose.foundation.b.d(applyIfNotNull, false, (String) null, (h) null, new 1(this.$onCardClick), 7, (Object) null);
    }
}
