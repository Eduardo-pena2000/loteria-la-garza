package com.revenuecat.purchases.ui.revenuecatui.utils;

import Da.w;
import android.content.res.XmlResourceParser;
import d1.B;
import d1.H;
import d1.L;
import d1.u;
import d1.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FontFamilyXmlParser {
    public static final int $stable = 0;
    private static final String ANDROID_NAMESPACE = "http://schemas.android.com/apk/res/android";
    private static final String APP_NAMESPACE = "http://schemas.android.com/apk/res-auto";
    private static final int DEFAULT_FONT_WEIGHT = 400;
    public static final FontFamilyXmlParser INSTANCE = new FontFamilyXmlParser();
    private static final int UNRECOGNIZED_VALUE = -1;

    private FontFamilyXmlParser() {
    }

    private final int getFontResourceId(XmlResourceParser xmlResourceParser) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "font", -1);
        return attributeResourceValue == -1 ? xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "font", -1) : attributeResourceValue;
    }

    private final int getFontStyle-MIvY41s(XmlResourceParser xmlResourceParser) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res-auto", "fontStyle");
        if (attributeValue == null) {
            attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fontStyle");
        }
        return t.c(attributeValue, "italic") ? H.b.a() : H.b.b();
    }

    private final int getFontWeight(XmlResourceParser xmlResourceParser) {
        int attributeIntValue = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "fontWeight", -1);
        if (attributeIntValue == -1) {
            attributeIntValue = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res/android", "fontWeight", 400);
        }
        if (attributeIntValue == -1) {
            return 400;
        }
        return attributeIntValue;
    }

    private final ParsedFont parseFontData(XmlResourceParser xmlResourceParser) {
        int fontResourceId = getFontResourceId(xmlResourceParser);
        if (fontResourceId == -1) {
            return null;
        }
        return new ParsedFont(fontResourceId, getFontWeight(xmlResourceParser), getFontStyle-MIvY41s(xmlResourceParser), null);
    }

    public final u parse(XmlResourceParser parser) {
        t.g(parser, "parser");
        List<ParsedFont> parseXmlData$revenuecatui_defaultsBc8Release = parseXmlData$revenuecatui_defaultsBc8Release(parser);
        if (parseXmlData$revenuecatui_defaultsBc8Release.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(w.y(parseXmlData$revenuecatui_defaultsBc8Release, 10));
        for (ParsedFont parsedFont : parseXmlData$revenuecatui_defaultsBc8Release) {
            int component1 = parsedFont.component1();
            int component2 = parsedFont.component2();
            arrayList.add(B.b(component1, new L(component2), parsedFont.component3-_-LCdwA(), 0, 8, (Object) null));
        }
        return v.b(arrayList);
    }

    public final List parseXmlData$revenuecatui_defaultsBc8Release(XmlResourceParser parser) {
        ParsedFont parseFontData;
        t.g(parser, "parser");
        ArrayList arrayList = new ArrayList();
        int eventType = parser.getEventType();
        while (eventType != 1) {
            if (eventType == 2 && t.c(parser.getName(), "font") && (parseFontData = parseFontData(parser)) != null) {
                arrayList.add(parseFontData);
            }
            eventType = parser.next();
        }
        return arrayList;
    }
}
