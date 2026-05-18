package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Ca.q;
import Ca.s;
import Da.Q;
import Da.S;
import android.net.Uri;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TemplateConfigurationFactory {
    public static final int $stable = 0;
    public static final TemplateConfigurationFactory INSTANCE = new TemplateConfigurationFactory();

    private TemplateConfigurationFactory() {
    }

    private final Uri getUriFromImage(PaywallData paywallData, String str) {
        if (str != null) {
            return Uri.parse(paywallData.getAssetBaseURL().toString()).buildUpon().path(str).build();
        }
        return null;
    }

    public final Object create-hUnOzRk(VariableDataProvider variableDataProvider, PaywallMode mode, PaywallData paywallData, List availablePackages, PaywallTemplate template, String str) {
        LinkedHashMap h;
        t.g(variableDataProvider, "variableDataProvider");
        t.g(mode, "mode");
        t.g(paywallData, "paywallData");
        t.g(availablePackages, "availablePackages");
        t.g(template, "template");
        PaywallData.Configuration.Images images = paywallData.getConfig().getImages();
        TemplateConfiguration.Images images2 = new TemplateConfiguration.Images(getUriFromImage(paywallData, images.getIcon()), getUriFromImage(paywallData, images.getBackground()), getUriFromImage(paywallData, images.getHeader()));
        Map imagesByTier = paywallData.getConfig().getImagesByTier();
        if (imagesByTier != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(imagesByTier.size()));
            for (Map.Entry entry : imagesByTier.entrySet()) {
                Object key = entry.getKey();
                TemplateConfigurationFactory templateConfigurationFactory = INSTANCE;
                linkedHashMap.put(key, new TemplateConfiguration.Images(templateConfigurationFactory.getUriFromImage(paywallData, ((PaywallData.Configuration.Images) entry.getValue()).getIcon()), templateConfigurationFactory.getUriFromImage(paywallData, ((PaywallData.Configuration.Images) entry.getValue()).getBackground()), templateConfigurationFactory.getUriFromImage(paywallData, ((PaywallData.Configuration.Images) entry.getValue()).getHeader())));
            }
            h = linkedHashMap;
        } else {
            h = S.h();
        }
        Object obj = PackageConfigurationFactory.INSTANCE.createPackageConfiguration-bMdYcbs(variableDataProvider, availablePackages, paywallData.getConfig().getPackageIds(), paywallData.getConfig().getDefaultPackage(), template.getConfigurationType(), paywallData, str);
        Throwable e = s.e(obj);
        if (e != null) {
            return s.b(Ca.t.a(e));
        }
        q qVar = (q) obj;
        return s.b(new TemplateConfiguration(template, mode, (TemplateConfiguration.PackageConfiguration) qVar.b(), paywallData.getConfig(), images2, h, paywallData.getConfig().getColors(), (Locale) qVar.a()));
    }
}
