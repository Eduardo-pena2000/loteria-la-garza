package org.apache.tika.metadata.filter;

import Wb.e;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DateNormalizingMetadataFilter extends MetadataFilter {
    private TimeZone defaultTimeZone = UTC;
    private static TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Wb.c LOGGER = e.l(DateNormalizingMetadataFilter.class);

    public void filter(Metadata metadata) throws TikaException {
        SimpleDateFormat simpleDateFormat = null;
        DateFormat dateFormat = null;
        for (String str : metadata.names()) {
            Property property = Property.get(str);
            if (property != null && property.getValueType().equals(Property.ValueType.DATE)) {
                String str2 = metadata.get(property);
                if (!str2.endsWith("Z")) {
                    if (simpleDateFormat == null) {
                        Locale locale = Locale.US;
                        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
                        simpleDateFormat.setTimeZone(this.defaultTimeZone);
                        DateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
                        simpleDateFormat2.setTimeZone(UTC);
                        dateFormat = simpleDateFormat2;
                    }
                    try {
                        metadata.set(property, dateFormat.format(simpleDateFormat.parse(str2)));
                    } catch (ParseException unused) {
                        LOGGER.w("Couldn't convert date to default time zone: >" + str2 + "<");
                    }
                }
            }
        }
    }

    public String getDefaultTimeZone() {
        return d.a(c.a(this.defaultTimeZone));
    }

    @Field
    public void setDefaultTimeZone(String str) {
        this.defaultTimeZone = b.a(a.a(str));
    }
}
