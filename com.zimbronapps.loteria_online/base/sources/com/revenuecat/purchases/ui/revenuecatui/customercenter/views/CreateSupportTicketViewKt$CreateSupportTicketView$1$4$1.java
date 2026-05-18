package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Za.E;
import b0.C0;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CreateSupportTicketData;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CreateSupportTicketViewKt$CreateSupportTicketView$1$4$1 extends u implements Qa.a {
    final /* synthetic */ CreateSupportTicketData $data;
    final /* synthetic */ C0 $description$delegate;
    final /* synthetic */ C0 $email$delegate;
    final /* synthetic */ C0 $hasError$delegate;
    final /* synthetic */ C0 $isSubmitting$delegate;

    public static final class 1 extends u implements Qa.a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ C0 $hasError$delegate;
        final /* synthetic */ C0 $isSubmitting$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(C0 c0, C0 c02) {
            super(0);
            this.$isSubmitting$delegate = c0;
            this.$hasError$delegate = c02;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$11(this.$isSubmitting$delegate, false);
            CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$13(this.$hasError$delegate, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSupportTicketViewKt$CreateSupportTicketView$1$4$1(CreateSupportTicketData createSupportTicketData, C0 c0, C0 c02, C0 c03, C0 c04) {
        super(0);
        this.$data = createSupportTicketData;
        this.$isSubmitting$delegate = c0;
        this.$hasError$delegate = c02;
        this.$email$delegate = c03;
        this.$description$delegate = c04;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$11(this.$isSubmitting$delegate, true);
        CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$13(this.$hasError$delegate, false);
        this.$data.getOnSubmit().invoke(E.j1(CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$1(this.$email$delegate)).toString(), CreateSupportTicketViewKt.access$CreateSupportTicketView$lambda$8(this.$description$delegate), 1.INSTANCE, new 2(this.$isSubmitting$delegate, this.$hasError$delegate));
    }
}
