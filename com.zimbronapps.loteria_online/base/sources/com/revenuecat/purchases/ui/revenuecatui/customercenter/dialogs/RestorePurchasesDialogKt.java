package com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs;

import A.i;
import Ca.I;
import F.V;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import X.E;
import X.c;
import X.h;
import X.m0;
import Z0.Y0;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.emergetools.snapshots.annotations.EmergeSnapshotConfig;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import d1.H;
import d1.L;
import j0.b;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class RestorePurchasesDialogKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ a $onContactSupport;

        public static final class 1 extends u implements q {
            final /* synthetic */ CustomerCenterConfigData.Localization $localization;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(CustomerCenterConfigData.Localization localization) {
                super(3);
                this.$localization = localization;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
                return I.a;
            }

            public final void invoke(V TextButton, m mVar, int i) {
                t.g(TextButton, "$this$TextButton");
                if ((i & 17) == 16 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (w.L()) {
                    w.U(1149789201, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous>.<anonymous> (RestorePurchasesDialog.kt:136)");
                }
                m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.CONTACT_SUPPORT), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(a aVar, CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$onContactSupport = aVar;
            this.$localization = localization;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(2084079289, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous> (RestorePurchasesDialog.kt:134)");
            }
            a aVar = this.$onContactSupport;
            if (aVar != null) {
                X.k.c(aVar, (e) null, false, (E1) null, (h) null, (X.j) null, (i) null, (F.L) null, (E.m) null, j0.i.d(1149789201, true, new 1(this.$localization), mVar, 54), mVar, 805306368, 510);
            }
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ a $onDismiss;

        public static final class 1 extends u implements q {
            final /* synthetic */ CustomerCenterConfigData.Localization $localization;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(CustomerCenterConfigData.Localization localization) {
                super(3);
                this.$localization = localization;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
                return I.a;
            }

            public final void invoke(V TextButton, m mVar, int i) {
                t.g(TextButton, "$this$TextButton");
                if ((i & 17) == 16 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (w.L()) {
                    w.U(-221760264, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous>.<anonymous> (RestorePurchasesDialog.kt:146)");
                }
                m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.DISMISS), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(a aVar, CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$onDismiss = aVar;
            this.$localization = localization;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-1053355717, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous> (RestorePurchasesDialog.kt:145)");
            }
            X.k.c(this.$onDismiss, (e) null, false, (E1) null, (h) null, (X.j) null, (i) null, (F.L) null, (E.m) null, j0.i.d(-221760264, true, new 1(this.$localization), mVar, 54), mVar, 805306368, 510);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(104176573, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous> (RestorePurchasesDialog.kt:118)");
            }
            m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_NOT_FOUND), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(mVar, E.b).j(), mVar, 0, 0, 65534);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(682942718, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous> (RestorePurchasesDialog.kt:126)");
            }
            m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_NOT_RECOVERED), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(mVar, E.b).b(), mVar, 0, 0, 65534);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 5 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ a $onContactSupport;
        final /* synthetic */ a $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(CustomerCenterConfigData.Localization localization, a aVar, a aVar2, int i, int i2) {
            super(2);
            this.$localization = localization;
            this.$onDismiss = aVar;
            this.$onContactSupport = aVar2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RestorePurchasesDialogKt.access$PurchasesNotFoundDialog(this.$localization, this.$onDismiss, this.$onContactSupport, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ a $onDismiss;

        public static final class 1 extends u implements q {
            final /* synthetic */ CustomerCenterConfigData.Localization $localization;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(CustomerCenterConfigData.Localization localization) {
                super(3);
                this.$localization = localization;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
                return I.a;
            }

            public final void invoke(V TextButton, m mVar, int i) {
                t.g(TextButton, "$this$TextButton");
                if ((i & 17) == 16 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (w.L()) {
                    w.U(-1528989004, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog.<anonymous>.<anonymous> (RestorePurchasesDialog.kt:99)");
                }
                m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.DONE), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(a aVar, CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$onDismiss = aVar;
            this.$localization = localization;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1752184593, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog.<anonymous> (RestorePurchasesDialog.kt:98)");
            }
            X.k.c(this.$onDismiss, (e) null, false, (E1) null, (h) null, (X.j) null, (i) null, (F.L) null, (E.m) null, j0.i.d(-1528989004, true, new 1(this.$localization), mVar, 54), mVar, 805306368, 510);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(90877325, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog.<anonymous> (RestorePurchasesDialog.kt:82)");
            }
            m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_RECOVERED), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(mVar, E.b).j(), mVar, 0, 0, 65534);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-324449492, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog.<anonymous> (RestorePurchasesDialog.kt:90)");
            }
            m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_RECOVERED_EXPLANATION), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(mVar, E.b).b(), mVar, 0, 0, 65534);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ a $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(CustomerCenterConfigData.Localization localization, a aVar, int i) {
            super(2);
            this.$localization = localization;
            this.$onDismiss = aVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RestorePurchasesDialogKt.access$PurchasesRecoveredDialog(this.$localization, this.$onDismiss, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ a $onContactSupport;
        final /* synthetic */ a $onDismiss;
        final /* synthetic */ a $onRestore;
        final /* synthetic */ RestorePurchasesState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(RestorePurchasesState restorePurchasesState, CustomerCenterConfigData.Localization localization, a aVar, a aVar2, a aVar3, int i) {
            super(2);
            this.$state = restorePurchasesState;
            this.$localization = localization;
            this.$onDismiss = aVar;
            this.$onRestore = aVar2;
            this.$onContactSupport = aVar3;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RestorePurchasesDialogKt.RestorePurchasesDialog(this.$state, this.$localization, this.$onDismiss, this.$onRestore, this.$onContactSupport, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
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

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 3 extends u implements a {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RestorePurchasesDialogKt.access$RestorePurchasesDialogNotFoundPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
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

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 3 extends u implements a {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RestorePurchasesDialogKt.access$RestorePurchasesDialogRecoveredPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
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

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 3 extends u implements a {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RestorePurchasesDialogKt.access$RestorePurchasesDialogRestoringPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
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

    public static final class 2 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1131714747, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestoringDialog.<anonymous> (RestorePurchasesDialog.kt:54)");
            }
            m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_RESTORING), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(mVar, E.b).j(), mVar, 0, 0, 65534);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(CustomerCenterConfigData.Localization localization, int i) {
            super(2);
            this.$localization = localization;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RestorePurchasesDialogKt.access$RestoringDialog(this.$localization, mVar, g1.a(this.$$changed | 1));
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestorePurchasesState.values().length];
            try {
                iArr[RestorePurchasesState.PURCHASES_RECOVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestorePurchasesState.PURCHASES_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestorePurchasesState.RESTORING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void PurchasesNotFoundDialog(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r26, Qa.a r27, Qa.a r28, b0.m r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt.PurchasesNotFoundDialog(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, Qa.a, Qa.a, b0.m, int, int):void");
    }

    private static final void PurchasesRecoveredDialog(CustomerCenterConfigData.Localization localization, a aVar, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1735282777);
        if ((i & 6) == 0) {
            i2 = (i3.E(localization) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(aVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1735282777, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog (RestorePurchasesDialog.kt:78)");
            }
            mVar2 = i3;
            c.a(aVar, j0.i.d(1752184593, true, new 1(aVar, localization), i3, 54), (e) null, (p) null, (p) null, j0.i.d(90877325, true, new 2(localization), i3, 54), j0.i.d(-324449492, true, new 3(localization), i3, 54), (E1) null, 0L, 0L, 0L, 0L, 0.0f, (r1.k) null, mVar2, ((i2 >> 3) & 14) | 1769520, 0, 16284);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 4(localization, aVar, i));
        }
    }

    public static final /* synthetic */ void RestorePurchasesDialog(RestorePurchasesState state, CustomerCenterConfigData.Localization localization, a onDismiss, a onRestore, a aVar, m mVar, int i) {
        int i2;
        t.g(state, "state");
        t.g(localization, "localization");
        t.g(onDismiss, "onDismiss");
        t.g(onRestore, "onRestore");
        m i3 = mVar.i(-1558153315);
        if ((i & 6) == 0) {
            i2 = (i3.U(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(localization) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.E(onDismiss) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.E(onRestore) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.E(aVar) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1558153315, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialog (RestorePurchasesDialog.kt:28)");
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i4 == 1) {
                i3.V(-583327083);
                PurchasesRecoveredDialog(localization, onDismiss, i3, (i2 >> 3) & 126);
                i3.P();
            } else if (i4 == 2) {
                i3.V(-583322607);
                PurchasesNotFoundDialog(localization, onDismiss, aVar, i3, ((i2 >> 3) & 126) | ((i2 >> 6) & 896), 0);
                i3.P();
            } else if (i4 != 3) {
                i3.V(-902851391);
                i3.P();
            } else {
                i3.V(-583314999);
                RestoringDialog(localization, i3, (i2 >> 3) & 14);
                I i5 = I.a;
                onRestore.invoke();
                i3.P();
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(state, localization, onDismiss, onRestore, aVar, i));
        }
    }

    @EmergeSnapshotConfig(ignore = true)
    private static final void RestorePurchasesDialogNotFoundPreview(m mVar, int i) {
        m i2 = mVar.i(-789679044);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-789679044, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogNotFoundPreview (RestorePurchasesDialog.kt:185)");
            }
            RestorePurchasesDialog(RestorePurchasesState.PURCHASES_NOT_FOUND, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), 1.INSTANCE, 2.INSTANCE, 3.INSTANCE, i2, 28038);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 4(i));
        }
    }

    @EmergeSnapshotConfig(ignore = true)
    private static final void RestorePurchasesDialogRecoveredPreview(m mVar, int i) {
        m i2 = mVar.i(1527727452);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1527727452, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogRecoveredPreview (RestorePurchasesDialog.kt:172)");
            }
            RestorePurchasesDialog(RestorePurchasesState.PURCHASES_RECOVERED, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), 1.INSTANCE, 2.INSTANCE, 3.INSTANCE, i2, 28038);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 4(i));
        }
    }

    @EmergeSnapshotConfig(ignore = true)
    private static final void RestorePurchasesDialogRestoringPreview(m mVar, int i) {
        m i2 = mVar.i(2037934116);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(2037934116, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogRestoringPreview (RestorePurchasesDialog.kt:159)");
            }
            RestorePurchasesDialog(RestorePurchasesState.RESTORING, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), 1.INSTANCE, 2.INSTANCE, 3.INSTANCE, i2, 28038);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 4(i));
        }
    }

    private static final void RestoringDialog(CustomerCenterConfigData.Localization localization, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(-1621839505);
        if ((i & 6) == 0) {
            i2 = (i3.E(localization) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-1621839505, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestoringDialog (RestorePurchasesDialog.kt:50)");
            }
            1 r3 = 1.INSTANCE;
            ComposableSingletons$RestorePurchasesDialogKt composableSingletons$RestorePurchasesDialogKt = ComposableSingletons$RestorePurchasesDialogKt.INSTANCE;
            p pVar = composableSingletons$RestorePurchasesDialogKt.getLambda-1$revenuecatui_defaultsBc8Release();
            b d = j0.i.d(1131714747, true, new 2(localization), i3, 54);
            p pVar2 = composableSingletons$RestorePurchasesDialogKt.getLambda-2$revenuecatui_defaultsBc8Release();
            mVar2 = i3;
            c.a(r3, pVar, (e) null, (p) null, (p) null, d, pVar2, (E1) null, 0L, 0L, 0L, 0L, 0.0f, (r1.k) null, mVar2, 1769526, 0, 16284);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 3(localization, i));
        }
    }

    public static final /* synthetic */ void access$PurchasesNotFoundDialog(CustomerCenterConfigData.Localization localization, a aVar, a aVar2, m mVar, int i, int i2) {
        PurchasesNotFoundDialog(localization, aVar, aVar2, mVar, i, i2);
    }

    public static final /* synthetic */ void access$PurchasesRecoveredDialog(CustomerCenterConfigData.Localization localization, a aVar, m mVar, int i) {
        PurchasesRecoveredDialog(localization, aVar, mVar, i);
    }

    public static final /* synthetic */ void access$RestorePurchasesDialogNotFoundPreview(m mVar, int i) {
        RestorePurchasesDialogNotFoundPreview(mVar, i);
    }

    public static final /* synthetic */ void access$RestorePurchasesDialogRecoveredPreview(m mVar, int i) {
        RestorePurchasesDialogRecoveredPreview(mVar, i);
    }

    public static final /* synthetic */ void access$RestorePurchasesDialogRestoringPreview(m mVar, int i) {
        RestorePurchasesDialogRestoringPreview(mVar, i);
    }

    public static final /* synthetic */ void access$RestoringDialog(CustomerCenterConfigData.Localization localization, m mVar, int i) {
        RestoringDialog(localization, mVar, i);
    }
}
