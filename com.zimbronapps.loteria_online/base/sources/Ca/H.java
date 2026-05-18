package ca;

import da.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class h {
    public final da.j a;
    public b b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            if (h.a(h.this) == null) {
                return;
            }
            String str = iVar.a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) iVar.b();
            try {
                dVar.a(h.a(h.this).a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e) {
                dVar.b("error", e.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public h(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/localization", da.f.a);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ b a(h hVar) {
        return hVar.b;
    }

    public void b(List list) {
        Q9.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            Q9.b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.b = bVar;
    }
}
