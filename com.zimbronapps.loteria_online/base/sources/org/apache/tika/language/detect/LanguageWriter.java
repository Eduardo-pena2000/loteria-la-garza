package org.apache.tika.language.detect;

import java.io.IOException;
import java.io.Writer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LanguageWriter extends Writer {
    private final LanguageDetector detector;

    public LanguageWriter(LanguageDetector languageDetector) {
        this.detector = languageDetector;
        languageDetector.reset();
    }

    public void close() throws IOException {
    }

    public void flush() {
    }

    public LanguageDetector getDetector() {
        return this.detector;
    }

    public LanguageResult getLanguage() {
        return this.detector.detect();
    }

    public void reset() {
        this.detector.reset();
    }

    public void write(char[] cArr, int i, int i2) {
        this.detector.addText(cArr, i, i2);
    }
}
