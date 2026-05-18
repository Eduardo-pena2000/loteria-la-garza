package org.apache.tika.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ParserUtils {
    public static final Property EMBEDDED_PARSER = Property.internalText("X-TIKA:EXCEPTION:embedded_parser");

    public static Metadata cloneMetadata(Metadata metadata) {
        Metadata metadata2 = new Metadata();
        for (String str : metadata.names()) {
            if (metadata.isMultiValued(str)) {
                for (String str2 : metadata.getValues(str)) {
                    metadata2.add(str, str2);
                }
            } else {
                metadata2.set(str, metadata.get(str));
            }
        }
        return metadata2;
    }

    public static InputStream ensureStreamReReadable(InputStream inputStream, TemporaryResources temporaryResources, Metadata metadata) throws IOException {
        if (inputStream instanceof RereadableInputStream) {
            return inputStream;
        }
        TikaInputStream cast = TikaInputStream.cast(inputStream);
        if (cast == null) {
            cast = TikaInputStream.get(inputStream, temporaryResources, metadata);
        }
        if (cast.getInputStreamFactory() != null) {
            return cast;
        }
        cast.getFile();
        cast.mark(-1);
        return cast;
    }

    public static String getParserClassname(Parser parser) {
        return parser instanceof ParserDecorator ? ((ParserDecorator) parser).getWrappedParser().getClass().getName() : parser.getClass().getName();
    }

    public static void recordParserDetails(Parser parser, Metadata metadata) {
        recordParserDetails(getParserClassname(parser), metadata);
    }

    public static void recordParserFailure(Parser parser, Throwable th, Metadata metadata) {
        metadata.add(TikaCoreProperties.EMBEDDED_EXCEPTION, ExceptionUtils.getStackTrace(th));
        metadata.add(EMBEDDED_PARSER, getParserClassname(parser));
    }

    public static InputStream streamResetForReRead(InputStream inputStream, TemporaryResources temporaryResources) throws IOException {
        if (inputStream instanceof RereadableInputStream) {
            ((RereadableInputStream) inputStream).rewind();
            return inputStream;
        }
        TikaInputStream tikaInputStream = (TikaInputStream) inputStream;
        if (tikaInputStream.getInputStreamFactory() != null) {
            return TikaInputStream.get(tikaInputStream.getInputStreamFactory(), temporaryResources);
        }
        tikaInputStream.reset();
        tikaInputStream.mark(-1);
        return tikaInputStream;
    }

    public static void recordParserDetails(String str, Metadata metadata) {
        Property property = TikaCoreProperties.TIKA_PARSED_BY;
        String[] values = metadata.getValues(property);
        if (values != null && values.length != 0) {
            Stream stream = Arrays.stream(values);
            Objects.requireNonNull(str);
            if (stream.noneMatch(new e(str))) {
                metadata.add(property, str);
                return;
            }
            return;
        }
        metadata.add(property, str);
    }
}
