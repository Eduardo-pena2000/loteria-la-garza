package c5;

import Da.D;
import android.graphics.Bitmap;
import c5.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements i {
    public static final a c = new a(null);
    public final LinkedHashMap a = new LinkedHashMap();
    public int b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b {
        public final int a;
        public final WeakReference b;
        public final Map c;
        public final int d;

        public b(int i, WeakReference weakReference, Map map, int i2) {
            this.a = i;
            this.b = weakReference;
            this.c = map;
            this.d = i2;
        }

        public final WeakReference a() {
            return this.b;
        }

        public final Map b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        public final int d() {
            return this.d;
        }
    }

    public synchronized void a(int i) {
        if (i >= 10 && i != 20) {
            d();
        }
    }

    public synchronized c.c b(c.b bVar) {
        try {
            ArrayList arrayList = (ArrayList) this.a.get(bVar);
            c.c cVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                b bVar2 = (b) arrayList.get(i);
                Bitmap bitmap = (Bitmap) bVar2.a().get();
                c.c cVar2 = bitmap != null ? new c.c(bitmap, bVar2.b()) : null;
                if (cVar2 != null) {
                    cVar = cVar2;
                    break;
                }
                i++;
            }
            e();
            return cVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c(c.b bVar, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = this.a;
            Object obj = linkedHashMap.get(bVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(bVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            b bVar2 = new b(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList.add(bVar2);
                    break;
                }
                b bVar3 = (b) arrayList.get(i2);
                if (i < bVar3.d()) {
                    i2++;
                } else if (bVar3.c() == identityHashCode && bVar3.a().get() == bitmap) {
                    arrayList.set(i2, bVar2);
                } else {
                    arrayList.add(i2, bVar2);
                }
            }
            e();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        WeakReference a2;
        this.b = 0;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) D.h0(arrayList);
                if (((bVar == null || (a2 = bVar.a()) == null) ? null : (Bitmap) a2.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((b) arrayList.get(i3)).a().get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public final void e() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            d();
        }
    }
}
