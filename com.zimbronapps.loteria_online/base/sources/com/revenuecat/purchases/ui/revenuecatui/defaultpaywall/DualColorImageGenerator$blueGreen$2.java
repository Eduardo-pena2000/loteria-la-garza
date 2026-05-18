package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DualColorImageGenerator;
import kotlin.jvm.internal.u;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DualColorImageGenerator$blueGreen$2 extends u implements a {
    public static final DualColorImageGenerator$blueGreen$2 INSTANCE = new DualColorImageGenerator$blueGreen$2();

    public DualColorImageGenerator$blueGreen$2() {
        super(0);
    }

    public final DualColorImageGenerator.PreviewAppIcon invoke() {
        DualColorImageGenerator dualColorImageGenerator = DualColorImageGenerator.INSTANCE;
        r0.a aVar = r0.b;
        DualColorImageGenerator.PreviewAppIcon previewAppIcon = DualColorImageGenerator.create-RFnl5yQ$default(dualColorImageGenerator, aVar.b(), aVar.f(), 0, 0, 12, null);
        if (previewAppIcon != null) {
            return previewAppIcon;
        }
        throw new IllegalStateException("Failed to generate blueGreen preview icon");
    }
}
