package C7;

import F7.a;
import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class b {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final DateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public b(String str, String str2, String str3, Date date, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    public static b a(a.c cVar) {
        String str = cVar.d;
        if (str == null) {
            str = "";
        }
        return new b(cVar.b, String.valueOf(cVar.c), str, new Date(cVar.m), cVar.e, cVar.j);
    }

    public static b b(Map map) {
        g(map);
        try {
            return new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (ParseException e) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e);
        } catch (NumberFormatException e2) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e2);
        }
    }

    public static void g(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.d.getTime();
    }

    public String e() {
        return this.b;
    }

    public a.c f(String str) {
        a.c cVar = new a.c();
        cVar.a = str;
        cVar.m = d();
        cVar.b = this.a;
        cVar.c = this.b;
        cVar.d = TextUtils.isEmpty(this.c) ? null : this.c;
        cVar.e = this.e;
        cVar.j = this.f;
        return cVar;
    }
}
