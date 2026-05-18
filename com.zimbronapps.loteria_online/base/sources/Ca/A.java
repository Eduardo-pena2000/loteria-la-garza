package ca;

import da.a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.j;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a {
    public final da.a a;
    public final FlutterJNI b;
    public b c;
    public final a.d d;

    public class a implements a.d {
        public a() {
        }

        public void a(Object obj, a.e eVar) {
            HashMap hashMap;
            HashMap hashMap2;
            if (a.a(a.this) == null) {
                eVar.a(null);
                return;
            }
            hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            hashMap2 = (HashMap) hashMap.get("data");
            Q9.b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            switch (str) {
                case "tooltip":
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.a(a.this).b(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.a(a.this).h(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.a(a.this).f(num.intValue());
                        break;
                    }
                    break;
                case "focus":
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.a(a.this).c(num2.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num3 = (Integer) hashMap.get("nodeId");
                    if (num3 != null) {
                        a.a(a.this).d(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    public interface b extends FlutterJNI.a {
        void b(String str);

        void c(int i);

        void d(int i);

        void f(int i);

        void h(String str);
    }

    public a(T9.a aVar, FlutterJNI flutterJNI) {
        a aVar2 = new a();
        this.d = aVar2;
        da.a aVar3 = new da.a(aVar, "flutter/accessibility", da.o.a);
        this.a = aVar3;
        aVar3.e(aVar2);
        this.b = flutterJNI;
    }

    public static /* synthetic */ b a(a aVar) {
        return aVar.c;
    }

    public void b(int i, j.g gVar) {
        this.b.dispatchSemanticsAction(i, gVar);
    }

    public void c(int i, j.g gVar, Object obj) {
        this.b.dispatchSemanticsAction(i, gVar, obj);
    }

    public void d() {
        this.b.setSemanticsEnabled(false);
    }

    public void e() {
        this.b.setSemanticsEnabled(true);
    }

    public void f(int i) {
        this.b.setAccessibilityFeatures(i);
    }

    public void g(b bVar) {
        this.c = bVar;
        this.b.setAccessibilityDelegate(bVar);
    }
}
