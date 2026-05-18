package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import android.net.Uri;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconImageKt {

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
            IconImageKt.access$IconImagePreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IconImage-djqs-MU(android.net.Uri r22, float r23, float r24, androidx.compose.ui.e r25, b0.m r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.IconImageKt.IconImage-djqs-MU(android.net.Uri, float, float, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void IconImagePreview(m mVar, int i) {
        m i2 = mVar.i(432450827);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(432450827, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IconImagePreview (IconImage.kt:56)");
            }
            IconImage-djqs-MU(Uri.parse("https://assets.pawwalls.com/icon.jpg"), h.g(140), h.g(16), null, i2, 432, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final /* synthetic */ void access$IconImagePreview(m mVar, int i) {
        IconImagePreview(mVar, i);
    }
}
