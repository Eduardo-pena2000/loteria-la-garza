package org.apache.tika.metadata.filter;

import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class GeoPointMetadataFilter extends MetadataFilter {
    String geoPointFieldName = "location";

    public void filter(Metadata metadata) throws TikaException {
        String str = metadata.get(TikaCoreProperties.LATITUDE);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        String str2 = metadata.get(TikaCoreProperties.LONGITUDE);
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        metadata.set(this.geoPointFieldName, str + "," + str2);
    }

    public String getGeoPointFieldName() {
        return this.geoPointFieldName;
    }

    @Field
    public void setGeoPointFieldName(String str) {
        this.geoPointFieldName = str;
    }
}
