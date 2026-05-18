package io.flutter.plugin.editing;

import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import ca.v;
import da.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class m implements v.b, SpellCheckerSession.SpellCheckerSessionListener {
    public final v a;
    public final TextServicesManager b;
    public SpellCheckerSession c;
    public j.d d;

    public m(TextServicesManager textServicesManager, v vVar) {
        this.b = textServicesManager;
        this.a = vVar;
        vVar.b(this);
    }

    public void a(String str, String str2, j.d dVar) {
        if (this.d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
        } else {
            this.d = dVar;
            c(str, str2);
        }
    }

    public void b() {
        this.a.b(null);
        SpellCheckerSession spellCheckerSession = this.c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b = ea.d.b(str);
        if (this.c == null) {
            this.c = this.b.newSpellCheckerSession((Bundle) null, b, this, true);
        }
        this.c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.d.a(new ArrayList());
            this.d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.d.a(new ArrayList());
            this.d = null;
            return;
        }
        for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z = false;
                for (int i2 = 0; i2 < suggestionsCount; i2++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i2);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z = true;
                    }
                }
                if (z) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.d.a(arrayList);
        this.d = null;
    }

    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
