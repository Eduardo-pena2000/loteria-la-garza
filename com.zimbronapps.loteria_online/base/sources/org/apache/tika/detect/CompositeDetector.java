package org.apache.tika.detect;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompositeDetector implements Detector {
    private static final long serialVersionUID = 5980683158436430252L;
    private final List detectors;
    private final MediaTypeRegistry registry;

    public CompositeDetector(MediaTypeRegistry mediaTypeRegistry, List list, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            this.detectors = list;
        } else {
            this.detectors = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Detector detector = (Detector) it.next();
                if (!isExcluded(collection, detector.getClass())) {
                    this.detectors.add(detector);
                }
            }
        }
        this.registry = mediaTypeRegistry;
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

    private static MediaType detectOverrides(Metadata metadata) {
        MediaType parse;
        MediaType parse2;
        String str = metadata.get(TikaCoreProperties.CONTENT_TYPE_USER_OVERRIDE);
        if (!StringUtils.isBlank(str) && (parse2 = MediaType.parse(str)) != null) {
            return parse2;
        }
        String str2 = metadata.get(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE);
        if (StringUtils.isBlank(str2) || (parse = MediaType.parse(str2)) == null) {
            return null;
        }
        return parse;
    }

    private boolean isExcluded(Collection collection, Class cls) {
        return collection.contains(cls) || assignableFrom(collection, cls);
    }

    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        MediaType detectOverrides = detectOverrides(metadata);
        if (detectOverrides != null) {
            return detectOverrides;
        }
        MediaType mediaType = MediaType.OCTET_STREAM;
        Iterator it = getDetectors().iterator();
        while (it.hasNext()) {
            MediaType detect = ((Detector) it.next()).detect(inputStream, metadata);
            if (this.registry.isSpecializationOf(detect, mediaType)) {
                mediaType = detect;
            }
        }
        return mediaType;
    }

    public List getDetectors() {
        return Collections.unmodifiableList(this.detectors);
    }

    public CompositeDetector(MediaTypeRegistry mediaTypeRegistry, List list) {
        this(mediaTypeRegistry, list, null);
    }

    public CompositeDetector(List list) {
        this(new MediaTypeRegistry(), list);
    }

    public CompositeDetector(Detector... detectorArr) {
        this(Arrays.asList(detectorArr));
    }
}
