package org.apache.tika.detect;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.apache.tika.config.LoadErrorHandler;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.utils.CharsetUtils;
import org.xml.sax.InputSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AutoDetectReader extends BufferedReader {
    private static final EncodingDetector DEFAULT_DETECTOR;
    private static final ServiceLoader DEFAULT_LOADER;
    private final Charset charset;

    static {
        ServiceLoader serviceLoader = new ServiceLoader(AutoDetectReader.class.getClassLoader());
        DEFAULT_LOADER = serviceLoader;
        DEFAULT_DETECTOR = new CompositeEncodingDetector(serviceLoader.loadServiceProviders(EncodingDetector.class));
    }

    private AutoDetectReader(InputStream inputStream, Charset charset) throws IOException {
        super(new InputStreamReader(inputStream, charset));
        this.charset = charset;
        mark(1);
        if (read() != 65279) {
            reset();
        }
    }

    private static Charset detect(InputStream inputStream, Metadata metadata, EncodingDetector encodingDetector, LoadErrorHandler loadErrorHandler) throws IOException, TikaException {
        String str;
        try {
            Charset detect = encodingDetector.detect(inputStream, metadata);
            if (detect != null) {
                return detect;
            }
        } catch (NoClassDefFoundError e) {
            loadErrorHandler.handleLoadError(encodingDetector.getClass().getName(), e);
        }
        MediaType parse = MediaType.parse(metadata.get("Content-Type"));
        if (parse != null && (str = (String) parse.getParameters().get("charset")) != null) {
            try {
                Charset forName = CharsetUtils.forName(str);
                metadata.set(TikaCoreProperties.DETECTED_ENCODING, forName.name());
                metadata.set(TikaCoreProperties.ENCODING_DETECTOR, "AutoDetectReader-charset-metadata-fallback");
                return forName;
            } catch (IllegalArgumentException unused) {
            }
        }
        throw new TikaException("Failed to detect the character encoding of a document");
    }

    private static InputStream getBuffered(InputStream inputStream) {
        return inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream);
    }

    public InputSource asInputSource() {
        InputSource inputSource = new InputSource(this);
        inputSource.setEncoding(this.charset.name());
        return inputSource;
    }

    public Charset getCharset() {
        return this.charset;
    }

    private AutoDetectReader(InputStream inputStream, Metadata metadata, EncodingDetector encodingDetector, LoadErrorHandler loadErrorHandler) throws IOException, TikaException {
        this(inputStream, detect(inputStream, metadata, encodingDetector, loadErrorHandler));
    }

    public AutoDetectReader(InputStream inputStream, Metadata metadata, EncodingDetector encodingDetector) throws IOException, TikaException {
        this(getBuffered(inputStream), metadata, encodingDetector, DEFAULT_LOADER.getLoadErrorHandler());
    }

    public AutoDetectReader(InputStream inputStream, Metadata metadata, ServiceLoader serviceLoader) throws IOException, TikaException {
        this(getBuffered(inputStream), metadata, new CompositeEncodingDetector(serviceLoader.loadServiceProviders(EncodingDetector.class)), serviceLoader.getLoadErrorHandler());
    }

    public AutoDetectReader(InputStream inputStream, Metadata metadata) throws IOException, TikaException {
        this(inputStream, metadata, DEFAULT_DETECTOR);
    }

    public AutoDetectReader(InputStream inputStream) throws IOException, TikaException {
        this(inputStream, new Metadata());
    }
}
