package org.apache.tika.language.detect;

import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LanguageResult {
    public static final LanguageResult NULL = new LanguageResult("", LanguageConfidence.NONE, 0.0f);
    private final LanguageConfidence confidence;
    private final String language;
    private final float rawScore;

    public LanguageResult(String str, LanguageConfidence languageConfidence, float f) {
        this.language = str;
        this.confidence = languageConfidence;
        this.rawScore = f;
    }

    public LanguageConfidence getConfidence() {
        return this.confidence;
    }

    public String getLanguage() {
        return this.language;
    }

    public float getRawScore() {
        return this.rawScore;
    }

    public boolean isLanguage(String str) {
        String[] split = str.split("\\-");
        String[] split2 = this.language.split("\\-");
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            if (!split[i].equalsIgnoreCase(split2[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean isReasonablyCertain() {
        return this.confidence == LanguageConfidence.HIGH;
    }

    public boolean isUnknown() {
        return this.confidence == LanguageConfidence.NONE;
    }

    public String toString() {
        return String.format(Locale.US, "%s: %s (%f)", new Object[]{this.language, this.confidence, Float.valueOf(this.rawScore)});
    }
}
