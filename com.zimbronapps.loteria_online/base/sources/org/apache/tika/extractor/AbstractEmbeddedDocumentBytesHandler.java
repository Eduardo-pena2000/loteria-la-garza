package org.apache.tika.extractor;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.tika.io.FilenameUtils;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class AbstractEmbeddedDocumentBytesHandler implements EmbeddedDocumentBytesHandler {
    List ids = new ArrayList();

    public void add(int i, Metadata metadata, InputStream inputStream) throws IOException {
        this.ids.add(Integer.valueOf(i));
    }

    public String getEmitKey(String str, int i, EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig, Metadata metadata) {
        String leftPad = embeddedDocumentBytesConfig.getZeroPadName() > 0 ? StringUtils.leftPad(Integer.toString(i), embeddedDocumentBytesConfig.getZeroPadName(), "0") : Integer.toString(i);
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isBlank(embeddedDocumentBytesConfig.getEmitKeyBase())) {
            sb.append(str);
            sb.append("/");
            sb.append(FilenameUtils.getName(str));
        } else {
            sb.append(embeddedDocumentBytesConfig.getEmitKeyBase());
        }
        sb.append(embeddedDocumentBytesConfig.getEmbeddedIdPrefix());
        sb.append(leftPad);
        if (embeddedDocumentBytesConfig.getSuffixStrategy().equals(EmbeddedDocumentBytesConfig.SUFFIX_STRATEGY.EXISTING)) {
            sb.append(FilenameUtils.getSuffixFromPath(metadata.get("resourceName")).toLowerCase(Locale.US));
        }
        return sb.toString();
    }

    public List getIds() {
        return this.ids;
    }
}
