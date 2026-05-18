package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import F.f;
import M0.B;
import O0.g;
import Qa.l;
import Qa.p;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.FeedbackSurveyData;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class FeedbackSurveyViewKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $loadingOption;
        final /* synthetic */ e $modifier;
        final /* synthetic */ l $onAnswerSubmit;
        final /* synthetic */ List $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(List list, l lVar, String str, e eVar, int i, int i2) {
            super(2);
            this.$options = list;
            this.$onAnswerSubmit = lVar;
            this.$loadingOption = str;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            FeedbackSurveyViewKt.FeedbackSurveyButtonsView(this.$options, this.$onAnswerSubmit, this.$loadingOption, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements l {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(1);
        }

        public final void invoke(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option) obj);
            return I.a;
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            FeedbackSurveyViewKt.FeedbackSurveyPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ FeedbackSurveyData $data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(FeedbackSurveyData feedbackSurveyData, int i) {
            super(2);
            this.$data = feedbackSurveyData;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            FeedbackSurveyViewKt.FeedbackSurveyView(this.$data, mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009c  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void FeedbackSurveyButtonsView(java.util.List r25, Qa.l r26, java.lang.String r27, androidx.compose.ui.e r28, b0.m r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyViewKt.FeedbackSurveyButtonsView(java.util.List, Qa.l, java.lang.String, androidx.compose.ui.e, b0.m, int, int):void");
    }

    public static final /* synthetic */ void FeedbackSurveyPreview(m mVar, int i) {
        List<CustomerCenterConfigData.HelpPath> paths;
        m i2 = mVar.i(-1976778683);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1976778683, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyPreview (FeedbackSurveyView.kt:72)");
            }
            r3 = null;
            CustomerCenterConfigData.Screen managementScreen = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getManagementScreen();
            if (managementScreen != null && (paths = managementScreen.getPaths()) != null) {
                for (CustomerCenterConfigData.HelpPath helpPath : paths) {
                    if (helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            t.d(helpPath);
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey = helpPath.getFeedbackSurvey();
            t.d(feedbackSurvey);
            FeedbackSurveyView(new FeedbackSurveyData(feedbackSurvey, 2.INSTANCE), i2, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 3(i));
        }
    }

    public static final /* synthetic */ void FeedbackSurveyView(FeedbackSurveyData data, m mVar, int i) {
        int i2;
        t.g(data, "data");
        m i3 = mVar.i(1091362999);
        if ((i & 6) == 0) {
            i2 = (i3.E(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1091362999, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyView (FeedbackSurveyView.kt:27)");
            }
            i3.V(125160704);
            Object C = i3.C();
            m.a aVar = m.a;
            if (C == aVar.a()) {
                C = U1.i((Object) null, (T1) null, 2, (Object) null);
                i3.t(C);
            }
            C0 c0 = (C0) C;
            i3.P();
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey = data.getFeedbackSurvey();
            e.a aVar2 = e.a;
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(i3, 0);
            b0.I r = i3.r();
            e f = androidx.compose.ui.c.f(i3, aVar2);
            g.a aVar3 = g.E8;
            Qa.a a2 = aVar3.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar3.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            List options = feedbackSurvey.getOptions();
            i3.V(-250247028);
            boolean E = i3.E(data);
            Object C2 = i3.C();
            if (E || C2 == aVar.a()) {
                C2 = new FeedbackSurveyViewKt$FeedbackSurveyView$1$1$1(data, c0);
                i3.t(C2);
            }
            i3.P();
            FeedbackSurveyButtonsView(options, (l) C2, FeedbackSurveyView$lambda$1(c0), null, i3, 0, 8);
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(data, i));
        }
    }

    private static final String FeedbackSurveyView$lambda$1(C0 c0) {
        return (String) c0.getValue();
    }

    private static final void FeedbackSurveyView$lambda$2(C0 c0, String str) {
        c0.setValue(str);
    }

    public static final /* synthetic */ void access$FeedbackSurveyView$lambda$2(C0 c0, String str) {
        FeedbackSurveyView$lambda$2(c0, str);
    }
}
