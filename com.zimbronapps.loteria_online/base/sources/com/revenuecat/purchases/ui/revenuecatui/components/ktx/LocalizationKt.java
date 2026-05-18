package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Ca.o;
import Ca.q;
import Ca.x;
import Da.Q;
import Da.S;
import Da.u;
import Da.v;
import Da.w;
import Za.B;
import Za.E;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import h1.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LocalizationKt {
    private static final Map scriptByRegion = S.l(x.a("CN", "Hans"), x.a("SG", "Hans"), x.a("MY", "Hans"), x.a("TW", "Hant"), x.a("HK", "Hant"), x.a("MO", "Hant"));

    public static final /* synthetic */ Object getBestMatch-64pKzr8(Map getBestMatch, String localeId) {
        t.g(getBestMatch, "$this$getBestMatch");
        t.g(localeId, "localeId");
        String str = getBestMatch-64pKzr8(getBestMatch.keySet(), localeId);
        if (str != null) {
            return getBestMatch.get(LocaleId.box-impl(str));
        }
        return null;
    }

    private static final List getFallbackLanguages(Locale locale) {
        String language = locale.getLanguage();
        return t.c(language, "nb") ? u.e(new Locale("no", locale.getCountry(), locale.getVariant())) : t.c(language, "nn") ? u.e(new Locale("no", locale.getCountry(), locale.getVariant())) : v.n();
    }

    public static final /* synthetic */ Result image-7v81vok(NonEmptyMap image, String key) {
        t.g(image, "$this$image");
        t.g(key, "key");
        Object obj = image.get(LocalizationKey.box-impl(key));
        ThemeImageUrls themeImageUrls = obj instanceof LocalizationData.Image ? ((LocalizationData.Image) obj).unbox-impl() : null;
        return themeImageUrls != null ? new Result.Success(themeImageUrls) : new Result.Error(new PaywallValidationError.MissingImageLocalization(key, null, 2, null));
    }

    public static final /* synthetic */ Result imageForAllLocales-7v81vok(NonEmptyMap imageForAllLocales, String key) {
        t.g(imageForAllLocales, "$this$imageForAllLocales");
        t.g(key, "key");
        Map access$getAll$p = NonEmptyMap.access$getAll$p(imageForAllLocales);
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(access$getAll$p.size()));
        for (Map.Entry entry : access$getAll$p.entrySet()) {
            Object key2 = entry.getKey();
            String str = ((LocaleId) entry.getKey()).unbox-impl();
            Result result = image-7v81vok((NonEmptyMap) entry.getValue(), key);
            if (!(result instanceof Result.Success)) {
                if (!(result instanceof Result.Error)) {
                    throw new o();
                }
                result = new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.MissingImageLocalization(key, str, null), new PaywallValidationError.MissingImageLocalization[0]));
            }
            linkedHashMap.put(key2, result);
        }
        NonEmptyMap nonEmptyMapOf = NonEmptyMapKt.nonEmptyMapOf(x.a(imageForAllLocales.getEntry().getKey(), S.i(linkedHashMap, imageForAllLocales.getEntry().getKey())), (Map) linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Result result2 = (Result) nonEmptyMapOf.getEntry().getValue();
        if (result2 instanceof Result.Success) {
            result2 = new Result.Success((ThemeImageUrls) ((Result.Success) result2).getValue());
        } else if (!(result2 instanceof Result.Error)) {
            throw new o();
        }
        if (result2 instanceof Result.Success) {
            result2 = new Result.Success(x.a(nonEmptyMapOf.getEntry().getKey(), ((Result.Success) result2).getValue()));
        } else if (!(result2 instanceof Result.Error)) {
            throw new o();
        }
        if (!(result2 instanceof Result.Success) && (result2 instanceof Result.Error)) {
            arrayList.addAll((NonEmptyList) ((Result.Error) result2).getValue());
        }
        for (Map.Entry entry2 : nonEmptyMapOf.entrySet()) {
            Object key3 = entry2.getKey();
            Result result3 = (Result) entry2.getValue();
            if (result3 instanceof Result.Success) {
                if (arrayList.isEmpty() && !t.c(key3, nonEmptyMapOf.getEntry().getKey())) {
                    linkedHashMap2.put(key3, (ThemeImageUrls) ((Result.Success) result3).getValue());
                }
            } else if (result3 instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) result3).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(NonEmptyMapKt.nonEmptyMapOf((q) ResultKt.getOrThrow(result2), (Map) linkedHashMap2));
    }

    public static final /* synthetic */ Result string-7v81vok(NonEmptyMap string, String key) {
        t.g(string, "$this$string");
        t.g(key, "key");
        Object obj = string.get(LocalizationKey.box-impl(key));
        String str = obj instanceof LocalizationData.Text ? ((LocalizationData.Text) obj).unbox-impl() : null;
        return str != null ? new Result.Success(str) : new Result.Error(new PaywallValidationError.MissingStringLocalization(key, null, 2, null));
    }

    public static final /* synthetic */ Result stringForAllLocales-7v81vok(NonEmptyMap stringForAllLocales, String key) {
        t.g(stringForAllLocales, "$this$stringForAllLocales");
        t.g(key, "key");
        Map access$getAll$p = NonEmptyMap.access$getAll$p(stringForAllLocales);
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(access$getAll$p.size()));
        for (Map.Entry entry : access$getAll$p.entrySet()) {
            Object key2 = entry.getKey();
            String str = ((LocaleId) entry.getKey()).unbox-impl();
            Result result = string-7v81vok((NonEmptyMap) entry.getValue(), key);
            if (!(result instanceof Result.Success)) {
                if (!(result instanceof Result.Error)) {
                    throw new o();
                }
                result = new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.MissingStringLocalization(key, str, null), new PaywallValidationError.MissingStringLocalization[0]));
            }
            linkedHashMap.put(key2, result);
        }
        NonEmptyMap nonEmptyMapOf = NonEmptyMapKt.nonEmptyMapOf(x.a(stringForAllLocales.getEntry().getKey(), S.i(linkedHashMap, stringForAllLocales.getEntry().getKey())), (Map) linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Result result2 = (Result) nonEmptyMapOf.getEntry().getValue();
        if (result2 instanceof Result.Success) {
            result2 = new Result.Success((String) ((Result.Success) result2).getValue());
        } else if (!(result2 instanceof Result.Error)) {
            throw new o();
        }
        if (result2 instanceof Result.Success) {
            result2 = new Result.Success(x.a(nonEmptyMapOf.getEntry().getKey(), ((Result.Success) result2).getValue()));
        } else if (!(result2 instanceof Result.Error)) {
            throw new o();
        }
        if (!(result2 instanceof Result.Success) && (result2 instanceof Result.Error)) {
            arrayList.addAll((NonEmptyList) ((Result.Error) result2).getValue());
        }
        for (Map.Entry entry2 : nonEmptyMapOf.entrySet()) {
            Object key3 = entry2.getKey();
            Result result3 = (Result) entry2.getValue();
            if (result3 instanceof Result.Success) {
                if (arrayList.isEmpty() && !t.c(key3, nonEmptyMapOf.getEntry().getKey())) {
                    linkedHashMap2.put(key3, (String) ((Result.Success) result3).getValue());
                }
            } else if (result3 instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) result3).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(NonEmptyMapKt.nonEmptyMapOf((q) ResultKt.getOrThrow(result2), (Map) linkedHashMap2));
    }

    public static final /* synthetic */ d toComposeLocale(Locale locale) {
        t.g(locale, "<this>");
        String languageTag = locale.toLanguageTag();
        t.f(languageTag, "toLanguageTag()");
        return new d(languageTag);
    }

    public static final /* synthetic */ d toComposeLocale-_KYeFs0(String toComposeLocale) {
        t.g(toComposeLocale, "$this$toComposeLocale");
        return new d(B.G(toComposeLocale, '_', '-', false, 4, null));
    }

    public static final /* synthetic */ Locale toJavaLocale(d dVar) {
        t.g(dVar, "<this>");
        Locale forLanguageTag = Locale.forLanguageTag(dVar.c());
        t.f(forLanguageTag, "forLanguageTag(toLanguageTag())");
        return forLanguageTag;
    }

    public static final /* synthetic */ Locale toJavaLocale-_KYeFs0(String toJavaLocale) {
        t.g(toJavaLocale, "$this$toJavaLocale");
        Locale forLanguageTag = Locale.forLanguageTag(B.G(toJavaLocale, '_', '-', false, 4, null));
        t.f(forLanguageTag, "forLanguageTag(value.replace('_', '-'))");
        return forLanguageTag;
    }

    public static final /* synthetic */ String toLocaleId(Locale locale) {
        t.g(locale, "<this>");
        String languageTag = locale.toLanguageTag();
        t.f(languageTag, "toLanguageTag()");
        return LocaleId.constructor-impl(B.G(languageTag, '-', '_', false, 4, null));
    }

    public static final /* synthetic */ Result video-7v81vok(NonEmptyMap video, String key) {
        t.g(video, "$this$video");
        t.g(key, "key");
        Object obj = video.get(LocalizationKey.box-impl(key));
        ThemeVideoUrls themeVideoUrls = obj instanceof LocalizationData.Video ? ((LocalizationData.Video) obj).unbox-impl() : null;
        return themeVideoUrls != null ? new Result.Success(themeVideoUrls) : new Result.Error(new PaywallValidationError.MissingVideoLocalization(key, null, 2, null));
    }

    public static final /* synthetic */ Result videoForAllLocales-7v81vok(NonEmptyMap videoForAllLocales, String key) {
        t.g(videoForAllLocales, "$this$videoForAllLocales");
        t.g(key, "key");
        Map access$getAll$p = NonEmptyMap.access$getAll$p(videoForAllLocales);
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(access$getAll$p.size()));
        for (Map.Entry entry : access$getAll$p.entrySet()) {
            Object key2 = entry.getKey();
            String str = ((LocaleId) entry.getKey()).unbox-impl();
            Result result = video-7v81vok((NonEmptyMap) entry.getValue(), key);
            if (!(result instanceof Result.Success)) {
                if (!(result instanceof Result.Error)) {
                    throw new o();
                }
                result = new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.MissingVideoLocalization(key, str, null), new PaywallValidationError.MissingVideoLocalization[0]));
            }
            linkedHashMap.put(key2, result);
        }
        NonEmptyMap nonEmptyMapOf = NonEmptyMapKt.nonEmptyMapOf(x.a(videoForAllLocales.getEntry().getKey(), S.i(linkedHashMap, videoForAllLocales.getEntry().getKey())), (Map) linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Result result2 = (Result) nonEmptyMapOf.getEntry().getValue();
        if (result2 instanceof Result.Success) {
            result2 = new Result.Success((ThemeVideoUrls) ((Result.Success) result2).getValue());
        } else if (!(result2 instanceof Result.Error)) {
            throw new o();
        }
        if (result2 instanceof Result.Success) {
            result2 = new Result.Success(x.a(nonEmptyMapOf.getEntry().getKey(), ((Result.Success) result2).getValue()));
        } else if (!(result2 instanceof Result.Error)) {
            throw new o();
        }
        if (!(result2 instanceof Result.Success) && (result2 instanceof Result.Error)) {
            arrayList.addAll((NonEmptyList) ((Result.Error) result2).getValue());
        }
        for (Map.Entry entry2 : nonEmptyMapOf.entrySet()) {
            Object key3 = entry2.getKey();
            Result result3 = (Result) entry2.getValue();
            if (result3 instanceof Result.Success) {
                if (arrayList.isEmpty() && !t.c(key3, nonEmptyMapOf.getEntry().getKey())) {
                    linkedHashMap2.put(key3, (ThemeVideoUrls) ((Result.Success) result3).getValue());
                }
            } else if (result3 instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) result3).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(NonEmptyMapKt.nonEmptyMapOf((q) ResultKt.getOrThrow(result2), (Map) linkedHashMap2));
    }

    private static final List withFallbackLanguages-_KYeFs0(String str) {
        Locale locale = toJavaLocale-_KYeFs0(str);
        List fallbackLanguages = getFallbackLanguages(locale);
        if (fallbackLanguages.isEmpty()) {
            return u.e(locale);
        }
        List c = u.c();
        c.add(locale);
        c.addAll(fallbackLanguages);
        return u.a(c);
    }

    public static final /* synthetic */ String getBestMatch-64pKzr8(Set getBestMatch, String localeId) {
        LocaleId localeId2;
        String str;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        t.g(getBestMatch, "$this$getBestMatch");
        t.g(localeId, "localeId");
        if (getBestMatch.contains(LocaleId.box-impl(localeId))) {
            return localeId;
        }
        Iterator it = withFallbackLanguages-_KYeFs0(localeId).iterator();
        while (true) {
            if (!it.hasNext()) {
                localeId2 = null;
                break;
            }
            Locale locale = (Locale) it.next();
            String language = locale.getLanguage();
            String country = locale.getCountry();
            String it2 = locale.getScript();
            t.f(it2, "it");
            if (E.h0(it2)) {
                it2 = null;
            }
            if (it2 == null) {
                it2 = (String) scriptByRegion.get(country);
            }
            t.f(language, "language");
            String str3 = LocaleId.constructor-impl(language);
            if (it2 != null) {
                str = LocaleId.constructor-impl(language + '_' + it2);
            } else {
                str = null;
            }
            if (it2 != null) {
                str2 = LocaleId.constructor-impl(language + '_' + it2 + '_' + country);
            } else {
                str2 = null;
            }
            String localeId3 = toLocaleId(locale);
            List c = u.c();
            c.add(LocaleId.box-impl(localeId3));
            if (str2 != null) {
                c.add(LocaleId.box-impl(str2));
            }
            if (str != null) {
                c.add(LocaleId.box-impl(str));
            }
            c.add(LocaleId.box-impl(str3));
            Iterator it3 = u.a(c).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (getBestMatch.contains(LocaleId.box-impl(((LocaleId) obj).unbox-impl()))) {
                    break;
                }
            }
            LocaleId localeId4 = (LocaleId) obj;
            String str4 = localeId4 != null ? localeId4.unbox-impl() : null;
            if (str4 == null) {
                Iterable iterable = (Iterable) getBestMatch;
                ArrayList arrayList = new ArrayList(w.y(iterable, 10));
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    arrayList.add(toJavaLocale-_KYeFs0(((LocaleId) it4.next()).unbox-impl()));
                }
                Iterator it5 = arrayList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it5.next();
                    Locale locale2 = (Locale) obj2;
                    if (t.c(locale2.getLanguage(), language) && t.c(locale2.getScript(), it2)) {
                        break;
                    }
                }
                Locale locale3 = (Locale) obj2;
                if (locale3 != null) {
                    str4 = toLocaleId(locale3);
                } else {
                    Iterator it6 = arrayList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it6.next();
                        if (t.c(((Locale) obj3).getLanguage(), language)) {
                            break;
                        }
                    }
                    Locale locale4 = (Locale) obj3;
                    str4 = locale4 != null ? toLocaleId(locale4) : null;
                }
            }
            localeId2 = str4 != null ? LocaleId.box-impl(str4) : null;
            if (localeId2 != null) {
                break;
            }
        }
        if (localeId2 != null) {
            return localeId2.unbox-impl();
        }
        return null;
    }

    public static final /* synthetic */ String toLocaleId(d dVar) {
        t.g(dVar, "<this>");
        return LocaleId.constructor-impl(B.G(dVar.c(), '-', '_', false, 4, null));
    }
}
