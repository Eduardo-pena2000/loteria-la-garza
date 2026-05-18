package P0;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import b0.U1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v0 {
    public static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ j4.f b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, j4.f fVar, String str) {
            super(0);
            this.a = z;
            this.b = fVar;
            this.c = str;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return Ca.I.a;
        }

        public final void invoke() {
            if (this.a) {
                this.b.e(this.c);
            }
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(v0.e(obj));
        }
    }

    public static /* synthetic */ Bundle a(k0.p pVar) {
        return d(pVar);
    }

    public static final t0 b(View view, j4.i iVar) {
        View parent = view.getParent();
        kotlin.jvm.internal.t.e(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = parent;
        Object tag = view2.getTag(o0.l.H);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return c(str, iVar);
    }

    public static final t0 c(String str, j4.i iVar) {
        boolean z;
        String str2 = k0.p.class.getSimpleName() + ':' + str;
        j4.f savedStateRegistry = iVar.getSavedStateRegistry();
        Bundle a2 = savedStateRegistry.a(str2);
        k0.p c = k0.s.c(a2 != null ? h(a2) : null, b.a);
        try {
            savedStateRegistry.c(str2, new u0(c));
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new t0(c, new a(z, savedStateRegistry, str2));
    }

    public static final Bundle d(k0.p pVar) {
        return g(pVar.e());
    }

    public static final /* synthetic */ boolean e(Object obj) {
        return f(obj);
    }

    public static final boolean f(Object obj) {
        if (obj instanceof l0.A) {
            l0.A a2 = (l0.A) obj;
            if (a2.d() != U1.j() && a2.d() != U1.q() && a2.d() != U1.n()) {
                return false;
            }
            Object value = a2.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof Ca.h) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final Bundle g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = (List) entry.getValue();
            bundle.putParcelableArrayList(str, arrayList instanceof ArrayList ? arrayList : new ArrayList(arrayList));
        }
        return bundle;
    }

    public static final Map h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            kotlin.jvm.internal.t.e(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
