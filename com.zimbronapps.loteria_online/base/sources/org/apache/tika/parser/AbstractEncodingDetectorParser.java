package org.apache.tika.parser;

import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.EncodingDetector;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class AbstractEncodingDetectorParser implements Parser {
    private EncodingDetector encodingDetector;

    public AbstractEncodingDetectorParser() {
        this.encodingDetector = new DefaultEncodingDetector();
    }

    public EncodingDetector getEncodingDetector(ParseContext parseContext) {
        EncodingDetector encodingDetector = (EncodingDetector) parseContext.get(EncodingDetector.class);
        return encodingDetector != null ? encodingDetector : getEncodingDetector();
    }

    public void setEncodingDetector(EncodingDetector encodingDetector) {
        this.encodingDetector = encodingDetector;
    }

    public AbstractEncodingDetectorParser(EncodingDetector encodingDetector) {
        this.encodingDetector = encodingDetector;
    }

    public EncodingDetector getEncodingDetector() {
        return this.encodingDetector;
    }
}
