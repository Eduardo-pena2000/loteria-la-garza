package ca;

import da.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class k {
    public final da.j a;
    public g b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00d9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onMethodCall(da.i r6, da.j.d r7) {
            /*
                Method dump skipped, instructions count: 754
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ca.k.a.onMethodCall(da.i, da.j$d):void");
        }
    }

    public static class b {
        public final int a;
        public final String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    public enum c {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");

        public String a;

        c(String str) {
            this.a = str;
        }

        public static c b(String str) {
            for (c cVar : values()) {
                if (cVar.a.equals(str)) {
                    return cVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum d {
        PLAIN_TEXT("text/plain");

        public String a;

        d(String str) {
            this.a = str;
        }

        public static d b(String str) {
            for (d dVar : values()) {
                if (dVar.a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum e {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");

        public String a;

        e(String str) {
            this.a = str;
        }

        public static e b(String str) {
            for (e eVar : values()) {
                if (eVar.a.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum f {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick"),
        SUCCESS_NOTIFICATION("HapticFeedbackType.successNotification"),
        WARNING_NOTIFICATION("HapticFeedbackType.warningNotification"),
        ERROR_NOTIFICATION("HapticFeedbackType.errorNotification");

        public final String a;

        f(String str) {
            this.a = str;
        }

        public static f b(String str) {
            for (f fVar : values()) {
                String str2 = fVar.a;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface g {
        void d();

        void g(boolean z);

        void h(List list);

        void i(f fVar);

        void j(i iVar);

        void k(j jVar);

        void l();

        boolean m();

        CharSequence n(d dVar);

        void o(b bVar);

        void p(h hVar);

        void q(String str);

        void r(String str);

        void s();

        void t(int i);
    }

    public enum h {
        CLICK("SystemSoundType.click"),
        TICK("SystemSoundType.tick"),
        ALERT("SystemSoundType.alert");

        public final String a;

        h(String str) {
            this.a = str;
        }

        public static h b(String str) {
            for (h hVar : values()) {
                if (hVar.a.equals(str)) {
                    return hVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class i {
        public final Integer a;
        public final c b;
        public final Boolean c;
        public final Integer d;
        public final c e;
        public final Integer f;
        public final Boolean g;

        public i(Integer num, c cVar, Boolean bool, Integer num2, c cVar2, Integer num3, Boolean bool2) {
            this.a = num;
            this.b = cVar;
            this.c = bool;
            this.d = num2;
            this.e = cVar2;
            this.f = num3;
            this.g = bool2;
        }
    }

    public enum j {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");

        public String a;

        j(String str) {
            this.a = str;
        }

        public static j b(String str) {
            for (j jVar : values()) {
                if (jVar.a.equals(str)) {
                    return jVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum k {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");

        public String a;

        k(String str) {
            this.a = str;
        }

        public static k b(String str) {
            for (k kVar : values()) {
                if (kVar.a.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public k(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/platform", da.f.a);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ g a(k kVar) {
        return kVar.b;
    }

    public static /* synthetic */ int b(k kVar, JSONArray jSONArray) {
        return kVar.h(jSONArray);
    }

    public static /* synthetic */ b c(k kVar, JSONObject jSONObject) {
        return kVar.g(jSONObject);
    }

    public static /* synthetic */ List d(k kVar, JSONArray jSONArray) {
        return kVar.k(jSONArray);
    }

    public static /* synthetic */ j e(k kVar, String str) {
        return kVar.j(str);
    }

    public static /* synthetic */ i f(k kVar, JSONObject jSONObject) {
        return kVar.i(jSONObject);
    }

    public final b g(JSONObject jSONObject) {
        int i2 = jSONObject.getInt("primaryColor");
        if (i2 != 0) {
            i2 |= -16777216;
        }
        return new b(i2, jSONObject.getString("label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(org.json.JSONArray r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r8.length()
            r5 = 2
            r6 = 1
            if (r1 >= r4) goto L33
            java.lang.String r4 = r8.getString(r1)
            ca.k$e r4 = ca.k.e.b(r4)
            int r4 = r4.ordinal()
            if (r4 == 0) goto L2b
            if (r4 == r6) goto L28
            if (r4 == r5) goto L25
            r5 = 3
            if (r4 == r5) goto L22
            goto L2d
        L22:
            r2 = r2 | 8
            goto L2d
        L25:
            r2 = r2 | 2
            goto L2d
        L28:
            r2 = r2 | 4
            goto L2d
        L2b:
            r2 = r2 | 1
        L2d:
            if (r3 != 0) goto L30
            r3 = r2
        L30:
            int r1 = r1 + 1
            goto L4
        L33:
            if (r2 == 0) goto L53
            r8 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L52;
                case 3: goto L48;
                case 4: goto L47;
                case 5: goto L45;
                case 6: goto L48;
                case 7: goto L48;
                case 8: goto L44;
                case 9: goto L48;
                case 10: goto L41;
                case 11: goto L40;
                case 12: goto L48;
                case 13: goto L48;
                case 14: goto L48;
                case 15: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L4f
        L3d:
            r8 = 13
            return r8
        L40:
            return r5
        L41:
            r8 = 11
            return r8
        L44:
            return r1
        L45:
            r8 = 12
        L47:
            return r8
        L48:
            if (r3 == r5) goto L52
            r0 = 4
            if (r3 == r0) goto L51
            if (r3 == r1) goto L50
        L4f:
            return r6
        L50:
            return r1
        L51:
            return r8
        L52:
            return r0
        L53:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.k.h(org.json.JSONArray):int");
    }

    public final i i(JSONObject jSONObject) {
        return new i(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? c.b(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? c.b(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public final j j(String str) {
        int ordinal = j.b(str).ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? j.EDGE_TO_EDGE : j.EDGE_TO_EDGE : j.IMMERSIVE_STICKY : j.IMMERSIVE : j.LEAN_BACK;
    }

    public final List k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int ordinal = k.b(jSONArray.getString(i2)).ordinal();
            if (ordinal == 0) {
                arrayList.add(k.TOP_OVERLAYS);
            } else if (ordinal == 1) {
                arrayList.add(k.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void l(g gVar) {
        this.b = gVar;
    }

    public void m(boolean z) {
        Q9.b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.a.c("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.valueOf(z)}));
    }
}
