package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DualColorImageGenerator;
import kotlin.jvm.internal.u;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DualColorImageGenerator$purpleOrange$2 extends u implements a {
    public static final DualColorImageGenerator$purpleOrange$2 INSTANCE = new DualColorImageGenerator$purpleOrange$2();

    public DualColorImageGenerator$purpleOrange$2() {
        super(0);
    }

    public final DualColorImageGenerator.PreviewAppIcon invoke() {
        DualColorImageGenerator.PreviewAppIcon previewAppIcon = DualColorImageGenerator.create-RFnl5yQ$default(DualColorImageGenerator.INSTANCE, s0.d(4286578816L), s0.d(4294944000L), 0, 0, 12, null);
        if (previewAppIcon != null) {
            return previewAppIcon;
        }
        throw new IllegalStateException("Failed to generate purpleOrange preview icon");
    }
}
