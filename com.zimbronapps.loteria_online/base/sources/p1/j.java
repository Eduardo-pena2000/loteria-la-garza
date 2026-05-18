package P1;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public static final j b = a(new Locale[0]);
    public final k a;

    public static class a {
        public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getDefault();
        }
    }

    public j(k kVar) {
        this.a = kVar;
    }

    public static j a(Locale... localeArr) {
        return j(b.a(localeArr));
    }

    public static j b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = a.a(split[i]);
        }
        return a(localeArr);
    }

    public static j d() {
        return j(b.b());
    }

    public static j e() {
        return b;
    }

    public static j j(LocaleList localeList) {
        return new j(new l(localeList));
    }

    public Locale c(int i) {
        return this.a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.a.equals(((j) obj).a);
    }

    public boolean f() {
        return this.a.isEmpty();
    }

    public int g() {
        return this.a.size();
    }

    public String h() {
        return this.a.a();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i() {
        return this.a.getLocaleList();
    }

    public String toString() {
        return this.a.toString();
    }
}
