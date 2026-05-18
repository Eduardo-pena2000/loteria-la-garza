package ca;

import android.os.Bundle;
import da.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class x {
    public final da.j a;
    public f b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            Object obj;
            Bundle bundle;
            if (x.a(x.this) == null) {
            }
            String str = iVar.a;
            obj = iVar.b;
            Q9.b.f("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            switch (str) {
                case "TextInput.setPlatformViewClient":
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        x.a(x.this).c(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.a(null);
                        break;
                    } catch (JSONException e) {
                        dVar.b("error", e.getMessage(), null);
                        return;
                    }
                case "TextInput.setEditingState":
                    try {
                        x.a(x.this).h(e.a((JSONObject) obj));
                        dVar.a(null);
                        break;
                    } catch (JSONException e2) {
                        dVar.b("error", e2.getMessage(), null);
                        return;
                    }
                case "TextInput.setClient":
                    try {
                        JSONArray jSONArray = (JSONArray) obj;
                        x.a(x.this).b(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                        dVar.a(null);
                        break;
                    } catch (JSONException | NoSuchFieldException e3) {
                        dVar.b("error", e3.getMessage(), null);
                        return;
                    }
                case "TextInput.hide":
                    x.a(x.this).a();
                    dVar.a(null);
                    break;
                case "TextInput.show":
                    x.a(x.this).show();
                    dVar.a(null);
                    break;
                case "TextInput.sendAppPrivateCommand":
                    try {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        x.a(x.this).g(string, bundle);
                        dVar.a(null);
                        break;
                    } catch (JSONException e4) {
                        dVar.b("error", e4.getMessage(), null);
                        return;
                    }
                    break;
                case "TextInput.setEditableSizeAndTransform":
                    try {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d = jSONObject3.getDouble("width");
                        double d2 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i = 0; i < 16; i++) {
                            dArr[i] = jSONArray2.getDouble(i);
                        }
                        x.a(x.this).i(d, d2, dArr);
                        dVar.a(null);
                        break;
                    } catch (JSONException e5) {
                        dVar.b("error", e5.getMessage(), null);
                        return;
                    }
                case "TextInput.finishAutofillContext":
                    x.a(x.this).e(((Boolean) obj).booleanValue());
                    dVar.a(null);
                    break;
                case "TextInput.clearClient":
                    x.a(x.this).f();
                    dVar.a(null);
                    break;
                case "TextInput.requestAutofill":
                    x.a(x.this).d();
                    dVar.a(null);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public static class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final d f;
        public final c g;
        public final Integer h;
        public final String i;
        public final a j;
        public final String[] k;
        public final b[] l;
        public final Locale[] m;

        public static class a {
            public final String a;
            public final String[] b;
            public final e c;
            public final String d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.a = str;
                this.b = strArr;
                this.d = str2;
                this.c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = b(jSONArray.getString(i));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.String b(java.lang.String r17) {
                /*
                    Method dump skipped, instructions count: 802
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: ca.x.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr, Locale[] localeArr) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = dVar;
            this.g = cVar;
            this.h = num;
            this.i = str;
            this.j = aVar;
            this.k = strArr;
            this.l = bVarArr;
            this.m = localeArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            Locale[] localeArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i = 0; i < length; i++) {
                    bVarArr2[i] = a(jSONArray.getJSONObject(i));
                }
                bVarArr = bVarArr2;
            }
            Integer b = b(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList.add(jSONArray2.optString(i2));
                }
            }
            if (jSONObject.isNull("hintLocales")) {
                localeArr = null;
            } else {
                JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
                Locale[] localeArr2 = new Locale[jSONArray3.length()];
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    localeArr2[i3] = Locale.forLanguageTag(jSONArray3.optString(i3));
                }
                localeArr = localeArr2;
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.b(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), b, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr, localeArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:3:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Integer b(java.lang.String r11) {
            /*
                r0 = 7
                r1 = 6
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r11.hashCode()
                r7 = 0
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = -1
                int r10 = r11.hashCode()
                switch(r10) {
                    case -810971940: goto L74;
                    case -737377923: goto L69;
                    case -737089298: goto L5e;
                    case -737080013: goto L53;
                    case -736940669: goto L48;
                    case 469250275: goto L3d;
                    case 1241689507: goto L32;
                    case 1539450297: goto L27;
                    case 2110497650: goto L1a;
                    default: goto L17;
                }
            L17:
                r7 = r9
                goto L7d
            L1a:
                java.lang.String r7 = "TextInputAction.previous"
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L23
                goto L17
            L23:
                r7 = 8
                goto L7d
            L27:
                java.lang.String r7 = "TextInputAction.newline"
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L30
                goto L17
            L30:
                r7 = r0
                goto L7d
            L32:
                java.lang.String r7 = "TextInputAction.go"
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L3b
                goto L17
            L3b:
                r7 = r1
                goto L7d
            L3d:
                java.lang.String r7 = "TextInputAction.search"
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L46
                goto L17
            L46:
                r7 = r2
                goto L7d
            L48:
                java.lang.String r7 = "TextInputAction.send"
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L51
                goto L17
            L51:
                r7 = r3
                goto L7d
            L53:
                java.lang.String r7 = "TextInputAction.none"
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L5c
                goto L17
            L5c:
                r7 = r4
                goto L7d
            L5e:
                java.lang.String r7 = "TextInputAction.next"
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L67
                goto L17
            L67:
                r7 = r5
                goto L7d
            L69:
                java.lang.String r7 = "TextInputAction.done"
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L72
                goto L17
            L72:
                r7 = r6
                goto L7d
            L74:
                java.lang.String r10 = "TextInputAction.unspecified"
                boolean r11 = r11.equals(r10)
                if (r11 != 0) goto L7d
                goto L17
            L7d:
                switch(r7) {
                    case 0: goto La4;
                    case 1: goto L9f;
                    case 2: goto L9a;
                    case 3: goto L95;
                    case 4: goto L90;
                    case 5: goto L8b;
                    case 6: goto L86;
                    case 7: goto L95;
                    case 8: goto L81;
                    default: goto L80;
                }
            L80:
                return r8
            L81:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
                return r11
            L86:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
                return r11
            L8b:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
                return r11
            L90:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
                return r11
            L95:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
                return r11
            L9a:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
                return r11
            L9f:
                java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
                return r11
            La4:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ca.x.b.b(java.lang.String):java.lang.Integer");
        }
    }

    public static class c {
        public final g a;
        public final boolean b;
        public final boolean c;

        public c(g gVar, boolean z, boolean z2) {
            this.a = gVar;
            this.b = z;
            this.c = z2;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.b(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");

        public final String a;

        d(String str) {
            this.a = str;
        }

        public static d b(String str) {
            for (d dVar : values()) {
                if (dVar.a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(String str, int i, int i2, int i3, int i4) {
            if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + i + ", " + i2 + ")");
            }
            if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + i3 + ", " + i4 + ")");
            }
            if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + i3);
            }
            if (i > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + i);
            }
            if (i2 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + i2);
            }
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i = this.d;
            return i >= 0 && this.e > i;
        }

        public boolean c() {
            return this.b >= 0;
        }
    }

    public interface f {
        void a();

        void b(int i, b bVar);

        void c(int i, boolean z);

        void d();

        void e(boolean z);

        void f();

        void g(String str, Bundle bundle);

        void h(e eVar);

        void i(double d, double d2, double[] dArr);

        void show();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");

        public final String a;

        g(String str) {
            this.a = str;
        }

        public static g b(String str) {
            for (g gVar : values()) {
                if (gVar.a.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public x(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/textinput", da.f.a);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ f a(x xVar) {
        return xVar.b;
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((io.flutter.plugin.editing.n) it.next()).b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    public static HashMap d(String str, int i, int i2, int i3, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i));
        hashMap.put("selectionExtent", Integer.valueOf(i2));
        hashMap.put("composingBase", Integer.valueOf(i3));
        hashMap.put("composingExtent", Integer.valueOf(i4));
        return hashMap;
    }

    public void b(int i, Map map) {
        Q9.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(new Object[]{Integer.valueOf(i), "TextInputAction.commitContent", map}));
    }

    public void e(int i) {
        Q9.b.f("TextInputChannel", "Sending 'done' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.done"}));
    }

    public void f(int i) {
        Q9.b.f("TextInputChannel", "Sending 'go' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.go"}));
    }

    public void g(int i) {
        Q9.b.f("TextInputChannel", "Sending 'newline' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.newline"}));
    }

    public void h(int i) {
        Q9.b.f("TextInputChannel", "Sending 'next' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.next"}));
    }

    public void i(int i, String str, Bundle bundle) {
        Serializable hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.a.c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap}));
    }

    public void j(int i) {
        Q9.b.f("TextInputChannel", "Sending 'previous' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.previous"}));
    }

    public void k() {
        this.a.c("TextInputClient.requestExistingInputState", null);
    }

    public void l(int i) {
        Q9.b.f("TextInputChannel", "Sending 'search' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.search"}));
    }

    public void m(int i) {
        Q9.b.f("TextInputChannel", "Sending 'send' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.send"}));
    }

    public void n(f fVar) {
        this.b = fVar;
    }

    public void o(int i) {
        Q9.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.unspecified"}));
    }

    public void p(int i, String str, int i2, int i3, int i4, int i5) {
        Q9.b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
        this.a.c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i), d(str, i2, i3, i4, i5)}));
    }

    public void q(int i, ArrayList arrayList) {
        Q9.b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i), c(arrayList)}));
    }

    public void r(int i, HashMap hashMap) {
        Q9.b.f("TextInputChannel", "Sending message to update editing state for " + hashMap.size() + " field(s).");
        Serializable hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            e eVar = (e) entry.getValue();
            hashMap2.put((String) entry.getKey(), d(eVar.a, eVar.b, eVar.c, -1, -1));
        }
        this.a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap2}));
    }
}
