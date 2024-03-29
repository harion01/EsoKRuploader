package kr.config;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
/**
 * Created by 안병길 on 2018-01-18.
 * Whya5448@gmail.com
 * Modified by harion01
 * harion01@gmail.com
 */

@SuppressWarnings("Annotator")
public class AppConfig {
	public static final Charset CHARSET = StandardCharsets.UTF_8;
	public static final Pattern POPattern =
			Pattern.compile("(#, fuzzy)?(\\r\\n|\\r|\\n)?msgctxt \"([0-9-]+)\"(\\r\\n|\\r|\\n)*?msgid \"{1,2}?(\\r\\n|\\r|\\n)?([\\s\\S]*?)\"(\\r\\n|\\r|\\n)*?msgstr \"{1,2}?(\\r\\n|\\r|\\n)?([\\s\\S]*?)\"(\\r\\n|\\r|\\n){2,}", Pattern.MULTILINE);
	public static final Pattern CSVPattern = Pattern.compile("\"()()(([\\d]+?)-([\\d]+?)-([\\d]+?))\",\"([\\s\\S]*?)\",\"([\\s\\S]*?)\"(\\r\\n|\\r|\\n)", Pattern.MULTILINE);
	public static final Pattern CategoryConfig = Pattern.compile ("FileName:(.*)((\\r\\n)|(\\n))isDuplicate:(.*)((\\r\\n)|(\\n))type:(.*)((\\r\\n)|(\\n))indexLinkCount:(.*)((\\r\\n)|(\\n))index:(.*)((\\r\\n)|(\\n))", Pattern.MULTILINE );
	public static final Pattern IconPath = Pattern.compile("EsoUI\\\\(.*?).dds", Pattern.MULTILINE);

	public static final String ZANATA_DOMAIN = "https://translate.zanata.org/";
}