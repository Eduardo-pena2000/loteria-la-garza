package org.apache.tika.detect;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompositeEncodingDetector implements EncodingDetector, Serializable {
    private static final long serialVersionUID = 5980683158436430252L;
    private final List detectors;

    public CompositeEncodingDetector(List list, Collection collection) {
        this.detectors = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EncodingDetector encodingDetector = (EncodingDetector) it.next();
            if (!isExcluded(collection, encodingDetector.getClass())) {
                this.detectors.add(encodingDetector);
            }
        }
    }

    private boolean assignableFrom(Collection collection, Class cls) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean isExcluded(Collection collection, Class cls) {
        return collection.contains(cls) || assignableFrom(collection, cls);
    }

    public Charset detect(InputStream inputStream, Metadata metadata) throws IOException {
        for (EncodingDetector encodingDetector : getDetectors()) {
            Charset detect = encodingDetector.detect(inputStream, metadata);
            if (detect != null) {
                metadata.set(TikaCoreProperties.DETECTED_ENCODING, detect.name());
                if (!encodingDetector.getClass().getSimpleName().equals("CompositeEncodingDetector")) {
                    metadata.set(TikaCoreProperties.ENCODING_DETECTOR, encodingDetector.getClass().getSimpleName());
                }
                return detect;
            }
        }
        return null;
    }

    public List getDetectors() {
        return Collections.unmodifiableList(this.detectors);
    }

    public CompositeEncodingDetector(List list) {
        LinkedList linkedList = new LinkedList();
        this.detectors = linkedList;
        linkedList.addAll(list);
    }
}
