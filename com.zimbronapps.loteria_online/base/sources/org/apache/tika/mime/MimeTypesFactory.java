package org.apache.tika.mime;

import Wb.c;
import Wb.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import org.w3c.dom.Document;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class MimeTypesFactory {
    public static final String CUSTOM_MIMES_SYS_PROP = "tika.custom-mimetypes";
    private static final c LOG = e.l(MimeTypesFactory.class);

    public static /* synthetic */ void a(URL url) {
        lambda$create$0(url);
    }

    public static MimeTypes create() {
        return new MimeTypes();
    }

    private static /* synthetic */ void lambda$create$0(URL url) {
        LOG.t("Loaded custom mimes file: {}", url);
    }

    public static MimeTypes create(Document document) throws MimeTypeException {
        MimeTypes mimeTypes = new MimeTypes();
        new MimeTypesReader(mimeTypes).read(document);
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream... inputStreamArr) throws IOException, MimeTypeException {
        MimeTypes mimeTypes = new MimeTypes();
        MimeTypesReader mimeTypesReader = new MimeTypesReader(mimeTypes);
        for (InputStream inputStream : inputStreamArr) {
            mimeTypesReader.read(inputStream);
        }
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream inputStream) throws IOException, MimeTypeException {
        return create(inputStream);
    }

    public static MimeTypes create(URL... urlArr) throws IOException, MimeTypeException {
        int length = urlArr.length;
        InputStream[] inputStreamArr = new InputStream[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            inputStreamArr[i2] = urlArr[i2].openStream();
        }
        try {
            return create(inputStreamArr);
        } finally {
            while (i < length) {
                inputStreamArr[i].close();
                i++;
            }
        }
    }

    public static MimeTypes create(URL url) throws IOException, MimeTypeException {
        return create(url);
    }

    public static MimeTypes create(String str) throws IOException, MimeTypeException {
        return create(MimeTypesReader.class.getResource(str));
    }

    public static MimeTypes create(String str, String str2) throws IOException, MimeTypeException {
        return create(str, str2, null);
    }

    public static MimeTypes create(String str, String str2, ClassLoader classLoader) throws IOException, MimeTypeException {
        if (classLoader == null) {
            classLoader = MimeTypesReader.class.getClassLoader();
        }
        URL resource = classLoader.getResource((MimeTypesReader.class.getPackage().getName().replace('.', '/') + "/") + str);
        ArrayList list = Collections.list(classLoader.getResources(str2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(resource);
        arrayList.addAll(list);
        c cVar = LOG;
        if (cVar.c()) {
            arrayList.stream().forEach(new a());
        }
        String property = System.getProperty("tika.custom-mimetypes");
        if (property != null) {
            File file = new File(property);
            if (file.exists()) {
                arrayList.add(file.toURI().toURL());
                if (cVar.c()) {
                    cVar.t("Loaded external custom mimetypes file: {}", file.getAbsolutePath());
                }
            } else {
                throw new IOException("Specified custom mimetypes file not found: " + property);
            }
        }
        return create((URL[]) arrayList.toArray(new URL[0]));
    }
}
