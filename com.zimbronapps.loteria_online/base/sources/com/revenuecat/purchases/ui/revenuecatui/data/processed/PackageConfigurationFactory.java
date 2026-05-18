package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Ca.o;
import Ca.q;
import Ca.s;
import Ca.x;
import Da.D;
import Da.Q;
import Da.w;
import Wa.n;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.errors.PackageConfigurationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PackageConfigurationFactory {
    public static final int $stable = 0;
    public static final PackageConfigurationFactory INSTANCE = new PackageConfigurationFactory();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageConfigurationType.values().length];
            try {
                iArr[PackageConfigurationType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageConfigurationType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PackageConfigurationType.MULTITIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PackageConfigurationFactory() {
    }

    private final Map filterNotNullValues(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object makeMultiTierPackageConfiguration-yxL6bBk(com.revenuecat.purchases.paywalls.PaywallData r17, java.util.List r18, java.util.List r19, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.processed.PackageConfigurationFactory.makeMultiTierPackageConfiguration-yxL6bBk(com.revenuecat.purchases.paywalls.PaywallData, java.util.List, java.util.List, com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider, java.lang.String):java.lang.Object");
    }

    private final Object makeMultiplePackageConfiguration-yxL6bBk(List list, VariableDataProvider variableDataProvider, PaywallData paywallData, String str, String str2) {
        Object obj;
        q makePackageInfo = makePackageInfo(list, variableDataProvider, paywallData, str2);
        Locale locale = (Locale) makePackageInfo.a();
        List list2 = (List) makePackageInfo.b();
        TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) D.f0(list2);
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (t.c(((TemplateConfiguration.PackageInfo) obj).getRcPackage().getIdentifier(), str)) {
                break;
            }
        }
        TemplateConfiguration.PackageInfo packageInfo2 = (TemplateConfiguration.PackageInfo) obj;
        if (packageInfo2 == null) {
            packageInfo2 = packageInfo;
        }
        s.a aVar = s.b;
        return s.b(x.a(locale, new TemplateConfiguration.PackageConfiguration.Multiple(new TemplateConfiguration.PackageConfiguration.MultiPackage(packageInfo, packageInfo2, list2))));
    }

    private final q makePackageInfo(List list, VariableDataProvider variableDataProvider, PaywallData paywallData, String str) {
        Price mostExpensivePricePerMonth = mostExpensivePricePerMonth(list);
        q localizedConfiguration = paywallData.getLocalizedConfiguration();
        Locale locale = (Locale) localizedConfiguration.a();
        PaywallData.LocalizedConfiguration localizedConfiguration2 = (PaywallData.LocalizedConfiguration) localizedConfiguration.b();
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Package r12 = (Package) it.next();
            Double productDiscount = INSTANCE.productDiscount(StoreProduct.pricePerMonth$default(r12.getProduct(), (Locale) null, 1, (Object) null), mostExpensivePricePerMonth);
            arrayList.add(new TemplateConfiguration.PackageInfo(r12, ProcessedLocalizedConfiguration.Companion.create(variableDataProvider, new VariableProcessor.PackageContext(productDiscount, str != null ? paywallData.getZeroDecimalPlaceCountries().contains(str) : false), localizedConfiguration2, r12, locale), productDiscount));
        }
        return x.a(locale, arrayList);
    }

    private final Object makeSinglePackageConfiguration-BWLJW6A(List list, VariableDataProvider variableDataProvider, PaywallData paywallData, String str) {
        q makePackageInfo = makePackageInfo(list, variableDataProvider, paywallData, str);
        Locale locale = (Locale) makePackageInfo.a();
        TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) D.f0((List) makePackageInfo.b());
        s.a aVar = s.b;
        return s.b(x.a(locale, new TemplateConfiguration.PackageConfiguration.Single(packageInfo)));
    }

    private final Price mostExpensivePricePerMonth(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Price pricePerMonth$default = StoreProduct.pricePerMonth$default(((Package) it.next()).getProduct(), (Locale) null, 1, (Object) null);
            if (pricePerMonth$default != null) {
                arrayList.add(pricePerMonth$default);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                long amountMicros = ((Price) obj).getAmountMicros();
                do {
                    Object next = it2.next();
                    long amountMicros2 = ((Price) next).getAmountMicros();
                    if (amountMicros < amountMicros2) {
                        obj = next;
                        amountMicros = amountMicros2;
                    }
                } while (it2.hasNext());
            }
        }
        return (Price) obj;
    }

    private final Double productDiscount(Price price, Price price2) {
        if (price == null) {
            return null;
        }
        long amountMicros = price.getAmountMicros();
        if (price2 == null) {
            return null;
        }
        long amountMicros2 = price2.getAmountMicros();
        if (amountMicros >= amountMicros2) {
            return null;
        }
        return Double.valueOf((amountMicros2 - amountMicros) / amountMicros2);
    }

    private final List reprocessPackagesForTiers(List list, List list2, PaywallData.LocalizedConfiguration localizedConfiguration, VariableDataProvider variableDataProvider, Locale locale, String str, List list3) {
        ArrayList<Package> arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (t.c(((Package) next).getIdentifier(), str2)) {
                    obj = next;
                    break;
                }
            }
            Package r4 = (Package) obj;
            if (r4 != null) {
                arrayList.add(r4);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.y(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add((Package) it3.next());
        }
        Price mostExpensivePricePerMonth = mostExpensivePricePerMonth(arrayList2);
        ArrayList arrayList3 = new ArrayList(w.y(arrayList, 10));
        for (Package r3 : arrayList) {
            Double productDiscount = INSTANCE.productDiscount(StoreProduct.pricePerMonth$default(r3.getProduct(), (Locale) null, 1, (Object) null), mostExpensivePricePerMonth);
            arrayList3.add(new TemplateConfiguration.PackageInfo(r3, ProcessedLocalizedConfiguration.Companion.create(variableDataProvider, new VariableProcessor.PackageContext(productDiscount, str != null ? list3.contains(str) : false), localizedConfiguration, r3, locale), productDiscount));
        }
        return arrayList3;
    }

    public final Object createPackageConfiguration-bMdYcbs(VariableDataProvider variableDataProvider, List availablePackages, List packageIdsInConfig, String str, PackageConfigurationType configurationType, PaywallData paywallData, String str2) {
        t.g(variableDataProvider, "variableDataProvider");
        t.g(availablePackages, "availablePackages");
        t.g(packageIdsInConfig, "packageIdsInConfig");
        t.g(configurationType, "configurationType");
        t.g(paywallData, "paywallData");
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(w.y(availablePackages, 10)), 16));
        for (Object obj : availablePackages) {
            linkedHashMap.put(((Package) obj).getIdentifier(), obj);
        }
        List arrayList = new ArrayList();
        Iterator it = packageIdsInConfig.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Package r4 = (Package) linkedHashMap.get(str3);
            if (r4 == null) {
                Logger.INSTANCE.d("Package with id " + str3 + " not found. Ignoring.");
            }
            if (r4 != null) {
                arrayList.add(r4);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        List list = arrayList == null ? availablePackages : arrayList;
        if (list.isEmpty()) {
            s.a aVar = s.b;
            return s.b(Ca.t.a(new PackageConfigurationError("No packages found for ids " + packageIdsInConfig)));
        }
        int i = WhenMappings.$EnumSwitchMapping$0[configurationType.ordinal()];
        if (i == 1) {
            return makeSinglePackageConfiguration-BWLJW6A(list, variableDataProvider, paywallData, str2);
        }
        if (i == 2) {
            return makeMultiplePackageConfiguration-yxL6bBk(list, variableDataProvider, paywallData, str, str2);
        }
        if (i == 3) {
            return makeMultiTierPackageConfiguration-yxL6bBk(paywallData, packageIdsInConfig, availablePackages, variableDataProvider, str2);
        }
        throw new o();
    }
}
