package Q8;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d {
    public final k a;
    public final WebView b;
    public final List c;
    public final Map d;
    public final String e;
    public final String f;
    public final String g;
    public final e h;

    public d(k kVar, WebView webView, String str, List list, String str2, String str3, e eVar) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new HashMap();
        this.a = kVar;
        this.b = webView;
        this.e = str;
        this.h = eVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                this.d.put(UUID.randomUUID().toString(), (Object) null);
            }
        }
        this.g = str2;
        this.f = str3;
    }

    public static d a(k kVar, WebView webView, String str, String str2) {
        V8.g.d(kVar, "Partner is null");
        V8.g.d(webView, "WebView is null");
        if (str2 != null) {
            V8.g.e(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(kVar, webView, null, null, str, str2, e.b);
    }

    public static d b(k kVar, WebView webView, String str, String str2) {
        V8.g.d(kVar, "Partner is null");
        V8.g.d(webView, "WebView is null");
        if (str2 != null) {
            V8.g.e(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new d(kVar, webView, null, null, str, str2, e.d);
    }

    public e c() {
        return this.h;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.f;
    }

    public Map f() {
        return Collections.unmodifiableMap(this.d);
    }

    public String g() {
        return this.e;
    }

    public k h() {
        return this.a;
    }

    public List i() {
        return Collections.unmodifiableList(this.c);
    }

    public WebView j() {
        return this.b;
    }
}
