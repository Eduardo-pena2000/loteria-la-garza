package org.apache.tika.metadata.filter;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CaptureGroupMetadataFilter extends MetadataFilter implements Initializable {
    private Pattern regex;
    private String regexString;
    private String sourceField;
    private String targetField;

    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
        if (StringUtils.isBlank(this.sourceField)) {
            throw new TikaConfigException("Must specify a 'sourceField'");
        }
        if (StringUtils.isBlank(this.targetField)) {
            throw new TikaConfigException("Must specify a 'targetField'");
        }
    }

    public void filter(Metadata metadata) throws TikaException {
        String str = metadata.get(this.sourceField);
        if (StringUtils.isBlank(str)) {
            return;
        }
        Matcher matcher = this.regex.matcher(str);
        if (matcher.find()) {
            metadata.set(this.targetField, matcher.group(1));
        }
    }

    public String getRegex() {
        return this.regexString;
    }

    public String getSourceField() {
        return this.sourceField;
    }

    public String getTargetField() {
        return this.targetField;
    }

    public void initialize(Map map) throws TikaConfigException {
        try {
            this.regex = Pattern.compile(this.regexString);
        } catch (PatternSyntaxException e) {
            throw new TikaConfigException("Couldn't parse regex", e);
        }
    }

    @Field
    public void setRegex(String str) {
        this.regexString = str;
    }

    @Field
    public void setSourceField(String str) {
        this.sourceField = str;
    }

    @Field
    public void setTargetField(String str) {
        this.targetField = str;
    }
}
