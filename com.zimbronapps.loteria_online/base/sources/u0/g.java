package U0;

import B0.d;
import U0.b;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final b.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C0.a aVar = new C0.a(xmlResourceParser, 0, 2, null);
        d.a a = C0.c.a(aVar, resources, theme, asAttributeSet);
        int i2 = 0;
        while (!C0.c.d(xmlResourceParser)) {
            i2 = C0.c.g(aVar, resources, asAttributeSet, theme, a, i2);
            xmlResourceParser.next();
        }
        return new b.a(a.f(), aVar.a() | i);
    }
}
