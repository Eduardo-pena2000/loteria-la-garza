package com.revenuecat.purchases.ui.revenuecatui.data.testdata;

import Da.Q;
import Da.S;
import Da.v;
import Da.w;
import Wa.n;
import Za.B;
import android.content.res.AssetManager;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import d1.u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MockResourceProvider implements ResourceProvider {
    public static final int $stable = 8;
    private final List assetPaths;
    private final Map downloadedFilesByUrl;
    private final Map fontFamiliesByXmlResourceId;
    private final AssetManager mockAssetManager;
    private final Map resourceIds;

    public MockResourceProvider() {
        this(null, null, null, null, null, 31, null);
    }

    public String getApplicationName() {
        return "Mock Paywall";
    }

    public Map getAssetFontPaths(List names) {
        t.g(names, "names");
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(w.y(names, 10)), 16));
        for (Object obj : names) {
            String str = (String) obj;
            if (!B.y(str, ".ttf", false, 2, null)) {
                str = str + ".ttf";
            }
            linkedHashMap.put(obj, "fonts/" + str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (this.assetPaths.contains(entry.getValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public AssetManager getAssetManager() {
        return this.mockAssetManager;
    }

    public DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        t.g(fontInfo, "fontInfo");
        return (DownloadedFontFamily) this.downloadedFilesByUrl.get(fontInfo.getUrl());
    }

    public Locale getLocale() {
        Locale locale = Locale.getDefault();
        t.f(locale, "getDefault()");
        return locale;
    }

    public int getResourceIdentifier(String name, String type) {
        Integer num;
        t.g(name, "name");
        t.g(type, "type");
        Map map = (Map) this.resourceIds.get(type);
        if (map == null || (num = (Integer) map.get(name)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public String getString(int i, Object... formatArgs) {
        t.g(formatArgs, "formatArgs");
        if (i == R.string.restore_purchases) {
            return "Restore purchases";
        }
        if (i == R.string.annual) {
            return "Annual";
        }
        if (i == R.string.semester) {
            return "6 month";
        }
        if (i == R.string.quarter) {
            return "3 month";
        }
        if (i == R.string.bimonthly) {
            return "2 month";
        }
        if (i == R.string.monthly) {
            return "Monthly";
        }
        if (i == R.string.weekly) {
            return "Weekly";
        }
        if (i == R.string.lifetime) {
            return "Lifetime";
        }
        if (i == R.string.continue_cta) {
            return "Continue";
        }
        if (i == R.string.default_offer_details_with_intro_offer) {
            return "Start your {{ sub_offer_duration }} trial, then {{ total_price_and_per_month }}.";
        }
        if (i == R.string.package_discount) {
            return formatArgs[0] + "% off";
        }
        throw new IllegalStateException(("Unknown string resource " + i).toString());
    }

    public u getXmlFontFamily(int i) {
        return (u) this.fontFamiliesByXmlResourceId.get(Integer.valueOf(i));
    }

    public MockResourceProvider(Map resourceIds, List assetPaths, Map downloadedFilesByUrl, Map fontFamiliesByXmlResourceId, AssetManager assetManager) {
        t.g(resourceIds, "resourceIds");
        t.g(assetPaths, "assetPaths");
        t.g(downloadedFilesByUrl, "downloadedFilesByUrl");
        t.g(fontFamiliesByXmlResourceId, "fontFamiliesByXmlResourceId");
        this.resourceIds = resourceIds;
        this.assetPaths = assetPaths;
        this.downloadedFilesByUrl = downloadedFilesByUrl;
        this.fontFamiliesByXmlResourceId = fontFamiliesByXmlResourceId;
        this.mockAssetManager = assetManager;
    }

    public /* synthetic */ MockResourceProvider(Map map, List list, Map map2, Map map3, AssetManager assetManager, int i, k kVar) {
        this((i & 1) != 0 ? S.h() : map, (i & 2) != 0 ? v.n() : list, (i & 4) != 0 ? S.h() : map2, (i & 8) != 0 ? S.h() : map3, (i & 16) != 0 ? null : assetManager);
    }
}
