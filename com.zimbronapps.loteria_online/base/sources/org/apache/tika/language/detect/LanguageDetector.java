package org.apache.tika.language.detect;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.ServiceLoader;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class LanguageDetector {
    private static final int BUFFER_LENGTH = 4096;
    private static final ServiceLoader DEFAULT_SERVICE_LOADER = new ServiceLoader();
    protected boolean mixedLanguages = false;
    protected boolean shortText = false;

    public static LanguageDetector getDefaultLanguageDetector() {
        List languageDetectors = getLanguageDetectors();
        if (languageDetectors.isEmpty()) {
            throw new IllegalStateException("No language detectors available");
        }
        return (LanguageDetector) languageDetectors.get(0);
    }

    public static List getLanguageDetectors() {
        return getLanguageDetectors(DEFAULT_SERVICE_LOADER);
    }

    public void addText(CharSequence charSequence) {
        int length = charSequence.length();
        if (length < 4096) {
            char[] charArray = charSequence.toString().toCharArray();
            addText(charArray, 0, charArray.length);
            return;
        }
        int i = 0;
        while (!hasEnoughText() && i < length) {
            int i2 = i + 4096;
            char[] charArray2 = charSequence.subSequence(i, Math.min(i2, length)).toString().toCharArray();
            addText(charArray2, 0, charArray2.length);
            i = i2;
        }
    }

    public abstract void addText(char[] cArr, int i, int i2);

    public LanguageResult detect() {
        return (LanguageResult) detectAll().get(0);
    }

    public abstract List detectAll();

    public List detectAll(String str) {
        reset();
        addText(str);
        return detectAll();
    }

    public boolean hasEnoughText() {
        return false;
    }

    public abstract boolean hasModel(String str);

    public boolean isMixedLanguages() {
        return this.mixedLanguages;
    }

    public boolean isShortText() {
        return this.shortText;
    }

    public abstract LanguageDetector loadModels() throws IOException;

    public abstract LanguageDetector loadModels(Set set) throws IOException;

    public abstract void reset();

    public LanguageDetector setMixedLanguages(boolean z) {
        this.mixedLanguages = z;
        return this;
    }

    public abstract LanguageDetector setPriors(Map map) throws IOException;

    public LanguageDetector setShortText(boolean z) {
        this.shortText = z;
        return this;
    }

    public static List getLanguageDetectors(ServiceLoader serviceLoader) {
        List loadStaticServiceProviders = serviceLoader.loadStaticServiceProviders(LanguageDetector.class);
        loadStaticServiceProviders.sort(new a());
        return loadStaticServiceProviders;
    }

    public LanguageResult detect(CharSequence charSequence) {
        reset();
        addText(charSequence);
        return detect();
    }
}
