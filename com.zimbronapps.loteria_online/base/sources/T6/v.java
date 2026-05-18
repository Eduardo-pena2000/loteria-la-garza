package T6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface v {

    public static final class a {
        public final Object a;
        public final b b;

        public a(Object obj, b bVar) {
            this.a = obj;
            this.b = bVar;
        }

        public Object a() {
            if (b()) {
                throw new IllegalStateException("getData called when there is a conflict.");
            }
            return this.a;
        }

        public boolean b() {
            return this.b != null;
        }
    }

    public static final class b {
        public final c7.a a;
        public final String b;
        public final c7.a c;
        public final c7.b d;

        public b(c7.a aVar, String str, c7.a aVar2, c7.b bVar) {
            this.a = aVar;
            this.b = str;
            this.c = aVar2;
            this.d = bVar;
        }
    }

    public static final class c extends com.google.android.gms.common.api.b {
        public final c7.e b;

        public c(Status status, c7.e eVar) {
            super(status);
            this.b = eVar;
        }
    }

    Task commitAndClose(c7.a aVar, c7.g gVar);

    Task delete(c7.e eVar);

    Task load(boolean z);

    Task open(String str, boolean z, int i);
}
