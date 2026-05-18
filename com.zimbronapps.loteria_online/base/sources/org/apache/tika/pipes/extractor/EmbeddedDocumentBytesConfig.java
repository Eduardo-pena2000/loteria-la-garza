package org.apache.tika.pipes.extractor;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class EmbeddedDocumentBytesConfig implements Serializable {
    public static EmbeddedDocumentBytesConfig SKIP = new EmbeddedDocumentBytesConfig(false);
    private static final long serialVersionUID = -3861669115439125268L;
    private String embeddedIdPrefix;
    private String emitKeyBase;
    private String emitter;
    private boolean extractEmbeddedDocumentBytes;
    private boolean includeOriginal;
    private SUFFIX_STRATEGY suffixStrategy;
    private int zeroPadName;

    public enum SUFFIX_STRATEGY {
        NONE,
        EXISTING,
        DETECTED;

        public static SUFFIX_STRATEGY parse(String str) {
            if (str.equalsIgnoreCase("none")) {
                return NONE;
            }
            if (str.equalsIgnoreCase("existing")) {
                return EXISTING;
            }
            if (str.equalsIgnoreCase("detected")) {
                return DETECTED;
            }
            throw new IllegalArgumentException("can't parse " + str);
        }
    }

    public EmbeddedDocumentBytesConfig() {
        this.zeroPadName = 0;
        this.suffixStrategy = SUFFIX_STRATEGY.NONE;
        this.embeddedIdPrefix = "-";
        this.includeOriginal = false;
        this.emitKeyBase = "";
        this.extractEmbeddedDocumentBytes = true;
    }

    public static EmbeddedDocumentBytesConfig getSKIP() {
        return SKIP;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) obj;
        return this.extractEmbeddedDocumentBytes == embeddedDocumentBytesConfig.extractEmbeddedDocumentBytes && this.zeroPadName == embeddedDocumentBytesConfig.zeroPadName && this.includeOriginal == embeddedDocumentBytesConfig.includeOriginal && this.suffixStrategy == embeddedDocumentBytesConfig.suffixStrategy && Objects.equals(this.embeddedIdPrefix, embeddedDocumentBytesConfig.embeddedIdPrefix) && Objects.equals(this.emitter, embeddedDocumentBytesConfig.emitter) && Objects.equals(this.emitKeyBase, embeddedDocumentBytesConfig.emitKeyBase);
    }

    public String getEmbeddedIdPrefix() {
        return this.embeddedIdPrefix;
    }

    public String getEmitKeyBase() {
        return this.emitKeyBase;
    }

    public String getEmitter() {
        return this.emitter;
    }

    public SUFFIX_STRATEGY getSuffixStrategy() {
        return this.suffixStrategy;
    }

    public int getZeroPadName() {
        return this.zeroPadName;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.extractEmbeddedDocumentBytes) * 31) + this.zeroPadName) * 31) + Objects.hashCode(this.suffixStrategy)) * 31) + Objects.hashCode(this.embeddedIdPrefix)) * 31) + Objects.hashCode(this.emitter)) * 31) + Boolean.hashCode(this.includeOriginal)) * 31) + Objects.hashCode(this.emitKeyBase);
    }

    public boolean isExtractEmbeddedDocumentBytes() {
        return this.extractEmbeddedDocumentBytes;
    }

    public boolean isIncludeOriginal() {
        return this.includeOriginal;
    }

    public void setEmbeddedIdPrefix(String str) {
        this.embeddedIdPrefix = str;
    }

    public void setEmitKeyBase(String str) {
        this.emitKeyBase = str;
    }

    public void setEmitter(String str) {
        this.emitter = str;
    }

    public void setExtractEmbeddedDocumentBytes(boolean z) {
        this.extractEmbeddedDocumentBytes = z;
    }

    public void setIncludeOriginal(boolean z) {
        this.includeOriginal = z;
    }

    public void setSuffixStrategy(SUFFIX_STRATEGY suffix_strategy) {
        this.suffixStrategy = suffix_strategy;
    }

    public void setZeroPadName(int i) {
        this.zeroPadName = i;
    }

    public String toString() {
        return "EmbeddedDocumentBytesConfig{extractEmbeddedDocumentBytes=" + this.extractEmbeddedDocumentBytes + ", zeroPadName=" + this.zeroPadName + ", suffixStrategy=" + String.valueOf(this.suffixStrategy) + ", embeddedIdPrefix='" + this.embeddedIdPrefix + "', emitter='" + this.emitter + "', includeOriginal=" + this.includeOriginal + ", emitKeyBase='" + this.emitKeyBase + "'}";
    }

    public void setSuffixStrategy(String str) {
        setSuffixStrategy(SUFFIX_STRATEGY.valueOf(str));
    }

    public EmbeddedDocumentBytesConfig(boolean z) {
        this.zeroPadName = 0;
        this.suffixStrategy = SUFFIX_STRATEGY.NONE;
        this.embeddedIdPrefix = "-";
        this.includeOriginal = false;
        this.emitKeyBase = "";
        this.extractEmbeddedDocumentBytes = z;
    }
}
