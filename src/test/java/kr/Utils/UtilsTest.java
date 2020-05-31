package kr.Utils;

import kr.config.SourceToMapConfig;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UtilsTest {

    @Test
    public void replaceSourceText() {
        SourceToMapConfig config = new SourceToMapConfig();
        String origin = "When your character has a |cFFFFFFmount|r set |cFFFFFFActive|r, they can take |cFFFFFFRiding Lessons|r provided by the |cFFFFFFStablemaster|r|t32:32:EsoUI\\Art\\Icons\\ServiceMapPins\\servicepin_stable.dds|t for a small amount of gold. \n\n|cFFFFFFUse|r the |t26:26:EsoUI/Art/Tutorial/pointsPlus_up.dds|t located next to the |cFFFFFFdesired skill|r to increase it.\n\n|cFFFFFFOne riding lesson|r will be offered by the |cFFFFFFStablemaster|r|t32:32:EsoUI\\Art\\Icons\\ServiceMapPins\\servicepin_stable.dds|t every |c76BCC320 hours|r |t32:32:EsoUI\\Art\\Tutorial\\timer_icon.dds|t, so don't forget to visit the stables daily.";
        Utils.replaceSourceText(config, origin);
        System.out.println("after ["+ Utils.replaceSourceText(config, origin) +"]");

    }


}