package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import Ca.o;
import Ca.q;
import Ca.x;
import Da.D;
import Da.Q;
import Da.S;
import Da.w;
import Wa.n;
import Za.E;
import android.content.res.AssetManager;
import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.DownloadedFont;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import d1.B;
import d1.H;
import d1.K;
import d1.L;
import d1.d;
import d1.p;
import d1.r;
import d1.u;
import d1.v;
import e1.c;
import e1.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class FontSpecKt {
    private static final c.a GoogleFontsProvider = new c.a("com.google.android.gms.fonts", "com.google.android.gms", R.array.com_google_android_gms_fonts_certs);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FontStyle.values().length];
            try {
                iArr[FontStyle.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FontStyle.ITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final FontSpec determineFontSpec(ResourceProvider resourceProvider, UiConfig.AppConfig.FontsConfig fontsConfig, Map map, Map map2) {
        FontSpec fontSpec;
        UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts android = fontsConfig.getAndroid();
        if (android instanceof UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts) {
            return new FontSpec.Google(android.getValue());
        }
        if (!(android instanceof UiConfig.AppConfig.FontsConfig.FontInfo.Name)) {
            throw new o();
        }
        UiConfig.AppConfig.FontsConfig.FontInfo.Name name = (UiConfig.AppConfig.FontsConfig.FontInfo.Name) android;
        FontSpec.Generic genericFontSpec = getGenericFontSpec(name);
        if (genericFontSpec != null) {
            return genericFontSpec;
        }
        if (name.getFamily() != null) {
            fontSpec = (FontSpec.Resource) map.get(name.getFamily());
            if (fontSpec == null) {
                fontSpec = (FontSpec) map2.get(name.getFamily());
            }
        } else {
            fontSpec = null;
        }
        if (fontSpec != null) {
            return fontSpec;
        }
        FontSpec.Downloaded downloadedFontSpec = getDownloadedFontSpec(resourceProvider, name);
        if (downloadedFontSpec != null) {
            return downloadedFontSpec;
        }
        FontSpec.System system = new FontSpec.System(name.getValue());
        Logger.INSTANCE.d("Could not find a font resource named `" + name.getValue() + "`. Assuming it's an OEM system font. If it isn't, make sure the font exists in the `res/font` folder. See for more info: https://developer.android.com/develop/ui/views/text-and-emoji/fonts-in-xml");
        return system;
    }

    public static final /* synthetic */ Map determineFontSpecs(Map map, ResourceProvider resourceProvider) {
        String family;
        t.g(map, "<this>");
        t.g(resourceProvider, "resourceProvider");
        Iterable Q0 = D.Q0(map.values());
        ArrayList<q> arrayList = new ArrayList();
        Iterator it = Q0.iterator();
        while (true) {
            q qVar = null;
            if (!it.hasNext()) {
                break;
            }
            UiConfig.AppConfig.FontsConfig.FontInfo.Name android = ((UiConfig.AppConfig.FontsConfig) it.next()).getAndroid();
            UiConfig.AppConfig.FontsConfig.FontInfo.Name name = android instanceof UiConfig.AppConfig.FontsConfig.FontInfo.Name ? android : null;
            if (name != null && (family = name.getFamily()) != null) {
                qVar = x.a(family, name);
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (q qVar2 : arrayList) {
            String str = (String) qVar2.a();
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add((UiConfig.AppConfig.FontsConfig.FontInfo.Name) qVar2.b());
        }
        ArrayList<q> arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            FontSpec.Resource fontSpecResource = toFontSpecResource((List) entry.getValue(), resourceProvider);
            q a = fontSpecResource != null ? x.a(str2, fontSpecResource) : null;
            if (a != null) {
                arrayList2.add(a);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(n.e(Q.e(w.y(arrayList2, 10)), 16));
        for (q qVar3 : arrayList2) {
            linkedHashMap2.put((String) qVar3.c(), (FontSpec.Resource) qVar3.d());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!linkedHashMap2.containsKey(entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList<q> arrayList3 = new ArrayList();
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str3 = (String) entry3.getKey();
            FontSpec.Asset fontSpecAsset = toFontSpecAsset((List) entry3.getValue(), resourceProvider);
            q a2 = fontSpecAsset != null ? x.a(str3, fontSpecAsset) : null;
            if (a2 != null) {
                arrayList3.add(a2);
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(n.e(Q.e(w.y(arrayList3, 10)), 16));
        for (q qVar4 : arrayList3) {
            linkedHashMap4.put((String) qVar4.c(), (FontSpec.Asset) qVar4.d());
        }
        Iterable Q02 = D.Q0(map.values());
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(n.e(Q.e(w.y(Q02, 10)), 16));
        for (Object obj2 : Q02) {
            linkedHashMap5.put(obj2, determineFontSpec(resourceProvider, (UiConfig.AppConfig.FontsConfig) obj2, linkedHashMap2, linkedHashMap4));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(Q.e(map.size()));
        for (Map.Entry entry4 : map.entrySet()) {
            linkedHashMap6.put(entry4.getKey(), (FontSpec) S.i(linkedHashMap5, (UiConfig.AppConfig.FontsConfig) entry4.getValue()));
        }
        return linkedHashMap6;
    }

    private static final FontSpec.Downloaded getDownloadedFontSpec(ResourceProvider resourceProvider, UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        DownloadedFontFamily cachedFontFamilyOrStartDownload = resourceProvider.getCachedFontFamilyOrStartDownload(name);
        if (cachedFontFamilyOrStartDownload != null) {
            return new FontSpec.Downloaded(cachedFontFamilyOrStartDownload);
        }
        return null;
    }

    public static final /* synthetic */ Result getFontSpec-pDyximM(Map getFontSpec, String alias) {
        t.g(getFontSpec, "$this$getFontSpec");
        t.g(alias, "alias");
        FontSpec fontSpec = (FontSpec) getFontSpec.get(FontAlias.box-impl(alias));
        return fontSpec != null ? new Result.Success(fontSpec) : new Result.Error(new PaywallValidationError.MissingFontAlias(alias, null));
    }

    private static final FontSpec.Generic getGenericFontSpec(UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        String value = name.getValue();
        u.a aVar = u.b;
        if (t.c(value, aVar.d().h())) {
            return FontSpec.Generic.SansSerif.INSTANCE;
        }
        if (t.c(value, aVar.e().h())) {
            return FontSpec.Generic.Serif.INSTANCE;
        }
        if (t.c(value, aVar.c().h())) {
            return FontSpec.Generic.Monospace.INSTANCE;
        }
        return null;
    }

    public static final /* synthetic */ Result recoverFromFontAliasError(Result result) {
        t.g(result, "<this>");
        if (result instanceof Result.Success) {
            return result;
        }
        if (!(result instanceof Result.Error)) {
            throw new o();
        }
        PaywallValidationError paywallValidationError = (PaywallValidationError) ((Result.Error) result).getValue();
        boolean z = paywallValidationError instanceof PaywallValidationError.MissingFontAlias;
        if (z && E.h0(((PaywallValidationError.MissingFontAlias) paywallValidationError).getAlias-BejUyPs())) {
            return new Result.Success(null);
        }
        if (!z) {
            return new Result.Error(paywallValidationError);
        }
        Logger.INSTANCE.w("Font named '" + FontAlias.toString-impl(((PaywallValidationError.MissingFontAlias) paywallValidationError).getAlias-BejUyPs()) + "' was not found in the font config. Try re-adding it in the Paywall editor.");
        return new Result.Success(null);
    }

    public static final /* synthetic */ u resolve-RetOiIg(FontSpec resolve, L weight, int i) {
        t.g(resolve, "$this$resolve");
        t.g(weight, "weight");
        if (resolve instanceof FontSpec.Resource) {
            return ((FontSpec.Resource) resolve).getFontFamily();
        }
        if (resolve instanceof FontSpec.Asset) {
            return ((FontSpec.Asset) resolve).getFontFamily();
        }
        if (resolve instanceof FontSpec.Google) {
            return v.c(new d1.t[]{e.a(new c(((FontSpec.Google) resolve).getName(), false, 2, (k) null), GoogleFontsProvider, weight, i)});
        }
        if (resolve instanceof FontSpec.Generic) {
            if (t.c(resolve, FontSpec.Generic.SansSerif.INSTANCE)) {
                return u.b.d();
            }
            if (t.c(resolve, FontSpec.Generic.Serif.INSTANCE)) {
                return u.b.e();
            }
            if (t.c(resolve, FontSpec.Generic.Monospace.INSTANCE)) {
                return u.b.c();
            }
            throw new o();
        }
        if (!(resolve instanceof FontSpec.Downloaded)) {
            if (resolve instanceof FontSpec.System) {
                return v.c(new d1.t[]{r.b(p.a(((FontSpec.System) resolve).getName()), weight, i, (K.d) null, 8, (Object) null)});
            }
            throw new o();
        }
        List<DownloadedFont> fonts = ((FontSpec.Downloaded) resolve).getDownloadedFontFamily().getFonts();
        ArrayList arrayList = new ArrayList(w.y(fonts, 10));
        for (DownloadedFont downloadedFont : fonts) {
            arrayList.add(d.b(new File(downloadedFont.getFile().getPath()), new L(downloadedFont.getWeight()), toComposeFontStyle(downloadedFont.getStyle()), (K.d) null, 8, (Object) null));
        }
        return v.b(arrayList);
    }

    private static final int toComposeFontStyle(FontStyle fontStyle) {
        int i = WhenMappings.$EnumSwitchMapping$0[fontStyle.ordinal()];
        if (i == 1) {
            return H.b.b();
        }
        if (i == 2) {
            return H.b.a();
        }
        throw new o();
    }

    private static final List toFontResourceIdAndData(List list, ResourceProvider resourceProvider) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UiConfig.AppConfig.FontsConfig.FontInfo.Name name = (UiConfig.AppConfig.FontsConfig.FontInfo.Name) it.next();
            if (!linkedHashSet.contains(name.getValue())) {
                Number valueOf = Integer.valueOf(resourceProvider.getResourceIdentifier(name.getValue(), "font"));
                if (valueOf.intValue() == 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    linkedHashSet.add(name.getValue());
                    Integer valueOf2 = Integer.valueOf(valueOf.intValue());
                    Integer weight = name.getWeight();
                    FontStyle style = name.getStyle();
                    r4 = new Ca.w(valueOf2, weight, style != null ? H.c(toComposeFontStyle(style)) : null);
                }
            }
            if (r4 != null) {
                arrayList.add(r4);
            }
        }
        return arrayList;
    }

    private static final FontSpec.Asset toFontSpecAsset(List list, ResourceProvider resourceProvider) {
        d1.t d;
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiConfig.AppConfig.FontsConfig.FontInfo.Name) it.next()).getValue());
        }
        Map assetFontPaths = resourceProvider.getAssetFontPaths(arrayList);
        AssetManager assetManager = resourceProvider.getAssetManager();
        if (assetFontPaths == null || assetManager == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            UiConfig.AppConfig.FontsConfig.FontInfo.Name name = (UiConfig.AppConfig.FontsConfig.FontInfo.Name) it2.next();
            String str = (String) assetFontPaths.get(name.getValue());
            if (str == null) {
                d = null;
            } else {
                Integer weight = name.getWeight();
                L l = weight != null ? new L(weight.intValue()) : L.b.g();
                FontStyle style = name.getStyle();
                d = d.d(str, assetManager, l, style != null ? toComposeFontStyle(style) : H.b.b(), (K.d) null, 16, (Object) null);
            }
            if (d != null) {
                arrayList2.add(d);
            }
        }
        return new FontSpec.Asset(v.b(arrayList2));
    }

    private static final FontSpec.Resource toFontSpecResource(List list, ResourceProvider resourceProvider) {
        u xmlFontFamily;
        List<Ca.w> fontResourceIdAndData = toFontResourceIdAndData(list, resourceProvider);
        if (fontResourceIdAndData.isEmpty()) {
            return null;
        }
        if (fontResourceIdAndData.size() == 1 && (xmlFontFamily = resourceProvider.getXmlFontFamily(((Number) ((Ca.w) D.f0(fontResourceIdAndData)).d()).intValue())) != null) {
            return new FontSpec.Resource(xmlFontFamily);
        }
        ArrayList arrayList = new ArrayList(w.y(fontResourceIdAndData, 10));
        for (Ca.w wVar : fontResourceIdAndData) {
            int intValue = ((Number) wVar.d()).intValue();
            Integer num = (Integer) wVar.e();
            L l = num != null ? new L(num.intValue()) : L.b.g();
            H h = (H) wVar.f();
            arrayList.add(B.b(intValue, l, h != null ? h.i() : H.b.b(), 0, 8, (Object) null));
        }
        return new FontSpec.Resource(v.b(arrayList));
    }
}
