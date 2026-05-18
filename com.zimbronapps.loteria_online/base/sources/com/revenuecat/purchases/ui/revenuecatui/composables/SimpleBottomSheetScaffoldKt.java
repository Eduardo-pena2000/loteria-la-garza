package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h2;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;
import n1.h;
import v0.E1;
import v0.r0;
import z.D;
import z.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SimpleBottomSheetScaffoldKt {
    private static final float ALPHA_SCRIM = 0.6f;

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $content;
        final /* synthetic */ e $modifier;
        final /* synthetic */ SimpleSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(SimpleSheetState simpleSheetState, e eVar, p pVar, int i, int i2) {
            super(2);
            this.$sheetState = simpleSheetState;
            this.$modifier = eVar;
            this.$content = pVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SimpleBottomSheetScaffoldKt.SimpleBottomSheetScaffold(this.$sheetState, this.$modifier, this.$content, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            SimpleBottomSheetScaffoldKt.access$SimpleBottomSheetScaffold_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void Scrim-EUb7tLY(boolean r17, float r18, Qa.a r19, androidx.compose.ui.e r20, Qa.p r21, b0.m r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffoldKt.Scrim-EUb7tLY(boolean, float, Qa.a, androidx.compose.ui.e, Qa.p, b0.m, int, int):void");
    }

    private static final float Scrim_EUb7tLY$lambda$2(h2 h2Var) {
        return ((h) h2Var.getValue()).m();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SimpleBottomSheetScaffold(com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState r18, androidx.compose.ui.e r19, Qa.p r20, b0.m r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffoldKt.SimpleBottomSheetScaffold(com.revenuecat.purchases.ui.revenuecatui.composables.SimpleSheetState, androidx.compose.ui.e, Qa.p, b0.m, int, int):void");
    }

    private static final void SimpleBottomSheetScaffold_Preview(m mVar, int i) {
        m i2 = mVar.i(-266393130);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-266393130, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffold_Preview (SimpleBottomSheetScaffold.kt:147)");
            }
            SimpleSheetState simpleSheetState = new SimpleSheetState();
            ComposableSingletons$SimpleBottomSheetScaffoldKt composableSingletons$SimpleBottomSheetScaffoldKt = ComposableSingletons$SimpleBottomSheetScaffoldKt.INSTANCE;
            SimpleSheetState.show$default(simpleSheetState, true, composableSingletons$SimpleBottomSheetScaffoldKt.getLambda-2$revenuecatui_defaultsBc8Release(), null, 4, null);
            SimpleBottomSheetScaffold(simpleSheetState, a.d(g.f(e.a, 0.0f, 1, (Object) null), r0.b.e(), (E1) null, 2, (Object) null), composableSingletons$SimpleBottomSheetScaffoldKt.getLambda-3$revenuecatui_defaultsBc8Release(), i2, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final /* synthetic */ void access$Scrim-EUb7tLY(boolean z, float f, Qa.a aVar, e eVar, p pVar, m mVar, int i, int i2) {
        Scrim-EUb7tLY(z, f, aVar, eVar, pVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$SimpleBottomSheetScaffold_Preview(m mVar, int i) {
        SimpleBottomSheetScaffold_Preview(mVar, i);
    }

    private static final z.r0 blurAnimationSpec() {
        return j.j(0, 0, (D) null, 7, (Object) null);
    }
}
