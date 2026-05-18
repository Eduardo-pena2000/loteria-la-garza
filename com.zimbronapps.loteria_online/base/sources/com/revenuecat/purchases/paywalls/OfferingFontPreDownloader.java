package com.revenuecat.purchases.paywalls;

import Da.Y;
import Da.v;
import Da.w;
import Za.B;
import android.annotation.SuppressLint;
import android.content.Context;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfoKt;
import com.revenuecat.purchases.utils.Result;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingFontPreDownloader {
    private final String assetsFontsDir;
    private final Context context;
    private final FontLoader fontLoader;
    private final Set genericFonts;

    public OfferingFontPreDownloader(Context context, FontLoader fontLoader) {
        t.g(context, "context");
        t.g(fontLoader, "fontLoader");
        this.context = context;
        this.fontLoader = fontLoader;
        this.assetsFontsDir = "fonts";
        this.genericFonts = Y.e(new String[]{"sans-serif", "serif", "monospace"});
    }

    private final String getAssetFontPath(Context context, String str) {
        String str2;
        int i = 0;
        if (!B.y(str, ".ttf", false, 2, (Object) null)) {
            str = str + ".ttf";
        }
        String[] list = context.getResources().getAssets().list(this.assetsFontsDir);
        if (list == null) {
            return null;
        }
        int length = list.length;
        while (true) {
            if (i >= length) {
                str2 = null;
                break;
            }
            str2 = list[i];
            if (t.c(str2, str)) {
                break;
            }
            i++;
        }
        if (str2 == null) {
            return null;
        }
        return this.assetsFontsDir + '/' + str2;
    }

    @SuppressLint({"DiscouragedApi"})
    private final int getResourceIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    private final boolean isBundled(UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        if (name.getValue().length() == 0) {
            return false;
        }
        return (!this.genericFonts.contains(name.getValue()) && getResourceIdentifier(this.context, name.getValue(), "font") == 0 && getAssetFontPath(this.context, name.getValue()) == null) ? false : true;
    }

    public final void preDownloadOfferingFontsIfNeeded(Offerings offerings) {
        Collection collection;
        UiConfig uiConfig;
        UiConfig.AppConfig app;
        Map fonts;
        t.g(offerings, "offerings");
        Iterator it = offerings.getAll().values().iterator();
        do {
            collection = null;
            if (!it.hasNext()) {
                break;
            }
            Offering.PaywallComponents paywallComponents = ((Offering) it.next()).getPaywallComponents();
            if (paywallComponents != null && (uiConfig = paywallComponents.getUiConfig()) != null && (app = uiConfig.getApp()) != null && (fonts = app.getFonts()) != null) {
                collection = fonts.values();
            }
        } while (collection == null);
        if (collection == null) {
            collection = v.n();
        }
        Iterable iterable = (Iterable) collection;
        ArrayList arrayList = new ArrayList(w.y(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(((UiConfig.AppConfig.FontsConfig) it2.next()).getAndroid());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof UiConfig.AppConfig.FontsConfig.FontInfo.Name) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            UiConfig.AppConfig.FontsConfig.FontInfo.Name name = (UiConfig.AppConfig.FontsConfig.FontInfo.Name) obj2;
            if ((DownloadableFontInfoKt.toDownloadableFontInfo(name) instanceof Result.Success) && !isBundled(name)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            UiConfig.AppConfig.FontsConfig.FontInfo.Name name2 = (UiConfig.AppConfig.FontsConfig.FontInfo.Name) obj3;
            try {
                new URL(name2.getUrl());
                arrayList4.add(obj3);
            } catch (MalformedURLException e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Malformed URL for font: " + name2.getValue() + ". Skipping download.", e);
            }
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            this.fontLoader.getCachedFontFamilyOrStartDownload((UiConfig.AppConfig.FontsConfig.FontInfo.Name) it3.next());
        }
    }
}
