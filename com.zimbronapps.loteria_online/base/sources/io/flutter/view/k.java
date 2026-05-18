package io.flutter.view;

import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class k {
    public String a;
    public List b;
    public String c;
    public String d;

    public static class a extends c {
        public String d;
    }

    public static class b extends c {
    }

    public static class c {
        public int a;
        public int b;
        public d c;
    }

    public enum d {
        SPELLOUT,
        LOCALE
    }

    public k a(List list) {
        this.b = list;
        return this;
    }

    public k b(String str) {
        this.c = str;
        return this;
    }

    public k c(String str) {
        this.a = str;
        return this;
    }

    public k d(String str) {
        this.d = str;
        return this;
    }

    public CharSequence e() {
        if (this.a == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.a);
        List<c> list = this.b;
        if (list != null) {
            for (c cVar : list) {
                int ordinal = cVar.c.ordinal();
                if (ordinal == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), cVar.a, cVar.b, 0);
                } else if (ordinal == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((a) cVar).d)), cVar.a, cVar.b, 0);
                }
            }
        }
        String str = this.d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan(this.d), 0, this.a.length(), 0);
        }
        String str2 = this.c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(this.c)), 0, this.a.length(), 0);
        }
        return spannableString;
    }
}
