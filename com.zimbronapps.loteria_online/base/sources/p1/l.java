package P1;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l implements k {
    public final LocaleList a;

    public l(Object obj) {
        this.a = (LocaleList) obj;
    }

    public String a() {
        return this.a.toLanguageTags();
    }

    public boolean equals(Object obj) {
        return this.a.equals(((k) obj).getLocaleList());
    }

    public Locale get(int i) {
        return this.a.get(i);
    }

    public Object getLocaleList() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
