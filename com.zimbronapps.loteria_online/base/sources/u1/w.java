package U1;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class w {
    public final Object a;

    public static class a extends AccessibilityNodeProvider {
        public final w a;

        public a(w wVar) {
            this.a = wVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            v b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.S0();
        }

        public List findAccessibilityNodeInfosByText(String str, int i) {
            List c = this.a.c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((v) c.get(i2)).S0());
            }
            return arrayList;
        }

        public AccessibilityNodeInfo findFocus(int i) {
            v d = this.a.d(i);
            if (d == null) {
                return null;
            }
            return d.S0();
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    public static class b extends a {
        public b(w wVar) {
            super(wVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, v.T0(accessibilityNodeInfo), str, bundle);
        }
    }

    public w() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new b(this);
        } else {
            this.a = new a(this);
        }
    }

    public v b(int i) {
        return null;
    }

    public List c(String str, int i) {
        return null;
    }

    public v d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public w(Object obj) {
        this.a = obj;
    }

    public void a(int i, v vVar, String str, Bundle bundle) {
    }
}
