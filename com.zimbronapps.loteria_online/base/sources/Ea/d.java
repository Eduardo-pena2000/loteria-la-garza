package ea;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import ca.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class d {
    public final h a;
    public final Context b;
    public final h.b c;

    public class a implements h.b {
        public a() {
        }

        public String a(String str, String str2) {
            Context a = d.a(d.this);
            if (str2 != null) {
                Locale b = d.b(str2);
                Configuration configuration = new Configuration(d.a(d.this).getResources().getConfiguration());
                configuration.setLocale(b);
                a = d.a(d.this).createConfigurationContext(configuration);
            }
            int identifier = a.getResources().getIdentifier(str, "string", d.a(d.this).getPackageName());
            if (identifier != 0) {
                return a.getResources().getString(identifier);
            }
            return null;
        }
    }

    public d(Context context, h hVar) {
        a aVar = new a();
        this.c = aVar;
        this.b = context;
        this.a = hVar;
        hVar.c(aVar);
    }

    public static /* synthetic */ Context a(d dVar) {
        return dVar.b;
    }

    public static Locale b(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            builder.setRegion(split[i]);
        }
        return builder.build();
    }

    public Locale c(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                Locale locale = locales.get(i);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(b.a(language));
                c.a();
                arrayList.add(b.a(locale.getLanguage()));
                c.a();
                arrayList.add(b.a(locale.getLanguage() + "-*"));
            }
            Locale a2 = ea.a.a(arrayList, list);
            if (a2 != null) {
                return a2;
            }
        } else {
            LocaleList locales2 = this.b.getResources().getConfiguration().getLocales();
            for (int i2 = 0; i2 < locales2.size(); i2++) {
                Locale locale2 = locales2.get(i2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Locale locale3 = (Locale) it.next();
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Locale locale4 = (Locale) it2.next();
                    if (locale2.getLanguage().equals(locale4.toLanguageTag())) {
                        return locale4;
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Locale locale5 = (Locale) it3.next();
                    if (locale2.getLanguage().equals(locale5.getLanguage())) {
                        return locale5;
                    }
                }
            }
        }
        return (Locale) list.get(0);
    }

    public void d(Configuration configuration) {
        List arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i));
        }
        this.a.b(arrayList);
    }
}
