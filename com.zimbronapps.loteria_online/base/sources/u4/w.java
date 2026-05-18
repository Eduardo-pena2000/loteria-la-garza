package u4;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class w {
    public final WebSettingsBoundaryInterface a;

    public w(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.a = webSettingsBoundaryInterface;
    }

    public void a(boolean z) {
        this.a.setPaymentRequestEnabled(z);
    }
}
