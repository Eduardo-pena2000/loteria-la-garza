package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.content.res.AssetManager;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import d1.u;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ResourceProvider {
    public static final String ASSETS_FONTS_DIR = "fonts";
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ASSETS_FONTS_DIR = "fonts";

        private Companion() {
        }
    }

    String getApplicationName();

    Map getAssetFontPaths(List list);

    AssetManager getAssetManager();

    DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name name);

    Locale getLocale();

    int getResourceIdentifier(String str, String str2);

    String getString(int i, Object... objArr);

    u getXmlFontFamily(int i);
}
