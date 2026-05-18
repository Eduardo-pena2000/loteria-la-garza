package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import com.revenuecat.purchases.ui.revenuecatui.utils.FontFamilyXmlParser;
import d1.u;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallResourceProvider implements ResourceProvider {
    public static final int $stable = 8;
    private final String applicationName;
    private final String packageName;
    private final Resources resources;

    public PaywallResourceProvider(String applicationName, String packageName, Resources resources) {
        t.g(applicationName, "applicationName");
        t.g(packageName, "packageName");
        t.g(resources, "resources");
        this.applicationName = applicationName;
        this.packageName = packageName;
        this.resources = resources;
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map getAssetFontPaths(java.util.List r10) {
        /*
            r9 = this;
            java.lang.String r0 = "names"
            kotlin.jvm.internal.t.g(r10, r0)
            android.content.res.Resources r0 = r9.resources
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = "fonts"
            java.lang.String[] r0 = r0.list(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L1a:
            boolean r2 = r10.hasNext()
            r3 = 0
            if (r2 == 0) goto L75
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            r4 = 2
            java.lang.String r5 = ".ttf"
            r6 = 0
            boolean r4 = Za.B.y(r2, r5, r6, r4, r3)
            if (r4 == 0) goto L33
            r4 = r2
            goto L42
        L33:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L42:
            if (r0 == 0) goto L68
            int r5 = r0.length
        L45:
            if (r6 >= r5) goto L53
            r7 = r0[r6]
            boolean r8 = kotlin.jvm.internal.t.c(r7, r4)
            if (r8 == 0) goto L50
            goto L54
        L50:
            int r6 = r6 + 1
            goto L45
        L53:
            r7 = r3
        L54:
            if (r7 == 0) goto L68
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fonts/"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            goto L69
        L68:
            r4 = r3
        L69:
            if (r4 == 0) goto L6f
            Ca.q r3 = Ca.x.a(r2, r4)
        L6f:
            if (r3 == 0) goto L1a
            r1.add(r3)
            goto L1a
        L75:
            java.util.Map r10 = Da.S.x(r1)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L80
            r3 = r10
        L80:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProvider.getAssetFontPaths(java.util.List):java.util.Map");
    }

    public AssetManager getAssetManager() {
        return this.resources.getAssets();
    }

    public DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        t.g(fontInfo, "fontInfo");
        Purchases.Companion companion = Purchases.Companion;
        if (companion.isConfigured()) {
            return companion.getSharedInstance().getCachedFontFamilyOrStartDownload(fontInfo);
        }
        Logger.INSTANCE.e("getCachedFontFileOrStartDownload called before Purchases is configured. Returning null.");
        return null;
    }

    public Locale getLocale() {
        Locale locale = this.resources.getConfiguration().getLocales().get(0);
        t.f(locale, "resources.configuration.locales.get(0)");
        return locale;
    }

    @SuppressLint({"DiscouragedApi"})
    public int getResourceIdentifier(String name, String type) {
        t.g(name, "name");
        t.g(type, "type");
        return this.resources.getIdentifier(name, type, this.packageName);
    }

    public String getString(int i, Object... formatArgs) {
        t.g(formatArgs, "formatArgs");
        String string = this.resources.getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        t.f(string, "resources.getString(resId, *formatArgs)");
        return string;
    }

    public u getXmlFontFamily(int i) {
        u uVar = null;
        try {
            XmlResourceParser xml = this.resources.getXml(i);
            t.f(xml, "try {\n            resour…    return null\n        }");
            try {
                uVar = FontFamilyXmlParser.INSTANCE.parse(xml);
            } finally {
                try {
                    xml.close();
                    return uVar;
                } catch (Throwable th) {
                }
            }
            xml.close();
            return uVar;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaywallResourceProvider(Context context) {
        t.g(context, "context");
        Context applicationContext = context.getApplicationContext();
        t.f(applicationContext, "context.applicationContext");
        String access$applicationName = PaywallResourceProviderKt.access$applicationName(applicationContext);
        String packageName = context.getPackageName();
        t.f(packageName, "context.packageName");
        Resources resources = context.getResources();
        t.f(resources, "context.resources");
        this(access$applicationName, packageName, resources);
    }
}
