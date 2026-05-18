package J8;

import G8.p;
import G8.q;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c extends p {
    public static final q b = new a();
    public final List a;

    public class a implements q {
        public p a(G8.d dVar, N8.a aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (I8.e.d()) {
            arrayList.add(I8.i.c(2, 2));
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(O8.a aVar, Date date) {
        String format;
        if (date == null) {
            aVar.u();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.a.get(0);
        synchronized (this.a) {
            format = dateFormat.format(date);
        }
        aVar.O(format);
    }
}
