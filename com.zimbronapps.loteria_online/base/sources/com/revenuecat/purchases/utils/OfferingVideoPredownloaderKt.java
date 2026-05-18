package com.revenuecat.purchases.utils;

import Ca.q;
import Ca.x;
import Da.v;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import java.net.URL;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OfferingVideoPredownloaderKt {
    public static final /* synthetic */ List access$checkedUrls(ThemeVideoUrls themeVideoUrls) {
        return checkedUrls(themeVideoUrls);
    }

    private static final List checkedUrls(ThemeVideoUrls themeVideoUrls) {
        URL urlLowRes;
        URL url;
        q a = x.a(themeVideoUrls.getLight().getUrl(), themeVideoUrls.getLight().getChecksum());
        VideoUrls dark = themeVideoUrls.getDark();
        q qVar = null;
        q a2 = (dark == null || (url = dark.getUrl()) == null) ? null : x.a(url, themeVideoUrls.getDark().getChecksum());
        URL urlLowRes2 = themeVideoUrls.getLight().getUrlLowRes();
        q a3 = urlLowRes2 != null ? x.a(urlLowRes2, themeVideoUrls.getLight().getChecksumLowRes()) : null;
        VideoUrls dark2 = themeVideoUrls.getDark();
        if (dark2 != null && (urlLowRes = dark2.getUrlLowRes()) != null) {
            qVar = x.a(urlLowRes, themeVideoUrls.getDark().getChecksumLowRes());
        }
        return v.s(a, a2, a3, qVar);
    }
}
